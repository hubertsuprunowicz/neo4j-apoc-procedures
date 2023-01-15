package apoc.export.yarspg.generated;// Generated from YARSpg.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YARSpgLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "BOOL", "STRING", "BYTES", "INTEGER", "UINTEGER", "DECIMAL", 
			"FLOAT", "DATETIME", "LOCALDATETIME", "DATE", "TIME", "LOCALTIME", "DURATION", 
			"MULTISET", "SET", "LIST", "DLIST", "STRUCT", "DEFAULT", "MIN", "MAX", 
			"UNIQUE", "NULL", "OPTIONAL", "COMMENT", "STR", "UNSIGNED_INT", "ALNUMPLUS", 
			"WS"
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


	public YARSpgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YARSpg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0157\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\7"+
		",\u0132\n,\f,\16,\u0135\13,\3,\3,\3-\3-\3-\3-\3-\7-\u013e\n-\f-\16-\u0141"+
		"\13-\3-\3-\3.\6.\u0146\n.\r.\16.\u0147\3/\3/\7/\u014c\n/\f/\16/\u014f"+
		"\13/\3\60\6\60\u0152\n\60\r\60\16\60\u0153\3\60\3\60\2\2\61\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\34\4\2DDdd\4\2QQqq\4\2NNnn\4\2"+
		"UUuu\4\2VVvv\4\2TTtt\4\2KKkk\4\2PPpp\4\2IIii\4\2[[{{\4\2GGgg\4\2WWww\4"+
		"\2FFff\4\2EEee\4\2OOoo\4\2CCcc\4\2HHhh\4\2ZZzz\4\2SSss\4\2RRrr\4\2\f\f"+
		"\16\17\6\2\f\f\17\17$$^^\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\f\""+
		"\"\2\u015d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2"+
		"\2\17m\3\2\2\2\21o\3\2\2\2\23q\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31w\3\2"+
		"\2\2\33y\3\2\2\2\35{\3\2\2\2\37}\3\2\2\2!\177\3\2\2\2#\u0081\3\2\2\2%"+
		"\u0084\3\2\2\2\'\u0086\3\2\2\2)\u008b\3\2\2\2+\u0092\3\2\2\2-\u0098\3"+
		"\2\2\2/\u00a0\3\2\2\2\61\u00a9\3\2\2\2\63\u00b1\3\2\2\2\65\u00b7\3\2\2"+
		"\2\67\u00c0\3\2\2\29\u00ce\3\2\2\2;\u00d3\3\2\2\2=\u00d8\3\2\2\2?\u00e2"+
		"\3\2\2\2A\u00eb\3\2\2\2C\u00f4\3\2\2\2E\u00f8\3\2\2\2G\u00fd\3\2\2\2I"+
		"\u0103\3\2\2\2K\u010a\3\2\2\2M\u0112\3\2\2\2O\u0116\3\2\2\2Q\u011a\3\2"+
		"\2\2S\u0121\3\2\2\2U\u0126\3\2\2\2W\u012f\3\2\2\2Y\u0138\3\2\2\2[\u0145"+
		"\3\2\2\2]\u0149\3\2\2\2_\u0151\3\2\2\2ab\7-\2\2b\4\3\2\2\2cd\7&\2\2d\6"+
		"\3\2\2\2ef\7?\2\2f\b\3\2\2\2gh\7.\2\2h\n\3\2\2\2ij\7]\2\2j\f\3\2\2\2k"+
		"l\7_\2\2l\16\3\2\2\2mn\7B\2\2n\20\3\2\2\2op\7>\2\2p\22\3\2\2\2qr\7<\2"+
		"\2r\24\3\2\2\2st\7@\2\2t\26\3\2\2\2uv\7\61\2\2v\30\3\2\2\2wx\7}\2\2x\32"+
		"\3\2\2\2yz\7\177\2\2z\34\3\2\2\2{|\7*\2\2|\36\3\2\2\2}~\7+\2\2~ \3\2\2"+
		"\2\177\u0080\7/\2\2\u0080\"\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083\7@"+
		"\2\2\u0083$\3\2\2\2\u0084\u0085\7U\2\2\u0085&\3\2\2\2\u0086\u0087\t\2"+
		"\2\2\u0087\u0088\t\3\2\2\u0088\u0089\t\3\2\2\u0089\u008a\t\4\2\2\u008a"+
		"(\3\2\2\2\u008b\u008c\t\5\2\2\u008c\u008d\t\6\2\2\u008d\u008e\t\7\2\2"+
		"\u008e\u008f\t\b\2\2\u008f\u0090\t\t\2\2\u0090\u0091\t\n\2\2\u0091*\3"+
		"\2\2\2\u0092\u0093\t\2\2\2\u0093\u0094\t\13\2\2\u0094\u0095\t\6\2\2\u0095"+
		"\u0096\t\f\2\2\u0096\u0097\t\5\2\2\u0097,\3\2\2\2\u0098\u0099\t\b\2\2"+
		"\u0099\u009a\t\t\2\2\u009a\u009b\t\6\2\2\u009b\u009c\t\f\2\2\u009c\u009d"+
		"\t\n\2\2\u009d\u009e\t\f\2\2\u009e\u009f\t\7\2\2\u009f.\3\2\2\2\u00a0"+
		"\u00a1\t\r\2\2\u00a1\u00a2\t\b\2\2\u00a2\u00a3\t\t\2\2\u00a3\u00a4\t\6"+
		"\2\2\u00a4\u00a5\t\f\2\2\u00a5\u00a6\t\n\2\2\u00a6\u00a7\t\f\2\2\u00a7"+
		"\u00a8\t\7\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\t\16\2\2\u00aa\u00ab\t\f\2"+
		"\2\u00ab\u00ac\t\17\2\2\u00ac\u00ad\t\b\2\2\u00ad\u00ae\t\20\2\2\u00ae"+
		"\u00af\t\21\2\2\u00af\u00b0\t\4\2\2\u00b0\62\3\2\2\2\u00b1\u00b2\t\22"+
		"\2\2\u00b2\u00b3\t\4\2\2\u00b3\u00b4\t\3\2\2\u00b4\u00b5\t\21\2\2\u00b5"+
		"\u00b6\t\6\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\t\16\2\2\u00b8\u00b9\t\21"+
		"\2\2\u00b9\u00ba\t\6\2\2\u00ba\u00bb\t\f\2\2\u00bb\u00bc\t\6\2\2\u00bc"+
		"\u00bd\t\b\2\2\u00bd\u00be\t\20\2\2\u00be\u00bf\t\f\2\2\u00bf\66\3\2\2"+
		"\2\u00c0\u00c1\t\4\2\2\u00c1\u00c2\t\3\2\2\u00c2\u00c3\t\17\2\2\u00c3"+
		"\u00c4\t\21\2\2\u00c4\u00c5\t\4\2\2\u00c5\u00c6\t\16\2\2\u00c6\u00c7\t"+
		"\21\2\2\u00c7\u00c8\t\6\2\2\u00c8\u00c9\t\f\2\2\u00c9\u00ca\t\6\2\2\u00ca"+
		"\u00cb\t\b\2\2\u00cb\u00cc\t\20\2\2\u00cc\u00cd\t\f\2\2\u00cd8\3\2\2\2"+
		"\u00ce\u00cf\t\16\2\2\u00cf\u00d0\t\21\2\2\u00d0\u00d1\t\6\2\2\u00d1\u00d2"+
		"\t\f\2\2\u00d2:\3\2\2\2\u00d3\u00d4\t\6\2\2\u00d4\u00d5\t\b\2\2\u00d5"+
		"\u00d6\t\20\2\2\u00d6\u00d7\t\f\2\2\u00d7<\3\2\2\2\u00d8\u00d9\t\4\2\2"+
		"\u00d9\u00da\t\3\2\2\u00da\u00db\t\17\2\2\u00db\u00dc\t\21\2\2\u00dc\u00dd"+
		"\t\4\2\2\u00dd\u00de\t\6\2\2\u00de\u00df\t\b\2\2\u00df\u00e0\t\20\2\2"+
		"\u00e0\u00e1\t\f\2\2\u00e1>\3\2\2\2\u00e2\u00e3\t\16\2\2\u00e3\u00e4\t"+
		"\r\2\2\u00e4\u00e5\t\7\2\2\u00e5\u00e6\t\21\2\2\u00e6\u00e7\t\6\2\2\u00e7"+
		"\u00e8\t\b\2\2\u00e8\u00e9\t\3\2\2\u00e9\u00ea\t\t\2\2\u00ea@\3\2\2\2"+
		"\u00eb\u00ec\t\20\2\2\u00ec\u00ed\t\r\2\2\u00ed\u00ee\t\4\2\2\u00ee\u00ef"+
		"\t\6\2\2\u00ef\u00f0\t\b\2\2\u00f0\u00f1\t\5\2\2\u00f1\u00f2\t\f\2\2\u00f2"+
		"\u00f3\t\6\2\2\u00f3B\3\2\2\2\u00f4\u00f5\t\5\2\2\u00f5\u00f6\t\f\2\2"+
		"\u00f6\u00f7\t\6\2\2\u00f7D\3\2\2\2\u00f8\u00f9\t\4\2\2\u00f9\u00fa\t"+
		"\b\2\2\u00fa\u00fb\t\5\2\2\u00fb\u00fc\t\6\2\2\u00fcF\3\2\2\2\u00fd\u00fe"+
		"\t\16\2\2\u00fe\u00ff\t\4\2\2\u00ff\u0100\t\b\2\2\u0100\u0101\t\5\2\2"+
		"\u0101\u0102\t\6\2\2\u0102H\3\2\2\2\u0103\u0104\t\5\2\2\u0104\u0105\t"+
		"\6\2\2\u0105\u0106\t\7\2\2\u0106\u0107\t\r\2\2\u0107\u0108\t\17\2\2\u0108"+
		"\u0109\t\6\2\2\u0109J\3\2\2\2\u010a\u010b\t\16\2\2\u010b\u010c\t\f\2\2"+
		"\u010c\u010d\t\22\2\2\u010d\u010e\t\21\2\2\u010e\u010f\t\r\2\2\u010f\u0110"+
		"\t\4\2\2\u0110\u0111\t\6\2\2\u0111L\3\2\2\2\u0112\u0113\t\20\2\2\u0113"+
		"\u0114\t\b\2\2\u0114\u0115\t\t\2\2\u0115N\3\2\2\2\u0116\u0117\t\20\2\2"+
		"\u0117\u0118\t\21\2\2\u0118\u0119\t\23\2\2\u0119P\3\2\2\2\u011a\u011b"+
		"\t\r\2\2\u011b\u011c\t\t\2\2\u011c\u011d\t\b\2\2\u011d\u011e\t\24\2\2"+
		"\u011e\u011f\t\r\2\2\u011f\u0120\t\f\2\2\u0120R\3\2\2\2\u0121\u0122\t"+
		"\t\2\2\u0122\u0123\t\r\2\2\u0123\u0124\t\4\2\2\u0124\u0125\t\4\2\2\u0125"+
		"T\3\2\2\2\u0126\u0127\t\3\2\2\u0127\u0128\t\25\2\2\u0128\u0129\t\6\2\2"+
		"\u0129\u012a\t\b\2\2\u012a\u012b\t\3\2\2\u012b\u012c\t\t\2\2\u012c\u012d"+
		"\t\21\2\2\u012d\u012e\t\4\2\2\u012eV\3\2\2\2\u012f\u0133\7%\2\2\u0130"+
		"\u0132\n\26\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0137\b,\2\2\u0137X\3\2\2\2\u0138\u013f\7$\2\2\u0139\u013e\n\27\2\2\u013a"+
		"\u013e\7)\2\2\u013b\u013c\7^\2\2\u013c\u013e\7$\2\2\u013d\u0139\3\2\2"+
		"\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0143\7$\2\2\u0143Z\3\2\2\2\u0144\u0146\t\30\2\2\u0145\u0144\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\\\3"+
		"\2\2\2\u0149\u014d\t\31\2\2\u014a\u014c\t\32\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e^\3\2\2\2"+
		"\u014f\u014d\3\2\2\2\u0150\u0152\t\33\2\2\u0151\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\b\60\2\2\u0156`\3\2\2\2\t\2\u0133\u013d\u013f\u0147\u014d\u0153"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}