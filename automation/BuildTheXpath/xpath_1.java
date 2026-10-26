package base.web.automation.BuildTheXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpath_1 {


    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.aadagam.com/admin");

        WebElement UserName = driver.findElement(By.xpath("//input[@placeholder='e.g. manager@yourbrand.com']"));
        UserName.sendKeys("Vannakama da pulla");


        WebElement Password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
        Password.sendKeys("1234 da puyaluga");

        WebElement click = driver.findElement(By.xpath("//span[text()='Sign In']"));
        click.click();



    }

   

    /*

    Syntax:

        //tagname[@attribute='value'];    -> relative xpath syntax

        //input[@placeholder='e.g. manager@yourbrand.com']

        Element visible text
        ----------------------
        //span[text()='Sign In']            ----> Exact text
        //span[contains(text(),'Sign In')]  -----> partial text
        //span[starts-with(text(),'Sign In')]   ----> starts with

        Attribute text
        ------------------
        //input[contains(@type,'email')]
        //input[starts-with(@type,'password')]

     */


}