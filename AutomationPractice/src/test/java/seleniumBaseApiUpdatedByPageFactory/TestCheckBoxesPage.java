package seleniumBaseApiUpdatedByPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCheckBoxesPage {
    private WebDriver chromeDriver;

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

    @Test(dataProvider = "dataProviderXPath")
    public void clickAllCheckBoxesWithXpath(String selector) {
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(chromeDriver);
        checkBoxesPage.clickAllCheckBoxesButtons(selector);
    }
}
