import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GoogleTest extends TestCase {
    // WebDriver symulator przeglarki, API
    @Test
    public void googleTest() throws InterruptedException {
        webDriver.navigate().to("http://www.google.pl");
        webDriver.manage().window().setSize(new Dimension(1024,768));
        Thread.sleep(3000);
        WebElement button = webDriver.findElement(By.cssSelector("input.gLFyf gsfi"));
        assertTrue(button.isDisplayed());
    }

}
