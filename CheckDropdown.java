package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class CheckDropdown {
    private ChromeDriver chromeDriver;

    @BeforeClass
    public void appSetup() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }

    @BeforeMethod
    public void clickDropdownButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/dropdown");
        chromeDriver.findElement(By.xpath("//button[contains(@id,'dropdownMenuButton')]")).click();
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
        chromeDriver.findElement(By.xpath("/html/body/div/div/div/a[" + i + "]")).click();
        chromeDriver.navigate().refresh();
        Assert.assertEquals(chromeDriver.getCurrentUrl(), "https://formy-project.herokuapp.com/" + URLName, "Current URL is not correct to webpage");
    }
}
