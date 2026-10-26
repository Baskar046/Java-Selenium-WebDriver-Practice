package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class seventeenth_FluentWait {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        try{

            driver.get("https://courses.rahulshettyacademy.com/courses/17122/lectures/12037723");

            Wait<WebDriver> wait = new FluentWait<>(driver)     // we create a Fluent wait for Webdriver.
                    .withTimeout(Duration.ofSeconds(10))    // it's waits Maximum 10 seconds.
                    .pollingEvery(Duration.ofSeconds(2))    // Approximately every 2 seconds conditions check.
                    .ignoring(NoSuchElementException.class);    // if element is still not yet identified means, ignore exception for that ones

//            WebElement EnrollCourseBtn = driver.findElement(By.linkText("Enroll in Course to Unlock"));

            WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Enroll in Course to Unlock")));
            course.click();

            wait.until(ExpectedConditions.urlToBe("https://courses.rahulshettyacademy.com/p/selenium-webdriver-interview-questions-tutorial-1"));

            System.out.println("navigation successful");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            driver.quit();
        }

    }
}


/*

Fluent wait:

    -> It's selenium advanced wait mechanism that allows defining the maximum
                wait time,
                polling frequency and
                exception handling.

    -> It's repeatedly checks the elements at regular intervals until the condition is met.

    -> It's complex to implement

    -> Once we implement the fluent wait we don't need to implement separate wait for explicit ones.

                 -> WebDriverWait is a subclass of FluentWait.

                 -> when we use WebDriverWait, we can be able to use polling and ignored exceptions.

                 -> If FluentWait use, we don't need to create a WebDriverWait.


Where we use this one:

            -> Payment success confirmation.  (After we click the make payment, confirmation message will be displayed on top display)
            -> Login success message.



What is difference between Fluent and Explicit Wait:

    -> In Java, WebDriverWait is a subclass of FluentWait. That means Fluent Wait is not a completely separate waiting mechanism from Explicit Wait.
    -> Both use the same underlying polling approach.
    -> WebDriverWait provides a convenient WebDriver-specific implementation, while FluentWait gives you more direct control over its configuration

 */
