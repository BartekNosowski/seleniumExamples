import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DofinansowaniaTest extends TestCase {
    @Test
    public void dofinansowaniaTest() throws InterruptedException {
        webDriver.navigate().to("http://www.akademiakodu.pl");
        webDriver.manage().window().setSize(new Dimension(1024,768));
        WebElement webElement = webDriver.findElement(By.linkText("Dofinansowania"));
        Thread.sleep(4000);
        String url = webElement.getAttribute("href");
        webDriver.navigate().to(url);
        assertTrue(webDriver.getPageSource().contains("Urzad pracy"));
    }
}