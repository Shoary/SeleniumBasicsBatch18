package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        // Click on the "Check All" button to enable all checkboxes
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableButton.click();

        // Select checkbox 4 (you mentioned Checkbox-4 in the comment)
        List<WebElement> options = driver.findElements(By.xpath("//input[@class='checkbox-field']"));

        for (WebElement option : options) {
            String optionVal = option.getAttribute("value");
            if (optionVal.equals("Checkbox-1")||optionVal.equals("Checkbox-4")) {
                option.click();
            }
        }

    }
}
