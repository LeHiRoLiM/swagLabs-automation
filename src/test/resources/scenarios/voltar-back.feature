#language: pt
Funcionalidade:  Voltar a pagina inicial

  @teste1 @reset
    Cenario: Clicar no botao back
      Dado que o usuario esta logado no site Swag Labs
      E o usuario clica no item de compra
      E o sistema redireciona para a pagina do produto
      Quando o usuario clicar no botao ‘Back’
      Entao o sistema redireciona para a pagina inicial.