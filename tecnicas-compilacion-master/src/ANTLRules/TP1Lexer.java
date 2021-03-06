// Generated from TP1.g4 by ANTLR 4.7.2

  package ANTLRules;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TP1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, CURLY_BRACKET_OPEN=3, CURLY_BRACKET_CLOSE=4, SQUARE_BRACKET_OPEN=5, 
		SQUARE_BRACKET_CLOSE=6, PARENS_OPEN=7, PARENS_CLOSE=8, SEMICOLON=9, COMMA=10, 
		EQUALS=11, COMPARISON=12, MINOR_THAN=13, MINOR_OR_EQUAL_THAN=14, GREATER_OR_EQUAL_THAN=15, 
		GREATER_THAN=16, ADDITION=17, SUBSTRACTION=18, PRODUCT=19, DIVISION=20, 
		MODULE=21, AND=22, OR=23, NOT=24, DATA_TYPE_CHAR=25, DATA_TYPE_SHORT=26, 
		DATA_TYPE_INT=27, DATA_TYPE_LONG=28, DATA_TYPE_FLOAT=29, DATA_TYPE_DOUBLE=30, 
		DATA_TYPE_VOID=31, CS_IF=32, CS_FOR=33, CS_WHILE=34, IDENTIFIER=35, COMMENT=36, 
		WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", 
			"SQUARE_BRACKET_CLOSE", "PARENS_OPEN", "PARENS_CLOSE", "SEMICOLON", "COMMA", 
			"EQUALS", "COMPARISON", "MINOR_THAN", "MINOR_OR_EQUAL_THAN", "GREATER_OR_EQUAL_THAN", 
			"GREATER_THAN", "ADDITION", "SUBSTRACTION", "PRODUCT", "DIVISION", "MODULE", 
			"AND", "OR", "NOT", "DATA_TYPE_CHAR", "DATA_TYPE_SHORT", "DATA_TYPE_INT", 
			"DATA_TYPE_LONG", "DATA_TYPE_FLOAT", "DATA_TYPE_DOUBLE", "DATA_TYPE_VOID", 
			"CS_IF", "CS_FOR", "CS_WHILE", "IDENTIFIER", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", 
			"'='", "'=='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'&&'", "'||'", "'!'", "'char'", "'short'", "'int'", "'long'", 
			"'float'", "'double'", "'void'", "'if'", "'for'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", 
			"SQUARE_BRACKET_CLOSE", "PARENS_OPEN", "PARENS_CLOSE", "SEMICOLON", "COMMA", 
			"EQUALS", "COMPARISON", "MINOR_THAN", "MINOR_OR_EQUAL_THAN", "GREATER_OR_EQUAL_THAN", 
			"GREATER_THAN", "ADDITION", "SUBSTRACTION", "PRODUCT", "DIVISION", "MODULE", 
			"AND", "OR", "NOT", "DATA_TYPE_CHAR", "DATA_TYPE_SHORT", "DATA_TYPE_INT", 
			"DATA_TYPE_LONG", "DATA_TYPE_FLOAT", "DATA_TYPE_DOUBLE", "DATA_TYPE_VOID", 
			"CS_IF", "CS_FOR", "CS_WHILE", "IDENTIFIER", "COMMENT", "WS"
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


	public TP1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TP1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\5\2O\n\2\3\2\6\2R\n\2\r\2\16\2"+
		"S\3\3\3\3\3\3\3\3\6\3Z\n\3\r\3\16\3[\3\3\3\3\3\3\6\3a\n\3\r\3\16\3b\5"+
		"\3e\n\3\3\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\7$\u00d2"+
		"\n$\f$\16$\u00d5\13$\3%\3%\3%\3%\7%\u00db\n%\f%\16%\u00de\13%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3\u00dc\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\7\4\2--//\3\2\62;"+
		"\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\f\"\"\2\u00ef\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\3N\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2"+
		"\17s\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27{\3\2\2\2\31}\3\2\2"+
		"\2\33\u0080\3\2\2\2\35\u0082\3\2\2\2\37\u0085\3\2\2\2!\u0088\3\2\2\2#"+
		"\u008a\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2)\u0090\3\2\2\2+\u0092\3"+
		"\2\2\2-\u0094\3\2\2\2/\u0097\3\2\2\2\61\u009a\3\2\2\2\63\u009c\3\2\2\2"+
		"\65\u00a1\3\2\2\2\67\u00a7\3\2\2\29\u00ab\3\2\2\2;\u00b0\3\2\2\2=\u00b6"+
		"\3\2\2\2?\u00bd\3\2\2\2A\u00c2\3\2\2\2C\u00c5\3\2\2\2E\u00c9\3\2\2\2G"+
		"\u00cf\3\2\2\2I\u00d6\3\2\2\2K\u00e3\3\2\2\2MO\t\2\2\2NM\3\2\2\2NO\3\2"+
		"\2\2OQ\3\2\2\2PR\t\3\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\4\3"+
		"\2\2\2Uj\5\3\2\2VW\5\3\2\2WY\7\60\2\2XZ\t\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y"+
		"\3\2\2\2[\\\3\2\2\2\\j\3\2\2\2]d\5\3\2\2^`\7\60\2\2_a\t\3\2\2`_\3\2\2"+
		"\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2d^\3\2\2\2de\3\2\2\2ef\3\2\2"+
		"\2fg\7g\2\2gh\5\3\2\2hj\3\2\2\2iU\3\2\2\2iV\3\2\2\2i]\3\2\2\2j\6\3\2\2"+
		"\2kl\7}\2\2l\b\3\2\2\2mn\7\177\2\2n\n\3\2\2\2op\7]\2\2p\f\3\2\2\2qr\7"+
		"_\2\2r\16\3\2\2\2st\7*\2\2t\20\3\2\2\2uv\7+\2\2v\22\3\2\2\2wx\7=\2\2x"+
		"\24\3\2\2\2yz\7.\2\2z\26\3\2\2\2{|\7?\2\2|\30\3\2\2\2}~\7?\2\2~\177\7"+
		"?\2\2\177\32\3\2\2\2\u0080\u0081\7>\2\2\u0081\34\3\2\2\2\u0082\u0083\7"+
		">\2\2\u0083\u0084\7?\2\2\u0084\36\3\2\2\2\u0085\u0086\7@\2\2\u0086\u0087"+
		"\7?\2\2\u0087 \3\2\2\2\u0088\u0089\7@\2\2\u0089\"\3\2\2\2\u008a\u008b"+
		"\7-\2\2\u008b$\3\2\2\2\u008c\u008d\7/\2\2\u008d&\3\2\2\2\u008e\u008f\7"+
		",\2\2\u008f(\3\2\2\2\u0090\u0091\7\61\2\2\u0091*\3\2\2\2\u0092\u0093\7"+
		"\'\2\2\u0093,\3\2\2\2\u0094\u0095\7(\2\2\u0095\u0096\7(\2\2\u0096.\3\2"+
		"\2\2\u0097\u0098\7~\2\2\u0098\u0099\7~\2\2\u0099\60\3\2\2\2\u009a\u009b"+
		"\7#\2\2\u009b\62\3\2\2\2\u009c\u009d\7e\2\2\u009d\u009e\7j\2\2\u009e\u009f"+
		"\7c\2\2\u009f\u00a0\7t\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3"+
		"\7j\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\66\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"8\3\2\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7i\2\2\u00af:\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5<\3\2\2\2\u00b6"+
		"\u00b7\7f\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7d\2\2"+
		"\u00ba\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc>\3\2\2\2\u00bd\u00be\7x\2"+
		"\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7f\2\2\u00c1@\3\2"+
		"\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7h\2\2\u00c4B\3\2\2\2\u00c5\u00c6"+
		"\7h\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7t\2\2\u00c8D\3\2\2\2\u00c9\u00ca"+
		"\7y\2\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7n\2\2\u00cd"+
		"\u00ce\7g\2\2\u00ceF\3\2\2\2\u00cf\u00d3\t\4\2\2\u00d0\u00d2\t\5\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4H\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8"+
		"\7\61\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00db\13\2\2\2\u00da\u00d9\3\2\2\2"+
		"\u00db\u00de\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\b%\2\2\u00e2J\3\2\2\2\u00e3\u00e4\t\6\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\b&\2\2\u00e6L\3\2\2\2\13\2NS[bdi\u00d3\u00dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}