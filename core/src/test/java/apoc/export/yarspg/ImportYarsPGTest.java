package apoc.export.yarspg;

import apoc.ApocSettings;
import apoc.graph.Graphs;
import apoc.util.TestUtil;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.neo4j.configuration.GraphDatabaseSettings;
import org.neo4j.test.rule.DbmsRule;
import org.neo4j.test.rule.ImpermanentDbmsRule;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static apoc.ApocConfig.*;
import static apoc.util.MapUtil.map;
import static apoc.util.TestUtil.isRunningInCI;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;
import static org.neo4j.configuration.GraphDatabaseSettings.TransactionStateMemoryAllocation.OFF_HEAP;
import static org.neo4j.configuration.GraphDatabaseSettings.TransactionStateMemoryAllocation.ON_HEAP;
import static org.neo4j.configuration.SettingValueParsers.BYTES;

public class ImportYarsPGTest {

    public static final List<String> ATTRIBUTES_CONTAINING_NODE_IDS = Arrays.asList("id", "source", "target");

    public static final String KEY_TYPES_EMPTY = "<key id=\"name\" for=\"node\" attr.name=\"name\" attr.type=\"string\"/>%n" +
            "<key id=\"limit\" for=\"node\" attr.name=\"limit\" attr.type=\"long\"/>%n" +
            "<key id=\"labels\" for=\"node\" attr.name=\"labels\" attr.type=\"string\"/>%n";
    public static final String GRAPH = "<graph id=\"G\" edgedefault=\"directed\">%n";
    public static final String HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>%n" +
            "<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://graphml.graphdrawing.org/xmlns http://graphml.graphdrawing.org/xmlns/1.0/graphml.xsd\">%n";
    public static final String KEY_TYPES_FALSE = "<key id=\"born\" for=\"node\" attr.name=\"born\"/>%n" +
            "<key id=\"values\" for=\"node\" attr.name=\"values\"/>%n" +
            "<key id=\"name\" for=\"node\" attr.name=\"name\"/>%n" +
            "<key id=\"labels\" for=\"node\" attr.name=\"labels\"/>%n"+
            "<key id=\"place\" for=\"node\" attr.name=\"place\"/>%n" +
            "<key id=\"age\" for=\"node\" attr.name=\"age\"/>%n" +
            "<key id=\"label\" for=\"edge\" attr.name=\"label\"/>%n";
    public static final String KEY_TYPES_DATA = "<key id=\"name\" for=\"node\" attr.name=\"name\"/>\n" +
            "<key id=\"labels\" for=\"node\" attr.name=\"labels\"/>";
    public static final String KEY_TYPES = "<key id=\"born\" for=\"node\" attr.name=\"born\" attr.type=\"string\"/>%n" +
            "<key id=\"values\" for=\"node\" attr.name=\"values\" attr.type=\"string\" attr.list=\"long\"/>%n" +
            "<key id=\"name\" for=\"node\" attr.name=\"name\" attr.type=\"string\"/>%n" +
            "<key id=\"labels\" for=\"node\" attr.name=\"labels\" attr.type=\"string\"/>%n"+
            "<key id=\"place\" for=\"node\" attr.name=\"place\" attr.type=\"string\"/>%n" +
            "<key id=\"age\" for=\"node\" attr.name=\"age\" attr.type=\"long\"/>%n" +
            "<key id=\"label\" for=\"edge\" attr.name=\"label\" attr.type=\"string\"/>%n";
    public static final String KEY_TYPES_PATH = "<key id=\"born\" for=\"node\" attr.name=\"born\" attr.type=\"string\"/>%n" +
            "<key id=\"name\" for=\"node\" attr.name=\"name\" attr.type=\"string\"/>%n" +
            "<key id=\"labels\" for=\"node\" attr.name=\"labels\" attr.type=\"string\"/>%n"+
            "<key id=\"place\" for=\"node\" attr.name=\"place\" attr.type=\"string\"/>%n" +
            "<key id=\"TYPE\" for=\"node\" attr.name=\"TYPE\" attr.type=\"string\"/>%n" +
            "<key id=\"age\" for=\"node\" attr.name=\"age\" attr.type=\"long\"/>%n" +
            "<key id=\"label\" for=\"edge\" attr.name=\"label\" attr.type=\"string\"/>%n" +
            "<key id=\"TYPE\" for=\"edge\" attr.name=\"TYPE\" attr.type=\"string\"/>%n";
    public static final String KEY_TYPES_CAMEL_CASE = "<key id=\"firstName\" for=\"node\" attr.name=\"firstName\" attr.type=\"string\"/>%n" +
            "<key id=\"ageNow\" for=\"node\" attr.name=\"ageNow\" attr.type=\"long\"/>%n" +
            "<key id=\"name\" for=\"node\" attr.name=\"name\" attr.type=\"string\"/>%n" +
            "<key id=\"labels\" for=\"node\" attr.name=\"labels\" attr.type=\"string\"/>%n" +
            "<key id=\"TYPE\" for=\"node\" attr.name=\"TYPE\" attr.type=\"string\"/>%n" +
            "<key id=\"label\" for=\"edge\" attr.name=\"label\" attr.type=\"string\"/>%n" +
            "<key id=\"TYPE\" for=\"edge\" attr.name=\"TYPE\" attr.type=\"string\"/>%n";
    public static final String KEY_TYPES_NO_DATA_KEY = "<key id=\"Node.Path\" for=\"node\" attr.name=\"Path\" attr.type=\"string\"/>\n" +
            "<key id=\"Edge.Path\" for=\"edge\" attr.name=\"Path\" attr.type=\"string\"/>";
    public static final String DATA = "<node id=\"n0\" labels=\":Foo:Foo0:Foo2\"><data key=\"labels\">:Foo:Foo0:Foo2</data><data key=\"place\">{\"crs\":\"wgs-84-3d\",\"latitude\":56.7,\"longitude\":12.78,\"height\":100.0}</data><data key=\"name\">foo</data><data key=\"born\">2018-10-10</data></node>%n" +
            "<node id=\"n1\" labels=\":Bar\"><data key=\"labels\">:Bar</data><data key=\"age\">42</data><data key=\"name\">bar</data><data key=\"place\">{\"crs\":\"wgs-84\",\"latitude\":56.7,\"longitude\":12.78,\"height\":null}</data></node>%n" +
            "<node id=\"n2\" labels=\":Bar\"><data key=\"labels\">:Bar</data><data key=\"age\">12</data><data key=\"values\">[1,2,3]</data></node>%n" +
            "<edge id=\"e0\" source=\"n0\" target=\"n1\" label=\"KNOWS\"><data key=\"label\">KNOWS</data></edge>%n";
    public static final String DATA_CAMEL_CASE =
            "<node id=\"n0\" labels=\":Foo:Foo0:Foo2\"><data key=\"TYPE\">:Foo:Foo0:Foo2</data><data key=\"label\">foo</data><data key=\"firstName\">foo</data></node>%n" +
            "<node id=\"n1\" labels=\":Bar\"><data key=\"TYPE\">:Bar</data><data key=\"label\">bar</data><data key=\"name\">bar</data><data key=\"ageNow\">42</data></node>%n" +
            "<edge id=\"e0\" source=\"n0\" target=\"n1\" label=\"KNOWS\"><data key=\"label\">KNOWS</data><data key=\"TYPE\">KNOWS</data></edge>%n";

