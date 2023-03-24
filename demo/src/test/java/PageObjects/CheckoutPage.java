package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    private WebDriver driver;
    
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
 
    public WebElement getInputFirstName() {
        return driver.findElement(By.id("first-name"));
    }
    
    public WebElement getInputLastName() {
        return driver.findElement(By.id("last-name"));
    }
    
    public WebElement getInputPostalCode() {
        return driver.findElement(By.id("postal-code"));
    }
    
    public WebElement getInputButtonContinue() {
        return driver.findElement(By.id("continue"));
    }
    
}
