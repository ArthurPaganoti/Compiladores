// Generated from C:/Users/pagan/OneDrive/Área de Trabalho/IF BCC/6 - Período BCC/Compiladores/Compiladores/src/main/java/org/example/Antlr4/Gramatica/AutomacaoResidencial.g4 by ANTLR 4.13.2
package org.example.Antlr4.Gramatica;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AutomacaoResidencialParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AutomacaoResidencialVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AutomacaoResidencialParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#lista_dispositivos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_dispositivos(AutomacaoResidencialParser.Lista_dispositivosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#dispositivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispositivo(AutomacaoResidencialParser.DispositivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#lista_agendamentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_agendamentos(AutomacaoResidencialParser.Lista_agendamentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#agendamento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgendamento(AutomacaoResidencialParser.AgendamentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#lista_rotinas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_rotinas(AutomacaoResidencialParser.Lista_rotinasContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#rotina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotina(AutomacaoResidencialParser.RotinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#configuracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguracoes(AutomacaoResidencialParser.ConfiguracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#configuracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfiguracao(AutomacaoResidencialParser.ConfiguracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#chave_config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChave_config(AutomacaoResidencialParser.Chave_configContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#valor_config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_config(AutomacaoResidencialParser.Valor_configContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcao(AutomacaoResidencialParser.AcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#hora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHora(AutomacaoResidencialParser.HoraContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#dia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDia(AutomacaoResidencialParser.DiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#horas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHoras(AutomacaoResidencialParser.HorasContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#minutos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinutos(AutomacaoResidencialParser.MinutosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#inteiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(AutomacaoResidencialParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomacaoResidencialParser#digito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigito(AutomacaoResidencialParser.DigitoContext ctx);
}