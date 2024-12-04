package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class ProdutoPage extends BasePages
{
    private String url = "https://www.saucedemo.com/v1/inventory.html";
    private By addpurchase = By.xpath("(/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button)[1]");
    private By cart= By.cssSelector("#shopping_cart_container > a > svg > path");


    public void syti()
    {
        driver.get(url);
    }

    public void btnAdicionar() throws InterruptedException
    {
        driver.findElement(addpurchase).click();
        Thread.sleep(1000);
    }

    public void btncarrinho()
    {
        driver.findElement(cart).click();
    }
}
