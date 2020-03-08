#language: pt


  Funcionalidade: Tela de login

    Cenario: Usuario valido e senha valida

      Dado que o usuario esta na pagina de login
      E o usuario preenche no campo "login" o valor "robson"
      E o usuario preenche no campo "password" o valor "agapito"
      Quando o usuario clicar no botao login
      Entao usuario deveria ver a mensagem de "success Login!"

      Dado que o usuario esta na pagina de login
      E o usuario preenche no campo "login" o valor "robson"
      E o usuario preenche no campo "password" o valor "password"
      Quando o usuario clicar no botao login
      Entao usuario deveria ver a mensagem de erro "erro Login!"