    public static final String DATA_NODE_EDGE = "<node id=\"n0\"> <data key=\"labels\">:FOO</data><data key=\"name\">foo</data> </node>%n" +
            "<node id=\"n1\"> <data key=\"labels\">:BAR</data><data key=\"name\">bar</data> <data key=\"kids\">[a,b,c]</data> </node>%n" +
            "<edge id=\"e0\" source=\"n0\" target=\"n1\"> <data key=\"label\">:EDGE_LABEL</data> <data key=\"name\">foo</data> </edge>%n" +
            "<edge id=\"e1\" source=\"n1\" target=\"n0\"><data key=\"label\">TEST</data> </edge>%n" +
            "<node id=\"n3\"> <data key=\"labels\">:QWERTY</data><data key=\"name\">qwerty</data> </node>%n" +
            "<edge id=\"e2\" source=\"n1\" target=\"n3\"> <data key=\"label\">KNOWS</data> </edge>%n";

    private static final String DATA_WITHOUT_CHAR_DATA_KEYS = "<node id=\"n0\" labels=\":Foo:Foo0:Foo2\"><data key=\"labels\">:Foo:Foo0:Foo2</data><data key=\"place\">{\"crs\":\"wgs-84-3d\",\"latitude\":56.7,\"longitude\":12.78,\"height\":100.0}</data><data key=\"name\">foo</data><data key=\"born\">2018-10-10</data></node>%n" +
            "<node id=\"n1\" labels=\":Bar\"><data key=\"labels\">:Bar</data><data key=\"age\">42</data><data key=\"name\">bar</data><data key=\"place\">{\"crs\":\"wgs-84\",\"latitude\":56.7,\"longitude\":12.78,\"height\":null}</data></node>%n" +
            "<node id=\"n2\" labels=\":Bar\"><data key=\"labels\">:Bar</data><data key=\"age\">12</data><data key=\"values\">[1,2,3]</data></node>%n" +
            "<edge id=\"e0\" source=\"n0\" target=\"n1\"><data key=\"d10\"/></edge>\n";

