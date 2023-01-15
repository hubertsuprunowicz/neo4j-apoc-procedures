package apoc.export.yarspg;

import apoc.ApocConfig;
import apoc.Pools;
import apoc.export.util.ExportConfig;
import apoc.export.util.ProgressReporter;
import apoc.result.ProgressInfo;
import apoc.util.FileUtils;
import apoc.util.Util;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.procedure.*;

import java.util.Map;
import java.util.stream.Stream;

public class ImportYarsPG {
    @Context
    public GraphDatabaseService db;

    @Context
    public Transaction tx;

    @Context
    public ApocConfig apocConfig;

    @Context
    public Pools pools;

    @Context
    public TerminationGuard terminationGuard;

    @Procedure(name = "apoc.import.yarspg", mode = Mode.WRITE)
    @Description("apoc.import.yarspg(file,config) - imports yarspg file")
    public Stream<ProgressInfo> file(@Name("file") String fileName, @Name("config") Map<String, Object> config) throws Exception {
        ProgressInfo result =
                Util.inThread(pools, () -> {
                    ExportConfig exportConfig = new ExportConfig(config);
                    ProgressReporter reporter = new ProgressReporter(null, null, new ProgressInfo(fileName, "file", "yarspg"));
                    YarsPGReader yarsPGReader = new YarsPGReader(db).reporter(reporter)
                            .batchSize(exportConfig.getBatchSize())
                            .relType(exportConfig.defaultRelationshipType())
                            .nodeLabels(exportConfig.readLabels());

                    if (exportConfig.storeNodeIds()) yarsPGReader.storeNodeIds();

                    yarsPGReader.parse(FileUtils.readerFor(fileName));
                    return reporter.getTotal();
                });
        return Stream.of(result);
    }
}
