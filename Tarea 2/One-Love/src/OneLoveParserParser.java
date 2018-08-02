// Generated from OneLoveParser.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OneLoveParserParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_s = 1, RULE_inicio = 2, RULE_variable = 3, RULE_constante = 4, 
		RULE_cuerpo = 5, RULE_fin = 6, RULE_stat = 7, RULE_declaracion = 8, RULE_assing = 9, 
		RULE_operaciones_matematicas = 10, RULE_operaciones_logicas = 11, RULE_sentencia_mate = 12, 
		RULE_sentencia_log = 13, RULE_if_sentence = 14, RULE_condicion = 15, RULE_else_sentence = 16, 
		RULE_bloque = 17, RULE_tipos_variable = 18, RULE_for_sentence = 19, RULE_for_encabezado = 20, 
		RULE_while_sentence = 21, RULE_sqrt = 22, RULE_sen = 23, RULE_cos = 24, 
		RULE_tag = 25, RULE_lectura = 26, RULE_escritura = 27;
	public static final String[] ruleNames = {
		"program", "s", "inicio", "variable", "constante", "cuerpo", "fin", "stat", 
		"declaracion", "assing", "operaciones_matematicas", "operaciones_logicas", 
		"sentencia_mate", "sentencia_log", "if_sentence", "condicion", "else_sentence", 
		"bloque", "tipos_variable", "for_sentence", "for_encabezado", "while_sentence", 
		"sqrt", "sen", "cos", "tag", "lectura", "escritura"
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

	@Override
	public String getGrammarFileName() { return "OneLoveParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OneLoveParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public FinContext fin() {
			return getRuleContext(FinContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			inicio();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(57);
				variable();
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					stat();
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQRT) | (1L << COS) | (1L << SEN) | (1L << TAN) | (1L << IF) | (1L << READ) | (1L << WRITE) | (1L << ENTERO) | (1L << PALABRA) | (1L << VF) | (1L << WHILE) | (1L << FOR) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << ID))) != 0) );
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(65);
				constante();
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					stat();
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQRT) | (1L << COS) | (1L << SEN) | (1L << TAN) | (1L << IF) | (1L << READ) | (1L << WRITE) | (1L << ENTERO) | (1L << PALABRA) | (1L << VF) | (1L << WHILE) | (1L << FOR) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << ID))) != 0) );
				}
			}

			setState(73);
			cuerpo();
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				stat();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQRT) | (1L << COS) | (1L << SEN) | (1L << TAN) | (1L << IF) | (1L << READ) | (1L << WRITE) | (1L << ENTERO) | (1L << PALABRA) | (1L << VF) | (1L << WHILE) | (1L << FOR) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << ID))) != 0) );
			setState(79);
			fin();
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

	public static class SContext extends ParserRuleContext {
		public Operaciones_matematicasContext operaciones_matematicas() {
			return getRuleContext(Operaciones_matematicasContext.class,0);
		}
		public Operaciones_logicasContext operaciones_logicas() {
			return getRuleContext(Operaciones_logicasContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OneLoveParserParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				operaciones_matematicas(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				operaciones_logicas(0);
				setState(83);
				match(EOF);
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

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(OneLoveParserParser.INICIO, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(INICIO);
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
		public TerminalNode VAR() { return getToken(OneLoveParserParser.VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(VAR);
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

	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(OneLoveParserParser.CONST, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CONST);
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

	public static class CuerpoContext extends ParserRuleContext {
		public TerminalNode CUERPO() { return getToken(OneLoveParserParser.CUERPO, 0); }
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cuerpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CUERPO);
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

	public static class FinContext extends ParserRuleContext {
		public TerminalNode FIN() { return getToken(OneLoveParserParser.FIN, 0); }
		public FinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitFin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinContext fin() throws RecognitionException {
		FinContext _localctx = new FinContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(FIN);
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

	public static class StatContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AssingContext assing() {
			return getRuleContext(AssingContext.class,0);
		}
		public Operaciones_matematicasContext operaciones_matematicas() {
			return getRuleContext(Operaciones_matematicasContext.class,0);
		}
		public If_sentenceContext if_sentence() {
			return getRuleContext(If_sentenceContext.class,0);
		}
		public Operaciones_logicasContext operaciones_logicas() {
			return getRuleContext(Operaciones_logicasContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public For_sentenceContext for_sentence() {
			return getRuleContext(For_sentenceContext.class,0);
		}
		public While_sentenceContext while_sentence() {
			return getRuleContext(While_sentenceContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				assing();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				operaciones_matematicas(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				if_sentence();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				operaciones_logicas(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				lectura();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				escritura();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				for_sentence();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				while_sentence();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public Tipos_variableContext tipos_variable() {
			return getRuleContext(Tipos_variableContext.class,0);
		}
		public TerminalNode ID() { return getToken(OneLoveParserParser.ID, 0); }
		public TerminalNode DOTCOMA() { return getToken(OneLoveParserParser.DOTCOMA, 0); }
		public AssingContext assing() {
			return getRuleContext(AssingContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				tipos_variable();
				setState(109);
				match(ID);
				setState(110);
				match(DOTCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				tipos_variable();
				setState(113);
				assing();
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

	public static class AssingContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(OneLoveParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OneLoveParserParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(OneLoveParserParser.ASSIGN, 0); }
		public TerminalNode DOTCOMA() { return getToken(OneLoveParserParser.DOTCOMA, 0); }
		public List<Operaciones_matematicasContext> operaciones_matematicas() {
			return getRuleContexts(Operaciones_matematicasContext.class);
		}
		public Operaciones_matematicasContext operaciones_matematicas(int i) {
			return getRuleContext(Operaciones_matematicasContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(OneLoveParserParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(OneLoveParserParser.STRING, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(OneLoveParserParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(OneLoveParserParser.BOOLEAN, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(OneLoveParserParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(OneLoveParserParser.NUMBER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(OneLoveParserParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(OneLoveParserParser.FLOAT, i);
		}
		public List<Operaciones_logicasContext> operaciones_logicas() {
			return getRuleContexts(Operaciones_logicasContext.class);
		}
		public Operaciones_logicasContext operaciones_logicas(int i) {
			return getRuleContext(Operaciones_logicasContext.class,i);
		}
		public AssingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitAssing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssingContext assing() throws RecognitionException {
		AssingContext _localctx = new AssingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			setState(118);
			match(ASSIGN);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(119);
					operaciones_matematicas(0);
					}
					break;
				case 2:
					{
					setState(120);
					match(ID);
					}
					break;
				case 3:
					{
					setState(121);
					match(STRING);
					}
					break;
				case 4:
					{
					setState(122);
					match(BOOLEAN);
					}
					break;
				case 5:
					{
					setState(123);
					match(NUMBER);
					}
					break;
				case 6:
					{
					setState(124);
					match(FLOAT);
					}
					break;
				case 7:
					{
					setState(125);
					operaciones_logicas(0);
					}
					break;
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQRT) | (1L << COS) | (1L << SEN) | (1L << TAN) | (1L << NUMBER) | (1L << FLOAT) | (1L << BOOLEAN) | (1L << STRING) | (1L << ID))) != 0) );
			setState(130);
			match(DOTCOMA);
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

	public static class Operaciones_matematicasContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(OneLoveParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OneLoveParserParser.ID, i);
		}
		public Sentencia_mateContext sentencia_mate() {
			return getRuleContext(Sentencia_mateContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(OneLoveParserParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(OneLoveParserParser.NUMBER, i);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public SenContext sen() {
			return getRuleContext(SenContext.class,0);
		}
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public List<Operaciones_matematicasContext> operaciones_matematicas() {
			return getRuleContexts(Operaciones_matematicasContext.class);
		}
		public Operaciones_matematicasContext operaciones_matematicas(int i) {
			return getRuleContext(Operaciones_matematicasContext.class,i);
		}
		public Operaciones_matematicasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones_matematicas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitOperaciones_matematicas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operaciones_matematicasContext operaciones_matematicas() throws RecognitionException {
		return operaciones_matematicas(0);
	}

	private Operaciones_matematicasContext operaciones_matematicas(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Operaciones_matematicasContext _localctx = new Operaciones_matematicasContext(_ctx, _parentState);
		Operaciones_matematicasContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_operaciones_matematicas, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(133);
				match(ID);
				setState(134);
				sentencia_mate();
				setState(135);
				match(ID);
				}
				break;
			case 2:
				{
				setState(137);
				match(ID);
				setState(138);
				sentencia_mate();
				setState(139);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(141);
				match(NUMBER);
				setState(142);
				sentencia_mate();
				setState(143);
				match(ID);
				}
				break;
			case 4:
				{
				setState(145);
				match(NUMBER);
				setState(146);
				sentencia_mate();
				setState(147);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(149);
				sqrt();
				}
				break;
			case 6:
				{
				setState(150);
				cos();
				}
				break;
			case 7:
				{
				setState(151);
				sen();
				}
				break;
			case 8:
				{
				setState(152);
				tag();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Operaciones_matematicasContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operaciones_matematicas);
					setState(155);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(156);
					sentencia_mate();
					setState(157);
					operaciones_matematicas(2);
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Operaciones_logicasContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(OneLoveParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OneLoveParserParser.ID, i);
		}
		public Sentencia_logContext sentencia_log() {
			return getRuleContext(Sentencia_logContext.class,0);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(OneLoveParserParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(OneLoveParserParser.BOOLEAN, i);
		}
		public List<Operaciones_logicasContext> operaciones_logicas() {
			return getRuleContexts(Operaciones_logicasContext.class);
		}
		public Operaciones_logicasContext operaciones_logicas(int i) {
			return getRuleContext(Operaciones_logicasContext.class,i);
		}
		public Operaciones_logicasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones_logicas; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitOperaciones_logicas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operaciones_logicasContext operaciones_logicas() throws RecognitionException {
		return operaciones_logicas(0);
	}

	private Operaciones_logicasContext operaciones_logicas(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Operaciones_logicasContext _localctx = new Operaciones_logicasContext(_ctx, _parentState);
		Operaciones_logicasContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_operaciones_logicas, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(165);
				match(ID);
				setState(166);
				sentencia_log();
				setState(167);
				match(ID);
				}
				break;
			case 2:
				{
				setState(169);
				match(ID);
				setState(170);
				sentencia_log();
				setState(171);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				setState(173);
				match(BOOLEAN);
				setState(174);
				sentencia_log();
				setState(175);
				match(ID);
				}
				break;
			case 4:
				{
				setState(177);
				match(BOOLEAN);
				setState(178);
				sentencia_log();
				setState(179);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Operaciones_logicasContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operaciones_logicas);
					setState(183);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(184);
					sentencia_log();
					setState(185);
					operaciones_logicas(2);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Sentencia_mateContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(OneLoveParserParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(OneLoveParserParser.RESTA, 0); }
		public TerminalNode DIVIDIR() { return getToken(OneLoveParserParser.DIVIDIR, 0); }
		public TerminalNode MULTI() { return getToken(OneLoveParserParser.MULTI, 0); }
		public Sentencia_mateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_mate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitSentencia_mate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_mateContext sentencia_mate() throws RecognitionException {
		Sentencia_mateContext _localctx = new Sentencia_mateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencia_mate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << DIVIDIR) | (1L << MULTI))) != 0)) ) {
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

	public static class Sentencia_logContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(OneLoveParserParser.AND, 0); }
		public TerminalNode OR() { return getToken(OneLoveParserParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(OneLoveParserParser.EQUAL, 0); }
		public TerminalNode NQUAL() { return getToken(OneLoveParserParser.NQUAL, 0); }
		public Sentencia_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_log; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitSentencia_log(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_logContext sentencia_log() throws RecognitionException {
		Sentencia_logContext _localctx = new Sentencia_logContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentencia_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << EQUAL) | (1L << NQUAL))) != 0)) ) {
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

	public static class If_sentenceContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(OneLoveParserParser.IF, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(OneLoveParserParser.ELSE, 0); }
		public Else_sentenceContext else_sentence() {
			return getRuleContext(Else_sentenceContext.class,0);
		}
		public If_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitIf_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sentenceContext if_sentence() throws RecognitionException {
		If_sentenceContext _localctx = new If_sentenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(IF);
			setState(197);
			condicion();
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(198);
				match(ELSE);
				setState(199);
				else_sentence();
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(OneLoveParserParser.LPAR, 0); }
		public Operaciones_logicasContext operaciones_logicas() {
			return getRuleContext(Operaciones_logicasContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OneLoveParserParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(OneLoveParserParser.LBRACE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(OneLoveParserParser.RBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condicion);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(LPAR);
				setState(203);
				operaciones_logicas(0);
				setState(204);
				match(RPAR);
				setState(205);
				match(LBRACE);
				setState(206);
				bloque();
				setState(207);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(LPAR);
				setState(210);
				operaciones_logicas(0);
				setState(211);
				match(RPAR);
				setState(212);
				stat();
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

	public static class Else_sentenceContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(OneLoveParserParser.LBRACE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(OneLoveParserParser.RBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Else_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitElse_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_sentenceContext else_sentence() throws RecognitionException {
		Else_sentenceContext _localctx = new Else_sentenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_sentence);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(LBRACE);
				setState(217);
				bloque();
				setState(218);
				match(RBRACE);
				}
				break;
			case SQRT:
			case COS:
			case SEN:
			case TAN:
			case IF:
			case READ:
			case WRITE:
			case ENTERO:
			case PALABRA:
			case VF:
			case WHILE:
			case FOR:
			case NUMBER:
			case BOOLEAN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				stat();
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

	public static class BloqueContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				stat();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SQRT) | (1L << COS) | (1L << SEN) | (1L << TAN) | (1L << IF) | (1L << READ) | (1L << WRITE) | (1L << ENTERO) | (1L << PALABRA) | (1L << VF) | (1L << WHILE) | (1L << FOR) | (1L << NUMBER) | (1L << BOOLEAN) | (1L << ID))) != 0) );
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

	public static class Tipos_variableContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(OneLoveParserParser.ENTERO, 0); }
		public TerminalNode PALABRA() { return getToken(OneLoveParserParser.PALABRA, 0); }
		public TerminalNode VF() { return getToken(OneLoveParserParser.VF, 0); }
		public Tipos_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitTipos_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_variableContext tipos_variable() throws RecognitionException {
		Tipos_variableContext _localctx = new Tipos_variableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tipos_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << PALABRA) | (1L << VF))) != 0)) ) {
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

	public static class For_sentenceContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(OneLoveParserParser.FOR, 0); }
		public For_encabezadoContext for_encabezado() {
			return getRuleContext(For_encabezadoContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(OneLoveParserParser.LBRACE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(OneLoveParserParser.RBRACE, 0); }
		public For_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitFor_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_sentenceContext for_sentence() throws RecognitionException {
		For_sentenceContext _localctx = new For_sentenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(FOR);
			setState(231);
			for_encabezado();
			setState(232);
			match(LBRACE);
			setState(233);
			bloque();
			setState(234);
			match(RBRACE);
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

	public static class For_encabezadoContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(OneLoveParserParser.LPAR, 0); }
		public List<AssingContext> assing() {
			return getRuleContexts(AssingContext.class);
		}
		public AssingContext assing(int i) {
			return getRuleContext(AssingContext.class,i);
		}
		public List<TerminalNode> DOTCOMA() { return getTokens(OneLoveParserParser.DOTCOMA); }
		public TerminalNode DOTCOMA(int i) {
			return getToken(OneLoveParserParser.DOTCOMA, i);
		}
		public Operaciones_logicasContext operaciones_logicas() {
			return getRuleContext(Operaciones_logicasContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OneLoveParserParser.RPAR, 0); }
		public For_encabezadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_encabezado; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitFor_encabezado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_encabezadoContext for_encabezado() throws RecognitionException {
		For_encabezadoContext _localctx = new For_encabezadoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_encabezado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LPAR);
			setState(237);
			assing();
			setState(238);
			match(DOTCOMA);
			setState(239);
			operaciones_logicas(0);
			setState(240);
			match(DOTCOMA);
			setState(241);
			assing();
			setState(242);
			match(RPAR);
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

	public static class While_sentenceContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(OneLoveParserParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(OneLoveParserParser.LPAR, 0); }
		public Operaciones_logicasContext operaciones_logicas() {
			return getRuleContext(Operaciones_logicasContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OneLoveParserParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(OneLoveParserParser.LBRACE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(OneLoveParserParser.RBRACE, 0); }
		public While_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitWhile_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_sentenceContext while_sentence() throws RecognitionException {
		While_sentenceContext _localctx = new While_sentenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(WHILE);
			setState(245);
			match(LPAR);
			setState(246);
			operaciones_logicas(0);
			setState(247);
			match(RPAR);
			setState(248);
			match(LBRACE);
			setState(249);
			bloque();
			setState(250);
			match(RBRACE);
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

	public static class SqrtContext extends ParserRuleContext {
		public TerminalNode SQRT() { return getToken(OneLoveParserParser.SQRT, 0); }
		public TerminalNode LPAR() { return getToken(OneLoveParserParser.LPAR, 0); }
		public Operaciones_matematicasContext operaciones_matematicas() {
			return getRuleContext(Operaciones_matematicasContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OneLoveParserParser.RPAR, 0); }
		public TerminalNode DOTCOMA() { return getToken(OneLoveParserParser.DOTCOMA, 0); }
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitSqrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(SQRT);
			setState(253);
			match(LPAR);
			setState(254);
			operaciones_matematicas(0);
			setState(255);
			match(RPAR);
			setState(256);
			match(DOTCOMA);
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

	public static class SenContext extends ParserRuleContext {
		public TerminalNode SEN() { return getToken(OneLoveParserParser.SEN, 0); }
		public TerminalNode LPAR() { return getToken(OneLoveParserParser.LPAR, 0); }
		public Operaciones_matematicasContext operaciones_matematicas() {
			return getRuleContext(Operaciones_matematicasContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OneLoveParserParser.RPAR, 0); }
		public TerminalNode DOTCOMA() { return getToken(OneLoveParserParser.DOTCOMA, 0); }
		public SenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitSen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenContext sen() throws RecognitionException {
		SenContext _localctx = new SenContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(SEN);
			setState(259);
			match(LPAR);
			setState(260);
			operaciones_matematicas(0);
			setState(261);
			match(RPAR);
			setState(262);
			match(DOTCOMA);
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

	public static class CosContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(OneLoveParserParser.COS, 0); }
		public TerminalNode LPAR() { return getToken(OneLoveParserParser.LPAR, 0); }
		public Operaciones_matematicasContext operaciones_matematicas() {
			return getRuleContext(Operaciones_matematicasContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OneLoveParserParser.RPAR, 0); }
		public TerminalNode DOTCOMA() { return getToken(OneLoveParserParser.DOTCOMA, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(COS);
			setState(265);
			match(LPAR);
			setState(266);
			operaciones_matematicas(0);
			setState(267);
			match(RPAR);
			setState(268);
			match(DOTCOMA);
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

	public static class TagContext extends ParserRuleContext {
		public TerminalNode TAN() { return getToken(OneLoveParserParser.TAN, 0); }
		public TerminalNode LPAR() { return getToken(OneLoveParserParser.LPAR, 0); }
		public Operaciones_matematicasContext operaciones_matematicas() {
			return getRuleContext(Operaciones_matematicasContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(OneLoveParserParser.RPAR, 0); }
		public TerminalNode DOTCOMA() { return getToken(OneLoveParserParser.DOTCOMA, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(TAN);
			setState(271);
			match(LPAR);
			setState(272);
			operaciones_matematicas(0);
			setState(273);
			match(RPAR);
			setState(274);
			match(DOTCOMA);
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

	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(OneLoveParserParser.READ, 0); }
		public TerminalNode LPAR() { return getToken(OneLoveParserParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(OneLoveParserParser.ID, 0); }
		public TerminalNode RPAR() { return getToken(OneLoveParserParser.RPAR, 0); }
		public TerminalNode DOTCOMA() { return getToken(OneLoveParserParser.DOTCOMA, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitLectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(READ);
			setState(277);
			match(LPAR);
			setState(278);
			match(ID);
			setState(279);
			match(RPAR);
			setState(280);
			match(DOTCOMA);
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

	public static class EscrituraContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(OneLoveParserParser.WRITE, 0); }
		public TerminalNode LPAR() { return getToken(OneLoveParserParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(OneLoveParserParser.RPAR, 0); }
		public TerminalNode DOTCOMA() { return getToken(OneLoveParserParser.DOTCOMA, 0); }
		public TerminalNode STRING() { return getToken(OneLoveParserParser.STRING ,0); }
		public List<TerminalNode> ID() { return getTokens(OneLoveParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(OneLoveParserParser.ID, i);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OneLoveParserVisitor ) return ((OneLoveParserVisitor<? extends T>)visitor).visitEscritura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_escritura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(WRITE);
			setState(283);
			match(LPAR);
			setState(285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(284);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==ID );
			setState(289);
			match(RPAR);
			setState(290);
			match(DOTCOMA);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return operaciones_matematicas_sempred((Operaciones_matematicasContext)_localctx, predIndex);
		case 11:
			return operaciones_logicas_sempred((Operaciones_logicasContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operaciones_matematicas_sempred(Operaciones_matematicasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean operaciones_logicas_sempred(Operaciones_logicasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\6\2>\n\2\r\2\16\2"+
		"?\5\2B\n\2\3\2\3\2\6\2F\n\2\r\2\16\2G\5\2J\n\2\3\2\3\2\6\2N\n\2\r\2\16"+
		"\2O\3\2\3\2\3\3\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\nv\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13"+
		"\u0081\n\13\r\13\16\13\u0082\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009c\n\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b8\n\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00be\n\r\f\r\16\r\u00c1\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\5\20\u00cb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00d9\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00e0\n"+
		"\22\3\23\6\23\u00e3\n\23\r\23\16\23\u00e4\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\6\35\u0120\n\35\r\35\16"+
		"\35\u0121\3\35\3\35\3\35\3\35\2\4\26\30\36\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668\2\6\3\2\7\n\3\2\f\17\3\2\36 \3\2&\'"+
		"\u0131\2:\3\2\2\2\4W\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\n]\3\2\2\2\f_\3\2\2"+
		"\2\16a\3\2\2\2\20l\3\2\2\2\22u\3\2\2\2\24w\3\2\2\2\26\u009b\3\2\2\2\30"+
		"\u00b7\3\2\2\2\32\u00c2\3\2\2\2\34\u00c4\3\2\2\2\36\u00c6\3\2\2\2 \u00d8"+
		"\3\2\2\2\"\u00df\3\2\2\2$\u00e2\3\2\2\2&\u00e6\3\2\2\2(\u00e8\3\2\2\2"+
		"*\u00ee\3\2\2\2,\u00f6\3\2\2\2.\u00fe\3\2\2\2\60\u0104\3\2\2\2\62\u010a"+
		"\3\2\2\2\64\u0110\3\2\2\2\66\u0116\3\2\2\28\u011c\3\2\2\2:A\5\6\4\2;="+
		"\5\b\5\2<>\5\20\t\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2"+
		"A;\3\2\2\2AB\3\2\2\2BI\3\2\2\2CE\5\n\6\2DF\5\20\t\2ED\3\2\2\2FG\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IC\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\5\f\7"+
		"\2LN\5\20\t\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\5\16"+
		"\b\2R\3\3\2\2\2SX\5\26\f\2TU\5\30\r\2UV\7\2\2\3VX\3\2\2\2WS\3\2\2\2WT"+
		"\3\2\2\2X\5\3\2\2\2YZ\7\27\2\2Z\7\3\2\2\2[\\\7\25\2\2\\\t\3\2\2\2]^\7"+
		"\26\2\2^\13\3\2\2\2_`\7\30\2\2`\r\3\2\2\2ab\7\31\2\2b\17\3\2\2\2cm\5\22"+
		"\n\2dm\5\24\13\2em\5\26\f\2fm\5\36\20\2gm\5\30\r\2hm\5\66\34\2im\58\35"+
		"\2jm\5(\25\2km\5,\27\2lc\3\2\2\2ld\3\2\2\2le\3\2\2\2lf\3\2\2\2lg\3\2\2"+
		"\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\21\3\2\2\2no\5&\24\2op\7\'"+
		"\2\2pq\7\13\2\2qv\3\2\2\2rs\5&\24\2st\5\24\13\2tv\3\2\2\2un\3\2\2\2ur"+
		"\3\2\2\2v\23\3\2\2\2wx\7\'\2\2x\u0080\7\20\2\2y\u0081\5\26\f\2z\u0081"+
		"\7\'\2\2{\u0081\7&\2\2|\u0081\7%\2\2}\u0081\7#\2\2~\u0081\7$\2\2\177\u0081"+
		"\5\30\r\2\u0080y\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2"+
		"\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\13"+
		"\2\2\u0085\25\3\2\2\2\u0086\u0087\b\f\1\2\u0087\u0088\7\'\2\2\u0088\u0089"+
		"\5\32\16\2\u0089\u008a\7\'\2\2\u008a\u009c\3\2\2\2\u008b\u008c\7\'\2\2"+
		"\u008c\u008d\5\32\16\2\u008d\u008e\7#\2\2\u008e\u009c\3\2\2\2\u008f\u0090"+
		"\7#\2\2\u0090\u0091\5\32\16\2\u0091\u0092\7\'\2\2\u0092\u009c\3\2\2\2"+
		"\u0093\u0094\7#\2\2\u0094\u0095\5\32\16\2\u0095\u0096\7#\2\2\u0096\u009c"+
		"\3\2\2\2\u0097\u009c\5.\30\2\u0098\u009c\5\62\32\2\u0099\u009c\5\60\31"+
		"\2\u009a\u009c\5\64\33\2\u009b\u0086\3\2\2\2\u009b\u008b\3\2\2\2\u009b"+
		"\u008f\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u00a3\3\2\2\2\u009d"+
		"\u009e\f\3\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\5\26\f\4\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\27\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\b\r\1"+
		"\2\u00a7\u00a8\7\'\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\7\'\2\2\u00aa"+
		"\u00b8\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00ae\7"+
		"%\2\2\u00ae\u00b8\3\2\2\2\u00af\u00b0\7%\2\2\u00b0\u00b1\5\34\17\2\u00b1"+
		"\u00b2\7\'\2\2\u00b2\u00b8\3\2\2\2\u00b3\u00b4\7%\2\2\u00b4\u00b5\5\34"+
		"\17\2\u00b5\u00b6\7%\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00a6\3\2\2\2\u00b7"+
		"\u00ab\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\u00bf\3\2"+
		"\2\2\u00b9\u00ba\f\3\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc\5\30\r\4\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\31\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3"+
		"\t\2\2\2\u00c3\33\3\2\2\2\u00c4\u00c5\t\3\2\2\u00c5\35\3\2\2\2\u00c6\u00c7"+
		"\7\32\2\2\u00c7\u00ca\5 \21\2\u00c8\u00c9\7\33\2\2\u00c9\u00cb\5\"\22"+
		"\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\37\3\2\2\2\u00cc\u00cd"+
		"\7\21\2\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\7\23\2"+
		"\2\u00d0\u00d1\5$\23\2\u00d1\u00d2\7\24\2\2\u00d2\u00d9\3\2\2\2\u00d3"+
		"\u00d4\7\21\2\2\u00d4\u00d5\5\30\r\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7"+
		"\5\20\t\2\u00d7\u00d9\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00d3\3\2\2\2"+
		"\u00d9!\3\2\2\2\u00da\u00db\7\23\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd\7"+
		"\24\2\2\u00dd\u00e0\3\2\2\2\u00de\u00e0\5\20\t\2\u00df\u00da\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0#\3\2\2\2\u00e1\u00e3\5\20\t\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5%\3"+
		"\2\2\2\u00e6\u00e7\t\4\2\2\u00e7\'\3\2\2\2\u00e8\u00e9\7\"\2\2\u00e9\u00ea"+
		"\5*\26\2\u00ea\u00eb\7\23\2\2\u00eb\u00ec\5$\23\2\u00ec\u00ed\7\24\2\2"+
		"\u00ed)\3\2\2\2\u00ee\u00ef\7\21\2\2\u00ef\u00f0\5\24\13\2\u00f0\u00f1"+
		"\7\13\2\2\u00f1\u00f2\5\30\r\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4\5\24\13"+
		"\2\u00f4\u00f5\7\22\2\2\u00f5+\3\2\2\2\u00f6\u00f7\7!\2\2\u00f7\u00f8"+
		"\7\21\2\2\u00f8\u00f9\5\30\r\2\u00f9\u00fa\7\22\2\2\u00fa\u00fb\7\23\2"+
		"\2\u00fb\u00fc\5$\23\2\u00fc\u00fd\7\24\2\2\u00fd-\3\2\2\2\u00fe\u00ff"+
		"\7\3\2\2\u00ff\u0100\7\21\2\2\u0100\u0101\5\26\f\2\u0101\u0102\7\22\2"+
		"\2\u0102\u0103\7\13\2\2\u0103/\3\2\2\2\u0104\u0105\7\5\2\2\u0105\u0106"+
		"\7\21\2\2\u0106\u0107\5\26\f\2\u0107\u0108\7\22\2\2\u0108\u0109\7\13\2"+
		"\2\u0109\61\3\2\2\2\u010a\u010b\7\4\2\2\u010b\u010c\7\21\2\2\u010c\u010d"+
		"\5\26\f\2\u010d\u010e\7\22\2\2\u010e\u010f\7\13\2\2\u010f\63\3\2\2\2\u0110"+
		"\u0111\7\6\2\2\u0111\u0112\7\21\2\2\u0112\u0113\5\26\f\2\u0113\u0114\7"+
		"\22\2\2\u0114\u0115\7\13\2\2\u0115\65\3\2\2\2\u0116\u0117\7\34\2\2\u0117"+
		"\u0118\7\21\2\2\u0118\u0119\7\'\2\2\u0119\u011a\7\22\2\2\u011a\u011b\7"+
		"\13\2\2\u011b\67\3\2\2\2\u011c\u011d\7\35\2\2\u011d\u011f\7\21\2\2\u011e"+
		"\u0120\t\5\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\22\2\2\u0124"+
		"\u0125\7\13\2\2\u01259\3\2\2\2\25?AGIOWlu\u0080\u0082\u009b\u00a3\u00b7"+
		"\u00bf\u00ca\u00d8\u00df\u00e4\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}