package Validation;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import Framawork.Utils.FileOperation;
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
    
    public void validationFieldsForm() {
        String name = FileOperation.getProperties("form").getProperty("name");
        String lastName = FileOperation.getProperties("form").getProperty("lastname");
        String zipCode = FileOperation.getProperties("form").getProperty("zip");
        Assertions.assertEquals(name, checkPage.getInputFirstName().getAttribute("value"));
        Assertions.assertEquals(lastName, checkPage.getInputLastName().getAttribute("value"));
        Assertions.assertEquals(zipCode, checkPage.getInputPostalCode().getAttribute("value"));
    }
    
}
