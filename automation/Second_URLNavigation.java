package base.web.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_URLNavigation {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.aadagam.com/");
        driver.navigate().back();
        Thread.sleep(1500);     // stops the google.com 1500 milliseconds. It's needs exception to handle the errors
        driver.navigate().forward();
        driver.navigate().refresh();



    }
}
