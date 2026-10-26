import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.openqa.selenium.WindowType.TAB;

public class Test_2 {
    public static void main(String[] args){
        try {

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.zoho.com/careers/");

            Thread.sleep(500);

            WebElement RegisterBtn = driver.findElement(By.linkText("Register"));
            RegisterBtn.click();

            Thread.sleep(500);

            System.out.println(driver.getWindowHandles());

            Set<String> NewTabCode = driver.getWindowHandles();

            List<String> NewTab = new ArrayList<>(NewTabCode);
            driver.switchTo().window(NewTab.get(1));

            Thread.sleep(900);

            WebElement EmailInput = driver.findElement(By.name("rec-form_193779000067382426"));
            EmailInput.sendKeys("jamesthamoskhan@gmail.com");

            WebElement PassWordInput = driver.findElement(By.cssSelector("#rec-form_3333 > div > lyte-input > div > input[type=password]"));
            PassWordInput.sendKeys("John@123");

            WebElement ReEnterPassInput = driver.findElement(By.cssSelector("#rec-form_3334 > div > lyte-input > div > input[type=password]"));
            ReEnterPassInput.sendKeys("John@123");

            WebElement FirstNameGender = driver.findElement(By.xpath("//*[@id=\"Salutation\"]"));
            FirstNameGender.click();

            Thread.sleep(900);

            WebElement selectMR = driver.findElement(By.xpath("//*[@id=\"Lyte_Drop_Item_243\"]"));
            selectMR.click();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

/*

Eppo getWindowHandles() Switch Use Pannuvom vs Eppo newWindow() Use Pannuvom?ScenarioEnna Use Pannanum?ExplanationScenario

1: Click pannale new tab open aagudhugetWindowHandles()Website-la irukra button/link target _blank-a irundha, click panna udane browser-e new tab open pannidum.
Anga getWindowHandles() potu switch mattum panna podhum.Scenario

       Set<String> NewTabCode = driver.getWindowHandles();

            List<String> NewTab = new ArrayList<>(NewTabCode);
            driver.switchTo().window(NewTab.get(1));

2: Namma thaan force panni new tab open pannanumdriver.switchTo().newWindow(TAB)Website auto-a new tab open pannadhu (same page-la thaan open aagum).
Aana namaku parallel-a innoru site open panni check panna new tab thevai padudhu-na namma newWindow() use pannuvom.


 */
