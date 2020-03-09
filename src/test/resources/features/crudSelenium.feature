  @run
  Feature: Test a simple CRUD Process with Selenium

    Scenario POST - A user are on Agapito Software Testing page to add a item
      And the user click on menu "processos"
      And The user click on button novo processo
      And The user click on field "processo_vara" and set value "1"
      And The user click on field "processo_numero_processo" and set value "12314"
      And The user click on field "processo_natureza" and set value "Guarda"
      And The user click on field "processo_data_entrada" and set value "04/03/2020"
      And The user click on field "processo_assistente_social" and set value "assistente"
      And The user click on field "processo_data_agendamento" and set value "Agendado"
      And The user click on field "processo_partes" and set value "Joao X Maria"
      And The user click on field "processo_status" and set value "inicial"
      And The user select "Sim" value on urgente field
      And The user click on field "processo_observacao" and set value "processo observacao"
      And The user click "Sim" radio button
    When The user click on button "btn-save" to save
    Then The user should see the message "Processo foi criado com sucesso."

   Scenario  GET - A user are on Agapito Software Testing page to see a item details
     And The user click on menu "processos"
     And The user click on button Mostrar
     When user select the item o list with id "6"
     Then the user should see the details os process

    Scenario: PUT - A user are on Agapito Software Testing page to update a item
      And the user click on menu "processos"
      And The user click on button Editar of item with id "7"
      And The user click on field "processo_vara" and set value "50"
      And The user click on field "processo_numero_processo" and set value "5050"
      And The user click on field "processo_natureza" and set value "Guardar"
      When The user click on button "btn-save" to save
      Then The user should see the message "Processo atualizado com sucesso."

    Scenario: DELETE - A user are on Agapito Software Testing page to delete a item
      And the user click on menu "processos"
      When user press button Apagar of item with id "7"
      Then The user should see the message "Processo atualizado com sucesso."