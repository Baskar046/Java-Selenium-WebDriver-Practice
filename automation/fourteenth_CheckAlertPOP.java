package base.web.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourteenth_CheckAlertPOP {

    public static void main(String[] args){

        try {
            WebDriver driver = new ChromeDriver();

            driver.get("https://demoqa.com/alerts");

            Thread.sleep(500);

            //------------simple alert-------------

            WebElement SimpleAlert = driver.findElement(By.id("alertButton"));
            SimpleAlert.click();

            Alert Simple_Alert = driver.switchTo().alert();
            Simple_Alert.accept();


            //----------Confirmation Alert--------------

            WebElement ConfirmationAlert = driver.findElement(By.id("confirmButton"));
            ConfirmationAlert.click();

            Alert conformation_alert = driver.switchTo().alert();
            conformation_alert.dismiss();


            //-----------Prompt BOX------------------

            WebElement PromptAlert = driver.findElement(By.id("promtButton"));
            PromptAlert.click();

            Alert prompt_alert = driver.switchTo().alert();
            prompt_alert.sendKeys("vanakkam da pulla");
            prompt_alert.accept();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}