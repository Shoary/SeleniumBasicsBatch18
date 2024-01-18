package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        // fined the WebElement input and send ur email address to it

       WebElement email= driver.findElement(By.id("email"));
       //
      // email.sendKeys("anesshoary@gmail.com");

       //find the element password and send the password
        WebElement password=driver.findElement(By.name("Pass"));
        password.sendKeys("");

        WebElement login =driver.findElement(By.name("login"));

       // login.click();
       // goto button create a new account
      //  WebElement createAccount=driver.findElement(By.LinkText("Create new account"));

        WebElement createAccount=driver.findElement(By.partialLinkText("Create new account"));
        createAccount.click();
    }
}
