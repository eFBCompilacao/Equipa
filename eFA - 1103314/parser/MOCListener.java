// Generated from MOC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MOCParser}.
 */
public interface MOCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MOCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MOCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MOCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MOCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MOCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MOCParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MOCParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(MOCParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(MOCParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MOCParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MOCParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(MOCParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(MOCParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(MOCParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(MOCParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(MOCParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(MOCParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayInit(MOCParser.ArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayInit(MOCParser.ArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MOCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MOCParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MOCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MOCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MOCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MOCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MOCParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MOCParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MOCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MOCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MOCParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MOCParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MOCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MOCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MOCParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MOCParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(MOCParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(MOCParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOCParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MOCParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOCParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MOCParser.ExprContext ctx);
}