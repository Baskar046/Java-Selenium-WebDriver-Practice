package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class TwentyTwo_BrokenLink {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/broken");

        List<WebElement> Links = driver.findElements(By.tagName("a"));

        for(WebElement PageLinks: Links){

            String Link = PageLinks.getAttribute("href");

            try{

                URL UrlLink = new URL(Link);
                HttpURLConnection connection = (HttpURLConnection) UrlLink.openConnection();

                connection.setRequestMethod("GET");
                connection.setRequestProperty("User-Agent", "Mozilla/5.0");

                connection.connect();
                connection.setConnectTimeout(3000);

                int ResponseCode = connection.getResponseCode();
                if(ResponseCode >=400){
                    System.out.println("Broken Links: " + Link);
                }else{
                    System.out.println("Valid Links: " + Link);
                }

            }catch (Exception e){
                System.out.println("Valid Links: " + Link);
            }

        }

    }
}

/*
Broken Link:

    -> A broken Link is a hyperlink that does not lead to the expected webpage or resources.
 */