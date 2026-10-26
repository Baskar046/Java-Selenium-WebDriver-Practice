package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;  // This class allows java to create  HTTP connection to a website and read it's response.
import java.net.URL;        // Java networking class, URl Class represent a web address.
import java.time.Duration;
import java.util.List;

public class TwentyTwo_BrokenLink {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.geeksforgeeks.org/");

        List<WebElement> Links = driver.findElements(By.tagName("a"));  //Find the element using tag name.

        for(WebElement PageLinks: Links){

            String Link = PageLinks.getAttribute("href");   // Get the actual URL from each anchor tag.

            if(Link == null || Link.isEmpty()){
                System.out.println("Missing href attribute");
                continue;
            }

            try{

                URL UrlLink = new URL(Link);    //Covert the Link string into URL objects. If URL is malformed, java may throw an Exception.
                HttpURLConnection connection = (HttpURLConnection) UrlLink.openConnection();

                connection.setConnectTimeout(3000); // Timing for connecting the server. Java will wait for 3 seconds.

                connection.setRequestMethod("GET"); // Request data from a server. It's check the URL through an actual HTTP request.
                connection.setRequestProperty("User-Agent", "Mozilla/5.0");

                connection.connect();   //Connect the server(establish HTTP connection and sends the request)


                int ResponseCode = connection.getResponseCode();    // Retrieves the HTTP response code from server.
                if(ResponseCode >=200 && ResponseCode < 300){
                    System.out.println("Valid Link: " + Link);
                }else if(ResponseCode >=300 && ResponseCode < 400){
                    System.out.println("Redirected Link: " + Link + "| code: " + ResponseCode);
                }else if(ResponseCode >=400 && ResponseCode < 500){
                    System.out.println("Client Error: " + Link + "| Code: " + ResponseCode);
                }else if(ResponseCode >=500){
                    System.out.println("Server Error: " + Link + "| code: " + ResponseCode);
                }

            }catch (Exception e){
                System.out.println("Unable to check Link: " + Link);
                System.out.println("Reason: " + e.getMessage());
            }

        }

    }
}

/*
Broken Link:

    -> A broken Link is a hyperlink that does not lead to the expected webpage or resources.


    Implicit Wait:

        -> Implicit wait does not wait for an HTTP response from a website.
        -> Your broken links checking uses Java's HTTPConnection, so the implicit wait does not control that connection.

User-Agent:

    -> User Agent in an HTTP header is a text string that identifies the client software,
    Operating system, and device type making a request to a web server.

    -> Mozilla/5.0 : It's a historical token used by almost all modern browser to indicate compatibility.

Http Condition present:

Range	    Meaning
-----------------------------
100–199	    Informational
200–299	    Success
300–399	    Redirection
400–499	    Client error
500–599	    Server error



Common HTTP response codes:

Response            code	            Meaning	Link check
-------------------------------------------------------------
200	                OK	                Usually valid
301	            Permanent redirect	    Usually valid, but redirected
302	            Temporary redirect	    Usually valid, but redirected
400	            Bad Request	            Error
401	            Unauthorized	        Access restricted
403	            Forbidden	            Access denied
404	            Not Found	            Broken link candidate
500	            Internal Server Error	Server error
503	            Service Unavailable	    Server unavailable




 */