// Generated from C:/Users/pagan/OneDrive/Área de Trabalho/IF BCC/6 - Período BCC/Compiladores/Compiladores/src/main/java/org/example/Antlr4/Gramatica/AutomacaoResidencial.g4 by ANTLR 4.13.2
package org.example.Antlr4.Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutomacaoResidencialParser}.
 */
public interface AutomacaoResidencialListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AutomacaoResidencialParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AutomacaoResidencialParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#lista_dispositivos}.
	 * @param ctx the parse tree
	 */
	void enterLista_dispositivos(AutomacaoResidencialParser.Lista_dispositivosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#lista_dispositivos}.
	 * @param ctx the parse tree
	 */
	void exitLista_dispositivos(AutomacaoResidencialParser.Lista_dispositivosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#dispositivo}.
	 * @param ctx the parse tree
	 */
	void enterDispositivo(AutomacaoResidencialParser.DispositivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#dispositivo}.
	 * @param ctx the parse tree
	 */
	void exitDispositivo(AutomacaoResidencialParser.DispositivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#lista_agendamentos}.
	 * @param ctx the parse tree
	 */
	void enterLista_agendamentos(AutomacaoResidencialParser.Lista_agendamentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#lista_agendamentos}.
	 * @param ctx the parse tree
	 */
	void exitLista_agendamentos(AutomacaoResidencialParser.Lista_agendamentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#agendamento}.
	 * @param ctx the parse tree
	 */
	void enterAgendamento(AutomacaoResidencialParser.AgendamentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#agendamento}.
	 * @param ctx the parse tree
	 */
	void exitAgendamento(AutomacaoResidencialParser.AgendamentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#lista_rotinas}.
	 * @param ctx the parse tree
	 */
	void enterLista_rotinas(AutomacaoResidencialParser.Lista_rotinasContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#lista_rotinas}.
	 * @param ctx the parse tree
	 */
	void exitLista_rotinas(AutomacaoResidencialParser.Lista_rotinasContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#rotina}.
	 * @param ctx the parse tree
	 */
	void enterRotina(AutomacaoResidencialParser.RotinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#rotina}.
	 * @param ctx the parse tree
	 */
	void exitRotina(AutomacaoResidencialParser.RotinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#configuracoes}.
	 * @param ctx the parse tree
	 */
	void enterConfiguracoes(AutomacaoResidencialParser.ConfiguracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#configuracoes}.
	 * @param ctx the parse tree
	 */
	void exitConfiguracoes(AutomacaoResidencialParser.ConfiguracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#configuracao}.
	 * @param ctx the parse tree
	 */
	void enterConfiguracao(AutomacaoResidencialParser.ConfiguracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#configuracao}.
	 * @param ctx the parse tree
	 */
	void exitConfiguracao(AutomacaoResidencialParser.ConfiguracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#chave_config}.
	 * @param ctx the parse tree
	 */
	void enterChave_config(AutomacaoResidencialParser.Chave_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#chave_config}.
	 * @param ctx the parse tree
	 */
	void exitChave_config(AutomacaoResidencialParser.Chave_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#valor_config}.
	 * @param ctx the parse tree
	 */
	void enterValor_config(AutomacaoResidencialParser.Valor_configContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#valor_config}.
	 * @param ctx the parse tree
	 */
	void exitValor_config(AutomacaoResidencialParser.Valor_configContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterAcao(AutomacaoResidencialParser.AcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitAcao(AutomacaoResidencialParser.AcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#hora}.
	 * @param ctx the parse tree
	 */
	void enterHora(AutomacaoResidencialParser.HoraContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#hora}.
	 * @param ctx the parse tree
	 */
	void exitHora(AutomacaoResidencialParser.HoraContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#dia}.
	 * @param ctx the parse tree
	 */
	void enterDia(AutomacaoResidencialParser.DiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#dia}.
	 * @param ctx the parse tree
	 */
	void exitDia(AutomacaoResidencialParser.DiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#horas}.
	 * @param ctx the parse tree
	 */
	void enterHoras(AutomacaoResidencialParser.HorasContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#horas}.
	 * @param ctx the parse tree
	 */
	void exitHoras(AutomacaoResidencialParser.HorasContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#minutos}.
	 * @param ctx the parse tree
	 */
	void enterMinutos(AutomacaoResidencialParser.MinutosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#minutos}.
	 * @param ctx the parse tree
	 */
	void exitMinutos(AutomacaoResidencialParser.MinutosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(AutomacaoResidencialParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(AutomacaoResidencialParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomacaoResidencialParser#digito}.
	 * @param ctx the parse tree
	 */
	void enterDigito(AutomacaoResidencialParser.DigitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomacaoResidencialParser#digito}.
	 * @param ctx the parse tree
	 */
	void exitDigito(AutomacaoResidencialParser.DigitoContext ctx);
}