package base.web.automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class twentieth_CheckIframe {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        try{
            driver.get("https://practice-automation.com/iframes/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            JavascriptExecutor Js = (JavascriptExecutor) driver;

            WebElement Iframe = driver.findElement(By.id("iframe-2"));

            driver.switchTo().frame(Iframe);    // Switch Iframe via ID or Name or we can use Index based one. This method is not recommended one.

            WebElement Searchbar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"docsearch-1\"]/button/span[1]/span")));
            Js.executeScript("arguments[0].click()",Searchbar);

            System.out.println("search bar is clicked");

            WebElement Input = driver.findElement(By.id("docsearch-input"));
            Input.sendKeys("Working with IFrames and frames");

            System.out.println("Iframe searched");

            WebElement result = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Working")));

            Js.executeScript("arguments[0].scrollIntoView({block:'center'})",result);

            Js.executeScript("arguments[0].click()",result);

            System.out.println("Content has been printed");

            driver.switchTo().defaultContent();     // Switch back to Parent or main page. and another method is,driver.switchTo().parentFrame();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
//4.28.28

/*

Iframe:

        -> An Iframe(Inline Inframe) is a HTML element that allows one webpage to
        be displayed inside another webpage.

        Example:

            -> Payment gateway
            -> Embedded YouTube videos
            -> Google Maps
            -> Chat widgets
            -> Embedded document viewers

Why we need to switch into Iframe:

    -> Selenium initially interact with the main webpage document.

    -> When an element belongs to an Ifrmae, selenium cannot locate it directly from the main
    document. We must switch selenium's browsing context into that Iframe first.

    -> Without switching it's throws the NOSuchElementException.

 */