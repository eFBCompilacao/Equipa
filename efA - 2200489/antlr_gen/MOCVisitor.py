# Generated from MOC.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MOCParser import MOCParser
else:
    from MOCParser import MOCParser

# This class defines a complete generic visitor for a parse tree produced by MOCParser.

class MOCVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MOCParser#program.
    def visitProgram(self, ctx:MOCParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#varType.
    def visitVarType(self, ctx:MOCParser.VarTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#type.
    def visitType(self, ctx:MOCParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#declaration.
    def visitDeclaration(self, ctx:MOCParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#variableDeclList.
    def visitVariableDeclList(self, ctx:MOCParser.VariableDeclListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#simpleDecl.
    def visitSimpleDecl(self, ctx:MOCParser.SimpleDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#initDecl.
    def visitInitDecl(self, ctx:MOCParser.InitDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#arrayDecl.
    def visitArrayDecl(self, ctx:MOCParser.ArrayDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#arrayInit.
    def visitArrayInit(self, ctx:MOCParser.ArrayInitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#arrayInitFromCall.
    def visitArrayInitFromCall(self, ctx:MOCParser.ArrayInitFromCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#functionDecl.
    def visitFunctionDecl(self, ctx:MOCParser.FunctionDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#functionDef.
    def visitFunctionDef(self, ctx:MOCParser.FunctionDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#paramList.
    def visitParamList(self, ctx:MOCParser.ParamListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#param.
    def visitParam(self, ctx:MOCParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#block.
    def visitBlock(self, ctx:MOCParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#statement.
    def visitStatement(self, ctx:MOCParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#assignment.
    def visitAssignment(self, ctx:MOCParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#normalFuncCall.
    def visitNormalFuncCall(self, ctx:MOCParser.NormalFuncCallContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#readExpr.
    def visitReadExpr(self, ctx:MOCParser.ReadExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#readcExpr.
    def visitReadcExpr(self, ctx:MOCParser.ReadcExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#readsExpr.
    def visitReadsExpr(self, ctx:MOCParser.ReadsExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#argumentList.
    def visitArgumentList(self, ctx:MOCParser.ArgumentListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#ifStatement.
    def visitIfStatement(self, ctx:MOCParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#whileStatement.
    def visitWhileStatement(self, ctx:MOCParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#forStatement.
    def visitForStatement(self, ctx:MOCParser.ForStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#orCond.
    def visitOrCond(self, ctx:MOCParser.OrCondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#singleCond.
    def visitSingleCond(self, ctx:MOCParser.SingleCondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#andCond.
    def visitAndCond(self, ctx:MOCParser.AndCondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#binaryCond.
    def visitBinaryCond(self, ctx:MOCParser.BinaryCondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#notCond.
    def visitNotCond(self, ctx:MOCParser.NotCondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#relop.
    def visitRelop(self, ctx:MOCParser.RelopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#doubleExpr.
    def visitDoubleExpr(self, ctx:MOCParser.DoubleExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#arrayAccessExpr.
    def visitArrayAccessExpr(self, ctx:MOCParser.ArrayAccessExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#intExpr.
    def visitIntExpr(self, ctx:MOCParser.IntExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#castExpr.
    def visitCastExpr(self, ctx:MOCParser.CastExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#addExpr.
    def visitAddExpr(self, ctx:MOCParser.AddExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#funcCallExpr.
    def visitFuncCallExpr(self, ctx:MOCParser.FuncCallExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#multExpr.
    def visitMultExpr(self, ctx:MOCParser.MultExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#parenExpr.
    def visitParenExpr(self, ctx:MOCParser.ParenExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#idExpr.
    def visitIdExpr(self, ctx:MOCParser.IdExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MOCParser#cast.
    def visitCast(self, ctx:MOCParser.CastContext):
        return self.visitChildren(ctx)



del MOCParser