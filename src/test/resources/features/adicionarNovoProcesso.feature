#language: pt

  Funcionalidade: Adicionar um Novo procrsso.

    Cenario: Adicionar um novo processo com sucesso.

      Dado que um usuario esta na pagina Agapito Software Testing
      E o usuario clica no menu "processos"
      E o usuario clica no botao novo processo
      E o usuario clica no campo "processo_vara" o valor "1"
      E o usuario clica no campo "processo_numero_processo" o valor "12314"
      E o usuario clica no campo "processo_natureza" o valor "Guarda"
      E o usuario clica no campo "processo_data_entrada" o valor "04/03/2020"
      E o usuario clica no campo "processo_assistente_social" o valor "assistente"
      E o usuario clica no campo "processo_data_agendamento" o valor "Agendado"
      E o usuario clica no campo "processo_partes" o valor "Joao X Maria"
      E o usuario clica no campo "processo_status" o valor "inicial"
      E o usuario clica no campo "processo_observacao" o valor "processo observacao"
      E o usuario selecionar o campo urgente com valor "Sim"
      E o usuario clica no campo processo_arbitramento_s com valor "Sim"
      Quando o usuario clicar no botao "btn-save" salvar
      Entao usuario deveria visualizar a mensagem "Processo foi criado com sucesso."
      Quando o usuario clicar no voltar
      Então o usuario deveria ver o texto "Joao X Maria"