package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class Ninth_checkFileUpload {
    public static void main(String[] args) {

        try{

            //-----------bowser launch-------
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/automation-practice-form");
            Thread.sleep(600);

            WebElement UploadBtn =  driver.findElement(By.id("uploadPicture"));
            UploadBtn.sendKeys("E:\\Document.txt");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}


/*

Why File Upload seems, not possible in selenium:

    -> The reason, "it's not possible" is because selenium cannot interact with OS level file dialog.

Robot class:

    -> the java.awt.robot class is java class that generates native system input events for
    mouse and keyboard, enabling test automation and control over system's input devices.

    -> It's useful for automating tasks that selenium or others tools cannot handle
    such as interacting with native pop-up windows(like file upload dialogs)



Scenario	                                    Selenium WebDriver	                            Java Robot

Upload a file                                   using input[type=file] sendKeys()	            Not needed
Click a button on a web page                    click()	                                        Usually not needed
Type into a web input field	                    sendKeys()	                                    Usually not needed
Press Ctrl + C or another OS-level shortcut	    Limited to browser interactions	                Can simulate the shortcut
Interact with a native desktop dialog	        Cannot directly control it	                    Can simulate keyboard and mouse actions
Handle a JavaScript alert	                    switchTo().alert()	                            Not needed


 */


//            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].click();",UploadBtn);
//            //-------------code till file upload
//
//            String filepath = "E:\\Document.txt";
//
//            StringSelection select = new StringSelection(filepath);
//
//            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
//
//            Thread.sleep(500);
//
//            //--------------- From here robot class concept starts-----
//
//            Robot robot = new Robot();
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_V);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.keyRelease(KeyEvent.VK_V);
//
//            robot.delay(500);
//
//            robot.keyPress(KeyEvent.VK_ENTER);
//            robot.keyRelease(KeyEvent.VK_ENTER);
