package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.HomePage;
import pages.ProdutoPage;

public class VoltarBackSteps extends BaseSteps
{
  HomePage homelist = new HomePage();
  ProdutoPage clickback = new ProdutoPage();

    @Dado("que o usuario esta logado no site Swag Labs")
    public void que_o_usuario_esta_logado_no_site_swag_labs()
    {
       homelist.productspage();
       screenshot();
    }

    @E("o usuario clica no item de compra")
    public void o_usuario_clica_no_item_de_compra() throws InterruptedException {
       homelist.clickProduto();
       Thread.sleep(1000);

    }

    @E("o sistema redireciona para a pagina do produto")
    public void o_sistema_redireciona_para_a_pagina_do_produto()
    {
        screenshot();
    }

    @Quando("o usuario clicar no botao ‘Back’")
    public void o_usuario_clicar_no_botao_back() throws InterruptedException {
       clickback.clickBotao();
       Thread.sleep(1000);

    }

    @Entao("o sistema redireciona para a pagina inicial.")
    public void o_sistema_redireciona_para_a_pagina_inicial()
    {
        String esperado = "Products";
        String naTela = homelist.showTitutloPage();
        Assert.assertEquals(esperado, naTela);
        System.out.println(naTela);
        screenshot();
    }

}