    public static final String DATA_NO_DATA_KEY = "<node id=\"A\" labels=\":Unit\"><data key=\"Path\">C:\\bright\\itecembed\\obj\\ada\\a3_status.ads</data></node>\n" +
            "<node id=\"B\" labels=\":Unit\"><data key=\"Path\">C:\\bright\\itecembed\\obj\\ada\\b3_status.ads</data></node>\n" +
            "<edge source=\"A\" target=\"B\"><!-- <data key=\"Path\">C:\\bright\\itecembed\\obj\\ada\\b3_status.ads</data> --></edge>";

    public static final String FOOTER = "</graph>%n" +
            "</graphml>";

    public static final String DATA_PATH = "<node id=\"n0\" labels=\":Foo:Foo0:Foo2\"><data key=\"TYPE\">:Foo:Foo0:Foo2</data><data key=\"label\">foo</data><data key=\"place\">{\"crs\":\"wgs-84-3d\",\"latitude\":56.7,\"longitude\":12.78,\"height\":100.0}</data><data key=\"name\">foo</data><data key=\"born\">2018-10-10</data></node>%n" +
            "<node id=\"n1\" labels=\":Bar\"><data key=\"TYPE\">:Bar</data><data key=\"label\">bar</data><data key=\"age\">42</data><data key=\"name\">bar</data><data key=\"place\">{\"crs\":\"wgs-84\",\"latitude\":56.7,\"longitude\":12.78,\"height\":null}</data></node>%n" +
            "<edge id=\"e0\" source=\"n0\" target=\"n1\" label=\"KNOWS\"><data key=\"label\">KNOWS</data><data key=\"TYPE\">KNOWS</data></edge>%n";

    public static final String DATA_PATH_CAPTION = "<node id=\"n0\" labels=\":Foo:Foo0:Foo2\"><data key=\"TYPE\">:Foo:Foo0:Foo2</data><data key=\"label\">foo</data><data key=\"place\">{\"crs\":\"wgs-84-3d\",\"latitude\":56.7,\"longitude\":12.78,\"height\":100.0}</data><data key=\"name\">foo</data><data key=\"born\">2018-10-10</data></node>%n" +
            "<node id=\"n1\" labels=\":Bar\"><data key=\"TYPE\">:Bar</data><data key=\"label\">bar</data><data key=\"age\">42</data><data key=\"name\">bar</data><data key=\"place\">{\"crs\":\"wgs-84\",\"latitude\":56.7,\"longitude\":12.78,\"height\":null}</data></node>%n" +
            "<edge id=\"e0\" source=\"n0\" target=\"n1\" label=\"KNOWS\"><data key=\"label\">KNOWS</data><data key=\"TYPE\">KNOWS</data></edge>%n";

