package base.web.automation.BuildTheXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath_3 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        try{
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.instagram.com/");

            WebElement UserName = driver.findElement(By.xpath("//input[@type='text' and @name='email']"));  //Find the xpath using and condition.
            UserName.sendKeys("Ken1999@gmail.com");

            WebElement PassWord = driver.findElement(By.xpath("//input[@name='pass']"));
            PassWord.sendKeys("Goat@1234");

            WebElement Login = driver.findElement(By.xpath("//span[text()='Log in']"));
            Login.click();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
