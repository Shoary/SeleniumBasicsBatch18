package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        // following the sib
        WebElement favouriteB1= driver.findElement(By.xpath("//*[@id='favourite-book']"));
        favouriteB1.sendKeys("\"Dune\" by Frank Herbert");
        WebElement favouriteB2= driver.findElement(By.xpath("//*[@id=\"frm\"]/div/div/input[2]"));
        favouriteB2.sendKeys("\"1984\" by George Orwell");
        WebElement favouriteB3= driver.findElement(By.xpath("//*[@id=\"frm\"]/div/div/input[3]"));
        favouriteB3.sendKeys("\"Brave New World \"by Aldous");
        //Preceding Sib
        WebElement leastFavB= driver.findElement(By.xpath("//*[@id='least-favorite']"));
        leastFavB.sendKeys("\"Dune\" by Frank Herbert");
        WebElement leastFavB1= driver.findElement(By.xpath("//*[@id='least-favorite']/preceding-sibling::input[1]"));
        leastFavB1.sendKeys("\"1984\" by George Orwell");
        WebElement leastFavB2= driver.findElement(By.xpath("//*[@id='least-favorite']/preceding-sibling::input[2]"));
        leastFavB2.sendKeys("Brave New World \"by Aldous");
        // Parent Child Relationship
        WebElement grParent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        grParent.sendKeys("Grandparent");
        WebElement parent= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        parent.sendKeys("parent");
        WebElement child= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        child.sendKeys("child");
    }
}
