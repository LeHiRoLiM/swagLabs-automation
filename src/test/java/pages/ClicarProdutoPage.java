package pages;

import config.baseclass.BasePages;
import org.openqa.selenium.By;

public class ClicarProdutoPage extends BasePages
{
    private String synti = "https://www.saucedemo.com/v1/index.html";
    private By usuario = By.id("user-name");
    private By pin = By.id("password");
    private By btn = By.id("login-button");

    public void syti()
    {
        driver.get(synti);
    }

    public void usernamen(String texto)
    {
        driver.findElement(usuario).click();
        driver.findElement(usuario).sendKeys(texto);
    }

    public void senha(String texto)
    {
        driver.findElement(pin).click();
        driver.findElement(pin).sendKeys(texto);
        driver.findElement(btn).click();
    }
}
