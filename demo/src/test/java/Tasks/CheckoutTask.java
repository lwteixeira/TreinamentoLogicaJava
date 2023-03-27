package Tasks;

import org.openqa.selenium.WebDriver;

import Framawork.Utils.FakersGenerations;
import PageObjects.CheckoutPage;
import Validation.CheckoutValidation;
import Validation.GenericValidation;

public class CheckoutTask {

    private WebDriver driver;
    private CheckoutPage checkPage;
    private GenericValidation genericValidation;
    private FakersGenerations faker;
    private CheckoutValidation checkValidation;
    
    public CheckoutTask(WebDriver driver) {
        this.driver = driver;
        checkPage = new CheckoutPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        faker = new FakersGenerations();
        checkValidation = new CheckoutValidation(this.driver);
    }
    
    public void efetuarCheckout() {
        genericValidation.validationPages("Checkout: Your Information");
        checkPage.getInputFirstName().sendKeys(faker.getFirstName());
        checkPage.getInputLastName().sendKeys(faker.getLastName());
        checkPage.getInputPostalCode().sendKeys(faker.getZipCode());
        checkValidation.validationInputPostalCode();
        checkPage.getInputButtonContinue().click();
    }
}