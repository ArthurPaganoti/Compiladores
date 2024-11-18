grammar Bcc;

programa
    : lista_dispositivos lista_agendamentos lista_rotinas
    ;

lista_dispositivos
    : 'dispositivos:' dispositivo ';'
    | dispositivo ';' lista_dispositivos
    ;

dispositivo
    : 'ar_condicionado'
    | 'tv'
    | 'luz'
    | 'computador'
    | 'videogame'
    | 'caixa_de_som'
    ;

lista_agendamentos
    : 'agendamento:' agendamento ';'
    | agendamento ';' lista_agendamentos
    ;

agendamento
    : hora dia dispositivo acao configuracoes?
    ;

lista_rotinas
    : 'rotina:' rotina ';'
    | rotina ';' lista_rotinas
    ;

rotina
    : dispositivo acao configuracoes?
    ;

configuracoes
    : configuracao (',' configuracao)*
    ;

configuracao
    : chave_config '=' valor_config
    ;

chave_config
    : 'temperatura'
    | 'canal'
    | 'volume'
    | 'cor'
    | 'intensidade'
    ;

valor_config
    : inteiro
    ;

acao
    : 'ligar'
    | 'desligar'
    | 'configurar'
    ;

hora
    : horas ':' minutos
    ;

dia
    : 'Segunda'
    | 'Terca'
    | 'Quarta'
    | 'Quinta'
    | 'Sexta'
    | 'Sabado'
    | 'Domingo'
    ;

horas
    : '00' .. '23'
    ;

minutos
    : '00' .. '59'
    ;

inteiro
    : digito+
    ;

digito
    : '0' .. '9'
    ;