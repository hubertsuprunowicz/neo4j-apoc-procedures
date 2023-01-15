package apoc.export.yarspg.generated;// Generated from YARSpg.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YARSpgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, BOOL=19, STRING=20, BYTES=21, INTEGER=22, UINTEGER=23, DECIMAL=24, 
		FLOAT=25, DATETIME=26, LOCALDATETIME=27, DATE=28, TIME=29, LOCALTIME=30, 
		DURATION=31, MULTISET=32, SET=33, LIST=34, DLIST=35, STRUCT=36, DEFAULT=37, 
		MIN=38, MAX=39, UNIQUE=40, NULL=41, OPTIONAL=42, COMMENT=43, STR=44, UNSIGNED_INT=45, 
		ALNUMPLUS=46, WS=47;
	public static final int
		RULE_yarspg = 0, RULE_statement = 1, RULE_metadata = 2, RULE_variable = 3, 
		RULE_variable_declaration = 4, RULE_variable_declaration_schema = 5, RULE_variable_name = 6, 
		RULE_graph_id = 7, RULE_prop_list = 8, RULE_meta_prop = 9, RULE_graphs_list = 10, 
		RULE_graph = 11, RULE_node = 12, RULE_edge = 13, RULE_directed = 14, RULE_undirected = 15, 
		RULE_node_id = 16, RULE_node_label = 17, RULE_prop = 18, RULE_edge_id = 19, 
		RULE_edge_label = 20, RULE_graph_label = 21, RULE_key = 22, RULE_value = 23, 
		RULE_primitive_value = 24, RULE_complex_value = 25, RULE_set_value = 26, 
		RULE_list_value = 27, RULE_struct_value = 28, RULE_node_schema = 29, RULE_node_id_schema = 30, 
		RULE_prop_list_schema = 31, RULE_prop_schema = 32, RULE_meta_prop_schema = 33, 
		RULE_cardinality = 34, RULE_min_cardinality = 35, RULE_max_cardinality = 36, 
		RULE_card_num = 37, RULE_value_schema = 38, RULE_primitive_value_schema = 39, 
		RULE_min_length = 40, RULE_max_length = 41, RULE_precision = 42, RULE_scale = 43, 
		RULE_complex_value_schema = 44, RULE_multiset_schema = 45, RULE_set_schema = 46, 
		RULE_list_schema = 47, RULE_dlist_schema = 48, RULE_struct_schema = 49, 
		RULE_edge_schema = 50, RULE_directed_schema = 51, RULE_undirected_schema = 52, 
		RULE_graph_schema = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"yarspg", "statement", "metadata", "variable", "variable_declaration", 
			"variable_declaration_schema", "variable_name", "graph_id", "prop_list", 
			"meta_prop", "graphs_list", "graph", "node", "edge", "directed", "undirected", 
			"node_id", "node_label", "prop", "edge_id", "edge_label", "graph_label", 
			"key", "value", "primitive_value", "complex_value", "set_value", "list_value", 
			"struct_value", "node_schema", "node_id_schema", "prop_list_schema", 
			"prop_schema", "meta_prop_schema", "cardinality", "min_cardinality", 
			"max_cardinality", "card_num", "value_schema", "primitive_value_schema", 
			"min_length", "max_length", "precision", "scale", "complex_value_schema", 
			"multiset_schema", "set_schema", "list_schema", "dlist_schema", "struct_schema", 
			"edge_schema", "directed_schema", "undirected_schema", "graph_schema"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'$'", "'='", "','", "'['", "']'", "'@'", "'<'", "':'", 
			"'>'", "'/'", "'{'", "'}'", "'('", "')'", "'-'", "'->'", "'S'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "BOOL", "STRING", "BYTES", 
			"INTEGER", "UINTEGER", "DECIMAL", "FLOAT", "DATETIME", "LOCALDATETIME", 
			"DATE", "TIME", "LOCALTIME", "DURATION", "MULTISET", "SET", "LIST", "DLIST", 
			"STRUCT", "DEFAULT", "MIN", "MAX", "UNIQUE", "NULL", "OPTIONAL", "COMMENT", 
			"STR", "UNSIGNED_INT", "ALNUMPLUS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "YARSpg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YARSpgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class YarspgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YARSpgParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MetadataContext> metadata() {
			return getRuleContexts(MetadataContext.class);
		}
		public MetadataContext metadata(int i) {
			return getRuleContext(MetadataContext.class,i);
		}
		public YarspgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yarspg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterYarspg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitYarspg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitYarspg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YarspgContext yarspg() throws RecognitionException {
		YarspgContext _localctx = new YarspgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_yarspg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__10) | (1L << T__13) | (1L << T__17))) != 0)) {
				{
				{
				setState(108);
				statement();
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(109);
					metadata();
					}
					break;
				}
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public EdgeContext edge() {
			return getRuleContext(EdgeContext.class,0);
		}
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Node_schemaContext node_schema() {
			return getRuleContext(Node_schemaContext.class,0);
		}
		public Edge_schemaContext edge_schema() {
			return getRuleContext(Edge_schemaContext.class,0);
		}
		public Variable_declaration_schemaContext variable_declaration_schema() {
			return getRuleContext(Variable_declaration_schemaContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public Graph_schemaContext graph_schema() {
			return getRuleContext(Graph_schemaContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				node();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				edge();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				metadata();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				variable_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				node_schema();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				edge_schema();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				variable_declaration_schema();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(126);
				graph();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				graph_schema();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetadataContext extends ParserRuleContext {
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_metadata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__0);
			setState(131);
			prop_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__1);
			setState(134);
			variable_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			variable();
			setState(137);
			match(T__2);
			setState(138);
			prop();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(139);
				match(T__3);
				setState(140);
				prop();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaration_schemaContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<Prop_schemaContext> prop_schema() {
			return getRuleContexts(Prop_schemaContext.class);
		}
		public Prop_schemaContext prop_schema(int i) {
			return getRuleContext(Prop_schemaContext.class,i);
		}
		public Variable_declaration_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterVariable_declaration_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitVariable_declaration_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitVariable_declaration_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_schemaContext variable_declaration_schema() throws RecognitionException {
		Variable_declaration_schemaContext _localctx = new Variable_declaration_schemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_declaration_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			variable();
			setState(147);
			match(T__2);
			setState(148);
			prop_schema();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(149);
				match(T__3);
				setState(150);
				prop_schema();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ALNUMPLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Graph_idContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(YARSpgParser.DEFAULT, 0); }
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Graph_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterGraph_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitGraph_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitGraph_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_idContext graph_id() throws RecognitionException {
		Graph_idContext _localctx = new Graph_idContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_graph_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==ALNUMPLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prop_listContext extends ParserRuleContext {
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Prop_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterProp_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitProp_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitProp_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_listContext prop_list() throws RecognitionException {
		Prop_listContext _localctx = new Prop_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_prop_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__4);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==STR) {
				{
				setState(163);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(161);
					prop();
					}
					break;
				case T__1:
					{
					setState(162);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(165);
					match(T__3);
					setState(168);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STR:
						{
						setState(166);
						prop();
						}
						break;
					case T__1:
						{
						setState(167);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(177);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Meta_propContext extends ParserRuleContext {
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Meta_propContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterMeta_prop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitMeta_prop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitMeta_prop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Meta_propContext meta_prop() throws RecognitionException {
		Meta_propContext _localctx = new Meta_propContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_meta_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__6);
			setState(180);
			match(T__7);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(181);
				key();
				setState(182);
				match(T__8);
				setState(183);
				value();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(184);
					match(T__3);
					setState(185);
					key();
					setState(186);
					match(T__8);
					setState(187);
					value();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(196);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Graphs_listContext extends ParserRuleContext {
		public List<Graph_idContext> graph_id() {
			return getRuleContexts(Graph_idContext.class);
		}
		public Graph_idContext graph_id(int i) {
			return getRuleContext(Graph_idContext.class,i);
		}
		public Graphs_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphs_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterGraphs_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitGraphs_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitGraphs_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graphs_listContext graphs_list() throws RecognitionException {
		Graphs_listContext _localctx = new Graphs_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_graphs_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__10);
			setState(199);
			graph_id();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(200);
				match(T__3);
				setState(201);
				graph_id();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphContext extends ParserRuleContext {
		public Graph_idContext graph_id() {
			return getRuleContext(Graph_idContext.class,0);
		}
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public List<Graph_labelContext> graph_label() {
			return getRuleContexts(Graph_labelContext.class);
		}
		public Graph_labelContext graph_label(int i) {
			return getRuleContext(Graph_labelContext.class,i);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitGraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__10);
			setState(210);
			graph_id();
			setState(211);
			match(T__10);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(212);
				match(T__11);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(213);
					graph_label();
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(214);
						match(T__3);
						setState(215);
						graph_label();
						}
						}
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(223);
				match(T__12);
				}
			}

			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(226);
				prop_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeContext extends ParserRuleContext {
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__13);
			setState(230);
			node_id();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(231);
				match(T__11);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(232);
					node_label();
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(233);
						match(T__3);
						setState(234);
						node_label();
						}
						}
						setState(239);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(242);
				match(T__12);
				}
			}

			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(245);
				prop_list();
				}
			}

			setState(248);
			match(T__14);
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(249);
				graphs_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeContext extends ParserRuleContext {
		public DirectedContext directed() {
			return getRuleContext(DirectedContext.class,0);
		}
		public UndirectedContext undirected() {
			return getRuleContext(UndirectedContext.class,0);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_edge);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				directed();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				undirected();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectedContext extends ParserRuleContext {
		public List<Node_idContext> node_id() {
			return getRuleContexts(Node_idContext.class);
		}
		public Node_idContext node_id(int i) {
			return getRuleContext(Node_idContext.class,i);
		}
		public Edge_idContext edge_id() {
			return getRuleContext(Edge_idContext.class,0);
		}
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public List<Edge_labelContext> edge_label() {
			return getRuleContexts(Edge_labelContext.class);
		}
		public Edge_labelContext edge_label(int i) {
			return getRuleContext(Edge_labelContext.class,i);
		}
		public DirectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterDirected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitDirected(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitDirected(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectedContext directed() throws RecognitionException {
		DirectedContext _localctx = new DirectedContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_directed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__13);
			setState(257);
			node_id();
			setState(258);
			match(T__14);
			setState(259);
			match(T__15);
			setState(260);
			match(T__13);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALNUMPLUS) {
				{
				setState(261);
				edge_id();
				}
			}

			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(264);
				match(T__11);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(265);
					edge_label();
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(266);
						match(T__3);
						setState(267);
						edge_label();
						}
						}
						setState(272);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(275);
				match(T__12);
				}
			}

			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(278);
				prop_list();
				}
			}

			setState(281);
			match(T__14);
			setState(282);
			match(T__16);
			setState(283);
			match(T__13);
			setState(284);
			node_id();
			setState(285);
			match(T__14);
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(286);
				graphs_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UndirectedContext extends ParserRuleContext {
		public List<Node_idContext> node_id() {
			return getRuleContexts(Node_idContext.class);
		}
		public Node_idContext node_id(int i) {
			return getRuleContext(Node_idContext.class,i);
		}
		public Edge_idContext edge_id() {
			return getRuleContext(Edge_idContext.class,0);
		}
		public Prop_listContext prop_list() {
			return getRuleContext(Prop_listContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public List<Edge_labelContext> edge_label() {
			return getRuleContexts(Edge_labelContext.class);
		}
		public Edge_labelContext edge_label(int i) {
			return getRuleContext(Edge_labelContext.class,i);
		}
		public UndirectedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undirected; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterUndirected(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitUndirected(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitUndirected(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UndirectedContext undirected() throws RecognitionException {
		UndirectedContext _localctx = new UndirectedContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_undirected);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__13);
			setState(290);
			node_id();
			setState(291);
			match(T__14);
			setState(292);
			match(T__15);
			setState(293);
			match(T__13);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALNUMPLUS) {
				{
				setState(294);
				edge_id();
				}
			}

			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(297);
				match(T__11);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(298);
					edge_label();
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(299);
						match(T__3);
						setState(300);
						edge_label();
						}
						}
						setState(305);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(308);
				match(T__12);
				}
			}

			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(311);
				prop_list();
				}
			}

			setState(314);
			match(T__14);
			setState(315);
			match(T__15);
			setState(316);
			match(T__13);
			setState(317);
			node_id();
			setState(318);
			match(T__14);
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(319);
				graphs_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_idContext extends ParserRuleContext {
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Node_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNode_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNode_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitNode_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_idContext node_id() throws RecognitionException {
		Node_idContext _localctx = new Node_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_node_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(ALNUMPLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_labelContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(YARSpgParser.STR, 0); }
		public Node_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNode_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNode_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitNode_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_labelContext node_label() throws RecognitionException {
		Node_labelContext _localctx = new Node_labelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_node_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Meta_propContext meta_prop() {
			return getRuleContext(Meta_propContext.class,0);
		}
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitProp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitProp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			key();
			setState(327);
			match(T__8);
			setState(328);
			value();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(329);
				meta_prop();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Edge_idContext extends ParserRuleContext {
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Edge_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterEdge_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitEdge_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitEdge_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_idContext edge_id() throws RecognitionException {
		Edge_idContext _localctx = new Edge_idContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_edge_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(ALNUMPLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Edge_labelContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(YARSpgParser.STR, 0); }
		public Edge_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterEdge_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitEdge_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitEdge_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_labelContext edge_label() throws RecognitionException {
		Edge_labelContext _localctx = new Edge_labelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_edge_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Graph_labelContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(YARSpgParser.STR, 0); }
		public Graph_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterGraph_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitGraph_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitGraph_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_labelContext graph_label() throws RecognitionException {
		Graph_labelContext _localctx = new Graph_labelContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_graph_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(YARSpgParser.STR, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public Primitive_valueContext primitive_value() {
			return getRuleContext(Primitive_valueContext.class,0);
		}
		public Complex_valueContext complex_value() {
			return getRuleContext(Complex_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				primitive_value();
				}
				break;
			case T__4:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				complex_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primitive_valueContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(YARSpgParser.STR, 0); }
		public Primitive_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterPrimitive_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitPrimitive_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitPrimitive_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_valueContext primitive_value() throws RecognitionException {
		Primitive_valueContext _localctx = new Primitive_valueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_primitive_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_valueContext extends ParserRuleContext {
		public Set_valueContext set_value() {
			return getRuleContext(Set_valueContext.class,0);
		}
		public List_valueContext list_value() {
			return getRuleContext(List_valueContext.class,0);
		}
		public Struct_valueContext struct_value() {
			return getRuleContext(Struct_valueContext.class,0);
		}
		public Complex_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterComplex_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitComplex_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitComplex_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_valueContext complex_value() throws RecognitionException {
		Complex_valueContext _localctx = new Complex_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_complex_value);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				set_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				list_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				struct_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_valueContext extends ParserRuleContext {
		public List<Primitive_valueContext> primitive_value() {
			return getRuleContexts(Primitive_valueContext.class);
		}
		public Primitive_valueContext primitive_value(int i) {
			return getRuleContext(Primitive_valueContext.class,i);
		}
		public List<Set_valueContext> set_value() {
			return getRuleContexts(Set_valueContext.class);
		}
		public Set_valueContext set_value(int i) {
			return getRuleContext(Set_valueContext.class,i);
		}
		public List<Meta_propContext> meta_prop() {
			return getRuleContexts(Meta_propContext.class);
		}
		public Meta_propContext meta_prop(int i) {
			return getRuleContext(Meta_propContext.class,i);
		}
		public Set_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterSet_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitSet_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitSet_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_valueContext set_value() throws RecognitionException {
		Set_valueContext _localctx = new Set_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_set_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__11);
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				{
				setState(352);
				primitive_value();
				}
				break;
			case T__11:
				{
				setState(353);
				set_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(356);
				meta_prop();
				}
			}

			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(359);
				match(T__3);
				setState(362);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(360);
					primitive_value();
					}
					break;
				case T__11:
					{
					setState(361);
					set_value();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(364);
					meta_prop();
					}
				}

				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_valueContext extends ParserRuleContext {
		public List<Primitive_valueContext> primitive_value() {
			return getRuleContexts(Primitive_valueContext.class);
		}
		public Primitive_valueContext primitive_value(int i) {
			return getRuleContext(Primitive_valueContext.class,i);
		}
		public List<List_valueContext> list_value() {
			return getRuleContexts(List_valueContext.class);
		}
		public List_valueContext list_value(int i) {
			return getRuleContext(List_valueContext.class,i);
		}
		public List<Meta_propContext> meta_prop() {
			return getRuleContexts(Meta_propContext.class);
		}
		public Meta_propContext meta_prop(int i) {
			return getRuleContext(Meta_propContext.class,i);
		}
		public List_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterList_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitList_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitList_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_valueContext list_value() throws RecognitionException {
		List_valueContext _localctx = new List_valueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_list_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__4);
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				{
				setState(375);
				primitive_value();
				}
				break;
			case T__4:
				{
				setState(376);
				list_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(379);
				meta_prop();
				}
			}

			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(382);
				match(T__3);
				setState(385);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(383);
					primitive_value();
					}
					break;
				case T__4:
					{
					setState(384);
					list_value();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(387);
					meta_prop();
					}
				}

				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_valueContext extends ParserRuleContext {
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<Primitive_valueContext> primitive_value() {
			return getRuleContexts(Primitive_valueContext.class);
		}
		public Primitive_valueContext primitive_value(int i) {
			return getRuleContext(Primitive_valueContext.class,i);
		}
		public List<Struct_valueContext> struct_value() {
			return getRuleContexts(Struct_valueContext.class);
		}
		public Struct_valueContext struct_value(int i) {
			return getRuleContext(Struct_valueContext.class,i);
		}
		public List<Meta_propContext> meta_prop() {
			return getRuleContexts(Meta_propContext.class);
		}
		public Meta_propContext meta_prop(int i) {
			return getRuleContext(Meta_propContext.class,i);
		}
		public Struct_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterStruct_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitStruct_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitStruct_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_valueContext struct_value() throws RecognitionException {
		Struct_valueContext _localctx = new Struct_valueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_struct_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__11);
			setState(398);
			key();
			setState(399);
			match(T__8);
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				{
				setState(400);
				primitive_value();
				}
				break;
			case T__11:
				{
				setState(401);
				struct_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(404);
				meta_prop();
				}
			}

			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(407);
				match(T__3);
				setState(408);
				key();
				setState(409);
				match(T__8);
				setState(412);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(410);
					primitive_value();
					}
					break;
				case T__11:
					{
					setState(411);
					struct_value();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(414);
					meta_prop();
					}
				}

				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_schemaContext extends ParserRuleContext {
		public Node_id_schemaContext node_id_schema() {
			return getRuleContext(Node_id_schemaContext.class,0);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public List<Node_labelContext> node_label() {
			return getRuleContexts(Node_labelContext.class);
		}
		public Node_labelContext node_label(int i) {
			return getRuleContext(Node_labelContext.class,i);
		}
		public Node_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNode_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNode_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitNode_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_schemaContext node_schema() throws RecognitionException {
		Node_schemaContext _localctx = new Node_schemaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_node_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__17);
			setState(425);
			match(T__13);
			setState(426);
			node_id_schema();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(427);
				match(T__11);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(428);
					node_label();
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(429);
						match(T__3);
						setState(430);
						node_label();
						}
						}
						setState(435);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(438);
				match(T__12);
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(441);
				prop_list_schema();
				}
			}

			setState(444);
			match(T__14);
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(445);
				graphs_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_id_schemaContext extends ParserRuleContext {
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Node_id_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_id_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterNode_id_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitNode_id_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitNode_id_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_id_schemaContext node_id_schema() throws RecognitionException {
		Node_id_schemaContext _localctx = new Node_id_schemaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_node_id_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(ALNUMPLUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prop_list_schemaContext extends ParserRuleContext {
		public List<Prop_schemaContext> prop_schema() {
			return getRuleContexts(Prop_schemaContext.class);
		}
		public Prop_schemaContext prop_schema(int i) {
			return getRuleContext(Prop_schemaContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Prop_list_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_list_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterProp_list_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitProp_list_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitProp_list_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_list_schemaContext prop_list_schema() throws RecognitionException {
		Prop_list_schemaContext _localctx = new Prop_list_schemaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_prop_list_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__4);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==STR) {
				{
				setState(453);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STR:
					{
					setState(451);
					prop_schema();
					}
					break;
				case T__1:
					{
					setState(452);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(455);
					match(T__3);
					setState(458);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STR:
						{
						setState(456);
						prop_schema();
						}
						break;
					case T__1:
						{
						setState(457);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(467);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prop_schemaContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Value_schemaContext value_schema() {
			return getRuleContext(Value_schemaContext.class,0);
		}
		public Prop_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterProp_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitProp_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitProp_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_schemaContext prop_schema() throws RecognitionException {
		Prop_schemaContext _localctx = new Prop_schemaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_prop_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			key();
			setState(470);
			match(T__8);
			setState(471);
			value_schema();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Meta_prop_schemaContext extends ParserRuleContext {
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public List<Value_schemaContext> value_schema() {
			return getRuleContexts(Value_schemaContext.class);
		}
		public Value_schemaContext value_schema(int i) {
			return getRuleContext(Value_schemaContext.class,i);
		}
		public Meta_prop_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_prop_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterMeta_prop_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitMeta_prop_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitMeta_prop_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Meta_prop_schemaContext meta_prop_schema() throws RecognitionException {
		Meta_prop_schemaContext _localctx = new Meta_prop_schemaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_meta_prop_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__6);
			setState(474);
			match(T__7);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STR) {
				{
				setState(475);
				key();
				setState(476);
				match(T__8);
				setState(477);
				value_schema();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(478);
					match(T__3);
					setState(479);
					key();
					setState(480);
					match(T__8);
					setState(481);
					value_schema();
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(490);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CardinalityContext extends ParserRuleContext {
		public Min_cardinalityContext min_cardinality() {
			return getRuleContext(Min_cardinalityContext.class,0);
		}
		public Max_cardinalityContext max_cardinality() {
			return getRuleContext(Max_cardinalityContext.class,0);
		}
		public CardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cardinality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterCardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitCardinality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitCardinality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CardinalityContext cardinality() throws RecognitionException {
		CardinalityContext _localctx = new CardinalityContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cardinality);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				min_cardinality();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MAX) {
					{
					setState(493);
					max_cardinality();
					}
				}

				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				max_cardinality();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Min_cardinalityContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(YARSpgParser.MIN, 0); }
		public Card_numContext card_num() {
			return getRuleContext(Card_numContext.class,0);
		}
		public Min_cardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_cardinality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterMin_cardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitMin_cardinality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitMin_cardinality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Min_cardinalityContext min_cardinality() throws RecognitionException {
		Min_cardinalityContext _localctx = new Min_cardinalityContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_min_cardinality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(MIN);
			setState(500);
			card_num();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Max_cardinalityContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(YARSpgParser.MAX, 0); }
		public Card_numContext card_num() {
			return getRuleContext(Card_numContext.class,0);
		}
		public Max_cardinalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_cardinality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterMax_cardinality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitMax_cardinality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitMax_cardinality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_cardinalityContext max_cardinality() throws RecognitionException {
		Max_cardinalityContext _localctx = new Max_cardinalityContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_max_cardinality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(MAX);
			setState(503);
			card_num();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Card_numContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(YARSpgParser.UNSIGNED_INT, 0); }
		public Card_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterCard_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitCard_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitCard_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Card_numContext card_num() throws RecognitionException {
		Card_numContext _localctx = new Card_numContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_card_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(UNSIGNED_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_schemaContext extends ParserRuleContext {
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(YARSpgParser.OPTIONAL, 0); }
		public Meta_prop_schemaContext meta_prop_schema() {
			return getRuleContext(Meta_prop_schemaContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(YARSpgParser.UNIQUE, 0); }
		public TerminalNode NULL() { return getToken(YARSpgParser.NULL, 0); }
		public Complex_value_schemaContext complex_value_schema() {
			return getRuleContext(Complex_value_schemaContext.class,0);
		}
		public Value_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterValue_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitValue_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitValue_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_schemaContext value_schema() throws RecognitionException {
		Value_schemaContext _localctx = new Value_schemaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value_schema);
		int _la;
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case STRING:
			case BYTES:
			case INTEGER:
			case UINTEGER:
			case DECIMAL:
			case FLOAT:
			case DATETIME:
			case LOCALDATETIME:
			case DATE:
			case TIME:
			case LOCALTIME:
			case DURATION:
			case ALNUMPLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				primitive_value_schema();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIQUE || _la==NULL) {
					{
					setState(508);
					_la = _input.LA(1);
					if ( !(_la==UNIQUE || _la==NULL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(511);
					match(OPTIONAL);
					}
				}

				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(514);
					meta_prop_schema();
					}
				}

				}
				break;
			case MULTISET:
			case SET:
			case LIST:
			case DLIST:
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				complex_value_schema();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NULL) {
					{
					setState(518);
					match(NULL);
					}
				}

				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(521);
					match(OPTIONAL);
					}
				}

				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(524);
					meta_prop_schema();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primitive_value_schemaContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(YARSpgParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(YARSpgParser.STRING, 0); }
		public Max_lengthContext max_length() {
			return getRuleContext(Max_lengthContext.class,0);
		}
		public TerminalNode BYTES() { return getToken(YARSpgParser.BYTES, 0); }
		public Min_lengthContext min_length() {
			return getRuleContext(Min_lengthContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(YARSpgParser.INTEGER, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode UINTEGER() { return getToken(YARSpgParser.UINTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(YARSpgParser.DECIMAL, 0); }
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(YARSpgParser.FLOAT, 0); }
		public TerminalNode DATETIME() { return getToken(YARSpgParser.DATETIME, 0); }
		public TerminalNode LOCALDATETIME() { return getToken(YARSpgParser.LOCALDATETIME, 0); }
		public TerminalNode DATE() { return getToken(YARSpgParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(YARSpgParser.TIME, 0); }
		public TerminalNode LOCALTIME() { return getToken(YARSpgParser.LOCALTIME, 0); }
		public TerminalNode DURATION() { return getToken(YARSpgParser.DURATION, 0); }
		public TerminalNode ALNUMPLUS() { return getToken(YARSpgParser.ALNUMPLUS, 0); }
		public Primitive_value_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_value_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterPrimitive_value_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitPrimitive_value_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitPrimitive_value_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_value_schemaContext primitive_value_schema() throws RecognitionException {
		Primitive_value_schemaContext _localctx = new Primitive_value_schemaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_primitive_value_schema);
		int _la;
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(STRING);
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(531);
					match(T__13);
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(532);
						max_length();
						}
					}

					setState(535);
					match(T__14);
					}
					break;
				}
				}
				break;
			case BYTES:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				match(BYTES);
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(539);
					match(T__13);
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(543);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
						case 1:
							{
							setState(540);
							min_length();
							setState(541);
							match(T__3);
							}
							break;
						}
						setState(545);
						max_length();
						}
					}

					setState(548);
					match(T__14);
					}
					break;
				}
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				match(INTEGER);
				setState(557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(552);
					match(T__13);
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(553);
						precision();
						}
					}

					setState(556);
					match(T__14);
					}
					break;
				}
				}
				break;
			case UINTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				match(UINTEGER);
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(560);
					match(T__13);
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(561);
						precision();
						}
					}

					setState(564);
					match(T__14);
					}
					break;
				}
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(567);
				match(DECIMAL);
				setState(577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(568);
					match(T__13);
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(569);
						precision();
						setState(572);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__3) {
							{
							setState(570);
							match(T__3);
							setState(571);
							scale();
							}
						}

						}
					}

					setState(576);
					match(T__14);
					}
					break;
				}
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(579);
				match(FLOAT);
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(580);
					match(T__13);
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNSIGNED_INT) {
						{
						setState(581);
						precision();
						setState(584);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__3) {
							{
							setState(582);
							match(T__3);
							setState(583);
							scale();
							}
						}

						}
					}

					setState(588);
					match(T__14);
					}
					break;
				}
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(591);
				match(DATETIME);
				}
				break;
			case LOCALDATETIME:
				enterOuterAlt(_localctx, 9);
				{
				setState(592);
				match(LOCALDATETIME);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 10);
				{
				setState(593);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 11);
				{
				setState(594);
				match(TIME);
				}
				break;
			case LOCALTIME:
				enterOuterAlt(_localctx, 12);
				{
				setState(595);
				match(LOCALTIME);
				}
				break;
			case DURATION:
				enterOuterAlt(_localctx, 13);
				{
				setState(596);
				match(DURATION);
				}
				break;
			case ALNUMPLUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(597);
				match(ALNUMPLUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Min_lengthContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(YARSpgParser.UNSIGNED_INT, 0); }
		public Min_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterMin_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitMin_length(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitMin_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Min_lengthContext min_length() throws RecognitionException {
		Min_lengthContext _localctx = new Min_lengthContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_min_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(UNSIGNED_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Max_lengthContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(YARSpgParser.UNSIGNED_INT, 0); }
		public Max_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterMax_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitMax_length(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitMax_length(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_lengthContext max_length() throws RecognitionException {
		Max_lengthContext _localctx = new Max_lengthContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_max_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(UNSIGNED_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecisionContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(YARSpgParser.UNSIGNED_INT, 0); }
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitPrecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(UNSIGNED_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(YARSpgParser.UNSIGNED_INT, 0); }
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(UNSIGNED_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_value_schemaContext extends ParserRuleContext {
		public Multiset_schemaContext multiset_schema() {
			return getRuleContext(Multiset_schemaContext.class,0);
		}
		public Set_schemaContext set_schema() {
			return getRuleContext(Set_schemaContext.class,0);
		}
		public List_schemaContext list_schema() {
			return getRuleContext(List_schemaContext.class,0);
		}
		public Dlist_schemaContext dlist_schema() {
			return getRuleContext(Dlist_schemaContext.class,0);
		}
		public Struct_schemaContext struct_schema() {
			return getRuleContext(Struct_schemaContext.class,0);
		}
		public Complex_value_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_value_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterComplex_value_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitComplex_value_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitComplex_value_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_value_schemaContext complex_value_schema() throws RecognitionException {
		Complex_value_schemaContext _localctx = new Complex_value_schemaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_complex_value_schema);
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTISET:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				multiset_schema();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				set_schema();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(610);
				list_schema();
				}
				break;
			case DLIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				dlist_schema();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 5);
				{
				setState(612);
				struct_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiset_schemaContext extends ParserRuleContext {
		public TerminalNode MULTISET() { return getToken(YARSpgParser.MULTISET, 0); }
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public Multiset_schemaContext multiset_schema() {
			return getRuleContext(Multiset_schemaContext.class,0);
		}
		public TerminalNode NULL() { return getToken(YARSpgParser.NULL, 0); }
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public Meta_prop_schemaContext meta_prop_schema() {
			return getRuleContext(Meta_prop_schemaContext.class,0);
		}
		public Multiset_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiset_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterMultiset_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitMultiset_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitMultiset_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiset_schemaContext multiset_schema() throws RecognitionException {
		Multiset_schemaContext _localctx = new Multiset_schemaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_multiset_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(MULTISET);
			setState(616);
			match(T__13);
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case STRING:
			case BYTES:
			case INTEGER:
			case UINTEGER:
			case DECIMAL:
			case FLOAT:
			case DATETIME:
			case LOCALDATETIME:
			case DATE:
			case TIME:
			case LOCALTIME:
			case DURATION:
			case ALNUMPLUS:
				{
				setState(617);
				primitive_value_schema();
				}
				break;
			case MULTISET:
				{
				setState(618);
				multiset_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULL) {
				{
				setState(621);
				match(NULL);
				}
			}

			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MIN || _la==MAX) {
				{
				setState(624);
				cardinality();
				}
			}

			setState(627);
			match(T__14);
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(628);
				meta_prop_schema();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_schemaContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(YARSpgParser.SET, 0); }
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public Set_schemaContext set_schema() {
			return getRuleContext(Set_schemaContext.class,0);
		}
		public TerminalNode NULL() { return getToken(YARSpgParser.NULL, 0); }
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public Meta_prop_schemaContext meta_prop_schema() {
			return getRuleContext(Meta_prop_schemaContext.class,0);
		}
		public Set_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterSet_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitSet_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitSet_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_schemaContext set_schema() throws RecognitionException {
		Set_schemaContext _localctx = new Set_schemaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_set_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(SET);
			setState(632);
			match(T__13);
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case STRING:
			case BYTES:
			case INTEGER:
			case UINTEGER:
			case DECIMAL:
			case FLOAT:
			case DATETIME:
			case LOCALDATETIME:
			case DATE:
			case TIME:
			case LOCALTIME:
			case DURATION:
			case ALNUMPLUS:
				{
				setState(633);
				primitive_value_schema();
				}
				break;
			case SET:
				{
				setState(634);
				set_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULL) {
				{
				setState(637);
				match(NULL);
				}
			}

			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MIN || _la==MAX) {
				{
				setState(640);
				cardinality();
				}
			}

			setState(643);
			match(T__14);
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(644);
				meta_prop_schema();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_schemaContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(YARSpgParser.LIST, 0); }
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public List_schemaContext list_schema() {
			return getRuleContext(List_schemaContext.class,0);
		}
		public TerminalNode NULL() { return getToken(YARSpgParser.NULL, 0); }
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public Meta_prop_schemaContext meta_prop_schema() {
			return getRuleContext(Meta_prop_schemaContext.class,0);
		}
		public List_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterList_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitList_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitList_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_schemaContext list_schema() throws RecognitionException {
		List_schemaContext _localctx = new List_schemaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_list_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(LIST);
			setState(648);
			match(T__13);
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case STRING:
			case BYTES:
			case INTEGER:
			case UINTEGER:
			case DECIMAL:
			case FLOAT:
			case DATETIME:
			case LOCALDATETIME:
			case DATE:
			case TIME:
			case LOCALTIME:
			case DURATION:
			case ALNUMPLUS:
				{
				setState(649);
				primitive_value_schema();
				}
				break;
			case LIST:
				{
				setState(650);
				list_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULL) {
				{
				setState(653);
				match(NULL);
				}
			}

			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MIN || _la==MAX) {
				{
				setState(656);
				cardinality();
				}
			}

			setState(659);
			match(T__14);
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(660);
				meta_prop_schema();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dlist_schemaContext extends ParserRuleContext {
		public TerminalNode DLIST() { return getToken(YARSpgParser.DLIST, 0); }
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public Dlist_schemaContext dlist_schema() {
			return getRuleContext(Dlist_schemaContext.class,0);
		}
		public TerminalNode NULL() { return getToken(YARSpgParser.NULL, 0); }
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public Meta_prop_schemaContext meta_prop_schema() {
			return getRuleContext(Meta_prop_schemaContext.class,0);
		}
		public Dlist_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dlist_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterDlist_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitDlist_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitDlist_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dlist_schemaContext dlist_schema() throws RecognitionException {
		Dlist_schemaContext _localctx = new Dlist_schemaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dlist_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(DLIST);
			setState(664);
			match(T__13);
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case STRING:
			case BYTES:
			case INTEGER:
			case UINTEGER:
			case DECIMAL:
			case FLOAT:
			case DATETIME:
			case LOCALDATETIME:
			case DATE:
			case TIME:
			case LOCALTIME:
			case DURATION:
			case ALNUMPLUS:
				{
				setState(665);
				primitive_value_schema();
				}
				break;
			case DLIST:
				{
				setState(666);
				dlist_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULL) {
				{
				setState(669);
				match(NULL);
				}
			}

			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MIN || _la==MAX) {
				{
				setState(672);
				cardinality();
				}
			}

			setState(675);
			match(T__14);
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(676);
				meta_prop_schema();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_schemaContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(YARSpgParser.STRUCT, 0); }
		public Primitive_value_schemaContext primitive_value_schema() {
			return getRuleContext(Primitive_value_schemaContext.class,0);
		}
		public Struct_schemaContext struct_schema() {
			return getRuleContext(Struct_schemaContext.class,0);
		}
		public TerminalNode NULL() { return getToken(YARSpgParser.NULL, 0); }
		public CardinalityContext cardinality() {
			return getRuleContext(CardinalityContext.class,0);
		}
		public Meta_prop_schemaContext meta_prop_schema() {
			return getRuleContext(Meta_prop_schemaContext.class,0);
		}
		public Struct_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterStruct_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitStruct_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitStruct_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_schemaContext struct_schema() throws RecognitionException {
		Struct_schemaContext _localctx = new Struct_schemaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_struct_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(STRUCT);
			setState(680);
			match(T__13);
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case STRING:
			case BYTES:
			case INTEGER:
			case UINTEGER:
			case DECIMAL:
			case FLOAT:
			case DATETIME:
			case LOCALDATETIME:
			case DATE:
			case TIME:
			case LOCALTIME:
			case DURATION:
			case ALNUMPLUS:
				{
				setState(681);
				primitive_value_schema();
				}
				break;
			case STRUCT:
				{
				setState(682);
				struct_schema();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULL) {
				{
				setState(685);
				match(NULL);
				}
			}

			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MIN || _la==MAX) {
				{
				setState(688);
				cardinality();
				}
			}

			setState(691);
			match(T__14);
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(692);
				meta_prop_schema();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Edge_schemaContext extends ParserRuleContext {
		public Directed_schemaContext directed_schema() {
			return getRuleContext(Directed_schemaContext.class,0);
		}
		public Undirected_schemaContext undirected_schema() {
			return getRuleContext(Undirected_schemaContext.class,0);
		}
		public Edge_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterEdge_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitEdge_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitEdge_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_schemaContext edge_schema() throws RecognitionException {
		Edge_schemaContext _localctx = new Edge_schemaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_edge_schema);
		try {
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				directed_schema();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				undirected_schema();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Directed_schemaContext extends ParserRuleContext {
		public List<Node_id_schemaContext> node_id_schema() {
			return getRuleContexts(Node_id_schemaContext.class);
		}
		public Node_id_schemaContext node_id_schema(int i) {
			return getRuleContext(Node_id_schemaContext.class,i);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public List<Edge_labelContext> edge_label() {
			return getRuleContexts(Edge_labelContext.class);
		}
		public Edge_labelContext edge_label(int i) {
			return getRuleContext(Edge_labelContext.class,i);
		}
		public Directed_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directed_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterDirected_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitDirected_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitDirected_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directed_schemaContext directed_schema() throws RecognitionException {
		Directed_schemaContext _localctx = new Directed_schemaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_directed_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(T__17);
			setState(700);
			match(T__13);
			setState(701);
			node_id_schema();
			setState(702);
			match(T__14);
			setState(703);
			match(T__15);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(704);
				match(T__13);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(705);
					match(T__11);
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STR) {
						{
						setState(706);
						edge_label();
						setState(711);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(707);
							match(T__3);
							setState(708);
							edge_label();
							}
							}
							setState(713);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(716);
					match(T__12);
					}
				}

				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(719);
					prop_list_schema();
					}
				}

				setState(722);
				match(T__14);
				}
			}

			setState(725);
			match(T__16);
			setState(726);
			match(T__13);
			setState(727);
			node_id_schema();
			setState(728);
			match(T__14);
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(729);
				graphs_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Undirected_schemaContext extends ParserRuleContext {
		public List<Node_id_schemaContext> node_id_schema() {
			return getRuleContexts(Node_id_schemaContext.class);
		}
		public Node_id_schemaContext node_id_schema(int i) {
			return getRuleContext(Node_id_schemaContext.class,i);
		}
		public Graphs_listContext graphs_list() {
			return getRuleContext(Graphs_listContext.class,0);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public List<Edge_labelContext> edge_label() {
			return getRuleContexts(Edge_labelContext.class);
		}
		public Edge_labelContext edge_label(int i) {
			return getRuleContext(Edge_labelContext.class,i);
		}
		public Undirected_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undirected_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterUndirected_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitUndirected_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitUndirected_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Undirected_schemaContext undirected_schema() throws RecognitionException {
		Undirected_schemaContext _localctx = new Undirected_schemaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_undirected_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__17);
			setState(733);
			match(T__13);
			setState(734);
			node_id_schema();
			setState(735);
			match(T__14);
			setState(736);
			match(T__15);
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(737);
				match(T__13);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(738);
					match(T__11);
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STR) {
						{
						setState(739);
						edge_label();
						setState(744);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(740);
							match(T__3);
							setState(741);
							edge_label();
							}
							}
							setState(746);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(749);
					match(T__12);
					}
				}

				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(752);
					prop_list_schema();
					}
				}

				setState(755);
				match(T__14);
				}
			}

			setState(758);
			match(T__15);
			setState(759);
			match(T__13);
			setState(760);
			node_id_schema();
			setState(761);
			match(T__14);
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(762);
				graphs_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Graph_schemaContext extends ParserRuleContext {
		public Graph_idContext graph_id() {
			return getRuleContext(Graph_idContext.class,0);
		}
		public Prop_list_schemaContext prop_list_schema() {
			return getRuleContext(Prop_list_schemaContext.class,0);
		}
		public Graph_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).enterGraph_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YARSpgListener ) ((YARSpgListener)listener).exitGraph_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YARSpgVisitor) return ((YARSpgVisitor<? extends T>)visitor).visitGraph_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_schemaContext graph_schema() throws RecognitionException {
		Graph_schemaContext _localctx = new Graph_schemaContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_graph_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(T__17);
			setState(766);
			match(T__10);
			setState(767);
			graph_id();
			setState(768);
			match(T__10);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(769);
				prop_list_schema();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0307\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\5\2q\n\2\7\2s\n\2\f\2\16\2v"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0083\n\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\7\7\u009a\n\7\f\7\16\7\u009d\13\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\5\n\u00a6\n\n\3\n\3\n\3\n\5\n\u00ab\n\n\7\n\u00ad\n\n\f"+
		"\n\16\n\u00b0\13\n\5\n\u00b2\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00c0\n\13\f\13\16\13\u00c3\13\13\5\13\u00c5"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u00cd\n\f\f\f\16\f\u00d0\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00db\n\r\f\r\16\r\u00de\13\r\5\r"+
		"\u00e0\n\r\3\r\5\r\u00e3\n\r\3\r\5\r\u00e6\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00ee\n\16\f\16\16\16\u00f1\13\16\5\16\u00f3\n\16\3\16\5\16"+
		"\u00f6\n\16\3\16\5\16\u00f9\n\16\3\16\3\16\5\16\u00fd\n\16\3\17\3\17\5"+
		"\17\u0101\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0109\n\20\3\20\3\20"+
		"\3\20\3\20\7\20\u010f\n\20\f\20\16\20\u0112\13\20\5\20\u0114\n\20\3\20"+
		"\5\20\u0117\n\20\3\20\5\20\u011a\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u0122\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u012a\n\21\3\21\3\21"+
		"\3\21\3\21\7\21\u0130\n\21\f\21\16\21\u0133\13\21\5\21\u0135\n\21\3\21"+
		"\5\21\u0138\n\21\3\21\5\21\u013b\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0143\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u014d\n\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u0159\n\31\3\32"+
		"\3\32\3\33\3\33\3\33\5\33\u0160\n\33\3\34\3\34\3\34\5\34\u0165\n\34\3"+
		"\34\5\34\u0168\n\34\3\34\3\34\3\34\5\34\u016d\n\34\3\34\5\34\u0170\n\34"+
		"\7\34\u0172\n\34\f\34\16\34\u0175\13\34\3\34\3\34\3\35\3\35\3\35\5\35"+
		"\u017c\n\35\3\35\5\35\u017f\n\35\3\35\3\35\3\35\5\35\u0184\n\35\3\35\5"+
		"\35\u0187\n\35\7\35\u0189\n\35\f\35\16\35\u018c\13\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\5\36\u0195\n\36\3\36\5\36\u0198\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u019f\n\36\3\36\5\36\u01a2\n\36\7\36\u01a4\n\36\f\36\16"+
		"\36\u01a7\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01b2"+
		"\n\37\f\37\16\37\u01b5\13\37\5\37\u01b7\n\37\3\37\5\37\u01ba\n\37\3\37"+
		"\5\37\u01bd\n\37\3\37\3\37\5\37\u01c1\n\37\3 \3 \3!\3!\3!\5!\u01c8\n!"+
		"\3!\3!\3!\5!\u01cd\n!\7!\u01cf\n!\f!\16!\u01d2\13!\5!\u01d4\n!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u01e6\n#\f#\16#\u01e9"+
		"\13#\5#\u01eb\n#\3#\3#\3$\3$\5$\u01f1\n$\3$\5$\u01f4\n$\3%\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3(\3(\5(\u0200\n(\3(\5(\u0203\n(\3(\5(\u0206\n(\3(\3(\5("+
		"\u020a\n(\3(\5(\u020d\n(\3(\5(\u0210\n(\5(\u0212\n(\3)\3)\3)\3)\5)\u0218"+
		"\n)\3)\5)\u021b\n)\3)\3)\3)\3)\3)\5)\u0222\n)\3)\5)\u0225\n)\3)\5)\u0228"+
		"\n)\3)\3)\3)\5)\u022d\n)\3)\5)\u0230\n)\3)\3)\3)\5)\u0235\n)\3)\5)\u0238"+
		"\n)\3)\3)\3)\3)\3)\5)\u023f\n)\5)\u0241\n)\3)\5)\u0244\n)\3)\3)\3)\3)"+
		"\3)\5)\u024b\n)\5)\u024d\n)\3)\5)\u0250\n)\3)\3)\3)\3)\3)\3)\3)\5)\u0259"+
		"\n)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\5.\u0268\n.\3/\3/\3/\3/\5/"+
		"\u026e\n/\3/\5/\u0271\n/\3/\5/\u0274\n/\3/\3/\5/\u0278\n/\3\60\3\60\3"+
		"\60\3\60\5\60\u027e\n\60\3\60\5\60\u0281\n\60\3\60\5\60\u0284\n\60\3\60"+
		"\3\60\5\60\u0288\n\60\3\61\3\61\3\61\3\61\5\61\u028e\n\61\3\61\5\61\u0291"+
		"\n\61\3\61\5\61\u0294\n\61\3\61\3\61\5\61\u0298\n\61\3\62\3\62\3\62\3"+
		"\62\5\62\u029e\n\62\3\62\5\62\u02a1\n\62\3\62\5\62\u02a4\n\62\3\62\3\62"+
		"\5\62\u02a8\n\62\3\63\3\63\3\63\3\63\5\63\u02ae\n\63\3\63\5\63\u02b1\n"+
		"\63\3\63\5\63\u02b4\n\63\3\63\3\63\5\63\u02b8\n\63\3\64\3\64\5\64\u02bc"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u02c8\n\65"+
		"\f\65\16\65\u02cb\13\65\5\65\u02cd\n\65\3\65\5\65\u02d0\n\65\3\65\5\65"+
		"\u02d3\n\65\3\65\5\65\u02d6\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u02dd\n"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u02e9\n\66"+
		"\f\66\16\66\u02ec\13\66\5\66\u02ee\n\66\3\66\5\66\u02f1\n\66\3\66\5\66"+
		"\u02f4\n\66\3\66\5\66\u02f7\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u02fe\n"+
		"\66\3\67\3\67\3\67\3\67\3\67\5\67\u0305\n\67\3\67\2\28\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjl\2\4\4\2\'\'\60\60\3\2*+\2\u0362\2t\3\2\2\2\4\u0082\3\2\2\2\6\u0084"+
		"\3\2\2\2\b\u0087\3\2\2\2\n\u008a\3\2\2\2\f\u0094\3\2\2\2\16\u009e\3\2"+
		"\2\2\20\u00a0\3\2\2\2\22\u00a2\3\2\2\2\24\u00b5\3\2\2\2\26\u00c8\3\2\2"+
		"\2\30\u00d3\3\2\2\2\32\u00e7\3\2\2\2\34\u0100\3\2\2\2\36\u0102\3\2\2\2"+
		" \u0123\3\2\2\2\"\u0144\3\2\2\2$\u0146\3\2\2\2&\u0148\3\2\2\2(\u014e\3"+
		"\2\2\2*\u0150\3\2\2\2,\u0152\3\2\2\2.\u0154\3\2\2\2\60\u0158\3\2\2\2\62"+
		"\u015a\3\2\2\2\64\u015f\3\2\2\2\66\u0161\3\2\2\28\u0178\3\2\2\2:\u018f"+
		"\3\2\2\2<\u01aa\3\2\2\2>\u01c2\3\2\2\2@\u01c4\3\2\2\2B\u01d7\3\2\2\2D"+
		"\u01db\3\2\2\2F\u01f3\3\2\2\2H\u01f5\3\2\2\2J\u01f8\3\2\2\2L\u01fb\3\2"+
		"\2\2N\u0211\3\2\2\2P\u0258\3\2\2\2R\u025a\3\2\2\2T\u025c\3\2\2\2V\u025e"+
		"\3\2\2\2X\u0260\3\2\2\2Z\u0267\3\2\2\2\\\u0269\3\2\2\2^\u0279\3\2\2\2"+
		"`\u0289\3\2\2\2b\u0299\3\2\2\2d\u02a9\3\2\2\2f\u02bb\3\2\2\2h\u02bd\3"+
		"\2\2\2j\u02de\3\2\2\2l\u02ff\3\2\2\2np\5\4\3\2oq\5\6\4\2po\3\2\2\2pq\3"+
		"\2\2\2qs\3\2\2\2rn\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3"+
		"\2\2\2wx\7\2\2\3x\3\3\2\2\2y\u0083\5\32\16\2z\u0083\5\34\17\2{\u0083\5"+
		"\6\4\2|\u0083\5\n\6\2}\u0083\5<\37\2~\u0083\5f\64\2\177\u0083\5\f\7\2"+
		"\u0080\u0083\5\30\r\2\u0081\u0083\5l\67\2\u0082y\3\2\2\2\u0082z\3\2\2"+
		"\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0082\177"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\5\3\2\2\2\u0084"+
		"\u0085\7\3\2\2\u0085\u0086\5\22\n\2\u0086\7\3\2\2\2\u0087\u0088\7\4\2"+
		"\2\u0088\u0089\5\16\b\2\u0089\t\3\2\2\2\u008a\u008b\5\b\5\2\u008b\u008c"+
		"\7\5\2\2\u008c\u0091\5&\24\2\u008d\u008e\7\6\2\2\u008e\u0090\5&\24\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\13\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\5\b\5\2\u0095\u0096"+
		"\7\5\2\2\u0096\u009b\5B\"\2\u0097\u0098\7\6\2\2\u0098\u009a\5B\"\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\r\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\60\2\2\u009f\17"+
		"\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\21\3\2\2\2\u00a2\u00b1\7\7\2\2\u00a3"+
		"\u00a6\5&\24\2\u00a4\u00a6\5\b\5\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2"+
		"\2\2\u00a6\u00ae\3\2\2\2\u00a7\u00aa\7\6\2\2\u00a8\u00ab\5&\24\2\u00a9"+
		"\u00ab\5\b\5\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00a7\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00a5\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\b\2\2\u00b4"+
		"\23\3\2\2\2\u00b5\u00b6\7\t\2\2\u00b6\u00c4\7\n\2\2\u00b7\u00b8\5.\30"+
		"\2\u00b8\u00b9\7\13\2\2\u00b9\u00c1\5\60\31\2\u00ba\u00bb\7\6\2\2\u00bb"+
		"\u00bc\5.\30\2\u00bc\u00bd\7\13\2\2\u00bd\u00be\5\60\31\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00ba\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00b7\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\f\2\2\u00c7"+
		"\25\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ce\5\20\t\2\u00ca\u00cb\7\6\2"+
		"\2\u00cb\u00cd\5\20\t\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\7\r\2\2\u00d2\27\3\2\2\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5"+
		"\5\20\t\2\u00d5\u00e2\7\r\2\2\u00d6\u00df\7\16\2\2\u00d7\u00dc\5,\27\2"+
		"\u00d8\u00d9\7\6\2\2\u00d9\u00db\5,\27\2\u00da\u00d8\3\2\2\2\u00db\u00de"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e3\7\17\2\2\u00e2\u00d6\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e6\5\22\n\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\31\3\2\2\2\u00e7\u00e8\7\20\2\2\u00e8\u00f5\5\"\22\2\u00e9"+
		"\u00f2\7\16\2\2\u00ea\u00ef\5$\23\2\u00eb\u00ec\7\6\2\2\u00ec\u00ee\5"+
		"$\23\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00ea\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\7\17\2\2\u00f5"+
		"\u00e9\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\5\22"+
		"\n\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\7\21\2\2\u00fb\u00fd\5\26\f\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3"+
		"\2\2\2\u00fd\33\3\2\2\2\u00fe\u0101\5\36\20\2\u00ff\u0101\5 \21\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\35\3\2\2\2\u0102\u0103\7\20\2"+
		"\2\u0103\u0104\5\"\22\2\u0104\u0105\7\21\2\2\u0105\u0106\7\22\2\2\u0106"+
		"\u0108\7\20\2\2\u0107\u0109\5(\25\2\u0108\u0107\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u0116\3\2\2\2\u010a\u0113\7\16\2\2\u010b\u0110\5*\26\2\u010c"+
		"\u010d\7\6\2\2\u010d\u010f\5*\26\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0117\7\17\2\2\u0116\u010a\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u011a\5\22\n\2\u0119\u0118\3\2\2\2\u0119\u011a\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\21\2\2\u011c\u011d\7\23\2\2\u011d"+
		"\u011e\7\20\2\2\u011e\u011f\5\"\22\2\u011f\u0121\7\21\2\2\u0120\u0122"+
		"\5\26\f\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\37\3\2\2\2\u0123"+
		"\u0124\7\20\2\2\u0124\u0125\5\"\22\2\u0125\u0126\7\21\2\2\u0126\u0127"+
		"\7\22\2\2\u0127\u0129\7\20\2\2\u0128\u012a\5(\25\2\u0129\u0128\3\2\2\2"+
		"\u0129\u012a\3\2\2\2\u012a\u0137\3\2\2\2\u012b\u0134\7\16\2\2\u012c\u0131"+
		"\5*\26\2\u012d\u012e\7\6\2\2\u012e\u0130\5*\26\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0135\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u012c\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0138\7\17\2\2\u0137\u012b\3\2\2\2\u0137\u0138\3"+
		"\2\2\2\u0138\u013a\3\2\2\2\u0139\u013b\5\22\n\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7\21\2\2\u013d\u013e\7"+
		"\22\2\2\u013e\u013f\7\20\2\2\u013f\u0140\5\"\22\2\u0140\u0142\7\21\2\2"+
		"\u0141\u0143\5\26\f\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143!\3"+
		"\2\2\2\u0144\u0145\7\60\2\2\u0145#\3\2\2\2\u0146\u0147\7.\2\2\u0147%\3"+
		"\2\2\2\u0148\u0149\5.\30\2\u0149\u014a\7\13\2\2\u014a\u014c\5\60\31\2"+
		"\u014b\u014d\5\24\13\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\'"+
		"\3\2\2\2\u014e\u014f\7\60\2\2\u014f)\3\2\2\2\u0150\u0151\7.\2\2\u0151"+
		"+\3\2\2\2\u0152\u0153\7.\2\2\u0153-\3\2\2\2\u0154\u0155\7.\2\2\u0155/"+
		"\3\2\2\2\u0156\u0159\5\62\32\2\u0157\u0159\5\64\33\2\u0158\u0156\3\2\2"+
		"\2\u0158\u0157\3\2\2\2\u0159\61\3\2\2\2\u015a\u015b\7.\2\2\u015b\63\3"+
		"\2\2\2\u015c\u0160\5\66\34\2\u015d\u0160\58\35\2\u015e\u0160\5:\36\2\u015f"+
		"\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\65\3\2\2"+
		"\2\u0161\u0164\7\16\2\2\u0162\u0165\5\62\32\2\u0163\u0165\5\66\34\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168\5\24"+
		"\13\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0173\3\2\2\2\u0169"+
		"\u016c\7\6\2\2\u016a\u016d\5\62\32\2\u016b\u016d\5\66\34\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0170\5\24\13\2"+
		"\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u0169"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7\17\2\2\u0177\67\3\2\2"+
		"\2\u0178\u017b\7\7\2\2\u0179\u017c\5\62\32\2\u017a\u017c\58\35\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017f\5\24"+
		"\13\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u018a\3\2\2\2\u0180"+
		"\u0183\7\6\2\2\u0181\u0184\5\62\32\2\u0182\u0184\58\35\2\u0183\u0181\3"+
		"\2\2\2\u0183\u0182\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0187\5\24\13\2\u0186"+
		"\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0180\3\2"+
		"\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\b\2\2\u018e9\3\2\2\2"+
		"\u018f\u0190\7\16\2\2\u0190\u0191\5.\30\2\u0191\u0194\7\13\2\2\u0192\u0195"+
		"\5\62\32\2\u0193\u0195\5:\36\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2"+
		"\u0195\u0197\3\2\2\2\u0196\u0198\5\24\13\2\u0197\u0196\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u01a5\3\2\2\2\u0199\u019a\7\6\2\2\u019a\u019b\5.\30\2\u019b"+
		"\u019e\7\13\2\2\u019c\u019f\5\62\32\2\u019d\u019f\5:\36\2\u019e\u019c"+
		"\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u01a2\5\24\13\2"+
		"\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u0199"+
		"\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7\17\2\2\u01a9;\3\2\2\2"+
		"\u01aa\u01ab\7\24\2\2\u01ab\u01ac\7\20\2\2\u01ac\u01b9\5> \2\u01ad\u01b6"+
		"\7\16\2\2\u01ae\u01b3\5$\23\2\u01af\u01b0\7\6\2\2\u01b0\u01b2\5$\23\2"+
		"\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\7\17\2\2\u01b9\u01ad\3"+
		"\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01bd\5@!\2\u01bc"+
		"\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\7\21"+
		"\2\2\u01bf\u01c1\5\26\f\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"=\3\2\2\2\u01c2\u01c3\7\60\2\2\u01c3?\3\2\2\2\u01c4\u01d3\7\7\2\2\u01c5"+
		"\u01c8\5B\"\2\u01c6\u01c8\5\b\5\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2"+
		"\2\2\u01c8\u01d0\3\2\2\2\u01c9\u01cc\7\6\2\2\u01ca\u01cd\5B\"\2\u01cb"+
		"\u01cd\5\b\5\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01cf\3\2"+
		"\2\2\u01ce\u01c9\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01c7\3\2"+
		"\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\7\b\2\2\u01d6"+
		"A\3\2\2\2\u01d7\u01d8\5.\30\2\u01d8\u01d9\7\13\2\2\u01d9\u01da\5N(\2\u01da"+
		"C\3\2\2\2\u01db\u01dc\7\t\2\2\u01dc\u01ea\7\n\2\2\u01dd\u01de\5.\30\2"+
		"\u01de\u01df\7\13\2\2\u01df\u01e7\5N(\2\u01e0\u01e1\7\6\2\2\u01e1\u01e2"+
		"\5.\30\2\u01e2\u01e3\7\13\2\2\u01e3\u01e4\5N(\2\u01e4\u01e6\3\2\2\2\u01e5"+
		"\u01e0\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2"+
		"\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01dd\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\7\f\2\2\u01edE\3\2\2\2"+
		"\u01ee\u01f0\5H%\2\u01ef\u01f1\5J&\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3"+
		"\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f4\5J&\2\u01f3\u01ee\3\2\2\2\u01f3"+
		"\u01f2\3\2\2\2\u01f4G\3\2\2\2\u01f5\u01f6\7(\2\2\u01f6\u01f7\5L\'\2\u01f7"+
		"I\3\2\2\2\u01f8\u01f9\7)\2\2\u01f9\u01fa\5L\'\2\u01faK\3\2\2\2\u01fb\u01fc"+
		"\7/\2\2\u01fcM\3\2\2\2\u01fd\u01ff\5P)\2\u01fe\u0200\t\3\2\2\u01ff\u01fe"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\3\2\2\2\u0201\u0203\7,\2\2\u0202"+
		"\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0206\5D"+
		"#\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0212\3\2\2\2\u0207"+
		"\u0209\5Z.\2\u0208\u020a\7+\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2"+
		"\2\u020a\u020c\3\2\2\2\u020b\u020d\7,\2\2\u020c\u020b\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0210\5D#\2\u020f\u020e\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u01fd\3\2\2\2\u0211\u0207\3\2"+
		"\2\2\u0212O\3\2\2\2\u0213\u0259\7\25\2\2\u0214\u021a\7\26\2\2\u0215\u0217"+
		"\7\20\2\2\u0216\u0218\5T+\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021b\7\21\2\2\u021a\u0215\3\2\2\2\u021a\u021b\3"+
		"\2\2\2\u021b\u0259\3\2\2\2\u021c\u0227\7\27\2\2\u021d\u0224\7\20\2\2\u021e"+
		"\u021f\5R*\2\u021f\u0220\7\6\2\2\u0220\u0222\3\2\2\2\u0221\u021e\3\2\2"+
		"\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\5T+\2\u0224\u0221"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\7\21\2\2"+
		"\u0227\u021d\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0259\3\2\2\2\u0229\u022f"+
		"\7\30\2\2\u022a\u022c\7\20\2\2\u022b\u022d\5V,\2\u022c\u022b\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\7\21\2\2\u022f\u022a\3"+
		"\2\2\2\u022f\u0230\3\2\2\2\u0230\u0259\3\2\2\2\u0231\u0237\7\31\2\2\u0232"+
		"\u0234\7\20\2\2\u0233\u0235\5V,\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0236\3\2\2\2\u0236\u0238\7\21\2\2\u0237\u0232\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0259\3\2\2\2\u0239\u0243\7\32\2\2\u023a\u0240\7"+
		"\20\2\2\u023b\u023e\5V,\2\u023c\u023d\7\6\2\2\u023d\u023f\5X-\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023b\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\7\21\2\2\u0243"+
		"\u023a\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0259\3\2\2\2\u0245\u024f\7\33"+
		"\2\2\u0246\u024c\7\20\2\2\u0247\u024a\5V,\2\u0248\u0249\7\6\2\2\u0249"+
		"\u024b\5X-\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2"+
		"\2\u024c\u0247\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250"+
		"\7\21\2\2\u024f\u0246\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0259\3\2\2\2"+
		"\u0251\u0259\7\34\2\2\u0252\u0259\7\35\2\2\u0253\u0259\7\36\2\2\u0254"+
		"\u0259\7\37\2\2\u0255\u0259\7 \2\2\u0256\u0259\7!\2\2\u0257\u0259\7\60"+
		"\2\2\u0258\u0213\3\2\2\2\u0258\u0214\3\2\2\2\u0258\u021c\3\2\2\2\u0258"+
		"\u0229\3\2\2\2\u0258\u0231\3\2\2\2\u0258\u0239\3\2\2\2\u0258\u0245\3\2"+
		"\2\2\u0258\u0251\3\2\2\2\u0258\u0252\3\2\2\2\u0258\u0253\3\2\2\2\u0258"+
		"\u0254\3\2\2\2\u0258\u0255\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2"+
		"\2\2\u0259Q\3\2\2\2\u025a\u025b\7/\2\2\u025bS\3\2\2\2\u025c\u025d\7/\2"+
		"\2\u025dU\3\2\2\2\u025e\u025f\7/\2\2\u025fW\3\2\2\2\u0260\u0261\7/\2\2"+
		"\u0261Y\3\2\2\2\u0262\u0268\5\\/\2\u0263\u0268\5^\60\2\u0264\u0268\5`"+
		"\61\2\u0265\u0268\5b\62\2\u0266\u0268\5d\63\2\u0267\u0262\3\2\2\2\u0267"+
		"\u0263\3\2\2\2\u0267\u0264\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0266\3\2"+
		"\2\2\u0268[\3\2\2\2\u0269\u026a\7\"\2\2\u026a\u026d\7\20\2\2\u026b\u026e"+
		"\5P)\2\u026c\u026e\5\\/\2\u026d\u026b\3\2\2\2\u026d\u026c\3\2\2\2\u026e"+
		"\u0270\3\2\2\2\u026f\u0271\7+\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2"+
		"\2\2\u0271\u0273\3\2\2\2\u0272\u0274\5F$\2\u0273\u0272\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\7\21\2\2\u0276\u0278\5D#\2\u0277"+
		"\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278]\3\2\2\2\u0279\u027a\7#\2\2\u027a"+
		"\u027d\7\20\2\2\u027b\u027e\5P)\2\u027c\u027e\5^\60\2\u027d\u027b\3\2"+
		"\2\2\u027d\u027c\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u0281\7+\2\2\u0280"+
		"\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\3\2\2\2\u0282\u0284\5F"+
		"$\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0287\7\21\2\2\u0286\u0288\5D#\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288_\3\2\2\2\u0289\u028a\7$\2\2\u028a\u028d\7\20\2\2\u028b\u028e"+
		"\5P)\2\u028c\u028e\5`\61\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e"+
		"\u0290\3\2\2\2\u028f\u0291\7+\2\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2"+
		"\2\2\u0291\u0293\3\2\2\2\u0292\u0294\5F$\2\u0293\u0292\3\2\2\2\u0293\u0294"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\7\21\2\2\u0296\u0298\5D#\2\u0297"+
		"\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298a\3\2\2\2\u0299\u029a\7%\2\2\u029a"+
		"\u029d\7\20\2\2\u029b\u029e\5P)\2\u029c\u029e\5b\62\2\u029d\u029b\3\2"+
		"\2\2\u029d\u029c\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u02a1\7+\2\2\u02a0"+
		"\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u02a4\5F"+
		"$\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a7\7\21\2\2\u02a6\u02a8\5D#\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8c\3\2\2\2\u02a9\u02aa\7&\2\2\u02aa\u02ad\7\20\2\2\u02ab\u02ae"+
		"\5P)\2\u02ac\u02ae\5d\63\2\u02ad\u02ab\3\2\2\2\u02ad\u02ac\3\2\2\2\u02ae"+
		"\u02b0\3\2\2\2\u02af\u02b1\7+\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2"+
		"\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b4\5F$\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\7\21\2\2\u02b6\u02b8\5D#\2\u02b7"+
		"\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8e\3\2\2\2\u02b9\u02bc\5h\65\2"+
		"\u02ba\u02bc\5j\66\2\u02bb\u02b9\3\2\2\2\u02bb\u02ba\3\2\2\2\u02bcg\3"+
		"\2\2\2\u02bd\u02be\7\24\2\2\u02be\u02bf\7\20\2\2\u02bf\u02c0\5> \2\u02c0"+
		"\u02c1\7\21\2\2\u02c1\u02d5\7\22\2\2\u02c2\u02cf\7\20\2\2\u02c3\u02cc"+
		"\7\16\2\2\u02c4\u02c9\5*\26\2\u02c5\u02c6\7\6\2\2\u02c6\u02c8\5*\26\2"+
		"\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca"+
		"\3\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc\u02c4\3\2\2\2\u02cc"+
		"\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\7\17\2\2\u02cf\u02c3\3"+
		"\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02d3\5@!\2\u02d2"+
		"\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\7\21"+
		"\2\2\u02d5\u02c2\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02d8\7\23\2\2\u02d8\u02d9\7\20\2\2\u02d9\u02da\5> \2\u02da\u02dc\7\21"+
		"\2\2\u02db\u02dd\5\26\f\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"i\3\2\2\2\u02de\u02df\7\24\2\2\u02df\u02e0\7\20\2\2\u02e0\u02e1\5> \2"+
		"\u02e1\u02e2\7\21\2\2\u02e2\u02f6\7\22\2\2\u02e3\u02f0\7\20\2\2\u02e4"+
		"\u02ed\7\16\2\2\u02e5\u02ea\5*\26\2\u02e6\u02e7\7\6\2\2\u02e7\u02e9\5"+
		"*\26\2\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed\u02e5\3\2"+
		"\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\7\17\2\2\u02f0"+
		"\u02e4\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f4\5@"+
		"!\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f7\7\21\2\2\u02f6\u02e3\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3"+
		"\2\2\2\u02f8\u02f9\7\22\2\2\u02f9\u02fa\7\20\2\2\u02fa\u02fb\5> \2\u02fb"+
		"\u02fd\7\21\2\2\u02fc\u02fe\5\26\f\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3"+
		"\2\2\2\u02fek\3\2\2\2\u02ff\u0300\7\24\2\2\u0300\u0301\7\r\2\2\u0301\u0302"+
		"\5\20\t\2\u0302\u0304\7\r\2\2\u0303\u0305\5@!\2\u0304\u0303\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305m\3\2\2\2}pt\u0082\u0091\u009b\u00a5\u00aa\u00ae\u00b1"+
		"\u00c1\u00c4\u00ce\u00dc\u00df\u00e2\u00e5\u00ef\u00f2\u00f5\u00f8\u00fc"+
		"\u0100\u0108\u0110\u0113\u0116\u0119\u0121\u0129\u0131\u0134\u0137\u013a"+
		"\u0142\u014c\u0158\u015f\u0164\u0167\u016c\u016f\u0173\u017b\u017e\u0183"+
		"\u0186\u018a\u0194\u0197\u019e\u01a1\u01a5\u01b3\u01b6\u01b9\u01bc\u01c0"+
		"\u01c7\u01cc\u01d0\u01d3\u01e7\u01ea\u01f0\u01f3\u01ff\u0202\u0205\u0209"+
		"\u020c\u020f\u0211\u0217\u021a\u0221\u0224\u0227\u022c\u022f\u0234\u0237"+
		"\u023e\u0240\u0243\u024a\u024c\u024f\u0258\u0267\u026d\u0270\u0273\u0277"+
		"\u027d\u0280\u0283\u0287\u028d\u0290\u0293\u0297\u029d\u02a0\u02a3\u02a7"+
		"\u02ad\u02b0\u02b3\u02b7\u02bb\u02c9\u02cc\u02cf\u02d2\u02d5\u02dc\u02ea"+
		"\u02ed\u02f0\u02f3\u02f6\u02fd\u0304";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}