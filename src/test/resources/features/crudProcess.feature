  @run
  Feature: Test a simple CRUD of Process

    Background:
      Given A user are on Process page

    Scenario A user are on Agapito Software Testing page
      And o usuario clica no menu "processos"
      And o usuario clica no botao novo processo
      And o usuario clica no campo "processo_vara" o valor "1"
      And o usuario clica no campo "processo_numero_processo" o valor "12314"
      And o usuario clica no campo "processo_natureza" o valor "Guarda"
      And o usuario clica no campo "processo_data_entrada" o valor "04/03/2020"
      And o usuario clica no campo "processo_assistente_social" o valor "assistente"
      And o usuario clica no campo "processo_data_agendamento" o valor "Agendado"
      And o usuario clica no campo "processo_partes" o valor "Joao X Maria"
      And o usuario clica no campo "processo_status" o valor "inicial"
      And o usuario selecionar o campo urgente com valor "Sim"
      And o usuario clica no campo "processo_observacao" o valor "processo observacao"
      And o usuario clica no campo processo_arbitramento_s com valor "Sim"
    When o usuario clicar no botao "btn-save" salvar
    Then usuario deveria visualizar a mensagem "Processo foi criado com sucesso."

   Scenario Outline:  GET - Display the list of exist Items
      And list of ids should be "<id>"
      When user click on view
      Then A message should be display "<message>"

      Examples:
      | id | message |
      | 40 | Success |
      | 35454 | Not Found |

    Scenario: PUT - Update a Item with the next information
      And view the Item with id "40"
      And field "vara" with value "34"
      And field "status" with value "Agendada"
      And field "observacao" with value "Pronta"
      When user press Update
      Then A message should be display "Success"
      And The field "vara" by value "34" should be return for user

    Scenario: DELETE - Remove a Item
      And view the Item with id "11"
      When user press Delete
      And user click on view
      Then A message should be display "Not Found"