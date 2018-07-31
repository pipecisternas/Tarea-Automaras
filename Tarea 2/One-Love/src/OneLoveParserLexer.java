// Generated from OneLoveParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OneLoveParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SQRT=1, COS=2, SEN=3, TAN=4, SUMA=5, RESTA=6, DIVIDIR=7, MULTI=8, DOTCOMA=9, 
		AND=10, OR=11, EQUAL=12, NQUAL=13, ASSIGN=14, LPAR=15, RPAR=16, LBRACE=17, 
		RBRACE=18, VAR=19, CONST=20, INICIO=21, CUERPO=22, FIN=23, IF=24, ELSE=25, 
		READ=26, WRITE=27, ENTERO=28, PALABRA=29, VF=30, WHILE=31, FOR=32, NUMBER=33, 
		FLOAT=34, BOOLEAN=35, STRING=36, ID=37, COMMENT=38, WS=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"V", "M", "NUM", "DOT", "SQRT", "COS", "SEN", "TAN", "SUMA", "RESTA", 
		"DIVIDIR", "MULTI", "DOTCOMA", "AND", "OR", "EQUAL", "NQUAL", "ASSIGN", 
		"LPAR", "RPAR", "LBRACE", "RBRACE", "VAR", "CONST", "INICIO", "CUERPO", 
		"FIN", "IF", "ELSE", "READ", "WRITE", "ENTERO", "PALABRA", "VF", "WHILE", 
		"FOR", "NUMBER", "FLOAT", "BOOLEAN", "STRING", "ID", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ENRAIZANTE'", "'COGRAMO'", "'GRAMO'", "'VOLAGENTE'", "'+'", "'-'", 
		"'/'", "'*'", "';'", "'Y'", "'O'", null, null, null, "'('", "')'", "'{'", 
		"'}'", "'BACILE'", "'BAJON'", "'KRIPPY'", "'PAPELILLO'", "'KUSH'", "'CANNABIS'", 
		"'PARAGUA'", "'QUEMAR'", "'ENRROLAR'", "'CUANTOSG'", "'SEPA'", "'TENIMANO'", 
		"'AMERICANA'", "'PEGAO'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SQRT", "COS", "SEN", "TAN", "SUMA", "RESTA", "DIVIDIR", "MULTI", 
		"DOTCOMA", "AND", "OR", "EQUAL", "NQUAL", "ASSIGN", "LPAR", "RPAR", "LBRACE", 
		"RBRACE", "VAR", "CONST", "INICIO", "CUERPO", "FIN", "IF", "ELSE", "READ", 
		"WRITE", "ENTERO", "PALABRA", "VF", "WHILE", "FOR", "NUMBER", "FLOAT", 
		"BOOLEAN", "STRING", "ID", "COMMENT", "WS"
	};
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


	public OneLoveParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OneLoveParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u014e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3&\6&\u0121\n&\r&\16&\u0122\3\'\3\'\3\'\3\'\3(\3(\5(\u012b\n(\3)\3)"+
		"\7)\u012f\n)\f)\16)\u0132\13)\3)\3)\3*\3*\5*\u0138\n*\3+\3+\7+\u013c\n"+
		"+\f+\16+\u013f\13+\3+\5+\u0142\n+\3+\3+\3+\3+\3,\6,\u0149\n,\r,\16,\u014a"+
		"\3,\3,\4\u0130\u013d\2-\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27"+
		"\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65"+
		"\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)\3\2\5\3\2\62;"+
		"\4\2C\\c|\5\2\13\f\17\17\"\"\u0150\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\3Y\3\2\2\2\5a\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rz\3\2"+
		"\2\2\17\u0082\3\2\2\2\21\u0088\3\2\2\2\23\u0092\3\2\2\2\25\u0094\3\2\2"+
		"\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3\2\2\2\35\u009c\3\2\2\2"+
		"\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a4\3\2\2\2%\u00a8\3\2\2\2\'\u00ac"+
		"\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3\2\2\2/\u00b4\3\2\2\2\61"+
		"\u00bb\3\2\2\2\63\u00c1\3\2\2\2\65\u00c8\3\2\2\2\67\u00d2\3\2\2\29\u00d7"+
		"\3\2\2\2;\u00e0\3\2\2\2=\u00e8\3\2\2\2?\u00ef\3\2\2\2A\u00f8\3\2\2\2C"+
		"\u0101\3\2\2\2E\u0106\3\2\2\2G\u010f\3\2\2\2I\u0119\3\2\2\2K\u0120\3\2"+
		"\2\2M\u0124\3\2\2\2O\u012a\3\2\2\2Q\u012c\3\2\2\2S\u0135\3\2\2\2U\u0139"+
		"\3\2\2\2W\u0148\3\2\2\2YZ\7J\2\2Z[\7C\2\2[\\\7[\2\2\\]\7O\2\2]^\7C\2\2"+
		"^_\7P\2\2_`\7Q\2\2`\4\3\2\2\2ab\7P\2\2bc\7Q\2\2cd\7J\2\2de\7C\2\2ef\7"+
		"[\2\2fg\7O\2\2gh\7C\2\2hi\7P\2\2ij\7Q\2\2j\6\3\2\2\2kl\t\2\2\2l\b\3\2"+
		"\2\2mn\7\60\2\2n\n\3\2\2\2op\7G\2\2pq\7P\2\2qr\7T\2\2rs\7C\2\2st\7K\2"+
		"\2tu\7\\\2\2uv\7C\2\2vw\7P\2\2wx\7V\2\2xy\7G\2\2y\f\3\2\2\2z{\7E\2\2{"+
		"|\7Q\2\2|}\7I\2\2}~\7T\2\2~\177\7C\2\2\177\u0080\7O\2\2\u0080\u0081\7"+
		"Q\2\2\u0081\16\3\2\2\2\u0082\u0083\7I\2\2\u0083\u0084\7T\2\2\u0084\u0085"+
		"\7C\2\2\u0085\u0086\7O\2\2\u0086\u0087\7Q\2\2\u0087\20\3\2\2\2\u0088\u0089"+
		"\7X\2\2\u0089\u008a\7Q\2\2\u008a\u008b\7N\2\2\u008b\u008c\7C\2\2\u008c"+
		"\u008d\7I\2\2\u008d\u008e\7G\2\2\u008e\u008f\7P\2\2\u008f\u0090\7V\2\2"+
		"\u0090\u0091\7G\2\2\u0091\22\3\2\2\2\u0092\u0093\7-\2\2\u0093\24\3\2\2"+
		"\2\u0094\u0095\7/\2\2\u0095\26\3\2\2\2\u0096\u0097\7\61\2\2\u0097\30\3"+
		"\2\2\2\u0098\u0099\7,\2\2\u0099\32\3\2\2\2\u009a\u009b\7=\2\2\u009b\34"+
		"\3\2\2\2\u009c\u009d\7[\2\2\u009d\36\3\2\2\2\u009e\u009f\7Q\2\2\u009f"+
		" \3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\u00a2\7/\2\2\u00a2\u00a3\7@\2\2\u00a3"+
		"\"\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\7>\2\2\u00a7"+
		"$\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7\u0080\2"+
		"\2\u00ab&\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad(\3\2\2\2\u00ae\u00af\7+\2\2"+
		"\u00af*\3\2\2\2\u00b0\u00b1\7}\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7\177\2"+
		"\2\u00b3.\3\2\2\2\u00b4\u00b5\7D\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7"+
		"E\2\2\u00b7\u00b8\7K\2\2\u00b8\u00b9\7N\2\2\u00b9\u00ba\7G\2\2\u00ba\60"+
		"\3\2\2\2\u00bb\u00bc\7D\2\2\u00bc\u00bd\7C\2\2\u00bd\u00be\7L\2\2\u00be"+
		"\u00bf\7Q\2\2\u00bf\u00c0\7P\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7M\2\2\u00c2"+
		"\u00c3\7T\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c5\7R\2\2\u00c5\u00c6\7R\2\2"+
		"\u00c6\u00c7\7[\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7R\2\2\u00c9\u00ca\7"+
		"C\2\2\u00ca\u00cb\7R\2\2\u00cb\u00cc\7G\2\2\u00cc\u00cd\7N\2\2\u00cd\u00ce"+
		"\7K\2\2\u00ce\u00cf\7N\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7Q\2\2\u00d1"+
		"\66\3\2\2\2\u00d2\u00d3\7M\2\2\u00d3\u00d4\7W\2\2\u00d4\u00d5\7U\2\2\u00d5"+
		"\u00d6\7J\2\2\u00d68\3\2\2\2\u00d7\u00d8\7E\2\2\u00d8\u00d9\7C\2\2\u00d9"+
		"\u00da\7P\2\2\u00da\u00db\7P\2\2\u00db\u00dc\7C\2\2\u00dc\u00dd\7D\2\2"+
		"\u00dd\u00de\7K\2\2\u00de\u00df\7U\2\2\u00df:\3\2\2\2\u00e0\u00e1\7R\2"+
		"\2\u00e1\u00e2\7C\2\2\u00e2\u00e3\7T\2\2\u00e3\u00e4\7C\2\2\u00e4\u00e5"+
		"\7I\2\2\u00e5\u00e6\7W\2\2\u00e6\u00e7\7C\2\2\u00e7<\3\2\2\2\u00e8\u00e9"+
		"\7S\2\2\u00e9\u00ea\7W\2\2\u00ea\u00eb\7G\2\2\u00eb\u00ec\7O\2\2\u00ec"+
		"\u00ed\7C\2\2\u00ed\u00ee\7T\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7G\2\2\u00f0"+
		"\u00f1\7P\2\2\u00f1\u00f2\7T\2\2\u00f2\u00f3\7T\2\2\u00f3\u00f4\7Q\2\2"+
		"\u00f4\u00f5\7N\2\2\u00f5\u00f6\7C\2\2\u00f6\u00f7\7T\2\2\u00f7@\3\2\2"+
		"\2\u00f8\u00f9\7E\2\2\u00f9\u00fa\7W\2\2\u00fa\u00fb\7C\2\2\u00fb\u00fc"+
		"\7P\2\2\u00fc\u00fd\7V\2\2\u00fd\u00fe\7Q\2\2\u00fe\u00ff\7U\2\2\u00ff"+
		"\u0100\7I\2\2\u0100B\3\2\2\2\u0101\u0102\7U\2\2\u0102\u0103\7G\2\2\u0103"+
		"\u0104\7R\2\2\u0104\u0105\7C\2\2\u0105D\3\2\2\2\u0106\u0107\7V\2\2\u0107"+
		"\u0108\7G\2\2\u0108\u0109\7P\2\2\u0109\u010a\7K\2\2\u010a\u010b\7O\2\2"+
		"\u010b\u010c\7C\2\2\u010c\u010d\7P\2\2\u010d\u010e\7Q\2\2\u010eF\3\2\2"+
		"\2\u010f\u0110\7C\2\2\u0110\u0111\7O\2\2\u0111\u0112\7G\2\2\u0112\u0113"+
		"\7T\2\2\u0113\u0114\7K\2\2\u0114\u0115\7E\2\2\u0115\u0116\7C\2\2\u0116"+
		"\u0117\7P\2\2\u0117\u0118\7C\2\2\u0118H\3\2\2\2\u0119\u011a\7R\2\2\u011a"+
		"\u011b\7G\2\2\u011b\u011c\7I\2\2\u011c\u011d\7C\2\2\u011d\u011e\7Q\2\2"+
		"\u011eJ\3\2\2\2\u011f\u0121\5\7\4\2\u0120\u011f\3\2\2\2\u0121\u0122\3"+
		"\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123L\3\2\2\2\u0124\u0125"+
		"\5K&\2\u0125\u0126\5\t\5\2\u0126\u0127\5K&\2\u0127N\3\2\2\2\u0128\u012b"+
		"\5\3\2\2\u0129\u012b\5\5\3\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"P\3\2\2\2\u012c\u0130\7$\2\2\u012d\u012f\13\2\2\2\u012e\u012d\3\2\2\2"+
		"\u012f\u0132\3\2\2\2\u0130\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7$\2\2\u0134R\3\2\2\2\u0135\u0137"+
		"\t\3\2\2\u0136\u0138\t\2\2\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"T\3\2\2\2\u0139\u013d\7#\2\2\u013a\u013c\13\2\2\2\u013b\u013a\3\2\2\2"+
		"\u013c\u013f\3\2\2\2\u013d\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0141"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\7\17\2\2\u0141\u0140\3\2\2\2"+
		"\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\f\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\b+\2\2\u0146V\3\2\2\2\u0147\u0149\t\4\2\2\u0148\u0147"+
		"\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\b,\2\2\u014dX\3\2\2\2\n\2\u0122\u012a\u0130"+
		"\u0137\u013d\u0141\u014a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}