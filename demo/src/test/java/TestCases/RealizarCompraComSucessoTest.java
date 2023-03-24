package TestCases;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framawork.TestBase;
import Tasks.LoginTask;
import Tasks.ProductTask;

public class RealizarCompraComSucessoTest extends TestBase{ 

    private WebDriver driver = getDriverManager();
    
    LoginTask loginTask = new LoginTask(driver);
    ProductTask productTask = new ProductTask(driver);
    
    @Test
    public void realizarCompra() {
        loginTask.efetuarLogin();
        productTask.selecionarProduto();
    }
    
}
