import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class AkademiaKoduTest extends TestCase {

    @Test
    public void testAkademiaKodu() throws InterruptedException {
        webDriver.navigate().to("http://www.akademiakodu.pl");
        webDriver.manage().window().setSize(new Dimension(1024,768));
        Thread.sleep(3000);

        List<WebElement> elements = webDriver.findElements(By
                .cssSelector(".menu-links ul li a"));
        Assert.assertEquals("Facebook",elements.get(0).getText());
        Assert.assertEquals("Szkolenie Python",elements.get(1).getText());
        Assert.assertEquals("Youtube",elements.get(2).getText());
    }
}
