@run
Feature: Test a simple CRUD Process with Selenium

  Scenario: A user are on Agapito Software Testing page
    Given POST - A user want to add a item
    And The user click on menu "processos"
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
    And The user click "Sim" radio button
    And The user click on field "processo_observacao" and set value "processo observacao"
    When The user click on button "btn-save" to save
    Then The user should see the message "Processo foi criado com sucesso."

    Given  GET - A user want to see a item details
    And The user click on menu "processos"
    When The user click on button Mostrar of list with id "6"
    Then The user should see the details os process

    Given PUT - A user want to update a item
    And The user click on menu "processos"
    And The user click on button Editar of item with id "461"
    And The user click on field "processo_vara" and set value "50"
    And The user click on field "processo_numero_processo" and set value "5050"
    And The user click on field "processo_natureza" and set value "Guardar"
    When The user click on button "btn-save" to save
    Then The user should see the message "Processo atualizado com sucesso."

    Given DELETE - A user want to delete a item
    And The user click on menu "processos"
    When user press button Apagar of item with id "338"
    Then The item with id "338" should not exist