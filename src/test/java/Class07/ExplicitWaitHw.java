package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitHw {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      //click on button "click to display button" and click on button "click to display button"

        driver.findElement(By.xpath("//button[@id=\"display_button\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Enabled\"]")));
        WebElement displayButton= driver.findElement(By.xpath("//button[text()=\"Enabled\"]"));
        displayButton.click();

        // Click on "click me to enable button"
        driver.findElement(By.xpath("//button[@id='enable_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@text()='Button']")));
        driver.findElement(By.xpath("//button[@text()='Button']")).click();
        displayButton.click();



        // Explicit wait for the button below to be clickable
         driver.findElement(By.xpath("//button[@id='checkbox_button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkbox']")));
        WebElement checked =driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkbox']")));


        // Click on "click to check the checkbox"

        System.out.println(checked.isSelected());





    }
}
