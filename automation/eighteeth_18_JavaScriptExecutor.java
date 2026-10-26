package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class eighteeth_18_JavaScriptExecutor {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
try {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    JavascriptExecutor Js = (JavascriptExecutor) driver;    // Type casting because JavaScriptExecutor is an interface.

    driver.get("https://www.flipkart.com/");

   WebElement Cancel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/span")));
    Js.executeScript("arguments[0].click()", Cancel);   //Click an element using JavaScript (arguments[0] represents the first argument passed from Java)

    WebElement LoginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));
    Js.executeScript("arguments[0].click()",LoginBtn);

    WebElement MobileNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("1")));
    Js.executeScript("arguments[0].value='9585793403'", MobileNumber);  //Enter a value into a field.

    System.out.println("Mobile number entered successfully");

    WebElement ContinueBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div[2]/div/div/div[3]/div/button")));
    Js.executeScript("arguments[0].click()",ContinueBtn);

    System.out.println("Button pressed successfully");

}catch (Exception e){
    System.out.println(e.getMessage());
} finally {
    driver.quit();
}
    }
}


/*

    -> JavaScriptExecutor is an interface in selenium that allows us to execute JavaScript code
directly inside a web browser using Java.

When we JavaScriptExecutor:

        -> Selenium cannot interact with an element normally becuase of a page design,
        scrolling issue, or a particular browser-side behavior. In those cases, JavaScriptExectuor can help.

executeScript() -> execute JavaScript immediately in the current page.

executeAsyncScript() -> executes asynschronous JavaScript and waits for its completion callback, subject to selenium script timeout.

Where and When do we use it:

    -> Scroll the webpage.(When a button or section is located at the bottom of a long wepage, Javascript can scroll to it)

    -> Click an element using JavaScript

    -> Enter a value into a field.

Explanation for this question:

        -> In my automation testing projects, I have used JavaScript Executor in Selenium when standard WebDriver interactions were not sufficient for a particular UI scenario.

        -> For example, in an e-commerce application, I used JavaScript to scroll to elements located at the bottom of the page.
            I have also used it to highlight elements during debugging, inspect browser-side properties, and check the document loading state.

        -> When a normal Selenium click fails, I first investigate the reason, such as an overlay, synchronization issue, or element visibility problem.
        If JavaScript interaction is appropriate, I may use JavaScript Executor as a workaround and verify that the expected application behavior occurs.

        -> I generally prefer standard WebDriver methods because they better represent real user interactions.
        I use JavaScript Executor selectively when there is a clear technical reason.

 */