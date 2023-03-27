package TestCases;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;

import Framawork.TestBase;
import Framawork.Browse.Waits;
import Tasks.CheckoutTask;
import Tasks.LoginTask;
import Tasks.OverviewTask;
import Tasks.ProductTask;

public class RealizarCompraComSucessoDataClassTest extends TestBase{

    private WebDriver driver = getDriverManager();

    LoginTask loginTask = new LoginTask(driver);
    ProductTask productTask = new ProductTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    OverviewTask overviewTask = new OverviewTask(driver);
    Waits wait = new Waits(driver);


    
    @ParameterizedTest
    @MethodSource("Framawork.Utils.DataClass#loginTestData")
    public void realizarCompra(String user, String password) {
        loginTask.efetuarLoginParametrizado(user,password);
        productTask.selecionarProduto();
        checkoutTask.efetuarCheckout();
        overviewTask.finalizaCompra();
    }

}