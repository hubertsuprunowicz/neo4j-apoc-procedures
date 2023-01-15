package apoc.export.yarspg;

import apoc.export.yarspg.generated.YARSpgBaseListener;
import apoc.export.yarspg.generated.YARSpgParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.RelationshipType;

import java.io.InputStream;
import java.util.*;

public class YarsPGListener extends YARSpgBaseListener {
    private final YarsPGReader yarsPGReader;

    private boolean isNode = false;
    private boolean isNodeLabels = false;

    private boolean isEdge = false;
    private boolean isEdgeLabel = false;
    private boolean isNodeId = false;

    private boolean isPropertiesList = false;
    private boolean isProp = false;
    private boolean isMetaProp = false;
    private boolean isKey = false;
    private boolean isValue = false;
    private boolean isPrimitiveValue = false;
    private boolean isComplexValue = false;
    private boolean isVarName = false;
    private boolean isVariableDeclaration = false;

    private String nodeId, nodeFromId, nodeToId;
    private RelationshipType relationshipType;
    private String propKey;
    private String propValue;
    private String variableName;

    private final Set<String> propValues = new HashSet<>();
    private final List<Label> labels = new ArrayList<>();
    private final Map<String, Object> properties = new HashMap<>();
    private final Map<String, Map<String, Object>> variables = new HashMap<>();

    private boolean isLeftNodeId = true;

    public YarsPGListener(YarsPGReader yarsPGReader) {
        super();
        this.yarsPGReader = yarsPGReader;
    }

    private void clearProperties() {
        propKey = null;
        propValue = null;
        properties.clear();
        propValues.clear();
    }

    private void clearEntity() {
        clearProperties();
        labels.clear();
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        String token = terminalNode.getText();

        // Remove quotes from non-terminal STR
        if (terminalNode.getSymbol().getType() == 44) {
            token = token.replace("\"", "");
        }

        boolean isEntity = isNode || isEdge;
        boolean hasProperty = (isVariableDeclaration || isEntity) && isProp && !isMetaProp;
        // Load property, either from entity (node/edge) or variable
        if (hasProperty) {
            if (isKey) {
                propKey = token;
                return;
            }

            if (isValue && isPrimitiveValue) {
                if (isComplexValue) {
                    propValues.add(token);
                    return;
                }

                propValue = token;
            }

            return;
        }

        if (isNode) {
            if (isNodeId) {
                nodeId = token;
                return;
            }

            if (isNodeLabels && yarsPGReader.isReadLabels()) {
                labels.add(Label.label(token));
                return;
            }
        }

        if (isEdge) {
            if (isNodeId) {
                // Define which node
                if (isLeftNodeId) {
                    nodeFromId = token;
                } else {
                    nodeToId = token;
                }

                isLeftNodeId = !isLeftNodeId;
                return;
            }

            if (isEdgeLabel) {
                relationshipType = RelationshipType.withName(token);
                return;
            }
        }

        boolean isEntityPropsHasVariable = isEntity && isPropertiesList && isVarName && variables.containsKey(token);
        // Merge variable with entity properties
        if (isEntityPropsHasVariable) {
            properties.putAll(variables.get(token));
        }

        if (isVariableDeclaration && isVarName) {
            variableName = token;
        }
    }

    @Override
    public void exitStatement(YARSpgParser.StatementContext ctx) {
        super.exitStatement(ctx);

    }

    @Override
    public void enterNode(YARSpgParser.NodeContext ctx) {
        super.enterNode(ctx);
        isNode = true;
    }

    @Override
    public void exitNode(YARSpgParser.NodeContext ctx) {
        super.exitNode(ctx);
        isNode = false;
        yarsPGReader.nodeFetch(nodeId, labels, properties);
        clearEntity();
    }

    @Override
    public void enterNode_id(YARSpgParser.Node_idContext ctx) {
        super.enterNode_id(ctx);
        isNodeId = true;
    }

    @Override
    public void exitNode_id(YARSpgParser.Node_idContext ctx) {
        super.exitNode_id(ctx);
        isNodeId = false;
    }

    @Override
    public void enterNode_label(YARSpgParser.Node_labelContext ctx) {
        super.enterNode_label(ctx);
        isNodeLabels = true;
    }

