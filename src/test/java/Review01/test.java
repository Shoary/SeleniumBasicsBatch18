package Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //go to syntax website
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement enabledCheckBox=driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enabledCheckBox.click();
        List<WebElement> checkbox=driver.findElements(By.xpath("//input[@value='Checkbox-1']"));
        for (WebElement option:checkbox){
            System.out.println(option.getAttribute("value"));
            String myCheck=option.getAttribute("value");
            if (myCheck.equals("Checkbox-1")||myCheck.equals("Checkbox-4")){
                System.out.println("hello");
                option.click();
            }
        }
    }
}

