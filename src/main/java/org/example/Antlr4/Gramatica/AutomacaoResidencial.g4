grammar AutomacaoResidencial;
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
    : configuracao
    | configuracao ',' configuracoes
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
    : '00' | '01' | '02' | '03' | '04' | '05' | '06' | '07'
    | '08' | '09' | '10' | '11' | '12' | '13' | '14' | '15'
    | '16' | '17' | '18' | '19' | '20' | '21' | '22' | '23'
    ;

minutos
    : '00' | '01' | '02' | '03' | '04' | '05' | '06' | '07'
    | '08' | '09' | '10' | '11' | '12' | '13' | '14' | '15'
    | '16' | '17' | '18' | '19' | '20' | '21' | '22' | '23'
    | '24' | '25' | '26' | '27' | '28' | '29' | '30' | '31'
    | '32' | '33' | '34' | '35' | '36' | '37' | '38' | '39'
    | '40' | '41' | '42' | '43' | '44' | '45' | '46' | '47'
    | '48' | '49' | '50' | '51' | '52' | '53' | '54' | '55'
    | '56' | '57' | '58' | '59'
    ;

inteiro
    : digito+
    ;

digito
    : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
    ;
