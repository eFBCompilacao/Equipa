// Generated from MOC_Interpretador.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MOC_Interpretador extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEIRO=1, DUPLO=2, VAZIO=3, FUNCAOPRINCIPAL=4, SE=5, SENAO=6, ENQUANTO=7, 
		PARA=8, DEVOLVE=9, LER=10, LERCARACT=11, LERVETOR=12, LERCADEIA=13, ESCREVER=14, 
		ESCREVERCARACT=15, ESCREVERVETOR=16, ESCREVERCADEIA=17, MAIS=18, MENOS=19, 
		MULTIPLICA=20, DIVIDE=21, RESTO=22, MENOR=23, MENORIGUAL=24, MAIOR=25, 
		MAIORIGUAL=26, IGUAL=27, DIFERENTE=28, ELOGICO=29, OULOGICO=30, NAO=31, 
		ABREPARENTISES=32, FECHAPARENTISES=33, ABRECHAVETAS=34, FECHACHAVETAS=35, 
		ABREPARENTISESRETOS=36, FECHAPARENTISESRETOS=37, ATRIBUICAO=38, PONTOVIRG=39, 
		VIRGULA=40, IDENTIFICADOR=41, LINTEIRO=42, LREAL=43, ESPACO=44, COMENTARIO=45;
	public static final int
		RULE_programa = 0, RULE_instrucao = 1, RULE_instrucaoSE = 2, RULE_instrucaoSEsimples = 3, 
		RULE_instrucaoSEcompleto = 4, RULE_instrucaoSEgeral = 5, RULE_instrucaoENQUANTO = 6, 
		RULE_instrucaoPARA = 7, RULE_instrucaoDEVOLVE = 8, RULE_instrucaoLEITURA = 9, 
		RULE_instrucaoESCRITA = 10, RULE_bloco = 11, RULE_expressao = 12, RULE_declaracao_variaveis = 13, 
		RULE_tipo = 14, RULE_lista_variaveis = 15, RULE_variavel = 16, RULE_prototipo = 17, 
		RULE_parametros = 18, RULE_parametro = 19, RULE_argumentos = 20, RULE_funcao = 21, 
		RULE_principal = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucao", "instrucaoSE", "instrucaoSEsimples", "instrucaoSEcompleto", 
			"instrucaoSEgeral", "instrucaoENQUANTO", "instrucaoPARA", "instrucaoDEVOLVE", 
			"instrucaoLEITURA", "instrucaoESCRITA", "bloco", "expressao", "declaracao_variaveis", 
			"tipo", "lista_variaveis", "variavel", "prototipo", "parametros", "parametro", 
			"argumentos", "funcao", "principal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'double'", "'void'", "'main'", "'if'", "'else'", "'while'", 
			"'for'", "'return'", "'read'", "'readc'", "'readv'", "'reads'", "'write'", 
			"'writec'", "'writev'", "'writes'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEIRO", "DUPLO", "VAZIO", "FUNCAOPRINCIPAL", "SE", "SENAO", 
			"ENQUANTO", "PARA", "DEVOLVE", "LER", "LERCARACT", "LERVETOR", "LERCADEIA", 
			"ESCREVER", "ESCREVERCARACT", "ESCREVERVETOR", "ESCREVERCADEIA", "MAIS", 
			"MENOS", "MULTIPLICA", "DIVIDE", "RESTO", "MENOR", "MENORIGUAL", "MAIOR", 
			"MAIORIGUAL", "IGUAL", "DIFERENTE", "ELOGICO", "OULOGICO", "NAO", "ABREPARENTISES", 
			"FECHAPARENTISES", "ABRECHAVETAS", "FECHACHAVETAS", "ABREPARENTISESRETOS", 
			"FECHAPARENTISESRETOS", "ATRIBUICAO", "PONTOVIRG", "VIRGULA", "IDENTIFICADOR", 
			"LINTEIRO", "LREAL", "ESPACO", "COMENTARIO"
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
	public String getGrammarFileName() { return "MOC_Interpretador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MOC_Interpretador(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MOC_Interpretador.EOF, 0); }
		public List<PrototipoContext> prototipo() {
			return getRuleContexts(PrototipoContext.class);
		}
		public PrototipoContext prototipo(int i) {
			return getRuleContext(PrototipoContext.class,i);
		}
		public List<Declaracao_variaveisContext> declaracao_variaveis() {
			return getRuleContexts(Declaracao_variaveisContext.class);
		}
		public Declaracao_variaveisContext declaracao_variaveis(int i) {
			return getRuleContext(Declaracao_variaveisContext.class,i);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					prototipo();
					}
					break;
				case 2:
					{
					setState(47);
					declaracao_variaveis();
					}
					break;
				case 3:
					{
					setState(48);
					funcao();
					}
					break;
				case 4:
					{
					setState(49);
					principal();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoContext extends ParserRuleContext {
		public InstrucaoSEContext instrucaoSE() {
			return getRuleContext(InstrucaoSEContext.class,0);
		}
		public InstrucaoENQUANTOContext instrucaoENQUANTO() {
			return getRuleContext(InstrucaoENQUANTOContext.class,0);
		}
		public InstrucaoPARAContext instrucaoPARA() {
			return getRuleContext(InstrucaoPARAContext.class,0);
		}
		public InstrucaoDEVOLVEContext instrucaoDEVOLVE() {
			return getRuleContext(InstrucaoDEVOLVEContext.class,0);
		}
		public InstrucaoLEITURAContext instrucaoLEITURA() {
			return getRuleContext(InstrucaoLEITURAContext.class,0);
		}
		public InstrucaoESCRITAContext instrucaoESCRITA() {
			return getRuleContext(InstrucaoESCRITAContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTOVIRG() { return getToken(MOC_Interpretador.PONTOVIRG, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucao);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				instrucaoSE();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				instrucaoENQUANTO();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				instrucaoPARA();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				instrucaoDEVOLVE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				instrucaoLEITURA();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				instrucaoESCRITA();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				expressao(0);
				setState(64);
				match(PONTOVIRG);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoSEContext extends ParserRuleContext {
		public InstrucaoSEsimplesContext instrucaoSEsimples() {
			return getRuleContext(InstrucaoSEsimplesContext.class,0);
		}
		public InstrucaoSEcompletoContext instrucaoSEcompleto() {
			return getRuleContext(InstrucaoSEcompletoContext.class,0);
		}
		public InstrucaoSEgeralContext instrucaoSEgeral() {
			return getRuleContext(InstrucaoSEgeralContext.class,0);
		}
		public InstrucaoSEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoSE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterInstrucaoSE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitInstrucaoSE(this);
		}
	}

	public final InstrucaoSEContext instrucaoSE() throws RecognitionException {
		InstrucaoSEContext _localctx = new InstrucaoSEContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucaoSE);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				instrucaoSEsimples();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				instrucaoSEcompleto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				instrucaoSEgeral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoSEsimplesContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(MOC_Interpretador.SE, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public InstrucaoSEContext instrucaoSE() {
			return getRuleContext(InstrucaoSEContext.class,0);
		}
		public InstrucaoSEcompletoContext instrucaoSEcompleto() {
			return getRuleContext(InstrucaoSEcompletoContext.class,0);
		}
		public TerminalNode SENAO() { return getToken(MOC_Interpretador.SENAO, 0); }
		public InstrucaoSEsimplesContext instrucaoSEsimples() {
			return getRuleContext(InstrucaoSEsimplesContext.class,0);
		}
		public InstrucaoSEsimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoSEsimples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterInstrucaoSEsimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitInstrucaoSEsimples(this);
		}
	}

	public final InstrucaoSEsimplesContext instrucaoSEsimples() throws RecognitionException {
		InstrucaoSEsimplesContext _localctx = new InstrucaoSEsimplesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucaoSEsimples);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(SE);
				setState(75);
				match(ABREPARENTISES);
				setState(76);
				expressao(0);
				setState(77);
				match(FECHAPARENTISES);
				setState(78);
				instrucaoSE();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(SE);
				setState(81);
				match(ABREPARENTISES);
				setState(82);
				expressao(0);
				setState(83);
				match(FECHAPARENTISES);
				setState(84);
				instrucaoSEcompleto();
				setState(85);
				match(SENAO);
				setState(86);
				instrucaoSEsimples();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoSEcompletoContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(MOC_Interpretador.SE, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public List<InstrucaoSEcompletoContext> instrucaoSEcompleto() {
			return getRuleContexts(InstrucaoSEcompletoContext.class);
		}
		public InstrucaoSEcompletoContext instrucaoSEcompleto(int i) {
			return getRuleContext(InstrucaoSEcompletoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(MOC_Interpretador.SENAO, 0); }
		public InstrucaoSEgeralContext instrucaoSEgeral() {
			return getRuleContext(InstrucaoSEgeralContext.class,0);
		}
		public InstrucaoSEcompletoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoSEcompleto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterInstrucaoSEcompleto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitInstrucaoSEcompleto(this);
		}
	}

	public final InstrucaoSEcompletoContext instrucaoSEcompleto() throws RecognitionException {
		InstrucaoSEcompletoContext _localctx = new InstrucaoSEcompletoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instrucaoSEcompleto);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(SE);
				setState(91);
				match(ABREPARENTISES);
				setState(92);
				expressao(0);
				setState(93);
				match(FECHAPARENTISES);
				setState(94);
				instrucaoSEcompleto();
				setState(95);
				match(SENAO);
				setState(96);
				instrucaoSEcompleto();
				}
				break;
			case LER:
			case LERCARACT:
			case LERVETOR:
			case LERCADEIA:
			case ESCREVER:
			case ESCREVERCARACT:
			case ESCREVERVETOR:
			case ESCREVERCADEIA:
			case MAIS:
			case MENOS:
			case NAO:
			case ABREPARENTISES:
			case ABRECHAVETAS:
			case IDENTIFICADOR:
			case LINTEIRO:
			case LREAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				instrucaoSEgeral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoSEgeralContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTOVIRG() { return getToken(MOC_Interpretador.PONTOVIRG, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public InstrucaoSEgeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoSEgeral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterInstrucaoSEgeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitInstrucaoSEgeral(this);
		}
	}

	public final InstrucaoSEgeralContext instrucaoSEgeral() throws RecognitionException {
		InstrucaoSEgeralContext _localctx = new InstrucaoSEgeralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instrucaoSEgeral);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				expressao(0);
				setState(102);
				match(PONTOVIRG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoENQUANTOContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(MOC_Interpretador.ENQUANTO, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public InstrucaoENQUANTOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoENQUANTO; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterInstrucaoENQUANTO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitInstrucaoENQUANTO(this);
		}
	}

	public final InstrucaoENQUANTOContext instrucaoENQUANTO() throws RecognitionException {
		InstrucaoENQUANTOContext _localctx = new InstrucaoENQUANTOContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instrucaoENQUANTO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ENQUANTO);
			setState(108);
			match(ABREPARENTISES);
			setState(109);
			expressao(0);
			setState(110);
			match(FECHAPARENTISES);
			setState(111);
			instrucao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoPARAContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(MOC_Interpretador.PARA, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> PONTOVIRG() { return getTokens(MOC_Interpretador.PONTOVIRG); }
		public TerminalNode PONTOVIRG(int i) {
			return getToken(MOC_Interpretador.PONTOVIRG, i);
		}
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public InstrucaoPARAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoPARA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterInstrucaoPARA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitInstrucaoPARA(this);
		}
	}

	public final InstrucaoPARAContext instrucaoPARA() throws RecognitionException {
		InstrucaoPARAContext _localctx = new InstrucaoPARAContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instrucaoPARA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(PARA);
			setState(114);
			match(ABREPARENTISES);
			setState(115);
			expressao(0);
			setState(116);
			match(PONTOVIRG);
			setState(117);
			expressao(0);
			setState(118);
			match(PONTOVIRG);
			setState(119);
			expressao(0);
			setState(120);
			match(FECHAPARENTISES);
			setState(121);
			instrucao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoDEVOLVEContext extends ParserRuleContext {
		public TerminalNode DEVOLVE() { return getToken(MOC_Interpretador.DEVOLVE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTOVIRG() { return getToken(MOC_Interpretador.PONTOVIRG, 0); }
		public InstrucaoDEVOLVEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoDEVOLVE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterInstrucaoDEVOLVE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitInstrucaoDEVOLVE(this);
		}
	}

	public final InstrucaoDEVOLVEContext instrucaoDEVOLVE() throws RecognitionException {
		InstrucaoDEVOLVEContext _localctx = new InstrucaoDEVOLVEContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instrucaoDEVOLVE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DEVOLVE);
			setState(124);
			expressao(0);
			setState(125);
			match(PONTOVIRG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoLEITURAContext extends ParserRuleContext {
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public TerminalNode PONTOVIRG() { return getToken(MOC_Interpretador.PONTOVIRG, 0); }
		public TerminalNode LER() { return getToken(MOC_Interpretador.LER, 0); }
		public TerminalNode LERCARACT() { return getToken(MOC_Interpretador.LERCARACT, 0); }
		public TerminalNode LERCADEIA() { return getToken(MOC_Interpretador.LERCADEIA, 0); }
		public InstrucaoLEITURAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoLEITURA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterInstrucaoLEITURA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitInstrucaoLEITURA(this);
		}
	}

	public final InstrucaoLEITURAContext instrucaoLEITURA() throws RecognitionException {
		InstrucaoLEITURAContext _localctx = new InstrucaoLEITURAContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instrucaoLEITURA);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 11264L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
			match(ABREPARENTISES);
			setState(129);
			match(FECHAPARENTISES);
			setState(130);
			match(PONTOVIRG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrucaoESCRITAContext extends ParserRuleContext {
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public TerminalNode PONTOVIRG() { return getToken(MOC_Interpretador.PONTOVIRG, 0); }
		public TerminalNode ESCREVER() { return getToken(MOC_Interpretador.ESCREVER, 0); }
		public TerminalNode ESCREVERCARACT() { return getToken(MOC_Interpretador.ESCREVERCARACT, 0); }
		public TerminalNode ESCREVERVETOR() { return getToken(MOC_Interpretador.ESCREVERVETOR, 0); }
		public TerminalNode ESCREVERCADEIA() { return getToken(MOC_Interpretador.ESCREVERCADEIA, 0); }
		public InstrucaoESCRITAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoESCRITA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterInstrucaoESCRITA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitInstrucaoESCRITA(this);
		}
	}

	public final InstrucaoESCRITAContext instrucaoESCRITA() throws RecognitionException {
		InstrucaoESCRITAContext _localctx = new InstrucaoESCRITAContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instrucaoESCRITA);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			match(ABREPARENTISES);
			setState(134);
			expressao(0);
			setState(135);
			match(FECHAPARENTISES);
			setState(136);
			match(PONTOVIRG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode ABRECHAVETAS() { return getToken(MOC_Interpretador.ABRECHAVETAS, 0); }
		public TerminalNode FECHACHAVETAS() { return getToken(MOC_Interpretador.FECHACHAVETAS, 0); }
		public List<Declaracao_variaveisContext> declaracao_variaveis() {
			return getRuleContexts(Declaracao_variaveisContext.class);
		}
		public Declaracao_variaveisContext declaracao_variaveis(int i) {
			return getRuleContext(Declaracao_variaveisContext.class,i);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ABRECHAVETAS);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15416786157486L) != 0)) {
				{
				setState(141);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEIRO:
				case DUPLO:
				case VAZIO:
					{
					setState(139);
					declaracao_variaveis();
					}
					break;
				case SE:
				case ENQUANTO:
				case PARA:
				case DEVOLVE:
				case LER:
				case LERCARACT:
				case LERVETOR:
				case LERCADEIA:
				case ESCREVER:
				case ESCREVERCARACT:
				case ESCREVERVETOR:
				case ESCREVERCADEIA:
				case MAIS:
				case MENOS:
				case NAO:
				case ABREPARENTISES:
				case ABRECHAVETAS:
				case IDENTIFICADOR:
				case LINTEIRO:
				case LREAL:
					{
					setState(140);
					instrucao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(FECHACHAVETAS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_writevContext extends ExpressaoContext {
		public TerminalNode ESCREVERVETOR() { return getToken(MOC_Interpretador.ESCREVERVETOR, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public Chamada_writevContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterChamada_writev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitChamada_writev(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Acesso_vetorContext extends ExpressaoContext {
		public TerminalNode IDENTIFICADOR() { return getToken(MOC_Interpretador.IDENTIFICADOR, 0); }
		public TerminalNode ABREPARENTISESRETOS() { return getToken(MOC_Interpretador.ABREPARENTISESRETOS, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHAPARENTISESRETOS() { return getToken(MOC_Interpretador.FECHAPARENTISESRETOS, 0); }
		public Acesso_vetorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterAcesso_vetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitAcesso_vetor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unitario_positivoContext extends ExpressaoContext {
		public TerminalNode MAIS() { return getToken(MOC_Interpretador.MAIS, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Unitario_positivoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterUnitario_positivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitUnitario_positivo(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Literal_inteiroContext extends ExpressaoContext {
		public TerminalNode LINTEIRO() { return getToken(MOC_Interpretador.LINTEIRO, 0); }
		public Literal_inteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterLiteral_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitLiteral_inteiro(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Literal_vetorContext extends ExpressaoContext {
		public TerminalNode ABRECHAVETAS() { return getToken(MOC_Interpretador.ABRECHAVETAS, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHACHAVETAS() { return getToken(MOC_Interpretador.FECHACHAVETAS, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(MOC_Interpretador.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MOC_Interpretador.VIRGULA, i);
		}
		public Literal_vetorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterLiteral_vetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitLiteral_vetor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Atribuicao_vetorContext extends ExpressaoContext {
		public TerminalNode IDENTIFICADOR() { return getToken(MOC_Interpretador.IDENTIFICADOR, 0); }
		public TerminalNode ABREPARENTISESRETOS() { return getToken(MOC_Interpretador.ABREPARENTISESRETOS, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHAPARENTISESRETOS() { return getToken(MOC_Interpretador.FECHAPARENTISESRETOS, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(MOC_Interpretador.ATRIBUICAO, 0); }
		public Atribuicao_vetorContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterAtribuicao_vetor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitAtribuicao_vetor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_readcContext extends ExpressaoContext {
		public TerminalNode LERCARACT() { return getToken(MOC_Interpretador.LERCARACT, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public Chamada_readcContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterChamada_readc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitChamada_readc(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_writeContext extends ExpressaoContext {
		public TerminalNode ESCREVER() { return getToken(MOC_Interpretador.ESCREVER, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public Chamada_writeContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterChamada_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitChamada_write(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_writesContext extends ExpressaoContext {
		public TerminalNode ESCREVERCADEIA() { return getToken(MOC_Interpretador.ESCREVERCADEIA, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public Chamada_writesContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterChamada_writes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitChamada_writes(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Variavel_simplesContext extends ExpressaoContext {
		public TerminalNode IDENTIFICADOR() { return getToken(MOC_Interpretador.IDENTIFICADOR, 0); }
		public Variavel_simplesContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterVariavel_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitVariavel_simples(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdicaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode MAIS() { return getToken(MOC_Interpretador.MAIS, 0); }
		public AdicaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterAdicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitAdicao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastingContext extends ExpressaoContext {
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CastingContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterCasting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitCasting(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode MULTIPLICA() { return getToken(MOC_Interpretador.MULTIPLICA, 0); }
		public MultiplicacaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitMultiplicacao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_readContext extends ExpressaoContext {
		public TerminalNode LER() { return getToken(MOC_Interpretador.LER, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public Chamada_readContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterChamada_read(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitChamada_read(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ExpressaoContext {
		public TerminalNode IDENTIFICADOR() { return getToken(MOC_Interpretador.IDENTIFICADOR, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(MOC_Interpretador.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitAtribuicao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Unitario_negativoContext extends ExpressaoContext {
		public TerminalNode MENOS() { return getToken(MOC_Interpretador.MENOS, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Unitario_negativoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterUnitario_negativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitUnitario_negativo(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(MOC_Interpretador.DIVIDE, 0); }
		public DivisaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterDivisao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitDivisao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtraccaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode MENOS() { return getToken(MOC_Interpretador.MENOS, 0); }
		public SubtraccaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterSubtraccao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitSubtraccao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Literal_realContext extends ExpressaoContext {
		public TerminalNode LREAL() { return getToken(MOC_Interpretador.LREAL, 0); }
		public Literal_realContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterLiteral_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitLiteral_real(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode RESTO() { return getToken(MOC_Interpretador.RESTO, 0); }
		public RestoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterResto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitResto(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisjuncaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OULOGICO() { return getToken(MOC_Interpretador.OULOGICO, 0); }
		public DisjuncaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterDisjuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitDisjuncao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentisesContext extends ExpressaoContext {
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public ParentisesContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterParentises(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitParentises(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_funcaoContext extends ExpressaoContext {
		public TerminalNode IDENTIFICADOR() { return getToken(MOC_Interpretador.IDENTIFICADOR, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public Chamada_funcaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitChamada_funcao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparacaoContext extends ExpressaoContext {
		public Token op;
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode MENOR() { return getToken(MOC_Interpretador.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(MOC_Interpretador.MENORIGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(MOC_Interpretador.MAIOR, 0); }
		public TerminalNode MAIORIGUAL() { return getToken(MOC_Interpretador.MAIORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(MOC_Interpretador.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(MOC_Interpretador.DIFERENTE, 0); }
		public ComparacaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitComparacao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_readvContext extends ExpressaoContext {
		public TerminalNode LERVETOR() { return getToken(MOC_Interpretador.LERVETOR, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public Chamada_readvContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterChamada_readv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitChamada_readv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConjuncaoContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode ELOGICO() { return getToken(MOC_Interpretador.ELOGICO, 0); }
		public ConjuncaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterConjuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitConjuncao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_readsContext extends ExpressaoContext {
		public TerminalNode LERCADEIA() { return getToken(MOC_Interpretador.LERCADEIA, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public Chamada_readsContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterChamada_reads(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitChamada_reads(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegacaoContext extends ExpressaoContext {
		public TerminalNode NAO() { return getToken(MOC_Interpretador.NAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public NegacaoContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterNegacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitNegacao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Chamada_writecContext extends ExpressaoContext {
		public TerminalNode ESCREVERCARACT() { return getToken(MOC_Interpretador.ESCREVERCARACT, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public Chamada_writecContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterChamada_writec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitChamada_writec(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ParentisesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(149);
				match(ABREPARENTISES);
				setState(150);
				expressao(0);
				setState(151);
				match(FECHAPARENTISES);
				}
				break;
			case 2:
				{
				_localctx = new CastingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(ABREPARENTISES);
				setState(154);
				tipo();
				setState(155);
				match(FECHAPARENTISES);
				setState(156);
				expressao(28);
				}
				break;
			case 3:
				{
				_localctx = new Atribuicao_vetorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(IDENTIFICADOR);
				setState(159);
				match(ABREPARENTISESRETOS);
				setState(160);
				expressao(0);
				setState(161);
				match(FECHAPARENTISESRETOS);
				setState(162);
				match(ATRIBUICAO);
				setState(163);
				expressao(27);
				}
				break;
			case 4:
				{
				_localctx = new AtribuicaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(IDENTIFICADOR);
				setState(166);
				match(ATRIBUICAO);
				setState(167);
				expressao(26);
				}
				break;
			case 5:
				{
				_localctx = new Chamada_funcaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				match(IDENTIFICADOR);
				setState(169);
				match(ABREPARENTISES);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15416786156544L) != 0)) {
					{
					setState(170);
					argumentos();
					}
				}

				setState(173);
				match(FECHAPARENTISES);
				}
				break;
			case 6:
				{
				_localctx = new Acesso_vetorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(IDENTIFICADOR);
				setState(175);
				match(ABREPARENTISESRETOS);
				setState(176);
				expressao(0);
				setState(177);
				match(FECHAPARENTISESRETOS);
				}
				break;
			case 7:
				{
				_localctx = new Variavel_simplesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(IDENTIFICADOR);
				}
				break;
			case 8:
				{
				_localctx = new NegacaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(NAO);
				setState(181);
				expressao(22);
				}
				break;
			case 9:
				{
				_localctx = new Unitario_negativoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(MENOS);
				setState(183);
				expressao(21);
				}
				break;
			case 10:
				{
				_localctx = new Unitario_positivoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(MAIS);
				setState(185);
				expressao(20);
				}
				break;
			case 11:
				{
				_localctx = new Literal_inteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(LINTEIRO);
				}
				break;
			case 12:
				{
				_localctx = new Literal_realContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(LREAL);
				}
				break;
			case 13:
				{
				_localctx = new Literal_vetorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(ABRECHAVETAS);
				setState(189);
				expressao(0);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(190);
					match(VIRGULA);
					setState(191);
					expressao(0);
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(FECHACHAVETAS);
				}
				break;
			case 14:
				{
				_localctx = new Chamada_readContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(LER);
				setState(200);
				match(ABREPARENTISES);
				setState(201);
				match(FECHAPARENTISES);
				}
				break;
			case 15:
				{
				_localctx = new Chamada_readcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(LERCARACT);
				setState(203);
				match(ABREPARENTISES);
				setState(204);
				match(FECHAPARENTISES);
				}
				break;
			case 16:
				{
				_localctx = new Chamada_readvContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(LERVETOR);
				setState(206);
				match(ABREPARENTISES);
				setState(207);
				match(FECHAPARENTISES);
				}
				break;
			case 17:
				{
				_localctx = new Chamada_readsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(LERCADEIA);
				setState(209);
				match(ABREPARENTISES);
				setState(210);
				match(FECHAPARENTISES);
				}
				break;
			case 18:
				{
				_localctx = new Chamada_writeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(ESCREVER);
				setState(212);
				match(ABREPARENTISES);
				setState(213);
				match(FECHAPARENTISES);
				}
				break;
			case 19:
				{
				_localctx = new Chamada_writecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(ESCREVERCARACT);
				setState(215);
				match(ABREPARENTISES);
				setState(216);
				match(FECHAPARENTISES);
				}
				break;
			case 20:
				{
				_localctx = new Chamada_writevContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(ESCREVERVETOR);
				setState(218);
				match(ABREPARENTISES);
				setState(219);
				match(FECHAPARENTISES);
				}
				break;
			case 21:
				{
				_localctx = new Chamada_writesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(ESCREVERCADEIA);
				setState(221);
				match(ABREPARENTISES);
				setState(222);
				match(FECHAPARENTISES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(225);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(226);
						match(MULTIPLICA);
						setState(227);
						expressao(20);
						}
						break;
					case 2:
						{
						_localctx = new DivisaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(228);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(229);
						match(DIVIDE);
						setState(230);
						expressao(19);
						}
						break;
					case 3:
						{
						_localctx = new RestoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(231);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(232);
						match(RESTO);
						setState(233);
						expressao(18);
						}
						break;
					case 4:
						{
						_localctx = new AdicaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(234);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(235);
						match(MAIS);
						setState(236);
						expressao(17);
						}
						break;
					case 5:
						{
						_localctx = new SubtraccaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(237);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(238);
						match(MENOS);
						setState(239);
						expressao(16);
						}
						break;
					case 6:
						{
						_localctx = new ComparacaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(240);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(241);
						((ComparacaoContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
							((ComparacaoContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						expressao(15);
						}
						break;
					case 7:
						{
						_localctx = new ConjuncaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(243);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(244);
						match(ELOGICO);
						setState(245);
						expressao(14);
						}
						break;
					case 8:
						{
						_localctx = new DisjuncaoContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(246);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(247);
						match(OULOGICO);
						setState(248);
						expressao(13);
						}
						break;
					}
					} 
				}
				setState(253);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_variaveisContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_variaveisContext lista_variaveis() {
			return getRuleContext(Lista_variaveisContext.class,0);
		}
		public TerminalNode PONTOVIRG() { return getToken(MOC_Interpretador.PONTOVIRG, 0); }
		public Declaracao_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterDeclaracao_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitDeclaracao_variaveis(this);
		}
	}

	public final Declaracao_variaveisContext declaracao_variaveis() throws RecognitionException {
		Declaracao_variaveisContext _localctx = new Declaracao_variaveisContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracao_variaveis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			tipo();
			setState(255);
			lista_variaveis();
			setState(256);
			match(PONTOVIRG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(MOC_Interpretador.INTEIRO, 0); }
		public TerminalNode DUPLO() { return getToken(MOC_Interpretador.DUPLO, 0); }
		public TerminalNode VAZIO() { return getToken(MOC_Interpretador.VAZIO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_variaveisContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MOC_Interpretador.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MOC_Interpretador.VIRGULA, i);
		}
		public Lista_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterLista_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitLista_variaveis(this);
		}
	}

	public final Lista_variaveisContext lista_variaveis() throws RecognitionException {
		Lista_variaveisContext _localctx = new Lista_variaveisContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lista_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			variavel();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(261);
				match(VIRGULA);
				setState(262);
				variavel();
				}
				}
				setState(267);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(MOC_Interpretador.IDENTIFICADOR, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(MOC_Interpretador.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ABREPARENTISESRETOS() { return getToken(MOC_Interpretador.ABREPARENTISESRETOS, 0); }
		public TerminalNode FECHAPARENTISESRETOS() { return getToken(MOC_Interpretador.FECHAPARENTISESRETOS, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variavel);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(IDENTIFICADOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(IDENTIFICADOR);
				setState(270);
				match(ATRIBUICAO);
				setState(271);
				expressao(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(IDENTIFICADOR);
				setState(273);
				match(ABREPARENTISESRETOS);
				setState(274);
				expressao(0);
				setState(275);
				match(FECHAPARENTISESRETOS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(IDENTIFICADOR);
				setState(278);
				match(ABREPARENTISESRETOS);
				setState(279);
				match(FECHAPARENTISESRETOS);
				setState(280);
				match(ATRIBUICAO);
				setState(281);
				expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrototipoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(MOC_Interpretador.IDENTIFICADOR, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public TerminalNode PONTOVIRG() { return getToken(MOC_Interpretador.PONTOVIRG, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<TerminalNode> VAZIO() { return getTokens(MOC_Interpretador.VAZIO); }
		public TerminalNode VAZIO(int i) {
			return getToken(MOC_Interpretador.VAZIO, i);
		}
		public TerminalNode FUNCAOPRINCIPAL() { return getToken(MOC_Interpretador.FUNCAOPRINCIPAL, 0); }
		public PrototipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterPrototipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitPrototipo(this);
		}
	}

	public final PrototipoContext prototipo() throws RecognitionException {
		PrototipoContext _localctx = new PrototipoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_prototipo);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				tipo();
				setState(285);
				match(IDENTIFICADOR);
				setState(286);
				match(ABREPARENTISES);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
					{
					setState(287);
					parametros();
					}
				}

				setState(290);
				match(FECHAPARENTISES);
				setState(291);
				match(PONTOVIRG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(VAZIO);
				setState(294);
				match(FUNCAOPRINCIPAL);
				setState(295);
				match(ABREPARENTISES);
				setState(296);
				match(VAZIO);
				setState(297);
				match(FECHAPARENTISES);
				setState(298);
				match(PONTOVIRG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MOC_Interpretador.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MOC_Interpretador.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			parametro();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(302);
				match(VIRGULA);
				setState(303);
				parametro();
				}
				}
				setState(308);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(MOC_Interpretador.IDENTIFICADOR, 0); }
		public TerminalNode ABREPARENTISESRETOS() { return getToken(MOC_Interpretador.ABREPARENTISESRETOS, 0); }
		public TerminalNode FECHAPARENTISESRETOS() { return getToken(MOC_Interpretador.FECHAPARENTISESRETOS, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametro);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				tipo();
				setState(310);
				match(IDENTIFICADOR);
				setState(311);
				match(ABREPARENTISESRETOS);
				setState(312);
				match(FECHAPARENTISESRETOS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				tipo();
				setState(315);
				match(ABREPARENTISESRETOS);
				setState(316);
				match(FECHAPARENTISESRETOS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				tipo();
				setState(319);
				match(IDENTIFICADOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(MOC_Interpretador.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(MOC_Interpretador.VIRGULA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			expressao(0);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(325);
				match(VIRGULA);
				setState(326);
				expressao(0);
				}
				}
				setState(331);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(MOC_Interpretador.IDENTIFICADOR, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			tipo();
			setState(333);
			match(IDENTIFICADOR);
			setState(334);
			match(ABREPARENTISES);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				setState(335);
				parametros();
				}
			}

			setState(338);
			match(FECHAPARENTISES);
			setState(339);
			bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrincipalContext extends ParserRuleContext {
		public List<TerminalNode> VAZIO() { return getTokens(MOC_Interpretador.VAZIO); }
		public TerminalNode VAZIO(int i) {
			return getToken(MOC_Interpretador.VAZIO, i);
		}
		public TerminalNode FUNCAOPRINCIPAL() { return getToken(MOC_Interpretador.FUNCAOPRINCIPAL, 0); }
		public TerminalNode ABREPARENTISES() { return getToken(MOC_Interpretador.ABREPARENTISES, 0); }
		public TerminalNode FECHAPARENTISES() { return getToken(MOC_Interpretador.FECHAPARENTISES, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOC_InterpretadorListener ) ((MOC_InterpretadorListener)listener).exitPrincipal(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(VAZIO);
			setState(342);
			match(FUNCAOPRINCIPAL);
			setState(343);
			match(ABREPARENTISES);
			setState(344);
			match(VAZIO);
			setState(345);
			match(FECHAPARENTISES);
			setState(346);
			bloco();
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
		case 12:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u015d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004d\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005j\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u008e\b\u000b\n\u000b\f\u000b\u0091\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ac"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00c1\b\f\n\f\f\f\u00c4\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e0\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00fa\b\f\n\f\f\f\u00fd\t\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0108\b\u000f\n\u000f\f\u000f\u010b\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u011b\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0121\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u012c\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0131\b\u0012\n\u0012\f\u0012\u0134\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0143\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0148"+
		"\b\u0014\n\u0014\f\u0014\u014b\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0151\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0000\u0001\u0018\u0017\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"+
		"\u0004\u0002\u0000\n\u000b\r\r\u0001\u0000\u000e\u0011\u0001\u0000\u0017"+
		"\u001c\u0001\u0000\u0001\u0003\u0181\u00004\u0001\u0000\u0000\u0000\u0002"+
		"C\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006X\u0001"+
		"\u0000\u0000\u0000\bc\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000"+
		"\fk\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000\u0000\u0010{\u0001"+
		"\u0000\u0000\u0000\u0012\u007f\u0001\u0000\u0000\u0000\u0014\u0084\u0001"+
		"\u0000\u0000\u0000\u0016\u008a\u0001\u0000\u0000\u0000\u0018\u00df\u0001"+
		"\u0000\u0000\u0000\u001a\u00fe\u0001\u0000\u0000\u0000\u001c\u0102\u0001"+
		"\u0000\u0000\u0000\u001e\u0104\u0001\u0000\u0000\u0000 \u011a\u0001\u0000"+
		"\u0000\u0000\"\u012b\u0001\u0000\u0000\u0000$\u012d\u0001\u0000\u0000"+
		"\u0000&\u0142\u0001\u0000\u0000\u0000(\u0144\u0001\u0000\u0000\u0000*"+
		"\u014c\u0001\u0000\u0000\u0000,\u0155\u0001\u0000\u0000\u0000.3\u0003"+
		"\"\u0011\u0000/3\u0003\u001a\r\u000003\u0003*\u0015\u000013\u0003,\u0016"+
		"\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000078\u0005\u0000\u0000\u00018\u0001\u0001\u0000"+
		"\u0000\u00009D\u0003\u0004\u0002\u0000:D\u0003\f\u0006\u0000;D\u0003\u000e"+
		"\u0007\u0000<D\u0003\u0010\b\u0000=D\u0003\u0012\t\u0000>D\u0003\u0014"+
		"\n\u0000?@\u0003\u0018\f\u0000@A\u0005\'\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000BD\u0003\u0016\u000b\u0000C9\u0001\u0000\u0000\u0000C:\u0001\u0000"+
		"\u0000\u0000C;\u0001\u0000\u0000\u0000C<\u0001\u0000\u0000\u0000C=\u0001"+
		"\u0000\u0000\u0000C>\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EI\u0003\u0006"+
		"\u0003\u0000FI\u0003\b\u0004\u0000GI\u0003\n\u0005\u0000HE\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u0005"+
		"\u0001\u0000\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0005 \u0000\u0000"+
		"LM\u0003\u0018\f\u0000MN\u0005!\u0000\u0000NO\u0003\u0004\u0002\u0000"+
		"OY\u0001\u0000\u0000\u0000PQ\u0005\u0005\u0000\u0000QR\u0005 \u0000\u0000"+
		"RS\u0003\u0018\f\u0000ST\u0005!\u0000\u0000TU\u0003\b\u0004\u0000UV\u0005"+
		"\u0006\u0000\u0000VW\u0003\u0006\u0003\u0000WY\u0001\u0000\u0000\u0000"+
		"XJ\u0001\u0000\u0000\u0000XP\u0001\u0000\u0000\u0000Y\u0007\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0005\u0000\u0000[\\\u0005 \u0000\u0000\\]\u0003"+
		"\u0018\f\u0000]^\u0005!\u0000\u0000^_\u0003\b\u0004\u0000_`\u0005\u0006"+
		"\u0000\u0000`a\u0003\b\u0004\u0000ad\u0001\u0000\u0000\u0000bd\u0003\n"+
		"\u0005\u0000cZ\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\t\u0001"+
		"\u0000\u0000\u0000ef\u0003\u0018\f\u0000fg\u0005\'\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hj\u0003\u0016\u000b\u0000ie\u0001\u0000\u0000\u0000"+
		"ih\u0001\u0000\u0000\u0000j\u000b\u0001\u0000\u0000\u0000kl\u0005\u0007"+
		"\u0000\u0000lm\u0005 \u0000\u0000mn\u0003\u0018\f\u0000no\u0005!\u0000"+
		"\u0000op\u0003\u0002\u0001\u0000p\r\u0001\u0000\u0000\u0000qr\u0005\b"+
		"\u0000\u0000rs\u0005 \u0000\u0000st\u0003\u0018\f\u0000tu\u0005\'\u0000"+
		"\u0000uv\u0003\u0018\f\u0000vw\u0005\'\u0000\u0000wx\u0003\u0018\f\u0000"+
		"xy\u0005!\u0000\u0000yz\u0003\u0002\u0001\u0000z\u000f\u0001\u0000\u0000"+
		"\u0000{|\u0005\t\u0000\u0000|}\u0003\u0018\f\u0000}~\u0005\'\u0000\u0000"+
		"~\u0011\u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0000\u0000\u0000\u0080"+
		"\u0081\u0005 \u0000\u0000\u0081\u0082\u0005!\u0000\u0000\u0082\u0083\u0005"+
		"\'\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0085\u0007\u0001"+
		"\u0000\u0000\u0085\u0086\u0005 \u0000\u0000\u0086\u0087\u0003\u0018\f"+
		"\u0000\u0087\u0088\u0005!\u0000\u0000\u0088\u0089\u0005\'\u0000\u0000"+
		"\u0089\u0015\u0001\u0000\u0000\u0000\u008a\u008f\u0005\"\u0000\u0000\u008b"+
		"\u008e\u0003\u001a\r\u0000\u008c\u008e\u0003\u0002\u0001\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005#\u0000\u0000\u0093\u0017\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0006\f\uffff\uffff\u0000\u0095\u0096\u0005"+
		" \u0000\u0000\u0096\u0097\u0003\u0018\f\u0000\u0097\u0098\u0005!\u0000"+
		"\u0000\u0098\u00e0\u0001\u0000\u0000\u0000\u0099\u009a\u0005 \u0000\u0000"+
		"\u009a\u009b\u0003\u001c\u000e\u0000\u009b\u009c\u0005!\u0000\u0000\u009c"+
		"\u009d\u0003\u0018\f\u001c\u009d\u00e0\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005)\u0000\u0000\u009f\u00a0\u0005$\u0000\u0000\u00a0\u00a1\u0003\u0018"+
		"\f\u0000\u00a1\u00a2\u0005%\u0000\u0000\u00a2\u00a3\u0005&\u0000\u0000"+
		"\u00a3\u00a4\u0003\u0018\f\u001b\u00a4\u00e0\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005)\u0000\u0000\u00a6\u00a7\u0005&\u0000\u0000\u00a7\u00e0\u0003"+
		"\u0018\f\u001a\u00a8\u00a9\u0005)\u0000\u0000\u00a9\u00ab\u0005 \u0000"+
		"\u0000\u00aa\u00ac\u0003(\u0014\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00e0\u0005!\u0000\u0000\u00ae\u00af\u0005)\u0000\u0000\u00af\u00b0"+
		"\u0005$\u0000\u0000\u00b0\u00b1\u0003\u0018\f\u0000\u00b1\u00b2\u0005"+
		"%\u0000\u0000\u00b2\u00e0\u0001\u0000\u0000\u0000\u00b3\u00e0\u0005)\u0000"+
		"\u0000\u00b4\u00b5\u0005\u001f\u0000\u0000\u00b5\u00e0\u0003\u0018\f\u0016"+
		"\u00b6\u00b7\u0005\u0013\u0000\u0000\u00b7\u00e0\u0003\u0018\f\u0015\u00b8"+
		"\u00b9\u0005\u0012\u0000\u0000\u00b9\u00e0\u0003\u0018\f\u0014\u00ba\u00e0"+
		"\u0005*\u0000\u0000\u00bb\u00e0\u0005+\u0000\u0000\u00bc\u00bd\u0005\""+
		"\u0000\u0000\u00bd\u00c2\u0003\u0018\f\u0000\u00be\u00bf\u0005(\u0000"+
		"\u0000\u00bf\u00c1\u0003\u0018\f\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005#\u0000\u0000\u00c6"+
		"\u00e0\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\n\u0000\u0000\u00c8\u00c9"+
		"\u0005 \u0000\u0000\u00c9\u00e0\u0005!\u0000\u0000\u00ca\u00cb\u0005\u000b"+
		"\u0000\u0000\u00cb\u00cc\u0005 \u0000\u0000\u00cc\u00e0\u0005!\u0000\u0000"+
		"\u00cd\u00ce\u0005\f\u0000\u0000\u00ce\u00cf\u0005 \u0000\u0000\u00cf"+
		"\u00e0\u0005!\u0000\u0000\u00d0\u00d1\u0005\r\u0000\u0000\u00d1\u00d2"+
		"\u0005 \u0000\u0000\u00d2\u00e0\u0005!\u0000\u0000\u00d3\u00d4\u0005\u000e"+
		"\u0000\u0000\u00d4\u00d5\u0005 \u0000\u0000\u00d5\u00e0\u0005!\u0000\u0000"+
		"\u00d6\u00d7\u0005\u000f\u0000\u0000\u00d7\u00d8\u0005 \u0000\u0000\u00d8"+
		"\u00e0\u0005!\u0000\u0000\u00d9\u00da\u0005\u0010\u0000\u0000\u00da\u00db"+
		"\u0005 \u0000\u0000\u00db\u00e0\u0005!\u0000\u0000\u00dc\u00dd\u0005\u0011"+
		"\u0000\u0000\u00dd\u00de\u0005 \u0000\u0000\u00de\u00e0\u0005!\u0000\u0000"+
		"\u00df\u0094\u0001\u0000\u0000\u0000\u00df\u0099\u0001\u0000\u0000\u0000"+
		"\u00df\u009e\u0001\u0000\u0000\u0000\u00df\u00a5\u0001\u0000\u0000\u0000"+
		"\u00df\u00a8\u0001\u0000\u0000\u0000\u00df\u00ae\u0001\u0000\u0000\u0000"+
		"\u00df\u00b3\u0001\u0000\u0000\u0000\u00df\u00b4\u0001\u0000\u0000\u0000"+
		"\u00df\u00b6\u0001\u0000\u0000\u0000\u00df\u00b8\u0001\u0000\u0000\u0000"+
		"\u00df\u00ba\u0001\u0000\u0000\u0000\u00df\u00bb\u0001\u0000\u0000\u0000"+
		"\u00df\u00bc\u0001\u0000\u0000\u0000\u00df\u00c7\u0001\u0000\u0000\u0000"+
		"\u00df\u00ca\u0001\u0000\u0000\u0000\u00df\u00cd\u0001\u0000\u0000\u0000"+
		"\u00df\u00d0\u0001\u0000\u0000\u0000\u00df\u00d3\u0001\u0000\u0000\u0000"+
		"\u00df\u00d6\u0001\u0000\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000"+
		"\u00df\u00dc\u0001\u0000\u0000\u0000\u00e0\u00fb\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\n\u0013\u0000\u0000\u00e2\u00e3\u0005\u0014\u0000\u0000\u00e3"+
		"\u00fa\u0003\u0018\f\u0014\u00e4\u00e5\n\u0012\u0000\u0000\u00e5\u00e6"+
		"\u0005\u0015\u0000\u0000\u00e6\u00fa\u0003\u0018\f\u0013\u00e7\u00e8\n"+
		"\u0011\u0000\u0000\u00e8\u00e9\u0005\u0016\u0000\u0000\u00e9\u00fa\u0003"+
		"\u0018\f\u0012\u00ea\u00eb\n\u0010\u0000\u0000\u00eb\u00ec\u0005\u0012"+
		"\u0000\u0000\u00ec\u00fa\u0003\u0018\f\u0011\u00ed\u00ee\n\u000f\u0000"+
		"\u0000\u00ee\u00ef\u0005\u0013\u0000\u0000\u00ef\u00fa\u0003\u0018\f\u0010"+
		"\u00f0\u00f1\n\u000e\u0000\u0000\u00f1\u00f2\u0007\u0002\u0000\u0000\u00f2"+
		"\u00fa\u0003\u0018\f\u000f\u00f3\u00f4\n\r\u0000\u0000\u00f4\u00f5\u0005"+
		"\u001d\u0000\u0000\u00f5\u00fa\u0003\u0018\f\u000e\u00f6\u00f7\n\f\u0000"+
		"\u0000\u00f7\u00f8\u0005\u001e\u0000\u0000\u00f8\u00fa\u0003\u0018\f\r"+
		"\u00f9\u00e1\u0001\u0000\u0000\u0000\u00f9\u00e4\u0001\u0000\u0000\u0000"+
		"\u00f9\u00e7\u0001\u0000\u0000\u0000\u00f9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00f9\u00ed\u0001\u0000\u0000\u0000\u00f9\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f3\u0001\u0000\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u0019\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003\u001c\u000e\u0000"+
		"\u00ff\u0100\u0003\u001e\u000f\u0000\u0100\u0101\u0005\'\u0000\u0000\u0101"+
		"\u001b\u0001\u0000\u0000\u0000\u0102\u0103\u0007\u0003\u0000\u0000\u0103"+
		"\u001d\u0001\u0000\u0000\u0000\u0104\u0109\u0003 \u0010\u0000\u0105\u0106"+
		"\u0005(\u0000\u0000\u0106\u0108\u0003 \u0010\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u001f\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u011b\u0005)\u0000"+
		"\u0000\u010d\u010e\u0005)\u0000\u0000\u010e\u010f\u0005&\u0000\u0000\u010f"+
		"\u011b\u0003\u0018\f\u0000\u0110\u0111\u0005)\u0000\u0000\u0111\u0112"+
		"\u0005$\u0000\u0000\u0112\u0113\u0003\u0018\f\u0000\u0113\u0114\u0005"+
		"%\u0000\u0000\u0114\u011b\u0001\u0000\u0000\u0000\u0115\u0116\u0005)\u0000"+
		"\u0000\u0116\u0117\u0005$\u0000\u0000\u0117\u0118\u0005%\u0000\u0000\u0118"+
		"\u0119\u0005&\u0000\u0000\u0119\u011b\u0003\u0018\f\u0000\u011a\u010c"+
		"\u0001\u0000\u0000\u0000\u011a\u010d\u0001\u0000\u0000\u0000\u011a\u0110"+
		"\u0001\u0000\u0000\u0000\u011a\u0115\u0001\u0000\u0000\u0000\u011b!\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0003\u001c\u000e\u0000\u011d\u011e\u0005"+
		")\u0000\u0000\u011e\u0120\u0005 \u0000\u0000\u011f\u0121\u0003$\u0012"+
		"\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0005!\u0000\u0000"+
		"\u0123\u0124\u0005\'\u0000\u0000\u0124\u012c\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0005\u0003\u0000\u0000\u0126\u0127\u0005\u0004\u0000\u0000\u0127"+
		"\u0128\u0005 \u0000\u0000\u0128\u0129\u0005\u0003\u0000\u0000\u0129\u012a"+
		"\u0005!\u0000\u0000\u012a\u012c\u0005\'\u0000\u0000\u012b\u011c\u0001"+
		"\u0000\u0000\u0000\u012b\u0125\u0001\u0000\u0000\u0000\u012c#\u0001\u0000"+
		"\u0000\u0000\u012d\u0132\u0003&\u0013\u0000\u012e\u012f\u0005(\u0000\u0000"+
		"\u012f\u0131\u0003&\u0013\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131"+
		"\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0001\u0000\u0000\u0000\u0133%\u0001\u0000\u0000\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0003\u001c\u000e\u0000\u0136\u0137"+
		"\u0005)\u0000\u0000\u0137\u0138\u0005$\u0000\u0000\u0138\u0139\u0005%"+
		"\u0000\u0000\u0139\u0143\u0001\u0000\u0000\u0000\u013a\u013b\u0003\u001c"+
		"\u000e\u0000\u013b\u013c\u0005$\u0000\u0000\u013c\u013d\u0005%\u0000\u0000"+
		"\u013d\u0143\u0001\u0000\u0000\u0000\u013e\u013f\u0003\u001c\u000e\u0000"+
		"\u013f\u0140\u0005)\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141"+
		"\u0143\u0003\u001c\u000e\u0000\u0142\u0135\u0001\u0000\u0000\u0000\u0142"+
		"\u013a\u0001\u0000\u0000\u0000\u0142\u013e\u0001\u0000\u0000\u0000\u0142"+
		"\u0141\u0001\u0000\u0000\u0000\u0143\'\u0001\u0000\u0000\u0000\u0144\u0149"+
		"\u0003\u0018\f\u0000\u0145\u0146\u0005(\u0000\u0000\u0146\u0148\u0003"+
		"\u0018\f\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a)\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0003\u001c\u000e\u0000\u014d\u014e\u0005)\u0000\u0000"+
		"\u014e\u0150\u0005 \u0000\u0000\u014f\u0151\u0003$\u0012\u0000\u0150\u014f"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0005!\u0000\u0000\u0153\u0154\u0003"+
		"\u0016\u000b\u0000\u0154+\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u0003"+
		"\u0000\u0000\u0156\u0157\u0005\u0004\u0000\u0000\u0157\u0158\u0005 \u0000"+
		"\u0000\u0158\u0159\u0005\u0003\u0000\u0000\u0159\u015a\u0005!\u0000\u0000"+
		"\u015a\u015b\u0003\u0016\u000b\u0000\u015b-\u0001\u0000\u0000\u0000\u0016"+
		"24CHXci\u008d\u008f\u00ab\u00c2\u00df\u00f9\u00fb\u0109\u011a\u0120\u012b"+
		"\u0132\u0142\u0149\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}