package base.web.automation.BuildTheXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpath_4 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        try{
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://vinothqaacademy.com/xpath-demo-page/");


            WebElement Parent = driver.findElement(By.xpath("//input[@type='text' and @id='usernameInput']/parent::div"));  // Parent Axes
            System.out.println(Parent.getText());

            WebElement Child = driver.findElement(By.xpath("//form[@id='loginForm']/child::div[3]"));
            System.out.println(Child.getText());
//
//            WebElement Ancestor = driver.findElement(By.xpath("//form[@id='loginForm']/ancestor::div[9]"));
//            System.out.println(Ancestor.getText());

            WebElement FollowingSiblings = driver.findElement(By.xpath("//button[@id='loginBtn']/following-sibling::a"));
            System.out.println(FollowingSiblings.getText());

            WebElement PrecedingSiblings = driver.findElement(By.xpath("//input[@id='passwordInput']/preceding-sibling::label"));
            System.out.println(PrecedingSiblings.getText());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
//5.37.32 -> Broken links

/*

Xpath Axes -> Xpath Axes help you find an element by using it's relationship with another element.

What is Xpath Axes:

But what if the page has multiple Login buttons?

Instead of searching the entire page, you can find the Login button based on its relationship with another element.

Xpath Axes has 13 types.

Structure:

            Ancestor(All nodes on the path from root to parent)
                                |
                                |
                           Grandfather
                                |
                                |
                               /  \
                          Parent  Uncle/Aunt
                           |
                           |
                          /   \
                Target Node   Sibling
                    |
                    |
                  Child(Immediate children of the node)

Syntax:
    //element/axis::targetElement

Parent Axes:
        -> Find the immediate parent of an element.

    //input[@type='text' and @id='usernameInput']/parent::div

Child axis:

        Meaning: Find the direct children of an element.

        //form[@id='loginForm']/child::div[3]


Descendant axis:
        Meaning: Find all elements inside the current element, including elements nested deeper.

        ->//form[@id='loginForm']/descendant::div

Following-siblings:

       ->  Find the elements that come after the current element and have the same parent.

        -> //button[@id='loginBtn']/following-sibling::a
 */