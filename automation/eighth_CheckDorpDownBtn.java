package base.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class eighth_CheckDorpDownBtn {
    public static void main(String[] args) {

        try {
            WebDriver driver = new EdgeDriver();
            driver.get("https://practice.expandtesting.com/dropdown");

            Thread.sleep(500);

            WebElement DropDownBtn = driver.findElement(By.id("country"));

            // It's applicable for single dropdown button.

           Select selectDropDownBtn  = new Select(DropDownBtn);
           selectDropDownBtn.selectByIndex(3); // It's select by index position
           selectDropDownBtn.selectByValue("IN"); // it's select by Attribute value tag. It's present in the Source code.
           selectDropDownBtn.selectByVisibleText("Japan"); // it's select by Visible Text seen by user. We can normally view that one.

            /*
            In single dropdown if we select more than one option last option is overwrite the first one.
            But in the multiple dropdown select button. It's not overwritten it's select that option also.

            And this same method is followed by multiple drop down option.
             */
            List<WebElement> dropbtn = selectDropDownBtn.getOptions();
            dropbtn.get(1).click();



        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static List<WebElement> getWebElements(WebElement DropDownBtn) {
        Select selectDropDownBtn  = new Select(DropDownBtn);
        selectDropDownBtn.selectByIndex(3); // It's select by index position
        selectDropDownBtn.selectByValue("IN"); // it's select by Attribute value tag. It's present in the Source code.
        selectDropDownBtn.selectByVisibleText("Japan"); // it's select by Visible Text seen by user. We can normally view that one.


        // It's used to deselect the selected options.
        selectDropDownBtn.deselectAll(); // de select all options
        selectDropDownBtn.deselectByIndex(0);
        selectDropDownBtn.deselectByValue("IN");
        selectDropDownBtn.selectByVisibleText("japan");


        //----------or-----------------

        List<WebElement> dropbtn  = selectDropDownBtn.getOptions();
        return dropbtn;
    }
}

//2.08.59