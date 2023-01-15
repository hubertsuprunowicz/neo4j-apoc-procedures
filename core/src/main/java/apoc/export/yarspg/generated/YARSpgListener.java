package apoc.export.yarspg.generated;// Generated from YARSpg.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YARSpgParser}.
 */
public interface YARSpgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#yarspg}.
	 * @param ctx the parse tree
	 */
	void enterYarspg(YARSpgParser.YarspgContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#yarspg}.
	 * @param ctx the parse tree
	 */
	void exitYarspg(YARSpgParser.YarspgContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YARSpgParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YARSpgParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#metadata}.
	 * @param ctx the parse tree
	 */
	void enterMetadata(YARSpgParser.MetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#metadata}.
	 * @param ctx the parse tree
	 */
	void exitMetadata(YARSpgParser.MetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(YARSpgParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(YARSpgParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(YARSpgParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(YARSpgParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#variable_declaration_schema}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_schema(YARSpgParser.Variable_declaration_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#variable_declaration_schema}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_schema(YARSpgParser.Variable_declaration_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(YARSpgParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(YARSpgParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#graph_id}.
	 * @param ctx the parse tree
	 */
	void enterGraph_id(YARSpgParser.Graph_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#graph_id}.
	 * @param ctx the parse tree
	 */
	void exitGraph_id(YARSpgParser.Graph_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#prop_list}.
	 * @param ctx the parse tree
	 */
	void enterProp_list(YARSpgParser.Prop_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#prop_list}.
	 * @param ctx the parse tree
	 */
	void exitProp_list(YARSpgParser.Prop_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#meta_prop}.
	 * @param ctx the parse tree
	 */
	void enterMeta_prop(YARSpgParser.Meta_propContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#meta_prop}.
	 * @param ctx the parse tree
	 */
	void exitMeta_prop(YARSpgParser.Meta_propContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#graphs_list}.
	 * @param ctx the parse tree
	 */
	void enterGraphs_list(YARSpgParser.Graphs_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#graphs_list}.
	 * @param ctx the parse tree
	 */
	void exitGraphs_list(YARSpgParser.Graphs_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(YARSpgParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(YARSpgParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(YARSpgParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(YARSpgParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(YARSpgParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(YARSpgParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#directed}.
	 * @param ctx the parse tree
	 */
	void enterDirected(YARSpgParser.DirectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#directed}.
	 * @param ctx the parse tree
	 */
	void exitDirected(YARSpgParser.DirectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#undirected}.
	 * @param ctx the parse tree
	 */
	void enterUndirected(YARSpgParser.UndirectedContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#undirected}.
	 * @param ctx the parse tree
	 */
	void exitUndirected(YARSpgParser.UndirectedContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#node_id}.
	 * @param ctx the parse tree
	 */
	void enterNode_id(YARSpgParser.Node_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#node_id}.
	 * @param ctx the parse tree
	 */
	void exitNode_id(YARSpgParser.Node_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#node_label}.
	 * @param ctx the parse tree
	 */
	void enterNode_label(YARSpgParser.Node_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#node_label}.
	 * @param ctx the parse tree
	 */
	void exitNode_label(YARSpgParser.Node_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(YARSpgParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(YARSpgParser.PropContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#edge_id}.
	 * @param ctx the parse tree
	 */
	void enterEdge_id(YARSpgParser.Edge_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#edge_id}.
	 * @param ctx the parse tree
	 */
	void exitEdge_id(YARSpgParser.Edge_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#edge_label}.
	 * @param ctx the parse tree
	 */
	void enterEdge_label(YARSpgParser.Edge_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#edge_label}.
	 * @param ctx the parse tree
	 */
	void exitEdge_label(YARSpgParser.Edge_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#graph_label}.
	 * @param ctx the parse tree
	 */
	void enterGraph_label(YARSpgParser.Graph_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#graph_label}.
	 * @param ctx the parse tree
	 */
	void exitGraph_label(YARSpgParser.Graph_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(YARSpgParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(YARSpgParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(YARSpgParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(YARSpgParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#primitive_value}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_value(YARSpgParser.Primitive_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#primitive_value}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_value(YARSpgParser.Primitive_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#complex_value}.
	 * @param ctx the parse tree
	 */
	void enterComplex_value(YARSpgParser.Complex_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#complex_value}.
	 * @param ctx the parse tree
	 */
	void exitComplex_value(YARSpgParser.Complex_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#set_value}.
	 * @param ctx the parse tree
	 */
	void enterSet_value(YARSpgParser.Set_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#set_value}.
	 * @param ctx the parse tree
	 */
	void exitSet_value(YARSpgParser.Set_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#list_value}.
	 * @param ctx the parse tree
	 */
	void enterList_value(YARSpgParser.List_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#list_value}.
	 * @param ctx the parse tree
	 */
	void exitList_value(YARSpgParser.List_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#struct_value}.
	 * @param ctx the parse tree
	 */
	void enterStruct_value(YARSpgParser.Struct_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#struct_value}.
	 * @param ctx the parse tree
	 */
	void exitStruct_value(YARSpgParser.Struct_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#node_schema}.
	 * @param ctx the parse tree
	 */
	void enterNode_schema(YARSpgParser.Node_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#node_schema}.
	 * @param ctx the parse tree
	 */
	void exitNode_schema(YARSpgParser.Node_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#node_id_schema}.
	 * @param ctx the parse tree
	 */
	void enterNode_id_schema(YARSpgParser.Node_id_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#node_id_schema}.
	 * @param ctx the parse tree
	 */
	void exitNode_id_schema(YARSpgParser.Node_id_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#prop_list_schema}.
	 * @param ctx the parse tree
	 */
	void enterProp_list_schema(YARSpgParser.Prop_list_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#prop_list_schema}.
	 * @param ctx the parse tree
	 */
	void exitProp_list_schema(YARSpgParser.Prop_list_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#prop_schema}.
	 * @param ctx the parse tree
	 */
	void enterProp_schema(YARSpgParser.Prop_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#prop_schema}.
	 * @param ctx the parse tree
	 */
	void exitProp_schema(YARSpgParser.Prop_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#meta_prop_schema}.
	 * @param ctx the parse tree
	 */
	void enterMeta_prop_schema(YARSpgParser.Meta_prop_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#meta_prop_schema}.
	 * @param ctx the parse tree
	 */
	void exitMeta_prop_schema(YARSpgParser.Meta_prop_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#cardinality}.
	 * @param ctx the parse tree
	 */
	void enterCardinality(YARSpgParser.CardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#cardinality}.
	 * @param ctx the parse tree
	 */
	void exitCardinality(YARSpgParser.CardinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#min_cardinality}.
	 * @param ctx the parse tree
	 */
	void enterMin_cardinality(YARSpgParser.Min_cardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#min_cardinality}.
	 * @param ctx the parse tree
	 */
	void exitMin_cardinality(YARSpgParser.Min_cardinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#max_cardinality}.
	 * @param ctx the parse tree
	 */
	void enterMax_cardinality(YARSpgParser.Max_cardinalityContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#max_cardinality}.
	 * @param ctx the parse tree
	 */
	void exitMax_cardinality(YARSpgParser.Max_cardinalityContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#card_num}.
	 * @param ctx the parse tree
	 */
	void enterCard_num(YARSpgParser.Card_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#card_num}.
	 * @param ctx the parse tree
	 */
	void exitCard_num(YARSpgParser.Card_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#value_schema}.
	 * @param ctx the parse tree
	 */
	void enterValue_schema(YARSpgParser.Value_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#value_schema}.
	 * @param ctx the parse tree
	 */
	void exitValue_schema(YARSpgParser.Value_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#primitive_value_schema}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_value_schema(YARSpgParser.Primitive_value_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#primitive_value_schema}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_value_schema(YARSpgParser.Primitive_value_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#min_length}.
	 * @param ctx the parse tree
	 */
	void enterMin_length(YARSpgParser.Min_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#min_length}.
	 * @param ctx the parse tree
	 */
	void exitMin_length(YARSpgParser.Min_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#max_length}.
	 * @param ctx the parse tree
	 */
	void enterMax_length(YARSpgParser.Max_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#max_length}.
	 * @param ctx the parse tree
	 */
	void exitMax_length(YARSpgParser.Max_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(YARSpgParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(YARSpgParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(YARSpgParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(YARSpgParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#complex_value_schema}.
	 * @param ctx the parse tree
	 */
	void enterComplex_value_schema(YARSpgParser.Complex_value_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#complex_value_schema}.
	 * @param ctx the parse tree
	 */
	void exitComplex_value_schema(YARSpgParser.Complex_value_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#multiset_schema}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_schema(YARSpgParser.Multiset_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#multiset_schema}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_schema(YARSpgParser.Multiset_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#set_schema}.
	 * @param ctx the parse tree
	 */
	void enterSet_schema(YARSpgParser.Set_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#set_schema}.
	 * @param ctx the parse tree
	 */
	void exitSet_schema(YARSpgParser.Set_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#list_schema}.
	 * @param ctx the parse tree
	 */
	void enterList_schema(YARSpgParser.List_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#list_schema}.
	 * @param ctx the parse tree
	 */
	void exitList_schema(YARSpgParser.List_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#dlist_schema}.
	 * @param ctx the parse tree
	 */
	void enterDlist_schema(YARSpgParser.Dlist_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#dlist_schema}.
	 * @param ctx the parse tree
	 */
	void exitDlist_schema(YARSpgParser.Dlist_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#struct_schema}.
	 * @param ctx the parse tree
	 */
	void enterStruct_schema(YARSpgParser.Struct_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#struct_schema}.
	 * @param ctx the parse tree
	 */
	void exitStruct_schema(YARSpgParser.Struct_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#edge_schema}.
	 * @param ctx the parse tree
	 */
	void enterEdge_schema(YARSpgParser.Edge_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#edge_schema}.
	 * @param ctx the parse tree
	 */
	void exitEdge_schema(YARSpgParser.Edge_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#directed_schema}.
	 * @param ctx the parse tree
	 */
	void enterDirected_schema(YARSpgParser.Directed_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#directed_schema}.
	 * @param ctx the parse tree
	 */
	void exitDirected_schema(YARSpgParser.Directed_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#undirected_schema}.
	 * @param ctx the parse tree
	 */
	void enterUndirected_schema(YARSpgParser.Undirected_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#undirected_schema}.
	 * @param ctx the parse tree
	 */
	void exitUndirected_schema(YARSpgParser.Undirected_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YARSpgParser#graph_schema}.
	 * @param ctx the parse tree
	 */
	void enterGraph_schema(YARSpgParser.Graph_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YARSpgParser#graph_schema}.
	 * @param ctx the parse tree
	 */
	void exitGraph_schema(YARSpgParser.Graph_schemaContext ctx);
}