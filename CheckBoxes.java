package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckBoxes {
    private ChromeDriver chromeDriver;

    @BeforeClass
    public void appSetup() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox");
        chromeDriver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() {
        chromeDriver.quit();
    }

    @DataProvider
    public Object[][] dataProviderXPath() {
        return new Object[][]{
                {"//input[@id='checkbox-1']"},
                {"//input[@id='checkbox-2']"},
                {"//input[@id='checkbox-3']"},
        };
    }

    @DataProvider
    public Object[][] dataProviderCss() {
        return new Object[][]{
                {"input#checkbox-1"},
                {"input#checkbox-2"},
                {"input#checkbox-3"},
        };
    }


    @Test(dataProvider = "dataProviderXPath")
    public void checkBoxesWithXpath(String selector) {
        chromeDriver.findElement(By.xpath(selector)).click();
    }

    @Test(dataProvider = "dataProviderCss")
    public void checkBoxesWithCss(String selector) {
        chromeDriver.findElement(By.cssSelector(selector)).click();
    }


}
