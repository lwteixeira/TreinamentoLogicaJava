package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framawork.TestBase;
import Tasks.CheckoutTask;
import Tasks.LoginTask;
import Tasks.OverviewTask;
import Tasks.ProductTask;

public class RealizarCompraComSucessoTest extends TestBase{ 

    private WebDriver driver = getDriverManager();
    
    LoginTask loginTask = new LoginTask(driver);
    ProductTask productTask = new ProductTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    OverviewTask overviewTask = new OverviewTask(driver);
    
    @Test
    public void realizarCompra() {
        loginTask.efetuarLogin();
        productTask.selecionarProduto();
        checkoutTask.efetuarCheckout();
        overviewTask.finalizaCompra();
    }
    
}
