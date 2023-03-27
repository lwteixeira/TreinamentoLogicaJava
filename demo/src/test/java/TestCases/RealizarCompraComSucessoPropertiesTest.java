package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framawork.TestBase;
import Framawork.Browse.Waits;
import Framawork.Utils.FileOperation;
import Tasks.CheckoutTask;
import Tasks.LoginTask;
import Tasks.OverviewTask;
import Tasks.ProductTask;

public class RealizarCompraComSucessoPropertiesTest extends TestBase{ 

    private WebDriver driver = getDriverManager();
    
    LoginTask loginTask = new LoginTask(driver);
    ProductTask productTask = new ProductTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    OverviewTask overviewTask = new OverviewTask(driver);
    Waits wait = new Waits(driver);
    
    @Test
    public void realizarCompra() {
        String user = FileOperation.getProperties("user").getProperty("user");
        String password = FileOperation.getProperties("user").getProperty("password");
        loginTask.efetuarLoginParametrizado(user, password);
        productTask.selecionarProduto();
        checkoutTask.efetuarCheckout();
        overviewTask.finalizaCompra();
    }
  //FileOperation.getProperties("user").getProperty("user")
  //FileOperation.getProperties("user").getProperty("password") 
}