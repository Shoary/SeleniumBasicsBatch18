package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        // Click on the button to trigger the last alert
        WebElement alert3= driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        alert3.click();
        Thread.sleep(4000);

        // Switch the focus of the driver to the last alert
        Alert lastAlert = driver.switchTo().alert();
        lastAlert.sendKeys("SHOARY");
        // Accept the alert (close it)
        lastAlert.accept();
    }
}



