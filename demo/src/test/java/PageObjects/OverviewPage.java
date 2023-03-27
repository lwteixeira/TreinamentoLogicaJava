package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framawork.Browse.Waits;

public class OverviewPage {

private WebDriver driver;
private Waits wait;
    
    public OverviewPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new Waits(driver);
        
    }
    
    public WebElement getTotalPrince () {
        return driver.findElement(By.className("summary_total_label"));
    }
    
    public WebElement getButtonFinish() {
        return driver.findElement(By.id("finish"));
    }
    
    public WebElement getImgFinishOk() {
        return driver.findElement(By.className("pony_express"));
    }
    
    public WebElement getTextFinishCompra() {
        return driver.findElement(By.xpath("//div[@id='checkout_complete_container']/h2"));
    }
    
    public WebElement getButtonBackHome() {
        return driver.findElement(By.id("back-to-products"));
    }
    
    public WebElement getButtonMenuLogout() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }
    
    public WebElement getLogoutLink(){
        return wait.visibilitOfElement(By.id("logout_sidebar_link"));
    }

}
