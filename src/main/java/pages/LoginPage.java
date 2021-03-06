package pages;

import core.BasePage;
import core.DriverFactory;
import org.openqa.selenium.By;

import static core.DriverFactory.getDriver;

public class LoginPage extends BasePage {

    public void acessarTelaInicial(){
        getDriver().get("https://seubarriga.wcaquino.me");
    }

    public void setEmail(String email){
        escrever("email", email);
    }

    public void setSenha(String senha){
        escrever("senha", senha);
    }

    public void entrar(){
        clicarBotao(By.xpath("//button[.='Entrar']"));
    }
}
