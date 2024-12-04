package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class CarrinhoPage extends BasePages
{
    private By titulo = By.cssSelector("#contents_wrapper > div.subheader");

    public String msgTela()
    {
        return driver.findElement(titulo).getText();

    }
}
