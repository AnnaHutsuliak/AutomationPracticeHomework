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
            Assert.assertTrue(driver.getTitle().startsWith("Goo"));
            Assert.assertTrue(driver.getTitle().endsWith("gle"));
            Assert.assertTrue(driver.getTitle().endsWith("le"), "It is true =)");
            Assert.assertFalse(driver.getTitle().startsWith("gla"));
            Assert.assertFalse(driver.getTitle().endsWith("gli"));
            Assert.assertFalse(driver.getTitle().endsWith("gli"),"It is false =(" );
        }
}
