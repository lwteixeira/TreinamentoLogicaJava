package Report;

import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;

import Framawork.Utils.CreateFolders;
import Framawork.Utils.DateTime;

public class Screenshot {

    
    private static final String PATH_SCREENSHOT = 
            ReportFactory.PATH_REPORT + File.separator + "Screenshot";
    
    public static Media capture(WebDriver driver) {
        try {
            CreateFolders.createFolderRepost(PATH_SCREENSHOT);
            File srshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String screenshot = PATH_SCREENSHOT + File.separator + "Image_" + DateTime.getDateTimeFormatScreemshot();
            FileUtils.copyFile(srshot, new File(screenshot));
            return MediaEntityBuilder.createScreenCaptureFromPath(screenshot).build();
        } catch (Exception e) {
            // TODO: handle exception
            String message = "Ocorreu um erro ao capturar a tela: " + e.getMessage();
        }
        return null;
    }
    
    public static Media captureBase64(WebDriver driver) {
        try {
            PageSnapshot screenshot = Shutterbug.shootPage(driver);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            ImageIO.write(screenshot.getImage(), "png", stream);
            String base64Img = Base64.encodeBase64String(stream.toByteArray());
            return MediaEntityBuilder.createScreenCaptureFromBase64String(base64Img).build();
        } catch (Exception e) {
            // TODO: handle exception
            String message = "Ocorreu um erro ao capturar a tela: " + e.getMessage();
        }
        
        return null;
    }
    
}
