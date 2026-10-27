package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TwentyThree_CheckColor {
    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();
        try{

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://www.aadagam.com/");

            WebElement ButtonColor = driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[1]/a[3]"));

            String ButtonTextColor = ButtonColor.getCssValue("color");

            String text = ButtonColor.getCssValue("background-color");  //Pick Background color

            System.out.println(text);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
