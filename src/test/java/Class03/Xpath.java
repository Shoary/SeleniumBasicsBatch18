// Import necessary Selenium libraries
package Class03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public static void main(String[] args) {
        // Set up WebDriver for Chrome
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the specified URL
        driver.get("https://syntaxprojects.com/Xpath.php");

        // Locate the username input field using XPath and input a value
        WebElement userName = driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("Anes");

        // Locate the button with the text 'Click Here' using XPath and click it
        WebElement button = driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();

        // Locate the input field with a partial name attribute and input a value
        WebElement q1 = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        q1.sendKeys("What is your name?");

        // Locate the label containing specific text and print the text
        WebElement textMag = driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum')]"));
        String text = textMag.getText();
        System.out.println(text);

        // Locate the input field with an ID starting with 'apiSettings' and input a value
        WebElement apiSettings = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("123.145.567");

        // Locate the second input field with a specific class attribute and input a value
        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("abram@gmail.com");

        // Locate the input field with specific data attributes and input a value
        WebElement field2 = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("ewfioquhjqi");

        // Close the WebDriver session
        driver.quit();
    }
}



