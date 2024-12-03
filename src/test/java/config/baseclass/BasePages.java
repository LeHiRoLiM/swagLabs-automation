package config.baseclass;

import org.openqa.selenium.WebDriver;

public class BasePages
{
    protected WebDriver driver;

    public BasePages()
    {
        this.driver = BaseSteps.browser;
    }
}
