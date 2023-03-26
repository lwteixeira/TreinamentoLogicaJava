package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.OverviewPage;
import Validation.GenericValidation;
import Validation.OverviewValidation;

public class OverviewTask {

	private WebDriver driver;
    private OverviewPage overviewPage;
    private GenericValidation genericValidation;
    private OverviewValidation overviewValidation;
    
    public OverviewTask(WebDriver driver) {
        this.driver = driver;
        overviewPage = new OverviewPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        overviewValidation = new OverviewValidation(this.driver);
    }
	
	public void finalizaCompra() {
		genericValidation.validationPages("Checkout: Overview");
		overviewValidation.validationTotalPrince("Total: $32.39");
		overviewPage.getButtonFinish().click();
		overviewValidation.validationFinishCompraImg();
		overviewValidation.validationTextFinish("Thank you for your order!");
		overviewPage.getButtonBackHome().click();
		genericValidation.validationPages("Products");
	}
	
	
}