    public static final String DATA_PATH_CAPTION_DEFAULT = "<node id=\"n0\" labels=\":Foo:Foo0:Foo2\"><data key=\"TYPE\">:Foo:Foo0:Foo2</data><data key=\"label\">point({x: 56.7, y: 12.78, z: 100.0, crs: 'wgs-84-3d'})</data><data key=\"place\">{\"crs\":\"wgs-84-3d\",\"latitude\":56.7,\"longitude\":12.78,\"height\":100.0}</data><data key=\"name\">foo</data><data key=\"born\">2018-10-10</data></node>%n" +
            "<node id=\"n1\" labels=\":Bar\"><data key=\"TYPE\">:Bar</data><data key=\"label\">point({x: 56.7, y: 12.78, crs: 'wgs-84'})</data><data key=\"age\">42</data><data key=\"name\">bar</data><data key=\"place\">{\"crs\":\"wgs-84\",\"latitude\":56.7,\"longitude\":12.78,\"height\":null}</data></node>%n" +
            "<edge id=\"e0\" source=\"n0\" target=\"n1\" label=\"KNOWS\"><data key=\"label\">KNOWS</data><data key=\"TYPE\">KNOWS</data></edge>%n";

    public static final String DATA_DATA = "<node id=\"n3\" labels=\":Person\"><data key=\"labels\">:Person</data><data key=\"name\">Foo</data></node>\n" +
            "<node id=\"n5\" labels=\":Person\"><data key=\"labels\">:Person</data><data key=\"name\">Foo0</data></node>\n";

    private static final String EXPECTED_TYPES_PATH = String.format(HEADER + KEY_TYPES_PATH + GRAPH + DATA_PATH + FOOTER);
    private static final String EXPECTED_TYPES_PATH_CAPTION = String.format(HEADER + KEY_TYPES_PATH + GRAPH + DATA_PATH_CAPTION + FOOTER);
    private static final String EXPECTED_TYPES_PATH_WRONG_CAPTION = String.format(HEADER + KEY_TYPES_PATH + GRAPH + DATA_PATH_CAPTION_DEFAULT + FOOTER);
    private static final String EXPECTED_TYPES = String.format(HEADER + KEY_TYPES + GRAPH + DATA + FOOTER);
    private static final String EXPECTED_TYPES_WITHOUT_CHAR_DATA_KEYS = String.format(HEADER + KEY_TYPES  + GRAPH + DATA_WITHOUT_CHAR_DATA_KEYS + FOOTER);
    private static final String EXPECTED_FALSE = String.format(HEADER + KEY_TYPES_FALSE + GRAPH + DATA + FOOTER);
    private static final String EXPECTED_DATA = String.format(HEADER + KEY_TYPES_DATA + GRAPH + DATA_DATA + FOOTER);
    private static final String EXPECTED_READ_NODE_EDGE = String.format(HEADER + GRAPH + DATA_NODE_EDGE + FOOTER);
    private static final String EXPECTED_TYPES_PATH_CAMEL_CASE = String.format(HEADER + KEY_TYPES_CAMEL_CASE + GRAPH + DATA_CAMEL_CASE + FOOTER);
    private static final String DATA_EMPTY = "<node id=\"n0\" labels=\":Test\"><data key=\"labels\">:Test</data><data key=\"name\"></data><data key=\"limit\">3</data></node>%n";
    private static final String EXPECTED_TYPES_EMPTY = String.format(HEADER + KEY_TYPES_EMPTY + GRAPH + DATA_EMPTY + FOOTER);
    private static final String EXPECTED_TYPES_NO_DATA_KEY = String.format(HEADER + KEY_TYPES_NO_DATA_KEY + GRAPH + DATA_NO_DATA_KEY + FOOTER);

    @Rule
    public TestName testName = new TestName();

    private static final String TEST_WITH_NO_IMPORT = "WithNoImportConfig";
    private static final String TEST_WITH_NO_EXPORT = "WithNoExportConfig";

