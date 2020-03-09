package epam.com.webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAssertions {

    @Test
    public void testCaseVerifyHomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        Assert.assertEquals("Google", driver.getTitle());
        Assert.assertEquals("Gogle", driver.getTitle());
        Assert.assertTrue(driver.getTitle().startsWith("Goo"), "Title starts with 'Goo', true");
        Assert.assertTrue(driver.getTitle().endsWith("gle"), "Title ends with 'gle', true, true");
        Assert.assertTrue(driver.getTitle().endsWith("le"), "Title ends with 'le', true");
        Assert.assertFalse(driver.getTitle().startsWith("gla"), "Title starts with 'gla', false");
        Assert.assertFalse(driver.getTitle().endsWith("gli"), "Title ends with 'gli', false");
        Assert.assertFalse(driver.getTitle().endsWith("glg"), "Title ends with 'glg', false");
    }
}