# Generated from MOC.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MOCParser import MOCParser
else:
    from MOCParser import MOCParser

# This class defines a complete listener for a parse tree produced by MOCParser.
class MOCListener(ParseTreeListener):

    # Enter a parse tree produced by MOCParser#program.
    def enterProgram(self, ctx:MOCParser.ProgramContext):
        pass

    # Exit a parse tree produced by MOCParser#program.
    def exitProgram(self, ctx:MOCParser.ProgramContext):
        pass


    # Enter a parse tree produced by MOCParser#varType.
    def enterVarType(self, ctx:MOCParser.VarTypeContext):
        pass

    # Exit a parse tree produced by MOCParser#varType.
    def exitVarType(self, ctx:MOCParser.VarTypeContext):
        pass


    # Enter a parse tree produced by MOCParser#type.
    def enterType(self, ctx:MOCParser.TypeContext):
        pass

    # Exit a parse tree produced by MOCParser#type.
    def exitType(self, ctx:MOCParser.TypeContext):
        pass


    # Enter a parse tree produced by MOCParser#declaration.
    def enterDeclaration(self, ctx:MOCParser.DeclarationContext):
        pass

    # Exit a parse tree produced by MOCParser#declaration.
    def exitDeclaration(self, ctx:MOCParser.DeclarationContext):
        pass


    # Enter a parse tree produced by MOCParser#variableDeclList.
    def enterVariableDeclList(self, ctx:MOCParser.VariableDeclListContext):
        pass

    # Exit a parse tree produced by MOCParser#variableDeclList.
    def exitVariableDeclList(self, ctx:MOCParser.VariableDeclListContext):
        pass


    # Enter a parse tree produced by MOCParser#simpleDecl.
    def enterSimpleDecl(self, ctx:MOCParser.SimpleDeclContext):
        pass

    # Exit a parse tree produced by MOCParser#simpleDecl.
    def exitSimpleDecl(self, ctx:MOCParser.SimpleDeclContext):
        pass


    # Enter a parse tree produced by MOCParser#initDecl.
    def enterInitDecl(self, ctx:MOCParser.InitDeclContext):
        pass

    # Exit a parse tree produced by MOCParser#initDecl.
    def exitInitDecl(self, ctx:MOCParser.InitDeclContext):
        pass


    # Enter a parse tree produced by MOCParser#arrayDecl.
    def enterArrayDecl(self, ctx:MOCParser.ArrayDeclContext):
        pass

    # Exit a parse tree produced by MOCParser#arrayDecl.
    def exitArrayDecl(self, ctx:MOCParser.ArrayDeclContext):
        pass


    # Enter a parse tree produced by MOCParser#arrayInit.
    def enterArrayInit(self, ctx:MOCParser.ArrayInitContext):
        pass

    # Exit a parse tree produced by MOCParser#arrayInit.
    def exitArrayInit(self, ctx:MOCParser.ArrayInitContext):
        pass


    # Enter a parse tree produced by MOCParser#arrayInitFromCall.
    def enterArrayInitFromCall(self, ctx:MOCParser.ArrayInitFromCallContext):
        pass

    # Exit a parse tree produced by MOCParser#arrayInitFromCall.
    def exitArrayInitFromCall(self, ctx:MOCParser.ArrayInitFromCallContext):
        pass


    # Enter a parse tree produced by MOCParser#functionDecl.
    def enterFunctionDecl(self, ctx:MOCParser.FunctionDeclContext):
        pass

    # Exit a parse tree produced by MOCParser#functionDecl.
    def exitFunctionDecl(self, ctx:MOCParser.FunctionDeclContext):
        pass


    # Enter a parse tree produced by MOCParser#functionDef.
    def enterFunctionDef(self, ctx:MOCParser.FunctionDefContext):
        pass

    # Exit a parse tree produced by MOCParser#functionDef.
    def exitFunctionDef(self, ctx:MOCParser.FunctionDefContext):
        pass


    # Enter a parse tree produced by MOCParser#paramList.
    def enterParamList(self, ctx:MOCParser.ParamListContext):
        pass

    # Exit a parse tree produced by MOCParser#paramList.
    def exitParamList(self, ctx:MOCParser.ParamListContext):
        pass


    # Enter a parse tree produced by MOCParser#paramDecl.
    def enterParamDecl(self, ctx:MOCParser.ParamDeclContext):
        pass

    # Exit a parse tree produced by MOCParser#paramDecl.
    def exitParamDecl(self, ctx:MOCParser.ParamDeclContext):
        pass


    # Enter a parse tree produced by MOCParser#param.
    def enterParam(self, ctx:MOCParser.ParamContext):
        pass

    # Exit a parse tree produced by MOCParser#param.
    def exitParam(self, ctx:MOCParser.ParamContext):
        pass


    # Enter a parse tree produced by MOCParser#block.
    def enterBlock(self, ctx:MOCParser.BlockContext):
        pass

    # Exit a parse tree produced by MOCParser#block.
    def exitBlock(self, ctx:MOCParser.BlockContext):
        pass


    # Enter a parse tree produced by MOCParser#declStmt.
    def enterDeclStmt(self, ctx:MOCParser.DeclStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#declStmt.
    def exitDeclStmt(self, ctx:MOCParser.DeclStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#assignStmt.
    def enterAssignStmt(self, ctx:MOCParser.AssignStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#assignStmt.
    def exitAssignStmt(self, ctx:MOCParser.AssignStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#callStmt.
    def enterCallStmt(self, ctx:MOCParser.CallStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#callStmt.
    def exitCallStmt(self, ctx:MOCParser.CallStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#ifStmt.
    def enterIfStmt(self, ctx:MOCParser.IfStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#ifStmt.
    def exitIfStmt(self, ctx:MOCParser.IfStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#whileStmt.
    def enterWhileStmt(self, ctx:MOCParser.WhileStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#whileStmt.
    def exitWhileStmt(self, ctx:MOCParser.WhileStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#forStmt.
    def enterForStmt(self, ctx:MOCParser.ForStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#forStmt.
    def exitForStmt(self, ctx:MOCParser.ForStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#returnStmt.
    def enterReturnStmt(self, ctx:MOCParser.ReturnStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#returnStmt.
    def exitReturnStmt(self, ctx:MOCParser.ReturnStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#writesStmt.
    def enterWritesStmt(self, ctx:MOCParser.WritesStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#writesStmt.
    def exitWritesStmt(self, ctx:MOCParser.WritesStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#writeStmt.
    def enterWriteStmt(self, ctx:MOCParser.WriteStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#writeStmt.
    def exitWriteStmt(self, ctx:MOCParser.WriteStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#writecStmt.
    def enterWritecStmt(self, ctx:MOCParser.WritecStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#writecStmt.
    def exitWritecStmt(self, ctx:MOCParser.WritecStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#writevStmt.
    def enterWritevStmt(self, ctx:MOCParser.WritevStmtContext):
        pass

    # Exit a parse tree produced by MOCParser#writevStmt.
    def exitWritevStmt(self, ctx:MOCParser.WritevStmtContext):
        pass


    # Enter a parse tree produced by MOCParser#assignment.
    def enterAssignment(self, ctx:MOCParser.AssignmentContext):
        pass

    # Exit a parse tree produced by MOCParser#assignment.
    def exitAssignment(self, ctx:MOCParser.AssignmentContext):
        pass


    # Enter a parse tree produced by MOCParser#normalFuncCall.
    def enterNormalFuncCall(self, ctx:MOCParser.NormalFuncCallContext):
        pass

    # Exit a parse tree produced by MOCParser#normalFuncCall.
    def exitNormalFuncCall(self, ctx:MOCParser.NormalFuncCallContext):
        pass


    # Enter a parse tree produced by MOCParser#readExpr.
    def enterReadExpr(self, ctx:MOCParser.ReadExprContext):
        pass

    # Exit a parse tree produced by MOCParser#readExpr.
    def exitReadExpr(self, ctx:MOCParser.ReadExprContext):
        pass


    # Enter a parse tree produced by MOCParser#readcExpr.
    def enterReadcExpr(self, ctx:MOCParser.ReadcExprContext):
        pass

    # Exit a parse tree produced by MOCParser#readcExpr.
    def exitReadcExpr(self, ctx:MOCParser.ReadcExprContext):
        pass


    # Enter a parse tree produced by MOCParser#readsExpr.
    def enterReadsExpr(self, ctx:MOCParser.ReadsExprContext):
        pass

    # Exit a parse tree produced by MOCParser#readsExpr.
    def exitReadsExpr(self, ctx:MOCParser.ReadsExprContext):
        pass


    # Enter a parse tree produced by MOCParser#argumentList.
    def enterArgumentList(self, ctx:MOCParser.ArgumentListContext):
        pass

    # Exit a parse tree produced by MOCParser#argumentList.
    def exitArgumentList(self, ctx:MOCParser.ArgumentListContext):
        pass


    # Enter a parse tree produced by MOCParser#orCond.
    def enterOrCond(self, ctx:MOCParser.OrCondContext):
        pass

    # Exit a parse tree produced by MOCParser#orCond.
    def exitOrCond(self, ctx:MOCParser.OrCondContext):
        pass


    # Enter a parse tree produced by MOCParser#singleCond.
    def enterSingleCond(self, ctx:MOCParser.SingleCondContext):
        pass

    # Exit a parse tree produced by MOCParser#singleCond.
    def exitSingleCond(self, ctx:MOCParser.SingleCondContext):
        pass


    # Enter a parse tree produced by MOCParser#andCond.
    def enterAndCond(self, ctx:MOCParser.AndCondContext):
        pass

    # Exit a parse tree produced by MOCParser#andCond.
    def exitAndCond(self, ctx:MOCParser.AndCondContext):
        pass


    # Enter a parse tree produced by MOCParser#binaryCond.
    def enterBinaryCond(self, ctx:MOCParser.BinaryCondContext):
        pass

    # Exit a parse tree produced by MOCParser#binaryCond.
    def exitBinaryCond(self, ctx:MOCParser.BinaryCondContext):
        pass


    # Enter a parse tree produced by MOCParser#notCond.
    def enterNotCond(self, ctx:MOCParser.NotCondContext):
        pass

    # Exit a parse tree produced by MOCParser#notCond.
    def exitNotCond(self, ctx:MOCParser.NotCondContext):
        pass


    # Enter a parse tree produced by MOCParser#relop.
    def enterRelop(self, ctx:MOCParser.RelopContext):
        pass

    # Exit a parse tree produced by MOCParser#relop.
    def exitRelop(self, ctx:MOCParser.RelopContext):
        pass


    # Enter a parse tree produced by MOCParser#doubleExpr.
    def enterDoubleExpr(self, ctx:MOCParser.DoubleExprContext):
        pass

    # Exit a parse tree produced by MOCParser#doubleExpr.
    def exitDoubleExpr(self, ctx:MOCParser.DoubleExprContext):
        pass


    # Enter a parse tree produced by MOCParser#arrayAccessExpr.
    def enterArrayAccessExpr(self, ctx:MOCParser.ArrayAccessExprContext):
        pass

    # Exit a parse tree produced by MOCParser#arrayAccessExpr.
    def exitArrayAccessExpr(self, ctx:MOCParser.ArrayAccessExprContext):
        pass


    # Enter a parse tree produced by MOCParser#intExpr.
    def enterIntExpr(self, ctx:MOCParser.IntExprContext):
        pass

    # Exit a parse tree produced by MOCParser#intExpr.
    def exitIntExpr(self, ctx:MOCParser.IntExprContext):
        pass


    # Enter a parse tree produced by MOCParser#castExpr.
    def enterCastExpr(self, ctx:MOCParser.CastExprContext):
        pass

    # Exit a parse tree produced by MOCParser#castExpr.
    def exitCastExpr(self, ctx:MOCParser.CastExprContext):
        pass


    # Enter a parse tree produced by MOCParser#addExpr.
    def enterAddExpr(self, ctx:MOCParser.AddExprContext):
        pass

    # Exit a parse tree produced by MOCParser#addExpr.
    def exitAddExpr(self, ctx:MOCParser.AddExprContext):
        pass


    # Enter a parse tree produced by MOCParser#funcCallExpr.
    def enterFuncCallExpr(self, ctx:MOCParser.FuncCallExprContext):
        pass

    # Exit a parse tree produced by MOCParser#funcCallExpr.
    def exitFuncCallExpr(self, ctx:MOCParser.FuncCallExprContext):
        pass


    # Enter a parse tree produced by MOCParser#multExpr.
    def enterMultExpr(self, ctx:MOCParser.MultExprContext):
        pass

    # Exit a parse tree produced by MOCParser#multExpr.
    def exitMultExpr(self, ctx:MOCParser.MultExprContext):
        pass


    # Enter a parse tree produced by MOCParser#parenExpr.
    def enterParenExpr(self, ctx:MOCParser.ParenExprContext):
        pass

    # Exit a parse tree produced by MOCParser#parenExpr.
    def exitParenExpr(self, ctx:MOCParser.ParenExprContext):
        pass


    # Enter a parse tree produced by MOCParser#idExpr.
    def enterIdExpr(self, ctx:MOCParser.IdExprContext):
        pass

    # Exit a parse tree produced by MOCParser#idExpr.
    def exitIdExpr(self, ctx:MOCParser.IdExprContext):
        pass


    # Enter a parse tree produced by MOCParser#cast.
    def enterCast(self, ctx:MOCParser.CastContext):
        pass

    # Exit a parse tree produced by MOCParser#cast.
    def exitCast(self, ctx:MOCParser.CastContext):
        pass



del MOCParser