package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import Validation.LoginValidation;

public class LoginTask {

    private WebDriver driver;
    private LoginPage login;
    private LoginValidation loginValidation;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        login = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }

    public void efetuarLogin() {
        loginValidation.validationLoginPage();
        login.getUserNameInput().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getButtonLogin().click();
    }

}
