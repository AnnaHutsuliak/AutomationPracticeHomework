package web.form.task3HW3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWebFormPage {
    private WebDriver chromeDriver;


    @BeforeClass
    public void appSetup() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        WebFormPage webFormPage = new WebFormPage(chromeDriver);
        webFormPage.openWebsite();
    }
    @AfterClass
    public void closeBrowser() {
        chromeDriver.quit();
    }

    @Test
    public void inputDates() {
        WebFormPage webFormPage = new WebFormPage(chromeDriver);
        webFormPage.enterAllDates();
    }
}
