package TestCases;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import Framawork.TestBase;
import Framawork.Browse.Waits;
import Tasks.CheckoutTask;
import Tasks.LoginTask;
import Tasks.OverviewTask;
import Tasks.ProductTask;

public class RealizarCompraComSucessoCSVTest extends TestBase{

    private WebDriver driver = getDriverManager();

    LoginTask loginTask = new LoginTask(driver);
    ProductTask productTask = new ProductTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    OverviewTask overviewTask = new OverviewTask(driver);
    Waits wait = new Waits(driver);


    
    @ParameterizedTest
    @CsvFileSource(resources = "/CSV/user.csv", numLinesToSkip = 1)
    public void realizarCompra(String user, String password) {
        loginTask.efetuarLoginParametrizado(user,password);
        productTask.selecionarProduto();
        checkoutTask.efetuarCheckout();
        overviewTask.finalizaCompra();
    }

}