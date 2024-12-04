package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.Transpose;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.CarrinhoPage;
import pages.ProdutoPage;

public class VerifCarrinhoSteps extends BaseSteps
{
    ProdutoPage verificarCompra = new ProdutoPage();
    CarrinhoPage verificaCart = new CarrinhoPage();

    @Dado("que o usuario esta logado no site Swag Labs e ao estar na pagina de lista de produtos")
    public void que_o_usuario_esta_logado_no_site_swag_labs_e_ao_estar_na_pagina_de_lista_de_produtos()
    {
       verificarCompra.syti();
       screenshot();
    }

    @Quando("o usuario clicar no botao ‘Add to cart’")
    public void o_usuario_clicar_no_botao_add_to_cart() throws InterruptedException
    {
        verificarCompra.btnAdicionar();
        screenshot();
    }

    @E("o usuario clica no botao carrinho")
    public void o_usuario_clica_no_botao_carrinhho()
    {
        verificarCompra.btncarrinho();
    }

    @Entao("o sistema redireciona para a pagina com o item selecionado.")
    public void o_sistema_redireciona_para_a_pagina_com_o_item_selecionado() throws InterruptedException {
        String esperado = "Your Cart";
        String naTela = verificaCart.msgTela();
        Assert.assertEquals(esperado, naTela);
        screenshot();
        Thread.sleep(1000);
    }
}
