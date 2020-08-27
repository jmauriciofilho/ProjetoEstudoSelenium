package pages;

import core.BasePage;
import core.DriverFactory;

import static core.DriverFactory.getDriver;

public class LoginPage extends BasePage {

    public void acessarTelaInicial(){
        getDriver().get("https://seubarriga.wcaquino.me");
    }
}