    @Rule
    public DbmsRule db = new ImpermanentDbmsRule()
            .withSetting(GraphDatabaseSettings.memory_tracking, true)
            .withSetting(GraphDatabaseSettings.tx_state_memory_allocation, OFF_HEAP)
            .withSetting(GraphDatabaseSettings.tx_state_max_off_heap_memory, BYTES.parse("200m"))
            .withSetting(ApocSettings.apoc_import_file_use__neo4j__config, false)
            .withSetting(GraphDatabaseSettings.load_csv_file_url_root, directory.toPath().toAbsolutePath());

    private static File directory = new File("target/import");

    static { //noinspection ResultOfMethodCallIgnored
        directory.mkdirs();
    }

    @Before
    public void setUp() throws Exception {
        TestUtil.registerProcedure(db, ImportYarsPG.class, Graphs.class);

        apocConfig().setProperty(APOC_EXPORT_FILE_ENABLED, Boolean.toString(!testName.getMethodName().endsWith(TEST_WITH_NO_EXPORT)));
        apocConfig().setProperty(APOC_IMPORT_FILE_ENABLED, Boolean.toString(!testName.getMethodName().endsWith(TEST_WITH_NO_IMPORT)));

        db.executeTransactionally("CREATE (f:Foo:Foo2:Foo0 {name:'foo', born:Date('2018-10-10'), place:point({ longitude: 56.7, latitude: 12.78, height: 100 })})-[:KNOWS]->(b:Bar {name:'bar',age:42, place:point({ longitude: 56.7, latitude: 12.78})}),(c:Bar {age:12,values:[1,2,3]})");
    }

    public static double Median(List<Long> values) {
        Collections.sort(values);

        if (values.size() % 2 == 1)
            return values.get((values.size() + 1) / 2 - 1);
        else {
            double lower = values.get(values.size() / 2 - 1);
            double upper = values.get(values.size() / 2);

            return (lower + upper) / 2.0;
        }
    }

    public static void calculate(String scaleFactor, String filename, FileWriter fw, DbmsRule db) throws IOException {
        List<Long> times = new ArrayList<>();
//        fw.write("\n" + filename);

        final String file = ClassLoader.getSystemResource("yarspg-test/" + filename).toString();

//        for (int i = 0; i < 1; i++) {
            TestUtil.testCall(db, "CALL apoc.import.yarspg($file,{readLabels:true})", map("file", file),
                    (r) -> {
                        Long time = (Long) r.get("time");
//                        times.add(time);
//                        Long nodes = (Long) r.get("nodes");
//                        Long relationships = (Long) r.get("relationships");
//                        Long properties = (Long) r.get("properties");
//                        try {
//                            fw.write("\nnodes:" + nodes);
//                            fw.write("\nrelationships:" + relationships);
//                            fw.write("\nproperties:" + properties);
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }

//                        db.executeTransactionally("MATCH (n) DETACH DELETE n");
                    });

