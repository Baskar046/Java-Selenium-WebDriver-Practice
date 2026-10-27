package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TwentyFour_AuthenticationPopUp {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        try{

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://vinothqaacademy.com/basic-auth-demo/");

            WebElement Button = driver.findElement(By.xpath("/html/body/a"));
            Button.click();

            String UserName = "admin";
            String PassWord = "vinothqa";

            String URL = "https://"+UserName+":"+PassWord+"@"+"vinothqaacademy.com/basic-auth-demo/protected/";
            driver.get(URL);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


/*

This Method is only testing environment not for production.

 */