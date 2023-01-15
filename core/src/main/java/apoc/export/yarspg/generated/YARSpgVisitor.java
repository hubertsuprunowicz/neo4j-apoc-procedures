package apoc.export.yarspg.generated;// Generated from YARSpg.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YARSpgParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YARSpgVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#yarspg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYarspg(YARSpgParser.YarspgContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YARSpgParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadata(YARSpgParser.MetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(YARSpgParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(YARSpgParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#variable_declaration_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_schema(YARSpgParser.Variable_declaration_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(YARSpgParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#graph_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_id(YARSpgParser.Graph_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#prop_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp_list(YARSpgParser.Prop_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#meta_prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeta_prop(YARSpgParser.Meta_propContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#graphs_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraphs_list(YARSpgParser.Graphs_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(YARSpgParser.GraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(YARSpgParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge(YARSpgParser.EdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#directed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirected(YARSpgParser.DirectedContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#undirected}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndirected(YARSpgParser.UndirectedContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#node_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_id(YARSpgParser.Node_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#node_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_label(YARSpgParser.Node_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp(YARSpgParser.PropContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#edge_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_id(YARSpgParser.Edge_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#edge_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_label(YARSpgParser.Edge_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#graph_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_label(YARSpgParser.Graph_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(YARSpgParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(YARSpgParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#primitive_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_value(YARSpgParser.Primitive_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#complex_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_value(YARSpgParser.Complex_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#set_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_value(YARSpgParser.Set_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#list_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_value(YARSpgParser.List_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#struct_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_value(YARSpgParser.Struct_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#node_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_schema(YARSpgParser.Node_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#node_id_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_id_schema(YARSpgParser.Node_id_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#prop_list_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp_list_schema(YARSpgParser.Prop_list_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#prop_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp_schema(YARSpgParser.Prop_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#meta_prop_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeta_prop_schema(YARSpgParser.Meta_prop_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#cardinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardinality(YARSpgParser.CardinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#min_cardinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin_cardinality(YARSpgParser.Min_cardinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#max_cardinality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_cardinality(YARSpgParser.Max_cardinalityContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#card_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCard_num(YARSpgParser.Card_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#value_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_schema(YARSpgParser.Value_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#primitive_value_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_value_schema(YARSpgParser.Primitive_value_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#min_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin_length(YARSpgParser.Min_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#max_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax_length(YARSpgParser.Max_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(YARSpgParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(YARSpgParser.ScaleContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#complex_value_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_value_schema(YARSpgParser.Complex_value_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#multiset_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiset_schema(YARSpgParser.Multiset_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#set_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_schema(YARSpgParser.Set_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#list_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_schema(YARSpgParser.List_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#dlist_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDlist_schema(YARSpgParser.Dlist_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#struct_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_schema(YARSpgParser.Struct_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#edge_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_schema(YARSpgParser.Edge_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#directed_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirected_schema(YARSpgParser.Directed_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#undirected_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndirected_schema(YARSpgParser.Undirected_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YARSpgParser#graph_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph_schema(YARSpgParser.Graph_schemaContext ctx);
}