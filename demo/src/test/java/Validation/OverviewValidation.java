package Validation;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.OverviewPage;

public class OverviewValidation {

    private WebDriver driver;
    private OverviewPage overviewPage;
    
    public OverviewValidation(WebDriver driver) {
        this.driver = driver;
        overviewPage = new OverviewPage(this.driver);
    }
    
    public void validationTotalPrince(String texto) {
        Assertions.assertEquals(texto, overviewPage.getTotalPrince().getText());
    }
    
    public void validationFinishCompraImg() {
        Assertions.assertTrue(overviewPage.getImgFinishOk().isDisplayed());
    }
    
    public void validationTextFinish(String texto) {
        Assertions.assertEquals(texto, overviewPage.getTextFinishCompra().getText());
    }
    
}