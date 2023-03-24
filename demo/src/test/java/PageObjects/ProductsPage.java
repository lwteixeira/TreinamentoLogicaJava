package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

    private WebDriver driver;
    
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebElement getIdLinkBackpack() {
        return driver.findElement(By.id("item_4_title_link"));
    }
    
    public WebElement getButtonAddProduct() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    
    public WebElement getButtonEnterCart() {
        return driver.findElement(By.className("shopping_cart_link"));
    }
    
    public WebElement getButtonCheckout() {
        return driver.findElement(By.id("checkout"));
    }

    
}
