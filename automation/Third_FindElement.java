package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Third_FindElement {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://gooogle.com");

        //Find by ID
//        WebElement search = driver.findElement(By.id("ti6dpd"));

          //Find by Name
          //By NameObj =  By.name("q"); -> Internal process.
 //       WebElement search = driver.findElement(By.name("q"));


        //Find by className
//        WebElement search = driver.findElement(By.className("gLFyf"));

        //find by tagName
//        WebElement search = driver.findElement(By.tagName("textarea"));


        //Find by xpath
//        WebElement find  = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/form/div[1]/input")); // find full xpath
//        WebElement search = driver.findElement(By.xpath("//*[@id=\"ti6dpd\"]")); //relative xpath

        //Find by CSS selector
//        WebElement search = driver.findElement(By.cssSelector("#ti6dpd"));
        //search.sendKeys("abdul kalam");


        //Find by href click to redirect to next page
//        WebElement Link = driver.findElement(By.linkText("Images"));

        //click href link by partially name.

        WebElement Link = driver.findElement(By.partialLinkText("Im"));
        Link.click();
    }
}

//59.49
