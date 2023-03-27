package Validation;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutPage;


public class CheckoutValidation {

    private WebDriver driver;
    private CheckoutPage checkPage;
    
    public CheckoutValidation(WebDriver driver) {
        this.driver = driver;
        checkPage = new CheckoutPage(this.driver);
    }
    
    public void validationInputPostalCode() {
        Assertions.assertFalse(checkPage.getInputPostalCode().getAttribute("value").equalsIgnoreCase(" "));
    }
    
    
}
