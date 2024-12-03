package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class HomePage extends BasePages
{
    private String swag = "https://www.saucedemo.com/v1/inventory.html";
    private By item = By.cssSelector("#item_4_title_link > div");
    private By titulo = By.cssSelector("#inventory_filter_container div");

    public void productspage()
    {
        driver.get("https://www.saucedemo.com/v1/inventory.html");
    }
    public void clickProduto()
    {
        driver.findElement(item).click();
    }
    public String showTitutloPage()
    {
        return driver.findElement(titulo).getText();
    }
}
