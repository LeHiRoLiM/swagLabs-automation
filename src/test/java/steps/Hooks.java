package steps;

import config.baseclass.BaseSteps;
import io.cucumber.java.*;

public class Hooks extends BaseSteps
{
    private static int contaTeste = 1;

    @Before
    public static void antesDoTeste(Scenario _scenario)
    {
        scenario = _scenario;
    }

    @After
    public static void depoisDoTeste()
    {
        contaTeste++;
        if(scenario.isFailed())
            screenshot();
    }

    @Before("@reset")
    public static void resetarBrowser() throws Exception
    {
        if(contaTeste > 1)
        {
            fecharBrowser();
            abrirBrowser();
        }
    }

    @BeforeAll
    public static void antesDeTudo() throws Exception
    {
        abrirBrowser();
    }

    @AfterAll
    public static void depoisDeTudo()
    {
        fecharBrowser();
    }
}
