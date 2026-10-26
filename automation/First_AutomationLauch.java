package base.web.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class First_AutomationLauch {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aadagam.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());  //It's returns the Current tap name.
//        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();

    }
}

//17.28