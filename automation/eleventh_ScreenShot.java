package base.web.automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.nio.file.Files;

public class eleventh_ScreenShot {
    public static void main(String[] args){

        try {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");

            TakesScreenshot screenshot = (TakesScreenshot)driver;
            File ScreenShotFile = screenshot.getScreenshotAs(OutputType.FILE);  // Temporary screenshot captured by selenium.

            File Source = new File("D:\\ScreenShot\\GoogleHome.png"); // The final screenshot file on our D drive.


            Files.copy(ScreenShotFile.toPath(),Source.toPath(),java.nio.file.StandardCopyOption.REPLACE_EXISTING);

        }catch (Exception e){
           e.printStackTrace();
        }
    }
}



/*

    -> We can take a screenshot by each element using getscreenshotAs.
    -> This place we don't need a TakeScreenshot type casting.

               WebElement search = driver.findElement(By.id("ti6dpd"));

            File Screenshot = search.getScreenshotAs(OutputType.FILE);

            File Source = new File("D:\\ScreenShot\\GoogleSearchBtn.png");

            Files.copy(Screenshot.toPath(),Source.toPath(),java.nio.file.StandardCopyOption.REPLACE_EXISTING);

    2.57.31

 */