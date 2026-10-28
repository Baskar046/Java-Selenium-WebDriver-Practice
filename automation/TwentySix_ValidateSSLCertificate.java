package base.web.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TwentySix_ValidateSSLCertificate {
    public static void main(String[] args){

        ChromeOptions option = new ChromeOptions();
        option.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(option);

        try {

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://expired.badssl.com/");
            System.out.println(driver.getTitle());


        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}