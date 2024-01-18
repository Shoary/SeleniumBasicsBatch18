package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        WebElement createA= driver.findElement(By.linkText("Create new account"));
        createA.click();
        Thread.sleep(5000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Anas");
        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("ShoAry");
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("6827023308");
        WebElement pass= driver.findElement(By.id("password_step_input"));
        pass.sendKeys("20012Asho");
        Thread.sleep(7000);
        driver.quit();

    }
}
