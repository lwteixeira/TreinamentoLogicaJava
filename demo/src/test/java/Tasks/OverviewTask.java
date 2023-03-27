package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Framawork.Browse.Waits;
import PageObjects.LoginPage;
import PageObjects.OverviewPage;
import Validation.GenericValidation;
import Validation.LoginValidation;
import Validation.OverviewValidation;


public class OverviewTask {

    private WebDriver driver;
    private OverviewPage overviewPage;
    private GenericValidation genericValidation;
    private OverviewValidation overviewValidation;
    private Waits wait;
    private LoginPage loginPage;
    private LoginValidation loginValidation;
    
    public OverviewTask(WebDriver driver) {
        this.driver = driver;
        overviewPage = new OverviewPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        overviewValidation = new OverviewValidation(this.driver);
        wait = new Waits(this.driver);
        loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }
    
    public void finalizaCompra() {
        genericValidation.validationPages("Checkout: Overview");
        genericValidation.validationProduto();
        overviewPage.getButtonFinish().click();
        overviewValidation.validationTextFinish("Thank you for your order!");
        overviewPage.getButtonMenuLogout().click();
        overviewPage.getLogoutLink().click();
        wait.loadElement(loginPage.getLogoText());
        loginValidation.validationLoginPage();
    }
    
    
}