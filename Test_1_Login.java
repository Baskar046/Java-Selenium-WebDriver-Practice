import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_1_Login {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.aadagam.com/");

        WebElement AdminSignLink = driver.findElement(By.linkText("Admin Sign In"));


        if(AdminSignLink.getText().equals("Admin Sign In")){
            System.out.println("Elements found");
            AdminSignLink.click();
        }else{
            System.out.println("Elements not found");
        }

        Thread.sleep(500);

        WebElement UserName  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[1]/div/input"));
        UserName.sendKeys("danamGold@gmail.com");

        WebElement PassWord = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/div[2]/div[2]/input"));
        PassWord.sendKeys("Dana@12345");

        Thread.sleep(500);

        WebElement SignInButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/form/button/span"));
        SignInButton.click();
    }
}
