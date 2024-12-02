// Generated from C:/Users/pagan/OneDrive/Área de Trabalho/IF BCC/6 - Período BCC/Compiladores/Compiladores/src/main/java/org/example/Antlr4/Gramatica/AutomacaoResidencial.g4 by ANTLR 4.13.2
package org.example.Antlr4.Gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AutomacaoResidencialParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98;
	public static final int
		RULE_programa = 0, RULE_lista_dispositivos = 1, RULE_dispositivo = 2, 
		RULE_lista_agendamentos = 3, RULE_agendamento = 4, RULE_lista_rotinas = 5, 
		RULE_rotina = 6, RULE_configuracoes = 7, RULE_configuracao = 8, RULE_chave_config = 9, 
		RULE_valor_config = 10, RULE_acao = 11, RULE_hora = 12, RULE_dia = 13, 
		RULE_horas = 14, RULE_minutos = 15, RULE_inteiro = 16, RULE_digito = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "lista_dispositivos", "dispositivo", "lista_agendamentos", 
			"agendamento", "lista_rotinas", "rotina", "configuracoes", "configuracao", 
			"chave_config", "valor_config", "acao", "hora", "dia", "horas", "minutos", 
			"inteiro", "digito"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dispositivos:'", "';'", "'ar_condicionado'", "'tv'", "'luz'", 
			"'computador'", "'videogame'", "'caixa_de_som'", "'agendamento:'", "'rotina:'", 
			"','", "'='", "'temperatura'", "'canal'", "'volume'", "'cor'", "'intensidade'", 
			"'ligar'", "'desligar'", "'configurar'", "':'", "'Segunda'", "'Terca'", 
			"'Quarta'", "'Quinta'", "'Sexta'", "'Sabado'", "'Domingo'", "'00'", "'01'", 
			"'02'", "'03'", "'04'", "'05'", "'06'", "'07'", "'08'", "'09'", "'10'", 
			"'11'", "'12'", "'13'", "'14'", "'15'", "'16'", "'17'", "'18'", "'19'", 
			"'20'", "'21'", "'22'", "'23'", "'24'", "'25'", "'26'", "'27'", "'28'", 
			"'29'", "'30'", "'31'", "'32'", "'33'", "'34'", "'35'", "'36'", "'37'", 
			"'38'", "'39'", "'40'", "'41'", "'42'", "'43'", "'44'", "'45'", "'46'", 
			"'47'", "'48'", "'49'", "'50'", "'51'", "'52'", "'53'", "'54'", "'55'", 
			"'56'", "'57'", "'58'", "'59'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", 
			"'6'", "'7'", "'8'", "'9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
	public String getGrammarFileName() { return "AutomacaoResidencial.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AutomacaoResidencialParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public Lista_dispositivosContext lista_dispositivos() {
			return getRuleContext(Lista_dispositivosContext.class,0);
		}
		public Lista_agendamentosContext lista_agendamentos() {
			return getRuleContext(Lista_agendamentosContext.class,0);
		}
		public Lista_rotinasContext lista_rotinas() {
			return getRuleContext(Lista_rotinasContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			lista_dispositivos();
			setState(37);
			lista_agendamentos();
			setState(38);
			lista_rotinas();
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
	public static class Lista_dispositivosContext extends ParserRuleContext {
		public DispositivoContext dispositivo() {
			return getRuleContext(DispositivoContext.class,0);
		}
		public Lista_dispositivosContext lista_dispositivos() {
			return getRuleContext(Lista_dispositivosContext.class,0);
		}
		public Lista_dispositivosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_dispositivos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterLista_dispositivos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitLista_dispositivos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitLista_dispositivos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_dispositivosContext lista_dispositivos() throws RecognitionException {
		Lista_dispositivosContext _localctx = new Lista_dispositivosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lista_dispositivos);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__0);
				setState(41);
				dispositivo();
				setState(42);
				match(T__1);
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				dispositivo();
				setState(45);
				match(T__1);
				setState(46);
				lista_dispositivos();
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
	public static class DispositivoContext extends ParserRuleContext {
		public DispositivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispositivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterDispositivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitDispositivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitDispositivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DispositivoContext dispositivo() throws RecognitionException {
		DispositivoContext _localctx = new DispositivoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dispositivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0)) ) {
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
	public static class Lista_agendamentosContext extends ParserRuleContext {
		public AgendamentoContext agendamento() {
			return getRuleContext(AgendamentoContext.class,0);
		}
		public Lista_agendamentosContext lista_agendamentos() {
			return getRuleContext(Lista_agendamentosContext.class,0);
		}
		public Lista_agendamentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_agendamentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterLista_agendamentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitLista_agendamentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitLista_agendamentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_agendamentosContext lista_agendamentos() throws RecognitionException {
		Lista_agendamentosContext _localctx = new Lista_agendamentosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_agendamentos);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__8);
				setState(53);
				agendamento();
				setState(54);
				match(T__1);
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				agendamento();
				setState(57);
				match(T__1);
				setState(58);
				lista_agendamentos();
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
	public static class AgendamentoContext extends ParserRuleContext {
		public HoraContext hora() {
			return getRuleContext(HoraContext.class,0);
		}
		public DiaContext dia() {
			return getRuleContext(DiaContext.class,0);
		}
		public DispositivoContext dispositivo() {
			return getRuleContext(DispositivoContext.class,0);
		}
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public ConfiguracoesContext configuracoes() {
			return getRuleContext(ConfiguracoesContext.class,0);
		}
		public AgendamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agendamento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterAgendamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitAgendamento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitAgendamento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgendamentoContext agendamento() throws RecognitionException {
		AgendamentoContext _localctx = new AgendamentoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_agendamento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			hora();
			setState(63);
			dia();
			setState(64);
			dispositivo();
			setState(65);
			acao();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) {
				{
				setState(66);
				configuracoes();
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
	public static class Lista_rotinasContext extends ParserRuleContext {
		public RotinaContext rotina() {
			return getRuleContext(RotinaContext.class,0);
		}
		public Lista_rotinasContext lista_rotinas() {
			return getRuleContext(Lista_rotinasContext.class,0);
		}
		public Lista_rotinasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_rotinas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterLista_rotinas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitLista_rotinas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitLista_rotinas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_rotinasContext lista_rotinas() throws RecognitionException {
		Lista_rotinasContext _localctx = new Lista_rotinasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lista_rotinas);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__9);
				setState(70);
				rotina();
				setState(71);
				match(T__1);
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				rotina();
				setState(74);
				match(T__1);
				setState(75);
				lista_rotinas();
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
	public static class RotinaContext extends ParserRuleContext {
		public DispositivoContext dispositivo() {
			return getRuleContext(DispositivoContext.class,0);
		}
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public ConfiguracoesContext configuracoes() {
			return getRuleContext(ConfiguracoesContext.class,0);
		}
		public RotinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterRotina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitRotina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitRotina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotinaContext rotina() throws RecognitionException {
		RotinaContext _localctx = new RotinaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rotina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			dispositivo();
			setState(80);
			acao();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) {
				{
				setState(81);
				configuracoes();
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
	public static class ConfiguracoesContext extends ParserRuleContext {
		public ConfiguracaoContext configuracao() {
			return getRuleContext(ConfiguracaoContext.class,0);
		}
		public ConfiguracoesContext configuracoes() {
			return getRuleContext(ConfiguracoesContext.class,0);
		}
		public ConfiguracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterConfiguracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitConfiguracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitConfiguracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfiguracoesContext configuracoes() throws RecognitionException {
		ConfiguracoesContext _localctx = new ConfiguracoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_configuracoes);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				configuracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				configuracao();
				setState(86);
				match(T__10);
				setState(87);
				configuracoes();
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
	public static class ConfiguracaoContext extends ParserRuleContext {
		public Chave_configContext chave_config() {
			return getRuleContext(Chave_configContext.class,0);
		}
		public Valor_configContext valor_config() {
			return getRuleContext(Valor_configContext.class,0);
		}
		public ConfiguracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterConfiguracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitConfiguracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitConfiguracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfiguracaoContext configuracao() throws RecognitionException {
		ConfiguracaoContext _localctx = new ConfiguracaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_configuracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			chave_config();
			setState(92);
			match(T__11);
			setState(93);
			valor_config();
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
	public static class Chave_configContext extends ParserRuleContext {
		public Chave_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chave_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterChave_config(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitChave_config(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitChave_config(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chave_configContext chave_config() throws RecognitionException {
		Chave_configContext _localctx = new Chave_configContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_chave_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 253952L) != 0)) ) {
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
	public static class Valor_configContext extends ParserRuleContext {
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public Valor_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterValor_config(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitValor_config(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitValor_config(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_configContext valor_config() throws RecognitionException {
		Valor_configContext _localctx = new Valor_configContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valor_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			inteiro();
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
	public static class AcaoContext extends ParserRuleContext {
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitAcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitAcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_acao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
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
	public static class HoraContext extends ParserRuleContext {
		public HorasContext horas() {
			return getRuleContext(HorasContext.class,0);
		}
		public MinutosContext minutos() {
			return getRuleContext(MinutosContext.class,0);
		}
		public HoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterHora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitHora(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitHora(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoraContext hora() throws RecognitionException {
		HoraContext _localctx = new HoraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			horas();
			setState(102);
			match(T__20);
			setState(103);
			minutos();
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
	public static class DiaContext extends ParserRuleContext {
		public DiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterDia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitDia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitDia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiaContext dia() throws RecognitionException {
		DiaContext _localctx = new DiaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 532676608L) != 0)) ) {
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
	public static class HorasContext extends ParserRuleContext {
		public HorasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_horas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterHoras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitHoras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitHoras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HorasContext horas() throws RecognitionException {
		HorasContext _localctx = new HorasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_horas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007198717870080L) != 0)) ) {
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
	public static class MinutosContext extends ParserRuleContext {
		public MinutosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minutos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterMinutos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitMinutos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitMinutos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinutosContext minutos() throws RecognitionException {
		MinutosContext _localctx = new MinutosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_minutos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & 1152921504606846975L) != 0)) ) {
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
	public static class InteiroContext extends ParserRuleContext {
		public List<DigitoContext> digito() {
			return getRuleContexts(DigitoContext.class);
		}
		public DigitoContext digito(int i) {
			return getRuleContext(DigitoContext.class,i);
		}
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitInteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inteiro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				digito();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 1023L) != 0) );
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
	public static class DigitoContext extends ParserRuleContext {
		public DigitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).enterDigito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomacaoResidencialListener ) ((AutomacaoResidencialListener)listener).exitDigito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutomacaoResidencialVisitor ) return ((AutomacaoResidencialVisitor<? extends T>)visitor).visitDigito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitoContext digito() throws RecognitionException {
		DigitoContext _localctx = new DigitoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_digito);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 1023L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001bw\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002"+
		"\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004D\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007Z\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0004\u0010q\b\u0010\u000b\u0010\f\u0010"+
		"r\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"\u0000\u0007\u0001\u0000\u0003\b\u0001\u0000\r\u0011\u0001\u0000\u0012"+
		"\u0014\u0001\u0000\u0016\u001c\u0001\u0000\u001d4\u0001\u0000\u001dX\u0001"+
		"\u0000Ybk\u0000$\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000"+
		"\u00042\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\b>\u0001"+
		"\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000"+
		"\u000eY\u0001\u0000\u0000\u0000\u0010[\u0001\u0000\u0000\u0000\u0012_"+
		"\u0001\u0000\u0000\u0000\u0014a\u0001\u0000\u0000\u0000\u0016c\u0001\u0000"+
		"\u0000\u0000\u0018e\u0001\u0000\u0000\u0000\u001ai\u0001\u0000\u0000\u0000"+
		"\u001ck\u0001\u0000\u0000\u0000\u001em\u0001\u0000\u0000\u0000 p\u0001"+
		"\u0000\u0000\u0000\"t\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001\u0000"+
		"%&\u0003\u0006\u0003\u0000&\'\u0003\n\u0005\u0000\'\u0001\u0001\u0000"+
		"\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0003\u0004\u0002\u0000*+\u0005"+
		"\u0002\u0000\u0000+1\u0001\u0000\u0000\u0000,-\u0003\u0004\u0002\u0000"+
		"-.\u0005\u0002\u0000\u0000./\u0003\u0002\u0001\u0000/1\u0001\u0000\u0000"+
		"\u00000(\u0001\u0000\u0000\u00000,\u0001\u0000\u0000\u00001\u0003\u0001"+
		"\u0000\u0000\u000023\u0007\u0000\u0000\u00003\u0005\u0001\u0000\u0000"+
		"\u000045\u0005\t\u0000\u000056\u0003\b\u0004\u000067\u0005\u0002\u0000"+
		"\u00007=\u0001\u0000\u0000\u000089\u0003\b\u0004\u00009:\u0005\u0002\u0000"+
		"\u0000:;\u0003\u0006\u0003\u0000;=\u0001\u0000\u0000\u0000<4\u0001\u0000"+
		"\u0000\u0000<8\u0001\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000"+
		">?\u0003\u0018\f\u0000?@\u0003\u001a\r\u0000@A\u0003\u0004\u0002\u0000"+
		"AC\u0003\u0016\u000b\u0000BD\u0003\u000e\u0007\u0000CB\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000D\t\u0001\u0000\u0000\u0000EF\u0005\n"+
		"\u0000\u0000FG\u0003\f\u0006\u0000GH\u0005\u0002\u0000\u0000HN\u0001\u0000"+
		"\u0000\u0000IJ\u0003\f\u0006\u0000JK\u0005\u0002\u0000\u0000KL\u0003\n"+
		"\u0005\u0000LN\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000MI\u0001"+
		"\u0000\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0003\u0004\u0002"+
		"\u0000PR\u0003\u0016\u000b\u0000QS\u0003\u000e\u0007\u0000RQ\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000S\r\u0001\u0000\u0000\u0000TZ\u0003"+
		"\u0010\b\u0000UV\u0003\u0010\b\u0000VW\u0005\u000b\u0000\u0000WX\u0003"+
		"\u000e\u0007\u0000XZ\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000"+
		"YU\u0001\u0000\u0000\u0000Z\u000f\u0001\u0000\u0000\u0000[\\\u0003\u0012"+
		"\t\u0000\\]\u0005\f\u0000\u0000]^\u0003\u0014\n\u0000^\u0011\u0001\u0000"+
		"\u0000\u0000_`\u0007\u0001\u0000\u0000`\u0013\u0001\u0000\u0000\u0000"+
		"ab\u0003 \u0010\u0000b\u0015\u0001\u0000\u0000\u0000cd\u0007\u0002\u0000"+
		"\u0000d\u0017\u0001\u0000\u0000\u0000ef\u0003\u001c\u000e\u0000fg\u0005"+
		"\u0015\u0000\u0000gh\u0003\u001e\u000f\u0000h\u0019\u0001\u0000\u0000"+
		"\u0000ij\u0007\u0003\u0000\u0000j\u001b\u0001\u0000\u0000\u0000kl\u0007"+
		"\u0004\u0000\u0000l\u001d\u0001\u0000\u0000\u0000mn\u0007\u0005\u0000"+
		"\u0000n\u001f\u0001\u0000\u0000\u0000oq\u0003\"\u0011\u0000po\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000s!\u0001\u0000\u0000\u0000tu\u0007\u0006\u0000\u0000"+
		"u#\u0001\u0000\u0000\u0000\u00070<CMRYr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}