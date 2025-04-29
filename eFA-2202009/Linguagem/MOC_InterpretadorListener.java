// Generated from MOC_Interpretador.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MOC_Interpretador}.
 */
public interface MOC_InterpretadorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MOC_Interpretador.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MOC_Interpretador.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(MOC_Interpretador.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(MOC_Interpretador.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#instrucaoSE}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoSE(MOC_Interpretador.InstrucaoSEContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#instrucaoSE}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoSE(MOC_Interpretador.InstrucaoSEContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#instrucaoSEsimples}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoSEsimples(MOC_Interpretador.InstrucaoSEsimplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#instrucaoSEsimples}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoSEsimples(MOC_Interpretador.InstrucaoSEsimplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#instrucaoSEcompleto}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoSEcompleto(MOC_Interpretador.InstrucaoSEcompletoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#instrucaoSEcompleto}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoSEcompleto(MOC_Interpretador.InstrucaoSEcompletoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#instrucaoSEgeral}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoSEgeral(MOC_Interpretador.InstrucaoSEgeralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#instrucaoSEgeral}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoSEgeral(MOC_Interpretador.InstrucaoSEgeralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#instrucaoENQUANTO}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoENQUANTO(MOC_Interpretador.InstrucaoENQUANTOContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#instrucaoENQUANTO}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoENQUANTO(MOC_Interpretador.InstrucaoENQUANTOContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#instrucaoPARA}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoPARA(MOC_Interpretador.InstrucaoPARAContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#instrucaoPARA}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoPARA(MOC_Interpretador.InstrucaoPARAContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#instrucaoDEVOLVE}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoDEVOLVE(MOC_Interpretador.InstrucaoDEVOLVEContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#instrucaoDEVOLVE}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoDEVOLVE(MOC_Interpretador.InstrucaoDEVOLVEContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#instrucaoLEITURA}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoLEITURA(MOC_Interpretador.InstrucaoLEITURAContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#instrucaoLEITURA}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoLEITURA(MOC_Interpretador.InstrucaoLEITURAContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#instrucaoESCRITA}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoESCRITA(MOC_Interpretador.InstrucaoESCRITAContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#instrucaoESCRITA}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoESCRITA(MOC_Interpretador.InstrucaoESCRITAContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(MOC_Interpretador.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(MOC_Interpretador.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_writev}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_writev(MOC_Interpretador.Chamada_writevContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_writev}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_writev(MOC_Interpretador.Chamada_writevContext ctx);
	/**
	 * Enter a parse tree produced by the {@code acesso_vetor}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterAcesso_vetor(MOC_Interpretador.Acesso_vetorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code acesso_vetor}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitAcesso_vetor(MOC_Interpretador.Acesso_vetorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unitario_positivo}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterUnitario_positivo(MOC_Interpretador.Unitario_positivoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unitario_positivo}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitUnitario_positivo(MOC_Interpretador.Unitario_positivoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal_inteiro}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_inteiro(MOC_Interpretador.Literal_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal_inteiro}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_inteiro(MOC_Interpretador.Literal_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal_vetor}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_vetor(MOC_Interpretador.Literal_vetorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal_vetor}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_vetor(MOC_Interpretador.Literal_vetorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuicao_vetor}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_vetor(MOC_Interpretador.Atribuicao_vetorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuicao_vetor}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_vetor(MOC_Interpretador.Atribuicao_vetorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_readc}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_readc(MOC_Interpretador.Chamada_readcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_readc}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_readc(MOC_Interpretador.Chamada_readcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_write}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_write(MOC_Interpretador.Chamada_writeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_write}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_write(MOC_Interpretador.Chamada_writeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_writes}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_writes(MOC_Interpretador.Chamada_writesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_writes}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_writes(MOC_Interpretador.Chamada_writesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variavel_simples}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterVariavel_simples(MOC_Interpretador.Variavel_simplesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variavel_simples}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitVariavel_simples(MOC_Interpretador.Variavel_simplesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code adicao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterAdicao(MOC_Interpretador.AdicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code adicao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitAdicao(MOC_Interpretador.AdicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casting}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterCasting(MOC_Interpretador.CastingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casting}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitCasting(MOC_Interpretador.CastingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicacao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacao(MOC_Interpretador.MultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicacao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacao(MOC_Interpretador.MultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_read}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_read(MOC_Interpretador.Chamada_readContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_read}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_read(MOC_Interpretador.Chamada_readContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(MOC_Interpretador.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(MOC_Interpretador.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unitario_negativo}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterUnitario_negativo(MOC_Interpretador.Unitario_negativoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unitario_negativo}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitUnitario_negativo(MOC_Interpretador.Unitario_negativoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divisao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterDivisao(MOC_Interpretador.DivisaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divisao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitDivisao(MOC_Interpretador.DivisaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtraccao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterSubtraccao(MOC_Interpretador.SubtraccaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtraccao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitSubtraccao(MOC_Interpretador.SubtraccaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literal_real}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_real(MOC_Interpretador.Literal_realContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literal_real}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_real(MOC_Interpretador.Literal_realContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resto}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterResto(MOC_Interpretador.RestoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resto}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitResto(MOC_Interpretador.RestoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code disjuncao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterDisjuncao(MOC_Interpretador.DisjuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code disjuncao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitDisjuncao(MOC_Interpretador.DisjuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentises}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterParentises(MOC_Interpretador.ParentisesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentises}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitParentises(MOC_Interpretador.ParentisesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_funcao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(MOC_Interpretador.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_funcao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(MOC_Interpretador.Chamada_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparacao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(MOC_Interpretador.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparacao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(MOC_Interpretador.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_readv}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_readv(MOC_Interpretador.Chamada_readvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_readv}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_readv(MOC_Interpretador.Chamada_readvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conjuncao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterConjuncao(MOC_Interpretador.ConjuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conjuncao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitConjuncao(MOC_Interpretador.ConjuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_reads}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_reads(MOC_Interpretador.Chamada_readsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_reads}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_reads(MOC_Interpretador.Chamada_readsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negacao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterNegacao(MOC_Interpretador.NegacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negacao}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitNegacao(MOC_Interpretador.NegacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chamada_writec}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_writec(MOC_Interpretador.Chamada_writecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chamada_writec}
	 * labeled alternative in {@link MOC_Interpretador#expressao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_writec(MOC_Interpretador.Chamada_writecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#declaracao_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_variaveis(MOC_Interpretador.Declaracao_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#declaracao_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_variaveis(MOC_Interpretador.Declaracao_variaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MOC_Interpretador.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MOC_Interpretador.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#lista_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterLista_variaveis(MOC_Interpretador.Lista_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#lista_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitLista_variaveis(MOC_Interpretador.Lista_variaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(MOC_Interpretador.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(MOC_Interpretador.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#prototipo}.
	 * @param ctx the parse tree
	 */
	void enterPrototipo(MOC_Interpretador.PrototipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#prototipo}.
	 * @param ctx the parse tree
	 */
	void exitPrototipo(MOC_Interpretador.PrototipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MOC_Interpretador.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MOC_Interpretador.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(MOC_Interpretador.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(MOC_Interpretador.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(MOC_Interpretador.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(MOC_Interpretador.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(MOC_Interpretador.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(MOC_Interpretador.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MOC_Interpretador#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(MOC_Interpretador.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MOC_Interpretador#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(MOC_Interpretador.PrincipalContext ctx);
}