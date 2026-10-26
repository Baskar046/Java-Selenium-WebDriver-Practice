package base.web.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class thirteenth_HeadLessCode {

    public static void main(String[] args){


        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");

        WebDriver driver = new ChromeDriver(option);

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());

       driver.quit();
    }
}


/*

-> Headless Mode is a way to execute browser automation without displaying the browser window.

-> In selenium with java, we can enable it using ChromeOptions and the ==headless argument.

-> It is commonly used in CI/CD piplines, jenkins execution and automated test suites running on serves
wihtout a graphical interface.



Feature	                    Normal Mode	                                    Headless Mode
--------------------------------------------------------------------------------------------------------------------
Browser window	              Visible	                                    Not visible
Selenium interactions	      Supported	                                    Supported
Debugging visually	          Easier	                                    Harder
CI/CD automation	          Possible, needs suitable environment	        Useful on servers without a desktop
Screenshots	                  Supported	                                    Supported
Best use	                  Development and debugging	                    Automated pipelines and background execution

 */