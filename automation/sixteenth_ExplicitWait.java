package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class sixteenth_ExplicitWait {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://www.aadagam.com/");

            WebElement AdminSignInBtn = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Admin Sign In")));
            AdminSignInBtn.click();

            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/input"))).sendKeys("JamesKhan@gmail.com");

            WebElement Password = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/div[2]/input"));
            Password.sendKeys("James@1999");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div/form/button"))).click();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            driver.quit();
        }

    }
}

/*
Explicit Wait — Specific wait

Ippo login page example eduthuppom.

Nee Login button click pannitta. Home page-la Profile button vara 3 seconds aagudhu.

Selenium-kitta nee ippadi solra:

"Profile button visible aagura varaikkum wait pannu. Maximum 10 seconds."

java
```
WebDriverWait wait =
    new WebDriverWait(driver, Duration.ofSeconds(10));

wait.until(
    ExpectedConditions.visibilityOfElementLocated(
        By.id("profileButton")
    )
);
```

Imports:

java
```
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


```

Element or action	                        Recommended approach
Admin Sign In link	                        Explicit wait — elementToBeClickable()
Email input	                                Explicit wait — visibilityOfElementLocated()
Password input	                            Explicit wait — visibilityOfElementLocated()
Login button	                            Explicit wait — elementToBeClickable()
Successful login message	                Explicit wait — visibilityOfElementLocated()


Static page element that is already available	Direct findElement() may be sufficient

Inga enna nadakkum?

- Profile button 3 seconds-la visible aana, Selenium continue pannidum.
- 10 seconds aagiyum visible aagala na timeout exception varalaam.

Enga use pannuvom? Button clickable aaganum, success message visible aaganum, loader disappear aaganum nu specific condition irukkumbodhu.

 */