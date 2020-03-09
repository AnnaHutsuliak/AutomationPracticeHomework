package seleniumBaseApiUpdatedByPageFactory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestButtonsPage {
    private ChromeDriver chromeDriver;

    @BeforeClass
    public void appSetup() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() {
        chromeDriver.quit();
    }

    @Test
    public void clickAllButtons() {
        ButtonsPage buttonsPage = new ButtonsPage(chromeDriver);
        buttonsPage.clickPrimaryButton();
        buttonsPage.clickSuccessButton();
        buttonsPage.clickInfoButton();
        buttonsPage.clickWarningButton();
        buttonsPage.clickDangerButton();
        buttonsPage.clickLinkButton();
        buttonsPage.clickLeftButton();
        buttonsPage.clickMiddleButton();
        buttonsPage.clickRightButton();
        buttonsPage.clickOneButton();
        buttonsPage.clickTwoButton();
        buttonsPage.clickDropdownLinkOneButton();
        buttonsPage.clickDropdownLinkTwoButton();
    }
}
