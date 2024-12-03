package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class ProdutoPage extends BasePages
{
    private By btn = By.cssSelector("#inventory_item_container button");

    public void clickBotao()
    {
        driver.findElement(btn).click();
    }
}
