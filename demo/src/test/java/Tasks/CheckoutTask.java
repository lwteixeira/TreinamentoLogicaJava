package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutPage;
import Validation.GenericValidation;

public class CheckoutTask {

    private WebDriver driver;
    private CheckoutPage checkPage;
    private GenericValidation genericValidation;
    
    public CheckoutTask(WebDriver driver) {
        this.driver = driver;
        checkPage = new CheckoutPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
    }
    
    public void efetuarCheckout() {
        genericValidation.validationPages("Checkout: Your Information");
        checkPage.getInputFirstName().sendKeys("Teste");
        checkPage.getInputLastName().sendKeys("Compras");
        checkPage.getInputPostalCode().sendKeys("00000-001");
        checkPage.getInputButtonContinue().click();
    }
}
