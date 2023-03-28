package Framawork;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import Framawork.Browse.DriverManager;
import Framawork.Browse.TypeBrowser;
import Framawork.Utils.FileOperation;
import Report.Report;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class TestBase extends DriverManager{

    private static WebDriver driver;
    
    private static String URL = FileOperation.getProperties("url").getProperty("index");
    
    public static WebDriver getDriverManager () {
        driver = getDriver(TypeBrowser.CHROME);
        return driver;
    }
    
    @BeforeEach
    public void setup() {
        getDriverManager().get(URL);
    }
    
    @AfterEach
    public void finish() {
        Report.close();
        quitDriver();
    }
}
