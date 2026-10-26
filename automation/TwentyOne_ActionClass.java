package base.web.automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class TwentyOne_ActionClass {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://ganeshsadagopan.github.io/Actions/");

            Actions action = new Actions(driver);  // Initialize  the action class by passing webdriver instance constructor.


            WebElement drag = driver.findElement(By.id("dragBox"));
            WebElement drop = driver.findElement(By.id("dropArea"));

            action.dragAndDrop(drag,drop)  // Define actions object(Use methods as click, doubleClick()).
                    .perform();    // Execute the action.

            WebElement DoubleClick = driver.findElement(By.id("doubleClickBtn"));
            action.doubleClick(DoubleClick).build().perform();

            Alert alert = driver.switchTo().alert();
            alert.accept();

            WebElement RightClick = driver.findElement(By.id("rightClickArea"));
            action.contextClick(RightClick).perform();

            WebElement NameBox = driver.findElement(By.id("nameBox"));
            action.click(NameBox).sendKeys("baskar").perform();

            action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
            action.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).perform();
            action.click(NameBox).sendKeys("selva").perform();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

/*

Action class:

    -> The action class in selenium webdriver is used to perform advance user interactions
    such as mouse movements and keyboard operations, drag and drop, double click and right clicking.

    -> It is part of the org.selenium.interactions package.

 */