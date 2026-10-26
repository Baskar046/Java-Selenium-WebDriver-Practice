package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sixth_IsSelected {
    public static void main(String[] args){

        try {
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/automation-practice-form");

            Thread.sleep(500);
            WebElement gender_male = driver.findElement(By.name("gender"));
            gender_male.click();
            System.out.println(gender_male.isSelected());   // check if the button is clicked or not. Returns the boolean value as a result.

            WebElement Hobbies_btn = driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-1\"]"));
            Hobbies_btn.click();
            System.out.println(Hobbies_btn.isSelected());


            WebElement ChooseFile_btn = driver.findElement(By.id("uploadPicture"));
            System.out.println(ChooseFile_btn.isEnabled()); // Check if the button is enabled to disable. It's return the boolean value.


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
