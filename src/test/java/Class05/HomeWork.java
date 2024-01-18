package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement enableBt = driver.findElement(By.xpath("//button[@id='enabledradio']"));
        enableBt.click();

        WebElement enabledRadioMale = driver.findElement(By.xpath("//input[@name='gender-identity' and @value='gender-male']"));

        if (enabledRadioMale.isEnabled()) {
            System.out.println("The Male radio button is enabled");
            enabledRadioMale.click();
        } else {
            System.out.println("The Male radio button is not enabled");
        }


    }
}

