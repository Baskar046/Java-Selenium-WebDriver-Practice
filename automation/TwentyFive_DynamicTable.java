package base.web.automation;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TwentyFive_DynamicTable {
    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();
        try{

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://vinothqaacademy.com/webtable/");

            String UserName = "Vinoth R";

            List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"myTable\"]/tbody/tr[td[contains(text(),'"+UserName+"')]]"));

            for(WebElement row : rows){

                String Result  = row.getText();

                System.out.println(Result);

//                if(UserName.equals(Result)){
//                    System.out.println("test successful " + Result);
//                }else{
//                    System.out.println("Record not found");
//                }

            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
