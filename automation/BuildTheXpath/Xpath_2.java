package base.web.automation.BuildTheXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Xpath_2 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        try {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.facebook.com/");

            //Using xpath using OR operator

            List<WebElement> LoginDetails = driver.findElements(By.xpath("//input[@name='pass' or @name='email']"));
            LoginDetails.get(0).sendKeys("Danny@123");
            LoginDetails.get(1).sendKeys("Danny@gmail.com");



        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
