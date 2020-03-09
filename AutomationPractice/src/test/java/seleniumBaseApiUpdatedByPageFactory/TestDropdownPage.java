package seleniumBaseApiUpdatedByPageFactory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestDropdownPage {
    private ChromeDriver chromeDriver;

    @BeforeClass
    public void appSetup() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }

    @BeforeMethod
    public void clickDropdownButton() {
        DropdownPage dropdownPage = new DropdownPage(chromeDriver);
        dropdownPage.openWebsiteAndClickDropdownButton();
    }

    @AfterMethod
    public void goBackToDropdownButtonPage() {
        chromeDriver.navigate().back();
    }

    @AfterClass
    public void closeBrowser() {
        chromeDriver.quit();
    }

    @DataProvider
    public Object[][] dataProviderXPath() {
        return new Object[][]{
                {"1", "autocomplete"},
                {"2", "buttons"},
                {"3", "checkbox"},
                {"4", "datepicker"},
                {"5", "dragdrop"},
                {"6", "dropdown"},
                {"7", "enabled"},
                {"8", "fileupload"},
                {"9", "filedownload"},
                {"10", "keypress"},
                {"11", "modal"},
                {"12", "scroll"},
                {"13", "radiobutton"},
                {"14", "switch-window"},
                {"15", "form"},
        };
    }

    @Test(dataProvider = "dataProviderXPath")
    public void testClickButtons(String i, String URLName) {
        DropdownPage dropdownPage = new DropdownPage(chromeDriver);
        dropdownPage.clickAllDropdownButtons(i, URLName);
        chromeDriver.navigate().refresh();
        Assert.assertEquals(chromeDriver.getCurrentUrl(), "https://formy-project.herokuapp.com/" + URLName, "Current URL is not correct to webpage");
    }


}