            TestUtil.testCall(db, "match (n) return count(n)", map("file", file),
                    (r) -> {
                        Long time = (Long) r.get("count(n)");
                        int c = 4;
                    });

//        }
//        fw.write("\ntime:" + Median(times) + "\n");
//        fw.write("\ntime:" + times + "\n");
    }


    @Test
    public void testImportYarsPGFile() throws IOException {
        assumeFalse(isRunningInCI());
        db.executeTransactionally("MATCH (n) DETACH DELETE n");

        File total = new File("results.txt");
        FileWriter fw = new FileWriter(total, false);
        fw.write("\nYarsPG");
        calculate("0.3", "0.1.yarspg", fw, db);

//        results.put("0.003", calculate("0.003", "0.003.yarspg", null, db));
//        results.put("0.01", calculate("0.01", "0.01.yarspg", null, db));
//        results.put("0.03", calculate("0.03", "0.03.yarspg", null, db));//        results.put("0.1", calculate("0.1", "0.1.yarspg", null, db));
//        results.put("0.3", calculate("0.3", "0.3.yarspg", null, db));
//        results.put("1", calculate("1", "1.yarspg", null, db));

//        results.put("0.003", calculate("0.003", "0.003.yarspg.lz4", null, db));
//        results.put("0.01", calculate("0.01", "0.01.yarspg.lz4", null, db));
//        results.put("0.03", calculate("0.03", "0.03.yarspg.lz4", null, db));
//        results.put("0.1", calculate("0.1", "0.1.yarspg.lz4", null, db));
//        results.put("0.3", calculate("0.3", "0.3.yarspg.lz4", null, db));
//        results.put("1", calculate("1", "1.yarspg.lz4", null, db));

//        final String file = ClassLoader.getSystemResource("yarspg-test/0.01.yarspg").toString();
//        for (int i = 0; i < 1; i++) {
//            TestUtil.testCall(db, "CALL apoc.import.yarspg($file,{readLabels:true})", map("file", file),
//                    (r) -> {
//                        Long time = (Long) r.get("time");
//                        times.add(time);
//                        assertTrue(true);
//                    });
//        }


//        final String file = ClassLoader.getSystemResource("yarspg-test/0.1.yarspg").toString();
//        TestUtil.testCall(db, "CALL apoc.import.yarspg($file,{readLabels:true})", map("file", file),
//                (r) -> {
//                    Long time = (Long) r.get("time");
//                    Long nodes = (Long) r.get("nodes");
//                    Long relationships = (Long) r.get("relationships");
//                    Long ,0 = (Long) r.get("properties");
//                    try {
//                        fw.write("\n0.1.yarspg");
//                        fw.write("\ntime:" + time);
//                        fw.write("\nnodes:" + nodes);
//                        fw.write("\nrelationships:" + relationships);
//                        fw.write("\nproperties:" + properties);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    assertTrue(true);
//                });

//        fw.write(Double.toString(Median(times)));
//        times.clear();


        fw.close();
    }

    @Test
    public void testImportYarsPGWithoutConfig() {
        assumeFalse(isRunningInCI());
        db.executeTransactionally("MATCH (n) DETACH DELETE n");

        final String file = ClassLoader.getSystemResource("yarspg-test/test.yarspg").toString();
        TestUtil.testCall(db, "CALL apoc.import.yarspg($file,{readLabels:true})", map("file", file),
                (r) -> {});

//        TestUtil.testCall(db, "CREATE (n:Person:Swedish) return n", map("file", file),
//                (r) -> {
//                    // No labels
//                    assumeFalse(false);
////                    assertEquals("yarspg", r.get("format"));
//                });
        TestUtil.testCall(db, "match (n) return count(n);", map("file", file),
                (r) -> {
                    Long time = (Long) r.get("count(n)");
                    int c = 4;
                });

    }

    @Test
    public void testImportYarsPGNullProperty() {
        assumeFalse(isRunningInCI());
        db.executeTransactionally("MATCH (n) DETACH DELETE n");

        final String file = ClassLoader.getSystemResource("yarspg-test/test.yarspg").toString();
        TestUtil.testCall(db, "CALL apoc.import.yarspg($file)", map("file", file),
                (r) -> {
                    assertEquals("yarspg", r.get("format"));
                });

    }

    @Test
    public void testImportYarsPGVariable() {
        assumeFalse(isRunningInCI());
        db.executeTransactionally("MATCH (n) DETACH DELETE n");

        final String file = ClassLoader.getSystemResource("yarspg-test/test.yarspg").toString();
        TestUtil.testCall(db, "CALL apoc.import.yarspg($file)", map("file", file),
                (r) -> {
                    assertEquals("yarspg", r.get("format"));
                });

    }

    @Test
    public void testImportYarsPGDefaultRelationship() {
        assumeFalse(isRunningInCI());
        db.executeTransactionally("MATCH (n) DETACH DELETE n");

        final String file = ClassLoader.getSystemResource("yarspg-test/test.yarspg").toString();
        TestUtil.testCall(db, "CALL apoc.import.yarspg($file)", map("file", file),
                (r) -> {
                    assertEquals("yarspg", r.get("format"));
                });

    }

}
