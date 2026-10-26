package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class Seventh_CheckMultiple_WebElements {
    public static void main(String[] args){

        try {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/automation-practice-form");

            Thread.sleep(500);
            List<WebElement> Gender_btn= driver.findElements(By.name("gender"));
               Gender_btn.get(2).click();
            System.out.println(Gender_btn.get(0).getAttribute("value"));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

/*

getText() only extracts visible inner text (e.g., <span>Text</span>). It returns an empty string "" on <input> elements.

getAttribute("value") retrieves the actual attribute value from <input> tags.

DemoQA Radio Buttons: The <input> tag is hidden by CSS. Use getAttribute("value") on the input, or call getText() / .click() directly on its corresponding <label>.

 */
