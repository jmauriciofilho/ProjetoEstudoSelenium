package pages;

import core.BasePage;
import org.openqa.selenium.By;

public class ContasPage extends BasePage {

    public void setNome(String nome){
        escrever("nome", nome);
    }

    public void salvar(){
        clicarBotao(By.xpath("//button[.='Salvar']"));
    }

    public String obterMensagemSuccess(){
        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }
}
