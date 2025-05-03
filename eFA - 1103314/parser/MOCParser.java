// Generated from MOC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MOCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, INT=39, 
		DOUBLE=40, STRING=41, WS=42, COMMENT=43, LINE_COMMENT=44;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_function = 2, RULE_paramList = 3, 
		RULE_param = 4, RULE_varDecl = 5, RULE_varList = 6, RULE_var = 7, RULE_arrayInit = 8, 
		RULE_type = 9, RULE_block = 10, RULE_statement = 11, RULE_assignment = 12, 
		RULE_ifStatement = 13, RULE_whileStatement = 14, RULE_forStatement = 15, 
		RULE_functionCall = 16, RULE_argList = 17, RULE_expr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "function", "paramList", "param", "varDecl", 
			"varList", "var", "arrayInit", "type", "block", "statement", "assignment", 
			"ifStatement", "whileStatement", "forStatement", "functionCall", "argList", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'void'", "')'", "','", "'['", "']'", "';'", "'='", "'{'", 
			"'}'", "'int'", "'double'", "'write'", "'writes'", "'writec'", "'writev'", 
			"'return'", "'if'", "'else'", "'while'", "'for'", "'read'", "'readc'", 
			"'reads'", "'*'", "'/'", "'+'", "'-'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'&&'", "'||'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "INT", "DOUBLE", "STRING", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "MOC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MOCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MOCParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6148L) != 0)) {
				{
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(38);
					declaration();
					}
					break;
				case 2:
					{
					setState(39);
					function();
					}
					break;
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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
	public static class DeclarationContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			varDecl();
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
	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			type();
			setState(50);
			match(ID);
			setState(51);
			match(T__0);
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(52);
				paramList();
				}
				break;
			case 2:
				{
				setState(53);
				match(T__1);
				}
				break;
			}
			setState(56);
			match(T__2);
			setState(57);
			block();
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
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			param();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(60);
				match(T__3);
				setState(61);
				param();
				}
				}
				setState(66);
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
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			type();
			setState(68);
			match(ID);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(69);
				match(T__4);
				setState(70);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			type();
			setState(74);
			varList();
			setState(75);
			match(T__6);
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
	public static class VarListContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitVarList(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			var();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(78);
				match(T__3);
				setState(79);
				var();
				}
				}
				setState(84);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ID);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(86);
				match(T__4);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061613662210L) != 0)) {
					{
					setState(87);
					expr(0);
					}
				}

				setState(90);
				match(T__5);
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(93);
				match(T__7);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(94);
					expr(0);
					}
					break;
				case 2:
					{
					setState(95);
					functionCall();
					}
					break;
				case 3:
					{
					setState(96);
					arrayInit();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterArrayInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitArrayInit(this);
		}
	}

	public final ArrayInitContext arrayInit() throws RecognitionException {
		ArrayInitContext _localctx = new ArrayInitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__8);
			setState(102);
			expr(0);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(103);
				match(T__3);
				setState(104);
				expr(0);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6148L) != 0)) ) {
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__8);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274910935556L) != 0)) {
				{
				{
				setState(115);
				statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MOCParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				functionCall();
				setState(129);
				match(T__6);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				match(T__12);
				setState(132);
				match(T__0);
				setState(133);
				expr(0);
				setState(134);
				match(T__2);
				setState(135);
				match(T__6);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				match(T__13);
				setState(138);
				match(T__0);
				setState(139);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(140);
				match(T__2);
				setState(141);
				match(T__6);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				match(T__14);
				setState(143);
				match(T__0);
				setState(144);
				expr(0);
				setState(145);
				match(T__2);
				setState(146);
				match(T__6);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
				match(T__15);
				setState(149);
				match(T__0);
				setState(150);
				match(ID);
				setState(151);
				match(T__2);
				setState(152);
				match(T__6);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				match(T__16);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061613662210L) != 0)) {
					{
					setState(154);
					expr(0);
					}
				}

				setState(157);
				match(T__6);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(158);
				block();
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
	public static class AssignmentContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(161);
				match(ID);
				}
				break;
			case 2:
				{
				setState(162);
				match(ID);
				setState(163);
				match(T__4);
				setState(164);
				expr(0);
				setState(165);
				match(T__5);
				}
				break;
			}
			setState(169);
			match(T__7);
			setState(170);
			expr(0);
			setState(171);
			match(T__6);
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
	public static class IfStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__17);
			setState(174);
			match(T__0);
			setState(175);
			expr(0);
			setState(176);
			match(T__2);
			setState(177);
			block();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(178);
				match(T__18);
				setState(179);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__19);
			setState(183);
			match(T__0);
			setState(184);
			expr(0);
			setState(185);
			match(T__2);
			setState(186);
			block();
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
	public static class ForStatementContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__20);
			setState(189);
			match(T__0);
			setState(190);
			assignment();
			setState(191);
			expr(0);
			setState(192);
			match(T__6);
			setState(193);
			assignment();
			setState(194);
			match(T__2);
			setState(195);
			block();
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCall);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(ID);
				setState(198);
				match(T__0);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061613662210L) != 0)) {
					{
					setState(199);
					argList();
					}
				}

				setState(202);
				match(T__2);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__21);
				setState(204);
				match(T__0);
				setState(205);
				match(T__2);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(T__22);
				setState(207);
				match(T__0);
				setState(208);
				match(T__2);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(T__23);
				setState(210);
				match(T__0);
				setState(211);
				match(T__2);
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
	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitArgList(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			expr(0);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(215);
				match(T__3);
				setState(216);
				expr(0);
				}
				}
				setState(221);
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
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(MOCParser.ID, 0); }
		public TerminalNode INT() { return getToken(MOCParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(MOCParser.DOUBLE, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MOCListener ) ((MOCListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(223);
				match(T__36);
				setState(224);
				expr(7);
				}
				break;
			case 2:
				{
				setState(225);
				match(T__0);
				setState(226);
				expr(0);
				setState(227);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(229);
				match(ID);
				setState(230);
				match(T__4);
				setState(231);
				expr(0);
				setState(232);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(234);
				match(ID);
				}
				break;
			case 5:
				{
				setState(235);
				match(INT);
				}
				break;
			case 6:
				{
				setState(236);
				match(DOUBLE);
				}
				break;
			case 7:
				{
				setState(237);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(241);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(244);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(247);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33822867456L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(248);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(250);
						((ExprContext)_localctx).op = match(T__34);
						setState(251);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(253);
						((ExprContext)_localctx).op = match(T__35);
						setState(254);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u0105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"?\b\u0003\n\u0003\f\u0003B\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006Q\b\u0006"+
		"\n\u0006\f\u0006T\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"Y\b\u0007\u0001\u0007\u0003\u0007\\\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007b\b\u0007\u0003\u0007d\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bj\b\b\n\b\f\bm\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0005\nu\b\n\n\n\f\nx\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u009c\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00a0\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00a8\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b5\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c9\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d5\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00da\b\u0011\n\u0011\f\u0011"+
		"\u00dd\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00ef\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0100\b\u0012"+
		"\n\u0012\f\u0012\u0103\t\u0012\u0001\u0012\u0000\u0001$\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0005\u0002\u0000\u0002\u0002\u000b\f\u0002\u0000&&))\u0001"+
		"\u0000\u0019\u001a\u0001\u0000\u001b\u001c\u0001\u0000\u001d\"\u011d\u0000"+
		"*\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u00041\u0001"+
		"\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000"+
		"\u0000\nI\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000eU\u0001"+
		"\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
		"\u0000\u0014r\u0001\u0000\u0000\u0000\u0016\u009f\u0001\u0000\u0000\u0000"+
		"\u0018\u00a7\u0001\u0000\u0000\u0000\u001a\u00ad\u0001\u0000\u0000\u0000"+
		"\u001c\u00b6\u0001\u0000\u0000\u0000\u001e\u00bc\u0001\u0000\u0000\u0000"+
		" \u00d4\u0001\u0000\u0000\u0000\"\u00d6\u0001\u0000\u0000\u0000$\u00ee"+
		"\u0001\u0000\u0000\u0000&)\u0003\u0002\u0001\u0000\')\u0003\u0004\u0002"+
		"\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001"+
		".\u0001\u0001\u0000\u0000\u0000/0\u0003\n\u0005\u00000\u0003\u0001\u0000"+
		"\u0000\u000012\u0003\u0012\t\u000023\u0005&\u0000\u000036\u0005\u0001"+
		"\u0000\u000047\u0003\u0006\u0003\u000057\u0005\u0002\u0000\u000064\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000089\u0005\u0003\u0000\u00009:\u0003\u0014\n\u0000"+
		":\u0005\u0001\u0000\u0000\u0000;@\u0003\b\u0004\u0000<=\u0005\u0004\u0000"+
		"\u0000=?\u0003\b\u0004\u0000><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u0007\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0003\u0012\t\u0000DG\u0005"+
		"&\u0000\u0000EF\u0005\u0005\u0000\u0000FH\u0005\u0006\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\t\u0001\u0000\u0000\u0000"+
		"IJ\u0003\u0012\t\u0000JK\u0003\f\u0006\u0000KL\u0005\u0007\u0000\u0000"+
		"L\u000b\u0001\u0000\u0000\u0000MR\u0003\u000e\u0007\u0000NO\u0005\u0004"+
		"\u0000\u0000OQ\u0003\u000e\u0007\u0000PN\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\r\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000U[\u0005&\u0000\u0000"+
		"VX\u0005\u0005\u0000\u0000WY\u0003$\u0012\u0000XW\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0005\u0006\u0000"+
		"\u0000[V\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\c\u0001\u0000"+
		"\u0000\u0000]a\u0005\b\u0000\u0000^b\u0003$\u0012\u0000_b\u0003 \u0010"+
		"\u0000`b\u0003\u0010\b\u0000a^\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000a`\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000c]\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000d\u000f\u0001\u0000\u0000\u0000"+
		"ef\u0005\t\u0000\u0000fk\u0003$\u0012\u0000gh\u0005\u0004\u0000\u0000"+
		"hj\u0003$\u0012\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000no\u0005\n\u0000\u0000o\u0011\u0001\u0000"+
		"\u0000\u0000pq\u0007\u0000\u0000\u0000q\u0013\u0001\u0000\u0000\u0000"+
		"rv\u0005\t\u0000\u0000su\u0003\u0016\u000b\u0000ts\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\n\u0000"+
		"\u0000z\u0015\u0001\u0000\u0000\u0000{\u00a0\u0003\n\u0005\u0000|\u00a0"+
		"\u0003\u0018\f\u0000}\u00a0\u0003\u001a\r\u0000~\u00a0\u0003\u001c\u000e"+
		"\u0000\u007f\u00a0\u0003\u001e\u000f\u0000\u0080\u0081\u0003 \u0010\u0000"+
		"\u0081\u0082\u0005\u0007\u0000\u0000\u0082\u00a0\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\r\u0000\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085"+
		"\u0086\u0003$\u0012\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088"+
		"\u0005\u0007\u0000\u0000\u0088\u00a0\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u000e\u0000\u0000\u008a\u008b\u0005\u0001\u0000\u0000\u008b\u008c"+
		"\u0007\u0001\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u00a0"+
		"\u0005\u0007\u0000\u0000\u008e\u008f\u0005\u000f\u0000\u0000\u008f\u0090"+
		"\u0005\u0001\u0000\u0000\u0090\u0091\u0003$\u0012\u0000\u0091\u0092\u0005"+
		"\u0003\u0000\u0000\u0092\u0093\u0005\u0007\u0000\u0000\u0093\u00a0\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u0096\u0005"+
		"\u0001\u0000\u0000\u0096\u0097\u0005&\u0000\u0000\u0097\u0098\u0005\u0003"+
		"\u0000\u0000\u0098\u00a0\u0005\u0007\u0000\u0000\u0099\u009b\u0005\u0011"+
		"\u0000\u0000\u009a\u009c\u0003$\u0012\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0005\u0007\u0000\u0000\u009e\u00a0\u0003\u0014\n\u0000"+
		"\u009f{\u0001\u0000\u0000\u0000\u009f|\u0001\u0000\u0000\u0000\u009f}"+
		"\u0001\u0000\u0000\u0000\u009f~\u0001\u0000\u0000\u0000\u009f\u007f\u0001"+
		"\u0000\u0000\u0000\u009f\u0080\u0001\u0000\u0000\u0000\u009f\u0083\u0001"+
		"\u0000\u0000\u0000\u009f\u0089\u0001\u0000\u0000\u0000\u009f\u008e\u0001"+
		"\u0000\u0000\u0000\u009f\u0094\u0001\u0000\u0000\u0000\u009f\u0099\u0001"+
		"\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u0017\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a8\u0005&\u0000\u0000\u00a2\u00a3\u0005&\u0000"+
		"\u0000\u00a3\u00a4\u0005\u0005\u0000\u0000\u00a4\u00a5\u0003$\u0012\u0000"+
		"\u00a5\u00a6\u0005\u0006\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\b\u0000\u0000\u00aa"+
		"\u00ab\u0003$\u0012\u0000\u00ab\u00ac\u0005\u0007\u0000\u0000\u00ac\u0019"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0012\u0000\u0000\u00ae\u00af"+
		"\u0005\u0001\u0000\u0000\u00af\u00b0\u0003$\u0012\u0000\u00b0\u00b1\u0005"+
		"\u0003\u0000\u0000\u00b1\u00b4\u0003\u0014\n\u0000\u00b2\u00b3\u0005\u0013"+
		"\u0000\u0000\u00b3\u00b5\u0003\u0014\n\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u001b\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005\u0014\u0000\u0000\u00b7\u00b8\u0005\u0001\u0000"+
		"\u0000\u00b8\u00b9\u0003$\u0012\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000"+
		"\u00ba\u00bb\u0003\u0014\n\u0000\u00bb\u001d\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005\u0015\u0000\u0000\u00bd\u00be\u0005\u0001\u0000\u0000\u00be"+
		"\u00bf\u0003\u0018\f\u0000\u00bf\u00c0\u0003$\u0012\u0000\u00c0\u00c1"+
		"\u0005\u0007\u0000\u0000\u00c1\u00c2\u0003\u0018\f\u0000\u00c2\u00c3\u0005"+
		"\u0003\u0000\u0000\u00c3\u00c4\u0003\u0014\n\u0000\u00c4\u001f\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005&\u0000\u0000\u00c6\u00c8\u0005\u0001\u0000"+
		"\u0000\u00c7\u00c9\u0003\"\u0011\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00d5\u0005\u0003\u0000\u0000\u00cb\u00cc\u0005\u0016\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0001\u0000\u0000\u00cd\u00d5\u0005\u0003\u0000\u0000"+
		"\u00ce\u00cf\u0005\u0017\u0000\u0000\u00cf\u00d0\u0005\u0001\u0000\u0000"+
		"\u00d0\u00d5\u0005\u0003\u0000\u0000\u00d1\u00d2\u0005\u0018\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0001\u0000\u0000\u00d3\u00d5\u0005\u0003\u0000\u0000"+
		"\u00d4\u00c5\u0001\u0000\u0000\u0000\u00d4\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d4\u00ce\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d5!\u0001\u0000\u0000\u0000\u00d6\u00db\u0003$\u0012\u0000\u00d7\u00d8"+
		"\u0005\u0004\u0000\u0000\u00d8\u00da\u0003$\u0012\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc#\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0006\u0012"+
		"\uffff\uffff\u0000\u00df\u00e0\u0005%\u0000\u0000\u00e0\u00ef\u0003$\u0012"+
		"\u0007\u00e1\u00e2\u0005\u0001\u0000\u0000\u00e2\u00e3\u0003$\u0012\u0000"+
		"\u00e3\u00e4\u0005\u0003\u0000\u0000\u00e4\u00ef\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0005&\u0000\u0000\u00e6\u00e7\u0005\u0005\u0000\u0000\u00e7"+
		"\u00e8\u0003$\u0012\u0000\u00e8\u00e9\u0005\u0006\u0000\u0000\u00e9\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ef\u0005&\u0000\u0000\u00eb\u00ef\u0005"+
		"\'\u0000\u0000\u00ec\u00ef\u0005(\u0000\u0000\u00ed\u00ef\u0003 \u0010"+
		"\u0000\u00ee\u00de\u0001\u0000\u0000\u0000\u00ee\u00e1\u0001\u0000\u0000"+
		"\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u0101\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\n\f\u0000\u0000\u00f1\u00f2\u0007\u0002\u0000\u0000"+
		"\u00f2\u0100\u0003$\u0012\r\u00f3\u00f4\n\u000b\u0000\u0000\u00f4\u00f5"+
		"\u0007\u0003\u0000\u0000\u00f5\u0100\u0003$\u0012\f\u00f6\u00f7\n\n\u0000"+
		"\u0000\u00f7\u00f8\u0007\u0004\u0000\u0000\u00f8\u0100\u0003$\u0012\u000b"+
		"\u00f9\u00fa\n\t\u0000\u0000\u00fa\u00fb\u0005#\u0000\u0000\u00fb\u0100"+
		"\u0003$\u0012\n\u00fc\u00fd\n\b\u0000\u0000\u00fd\u00fe\u0005$\u0000\u0000"+
		"\u00fe\u0100\u0003$\u0012\t\u00ff\u00f0\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f3\u0001\u0000\u0000\u0000\u00ff\u00f6\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f9\u0001\u0000\u0000\u0000\u00ff\u00fc\u0001\u0000\u0000\u0000\u0100"+
		"\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102%\u0001\u0000\u0000\u0000\u0103\u0101"+
		"\u0001\u0000\u0000\u0000\u0016(*6@GRX[ackv\u009b\u009f\u00a7\u00b4\u00c8"+
		"\u00d4\u00db\u00ee\u00ff\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}