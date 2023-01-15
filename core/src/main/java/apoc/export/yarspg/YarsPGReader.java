package apoc.export.yarspg;

import apoc.export.util.BatchTransaction;
import apoc.export.util.Reporter;
import apoc.export.yarspg.generated.YARSpgLexer;
import apoc.export.yarspg.generated.YARSpgParser;
import org.antlr.v4.runtime.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.neo4j.graphdb.*;

import java.io.Reader;
import java.util.*;
import java.util.stream.Stream;

public class YarsPGReader {
    private final GraphDatabaseService db;
    private BatchTransaction tx;
    private int batchSize = 40000;
    private Reporter reporter;
    private RelationshipType defaultRelType = RelationshipType.withName("UNKNOWN");
    private boolean readLabels = true;
    private boolean storeNodeIds = false;
    private int count = 0;
    private final Map<String, RelationshipPack> lackingNodes = new HashMap<>(1024 * 4);
    private final Map<String, Long> cache = new HashMap<>(1024 * 32);

    public YarsPGReader(GraphDatabaseService db) {
        this.db = db;
    }

    public YarsPGReader relType(String name) {
        this.defaultRelType = RelationshipType.withName(name);
        return this;
    }

    public YarsPGReader batchSize(int batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    public YarsPGReader nodeLabels(boolean readLabels) {
        this.readLabels = readLabels;
        return this;
    }

    public YarsPGReader reporter(Reporter reporter) {
        this.reporter = reporter;
        return this;
    }

    public YarsPGReader storeNodeIds() {
        this.storeNodeIds = true;
        return this;
    }

    public boolean isReadLabels() {
        return readLabels;
    }

    public long parse(Reader reader) {
        UnbufferedCharStream input = new UnbufferedCharStream(reader);

        YARSpgLexer lex = new YARSpgLexer(input);

        lex.setTokenFactory(new CommonTokenFactory(true));

        YARSpgParser parser = new YARSpgParser(new UnbufferedTokenStream<CommonToken>(lex));
        parser.setBuildParseTree(false);

        tx = new BatchTransaction(db, batchSize * 10, reporter);
        parser.addParseListener(new YarsPGListener(this));

        // Run parser
        // Grammar generated on 06 Jan 2022 from:
        // https://github.com/lszeremeta/yarspg/blob/master/yarspg/YARSpg.g4
        parser.yarspg();
        handleLackingNodes();

        tx.close();

        return count;
    }

    public void nodeFetch(String nodeId, List<Label> labels,
                          Map<String, Object> properties) {
        tx.increment();
        Node node = tx.getTransaction().createNode();
        labels.forEach(node::addLabel);
        cache.put(nodeId, node.getId());

        if (storeNodeIds) {
            properties.put("id", nodeId);
        }

        if (!properties.isEmpty()) {
            properties.forEach((key, value) -> handleProperty(node, key, value));
        }

        reporter.update(1, 0, 0);
    }

    private boolean isUncreatableRelationship(String leftNodeId, String rightNodeId) {
        return !cache.containsKey(leftNodeId) || !cache.containsKey(rightNodeId);
    }

    private void cacheRelationship(String leftNodeId, RelationshipType relationshipType, String rightNodeId, Map<String, Object> properties) {
        String uniqueOperationKey = leftNodeId + "." + relationshipType + "." + rightNodeId;
        HashMap<String, Object> propertiesCopy = new HashMap<>(properties);
        lackingNodes.put(uniqueOperationKey, new RelationshipPack(leftNodeId, relationshipType, rightNodeId, propertiesCopy));
    }

    public void relationshipFetch(String leftNodeId, RelationshipType relationshipType, String rightNodeId,
                                  Map<String, Object> properties) {
        RelationshipType optionalRelationshipType = Optional.ofNullable(relationshipType).orElse(defaultRelType);

        // Put operation for later if nodes are not present yet
        if (isUncreatableRelationship(leftNodeId, rightNodeId)) {
            cacheRelationship(leftNodeId, optionalRelationshipType, rightNodeId, properties);
            return;
        }

        createRelationship(leftNodeId, optionalRelationshipType, rightNodeId, properties);
    }

    public void createRelationship(String leftNodeId, RelationshipType relationshipType, String rightNodeId,
                                   Map<String, Object> properties) {
        tx.increment();
        Node nodeFrom = tx.getTransaction().getNodeById(cache.get(leftNodeId));
        Node nodeTo = tx.getTransaction().getNodeById(cache.get(rightNodeId));
        Relationship relationship = nodeFrom.createRelationshipTo(nodeTo, relationshipType);
        properties.forEach((key, value) -> handleProperty(relationship, key, value));

        reporter.update(0, 1, 0);
        count++;
    }

    // Property could be either primitive type or complex type
    private void handleProperty(Entity entity, String key, Object value) {
        if (value instanceof String) {
            handlePrimitiveType(entity, key, (String) value);
        } else if (value instanceof HashSet && ((HashSet<String>) value).size() != 0) {
            handleComplexType(entity, key, (HashSet<String>) value);
        }

        reporter.update(0, 0, 1);
    }

    private void handlePrimitiveType(Entity entity, String key, String value) {
        // Nullable values are not present in Cypher
        if (value.equals("null")) {
            return;
        }

        switch (getValueTypeName(value)) {
            case "Long": {
                entity.setProperty(key, Long.parseLong(value));
                break;
            }
            case "Integer": {
                entity.setProperty(key, Integer.parseInt(value));
                break;
            }
            case "Double": {
                entity.setProperty(key, Double.parseDouble(value));
                break;
            }
            case "Boolean": {
                entity.setProperty(key, Boolean.parseBoolean(value));
                break;
            }
            case "String":
            default: {
                entity.setProperty(key, value);
            }
        }
    }

    // NOTE: Normally in a YARS-PG complex type could contain another complex type,
    // but a list was flattened in the process of parsing to match Cypher requirements
    private void handleComplexType(Entity entity, String key, Set<String> values) {
        String[] stringProps = new String[values.size()];
        values.toArray(stringProps);
        String firstOf = values.iterator().next();

        // Array in Cypher should have only primitives with the same type
        if (!isSameType(values.iterator())) {
            entity.setProperty(key, stringProps);
        }

        switch (getValueTypeName(firstOf)) {
            case "Long": {
                long[] longs = Stream.of(stringProps).mapToLong(Long::parseLong).toArray();
                entity.setProperty(key, longs);
                break;
            }
            case "Double": {
                double[] doubles = Stream.of(stringProps).mapToDouble(Double::parseDouble).toArray();
                entity.setProperty(key, doubles);
                break;
            }
            case "Boolean": {
                Boolean[] booleans = Arrays.stream(stringProps)
                        .map(i -> i.equals("true"))
                        .toArray(Boolean[]::new);

                entity.setProperty(key, booleans);
            }
            case "String":
            default: {
                entity.setProperty(key, stringProps);
            }
        }
    }

    // Handle case when relationship is declared but any of the nodes are not
    private void handleLackingNodes() {
        if (cache.isEmpty() || lackingNodes.isEmpty()) {
            return;
        }

        lackingNodes.forEach((k, v) -> {
            if (cache.containsKey(v.getLeftNodeId()) && cache.containsKey(v.getRightNodeId())) {
                createRelationship(v.getLeftNodeId(), v.getRelationshipType(), v.getRightNodeId(), v.getProperties());
            }
        });
    }

    private boolean isParsableAsLong(String s) {
        try {
            Long.valueOf(s);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    private boolean isParsableAsInteger(String s) {
        try {
            Integer.valueOf(s);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    private boolean isParsableAsDouble(String s) {
        try {
            Double.valueOf(s);
            return true;
        } catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    private boolean isParsableAsBoolean(String s) {
        return s.equals("true") || s.equals("false");
    }

    private boolean isSameType(Iterator<String> values) {
        String type = "";

        while (values.hasNext()) {
            String value = values.next();

            if (!type.isEmpty() && !type.equals(getValueTypeName(value))) {
                return false;
            }

            type = getValueTypeName(value);
        }

        return true;
    }

    private String getValueTypeName(String value) {
        if (NumberUtils.isCreatable(value)) {
            if (isParsableAsLong(value)) {
                return Long.class.getSimpleName();
            }

            if (isParsableAsInteger(value)) {
                return Integer.class.getSimpleName();
            }

            if (isParsableAsDouble(value)) {
                return Double.class.getSimpleName();
            }

            return String.class.getSimpleName();
        }

        if (isParsableAsBoolean(value)) {
            return Boolean.class.getSimpleName();
        }

        return String.class.getSimpleName();
    }
}

class RelationshipPack {
    private final String leftNodeId;
    private final RelationshipType relationshipType;
    private final String rightNodeId;
    private final Map<String, Object> properties;

    public RelationshipPack(String leftNodeId, RelationshipType relationshipType, String rightNodeId, Map<String, Object> properties) {
        this.leftNodeId = leftNodeId;
        this.relationshipType = relationshipType;
        this.rightNodeId = rightNodeId;
        this.properties = properties;
    }

    public String getLeftNodeId() {
        return leftNodeId;
    }

    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    public String getRightNodeId() {
        return rightNodeId;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}
