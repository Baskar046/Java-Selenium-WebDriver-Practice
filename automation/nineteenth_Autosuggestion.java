package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class nineteenth_Autosuggestion {
    public static void  main(String[] args){

        WebDriver driver = new ChromeDriver();

        try {

            JavascriptExecutor Js = (JavascriptExecutor)driver;
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://www.flipkart.com/");

            WebElement Cancel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[5]/div/span")));
            Cancel.click();

            WebElement SearchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
            SearchBar.sendKeys("Iphone 17");

            By suggestion = By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/header/div[1]/div[1]/form/ul/li");

            List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(suggestion));
            System.out.println( " the list size " + list.size());

            if(list.size() > 0){
                System.out.println(list.get(1).getText());
            }else{
                System.out.println("element not found");
            }

            for(WebElement dropdownList : list){
                if(dropdownList.getText().equals("Iphone")){
                    dropdownList.click();
                    System.out.println(dropdownList.getText());
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            driver.quit();
        }
    }
}


/*


What id the auto-suggestion:

        -> Auto suggestion is feature in a web application that automatically display the values
        based on user input in search box.

        -> These suggestions are used to identify the product quickly without type the complete search term.

        -> User opens FlipkartEnters text: mobileApplication processes searchtextAuto-suggestion dropdownappearsSelenium identifies suggestionelementsSelenium selects requiredsuggestionSearch results are displayed

        -> In Selenium, we handle auto-suggestions using dynamic locators, findElements(), explicit waits, and iteration to identify and select the required suggestion.

How to push the flipkart auto-suggestion:

            -> Event Listener Breakpoint: Go to DevTools -> Sources -> Event Listener Breakpoints -> Control / Focus -> check Blur.

 */