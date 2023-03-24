package Validation;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.GenericPage;


public class GenericValidation {

    private WebDriver driver;
    private GenericPage genericPage;
    
    public GenericValidation(WebDriver driver) {
        this.driver = driver;
        genericPage = new GenericPage(this.driver);
    }
    /*
    public void validationPageProducts() {
        Assertions.assertEquals("Products", genericPage.getHomeTextSpan().getText());
    }*/
    
    public void validationPages(String texto) {
        Assertions.assertEquals(texto, genericPage.getHomeTextSpan().getText()); 
    }
    
    public void validationProduto() {
        Assertions.assertTrue(genericPage.getProductLabel().isDisplayed());
    }
    
}
