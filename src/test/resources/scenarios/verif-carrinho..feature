#language: pt
Funcionalidade:  Carrinho de compras

  @teste1 @reset
    Cenario: Adicionar item da lista de produtos ao carrinho e verificar se esta la
    Dado que o usuario esta logado no site Swag Labs e ao estar na pagina de lista de produtos
    Quando o usuario clicar no botao ‘Add to cart’
    E o usuario clica no botao carrinho
    Entao o sistema redireciona para a pagina com o item selecionado.