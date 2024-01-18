package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class WaitHw1 {
    public static void main(String[] args) {

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to the specified URL
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
        // Explicit Wait: Wait for the "Button 2" element to be clickable
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//*[@id=\"show_text_synchronize_02\"]"));
        WebElement btnMale= driver.findElement(By.xpath("//input[@value='Male']"));
        btnMale.click();

        // Click on "Button 3"
        driver.findElement(By.xpath("//*[@id=\"show_text_synchronize_03\"]"));
        WebElement checkBoxOption1 = (WebElement) driver.findElement(By.xpath("//input[@value='Option-1']"));
        // Select "Option 1"
        checkBoxOption1.click();



    }
}





