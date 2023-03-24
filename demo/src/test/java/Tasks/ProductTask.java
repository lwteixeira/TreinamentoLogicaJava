package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.GenericPage;
import PageObjects.ProductsPage;
import Validation.GenericValidation;

public class ProductTask {

    private WebDriver driver;
    private ProductsPage prodPage;
    private GenericPage genericPage;
    private GenericValidation genericValidation;
    
    public ProductTask(WebDriver driver) {
        this.driver = driver;
        prodPage = new ProductsPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        genericPage = new GenericPage(this.driver);
    }
    
    public void selecionarProduto() {
        genericValidation.validationPages("Product");
        prodPage.getIdLinkBackpack().click();
        prodPage.getButtonAddProduct().click();
        prodPage.getButtonEnterCart().click();
        genericValidation.validationPages("Your Cart");
        genericValidation.validationProduto();
        prodPage.getButtonCheckout().click();
    }
    
    
    
}
