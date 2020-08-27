package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.ContasPage;
import pages.MenuPage;

public class ContaTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    ContasPage contasPage = new ContasPage();

    @Test
    public void testInserirConta(){
        menuPage.acessarTelaInserirConta();
        contasPage.setNome("Conta do Teste");
        contasPage.salvar();
        Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSuccess());
    }

    @Test
    public void testAlterarConta(){
        menuPage.acessarTelaListarContas();
        
    }
}
