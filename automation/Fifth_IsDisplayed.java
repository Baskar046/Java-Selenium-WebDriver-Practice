package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fifth_IsDisplayed {
    public static void main(String[] args) throws InterruptedException {
try {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.aadagam.com/admin");

    Thread.sleep(500);

    WebElement AdminLoginButton = driver.findElement(By.linkText("Admin Sign In"));

    WebElement SignIn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/input"));

    WebElement password = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/div[2]/input"));

    boolean present = AdminLoginButton.isDisplayed();  // It's check the given link is present in current tab or not. checks and return the boolean value.
    System.out.println(present);

}catch (Exception e){
    System.out.println(e.getMessage());
}

    }
}

