package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementCommands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");

        // Find and interact with the text input element
        WebElement textBox = driver.findElement(By.xpath("//input[@id='textInput']"));
        textBox.clear();
        textBox.sendKeys("welcome");

        // Find and interact with the radio button (option1)
        WebElement option1 = driver.findElement(By.xpath("//input[@name='radioDemo' and @value='option1']"));
        if (!option1.isSelected()) {
            option1.click();

            System.out.println("The state of radiobutton1 is " + option1.isSelected());

            // Find the second radio button (option2)
            WebElement option2 = driver.findElement(By.xpath("//input[@value='option2']"));
            boolean enableStateOfOp2 = option2.isEnabled();
            if (enableStateOfOp2) {
                System.out.println("Option2 is enabled and can be selected");
            } else {
                System.out.println("Option2 is not enabled and not clickable");

                // Find the third radio button (option3)
                WebElement option3 = driver.findElement(By.xpath("//input[@value='option3']"));
                boolean isDisplayedOp3 = option3.isDisplayed();
                if (isDisplayedOp3) {
                    System.out.println("The radio button option3 is displayed");
                } else {
                    System.out.println("The radio button option3 is not displayed");

                    //        get the text
                    WebElement textMsg = driver.findElement(By.xpath("//div[@id='textElement']"));
                    String text = textMsg.getText();
                    System.out.println(text);
                    //        get the attribute value and print on screen
                    WebElement attribute = driver.findElement(By.xpath("//div[text()='inspect me to view my custom attribute!']"));

                    String value = attribute.getAttribute("id");
                    System.out.println(value);
                }
            }


        }

    }
}