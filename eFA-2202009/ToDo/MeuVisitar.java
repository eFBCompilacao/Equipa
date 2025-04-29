//
//
// UC: 21018 - COMPILAÇÃO 
// E-Fólio A
//
// Versão 1
//
// Adaptado de:
// https://stackoverflow.com/questions/48555825/antlr4-is-there-a-simple-example-of-using-the-parsetree-walker
//	
// Aluno: 2202009 - Vasco Lopes
//
// Última modificação : 14 / 04 / 2025
//
//

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;

public class MeuVisitar extends MOC_InterpretadorBaseVisitor<Void> {
    @Override
    public Void visitInstrucaoSE(MOC_Interpretador.InstrucaoSEContext ctx) {
        System.out.println("Instrução SE:");
        System.out.println(obterTextoOriginal(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitInstrucaoENQUANTO(MOC_Interpretador.InstrucaoENQUANTOContext ctx) {
        System.out.println("Instrução ENQUANTO:");
        System.out.println(obterTextoOriginal(ctx));
        return visitChildren(ctx);
    }

    @Override
    public Void visitInstrucaoPARA(MOC_Interpretador.InstrucaoPARAContext ctx) {
        System.out.println("Instrução PARA:");
        System.out.println(obterTextoOriginal(ctx));
        return visitChildren(ctx);
    }

    // Método auxiliar para recuperar o texto original formatado
    private String obterTextoOriginal(ParserRuleContext ctx) {
        Interval intervalo = Interval.of(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex());
        return ctx.getStart().getInputStream().getText(intervalo);
    }
}