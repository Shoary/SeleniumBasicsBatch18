package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");

        // Find the username text box
        WebElement inputBox = driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("hello");

        // Find the profile box
        WebElement profileBox = driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("abracadabra");

        // Find the feedback box
        WebElement feedbackBox = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackBox.sendKeys("the website is too slow");
        // couretopic
        WebElement courseTopic= driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("Selenium");
        //introtoDVANCECSSS
        WebElement  intro=driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("easy");
        //conclusion
        WebElement conclusion=driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("welldone");
    }
}

