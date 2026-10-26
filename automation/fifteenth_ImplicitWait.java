package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class fifteenth_ImplicitWait {
    public static void main(String[] args){

try {
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://www.aadagam.com/");

    WebElement AdminSignBtn = driver.findElement(By.linkText("Admin Sign In"));
    AdminSignBtn.click();

    WebElement Email = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/input"));
    Email.sendKeys("JaiSankar@gmail.com");

    WebElement Password = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/div[2]/input"));
    Password.sendKeys("123456");

    WebElement SignInBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/button"));
    SignInBtn.click();

}catch (Exception e){
    System.out.println(e.getMessage());
}

    }
}

/*

## Example: Login Page Testing

Imagine nee oru website test panra.

1. Username enter panra.
2. Password enter panra.
3. Login button click panra.
4. Login success aana, Home page open aagum. Aana Home page load aaga 3 seconds aagudhu.

Ippo Selenium udane Profile button-a click panna try pannina, andha button innum page-la varala na test fail aagalam.

Adhukku dhaan Wait use panrom.

## 1. Implicit Wait — General wait

Selenium-kitta nee ippadi solra:

"Element udane kidaikkala na, maximum 10 seconds varaikkum thedu."

java
```
driver.manage().timeouts()
      .implicitlyWait(Duration.ofSeconds(10));
```

Real-time example:

Nee Amazon website open panra. Search box vara konjam time aagudhu.

Implicit Wait irundha, Selenium search box-a udane find panna mudiyalana, 10 seconds varaikkum wait panni try pannum.

- Element 2 seconds-la vandha, Selenium continue pannidum.
- 10 seconds-kullayum kidaikkala na exception varalaam.

Enga use pannuvom? General-ah elements find panna delay irukkumbodhu.


## 3. Rendum eppadi different?

| Implicit Wait                                                 | Explicit Wait |

| Element-a find panna wait pannum                              | Specific condition-ku wait pannum |
| General-ah apply aagum                                        | Thevaiyaana idathula use pannuvom |
| Element present aaguradhukku useful                           | Visible, clickable, text present pondra conditions-ku useful |

### Senior tester tip 👨‍💻

Real-time Selenium automation framework-la naan Explicit Wait-ku adhigama importance kuduppen, because application-la button click aaguradhu, loader disappear aaguradhu, message visible aaguradhu maadhiri different situations irukkum.

Oru important point: Implicit Wait-um Explicit Wait-um ore framework-la mix pannuradha avoid pannunga. Selenium-la usually implicit wait zero-va vechuttu, thevaiyaana idathula Explicit Wait use pannalaam.

 */