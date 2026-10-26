package base.web.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fourth_WindowHandling {
    public static void main(String[] args){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.aadagam.com/");

        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();
    }
}
