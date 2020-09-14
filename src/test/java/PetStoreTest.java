import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class PetStoreTest extends TestCase {
    @Test
    public void petStoreTest() throws InterruptedException {
        webDriver.navigate().to("https://jpetstore.cfapps.io/catalog");
        webDriver.manage().window().setSize(new Dimension(1024, 768));
        //div[@id='Content']//a[5]//img[1]
        WebElement element = webDriver.findElement(By.xpath("//div[@id='Content']//a[5]//img[1]"));
        element.click();
        List<WebElement> list = webDriver.findElements(By.xpath("//body//tr"));
        Assert.assertTrue(list.size() > 1);

    }
}