    @Override
    public void exitNode_label(YARSpgParser.Node_labelContext ctx) {
        super.exitNode_label(ctx);
        isNodeLabels = false;
    }

    @Override
    public void enterEdge(YARSpgParser.EdgeContext ctx) {
        super.enterEdge(ctx);
        isEdge = true;
    }

    @Override
    public void exitEdge(YARSpgParser.EdgeContext ctx) {
        super.exitEdge(ctx);
        isEdge = false;
        isLeftNodeId = true;
        yarsPGReader.relationshipFetch(nodeFromId, relationshipType, nodeToId, properties);
        clearEntity();
    }

    @Override
    public void enterEdge_label(YARSpgParser.Edge_labelContext ctx) {
        super.enterEdge_label(ctx);
        isEdgeLabel = true;
    }

    @Override
    public void exitEdge_label(YARSpgParser.Edge_labelContext ctx) {
        super.exitEdge_label(ctx);
        isEdgeLabel = false;
    }

    @Override
    public void enterProp_list(YARSpgParser.Prop_listContext ctx) {
        super.enterProp_list(ctx);
        isPropertiesList = true;
    }

    @Override
    public void exitProp_list(YARSpgParser.Prop_listContext ctx) {
        super.exitProp_list(ctx);
        isPropertiesList = false;
    }

    @Override
    public void enterProp(YARSpgParser.PropContext ctx) {
        super.enterProp(ctx);
        isProp = true;
    }

    @Override
    public void exitProp(YARSpgParser.PropContext ctx) {
        super.exitProp(ctx);
        isProp = false;
        if (propValue != null) {
            properties.put(propKey, propValue);
            propValue = null;
        } else if (!propValues.isEmpty()) {
            Set<String> propValuesCopy = new HashSet<>(propValues);
            properties.put(propKey, propValuesCopy);
            propValues.clear();
        }
    }

    @Override
    public void enterMeta_prop(YARSpgParser.Meta_propContext ctx) {
        super.enterMeta_prop(ctx);
        isMetaProp = true;
    }

    @Override
    public void exitMeta_prop(YARSpgParser.Meta_propContext ctx) {
        super.exitMeta_prop(ctx);
        isMetaProp = false;
    }

    @Override
    public void enterKey(YARSpgParser.KeyContext ctx) {
        super.enterKey(ctx);
        isKey = true;
    }

    @Override
    public void exitKey(YARSpgParser.KeyContext ctx) {
        super.exitKey(ctx);
        isKey = false;
    }

    @Override
    public void enterValue(YARSpgParser.ValueContext ctx) {
        super.enterValue(ctx);
        isValue = true;
    }

    @Override
    public void exitValue(YARSpgParser.ValueContext ctx) {
        super.exitValue(ctx);
        isValue = false;
    }

    @Override
    public void enterPrimitive_value(YARSpgParser.Primitive_valueContext ctx) {
        super.enterPrimitive_value(ctx);
        isPrimitiveValue = true;
    }

    @Override
    public void exitPrimitive_value(YARSpgParser.Primitive_valueContext ctx) {
        super.exitPrimitive_value(ctx);
        isPrimitiveValue = false;
    }

    @Override
    public void enterComplex_value(YARSpgParser.Complex_valueContext ctx) {
        super.enterComplex_value(ctx);
        isComplexValue = true;
    }

    @Override
    public void exitComplex_value(YARSpgParser.Complex_valueContext ctx) {
        super.exitComplex_value(ctx);
        isComplexValue = false;
    }

    @Override
    public void enterVariable_declaration(YARSpgParser.Variable_declarationContext ctx) {
        super.enterVariable_declaration(ctx);
        isVariableDeclaration = true;
    }

    @Override
    public void exitVariable_declaration(YARSpgParser.Variable_declarationContext ctx) {
        super.exitVariable_declaration(ctx);
        isVariableDeclaration = false;
        HashMap<String, Object> propertiesCopy = new HashMap<>(properties);
        variables.put(variableName, propertiesCopy);
        clearProperties();
    }

    @Override
    public void enterVariable_name(YARSpgParser.Variable_nameContext ctx) {
        super.enterVariable_name(ctx);
        isVarName = true;
    }

    @Override
    public void exitVariable_name(YARSpgParser.Variable_nameContext ctx) {
        super.exitVariable_name(ctx);
        isVarName = false;
    }
}