import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {
    public static void main(String[] args){

        try {

            WebDriver driver = new ChromeDriver();

            driver.get("https://careers.hcltech.com/");

            WebElement RejectPop = driver.findElement(By.id("onetrust-reject-all-handler"));
            RejectPop.click();

            WebElement RejectCookie = driver.findElement(By.id("cookie-reject"));
            RejectCookie.click();

            WebElement ExploreBtn = driver.findElement(By.linkText("Explore Job Opportunities"));
            ExploreBtn.click();

            WebElement SearchBox = driver.findElement(By.name("q"));
            SearchBox.sendKeys("graduate trainee");

            WebElement SearchBtn = driver.findElement(By.cssSelector("#search-wrapper > div > div > div.col-lg-2 > button"));
            SearchBtn.click();

            System.out.println(driver.getWindowHandles());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
