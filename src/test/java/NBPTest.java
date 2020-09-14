import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NBPTest extends TestCase {
       @Test
    public void googleTest(){
        webDriver.navigate().to("http://www.google.pl");
        WebElement input = webDriver.findElement(By.name("q"));
        input.sendKeys("kurs NBP");
        input.submit();
        assertTrue(webDriver.getTitle().contains("kurs NBP"));
    }
}