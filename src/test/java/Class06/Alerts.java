package Class06;

import org.openqa.selenium.Alert; // Add this import statement
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        // find the alert1
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(3000);

        // SWITCH THE FOCUS OF THE DRIVER TO ALERTS

        // switch the focus of the driver to alert
        Alert alertHandler = driver.switchTo().alert();
        alertHandler.accept();
//        find the alert2 button
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(3000);
        System.out.println(alertHandler.getText());

        WebElement alert3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();
        Thread.sleep(3000);
        System.out.println(alertHandler.getText());
        alert3.sendKeys("QWETR");
        alertHandler.dismiss();

    }
}

