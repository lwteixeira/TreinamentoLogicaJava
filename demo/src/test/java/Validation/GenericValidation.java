package Validation;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.GenericPage;
import Report.Report;
import Report.Screenshot;


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
        try {
            Assertions.assertEquals(texto, genericPage.getHomeTextSpan().getText());
            Report.log(Status.PASS, "A pagina " + texto + " Foi acessado com sucesso.", Screenshot.captureBase64(driver));
        } catch (Exception e) {
            // TODO: handle exception
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
         
    }
    
    public void validationProduto() {
        try {
            Assertions.assertTrue(genericPage.getProductLabel().isDisplayed());
            Report.log(Status.PASS, "O Produto selecionado está correto.", Screenshot.captureBase64(driver));
        } catch (Exception e) {
            // TODO: handle exception
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
         
    }
        
    
    
}
