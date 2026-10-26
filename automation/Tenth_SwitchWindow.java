package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tenth_SwitchWindow {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        //Each window haves the unique ID.

        System.out.println(driver.getWindowHandle()); // Returns the Window unique ID in String format

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.chrome.com/");

        Thread.sleep(500);

        WebElement MobileBtn = driver.findElement(By.linkText("Mobile"));
        MobileBtn.click();

        System.out.println(driver.getWindowHandles());

//        WebElement tab = driver.findElement(By.id("https://www.chrome.com/"));
    }
}

//2.41.32


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
