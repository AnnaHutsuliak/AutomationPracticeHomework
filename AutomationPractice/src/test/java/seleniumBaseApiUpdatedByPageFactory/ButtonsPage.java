package seleniumBaseApiUpdatedByPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
    private final WebDriver chromeDriver;
    @FindBy(xpath = "//*[@class='btn btn-lg btn-primary']")
    WebElement primaryButton;
    @FindBy(xpath = "//*[@class='btn btn-lg btn-success']")
    WebElement successButton;
    @FindBy(xpath = "//button[contains(@class, 'btn-info')]")
    WebElement infoButton;
    @FindBy(xpath = "//*[text() = 'Warning']")
    WebElement warningButton;
    @FindBy(xpath = "//*[text() = 'Danger']")
    WebElement dangerButton;
    @FindBy(xpath = "//button[contains(@class,'btn') and text()='Link']")
    WebElement linkButton;
    @FindBy(xpath = "//button[contains(@class,'btn btn-lg btn-primary') and text()='Left']")
    WebElement leftButton;
    @FindBy(xpath = "//button[contains(@class,'btn btn-lg btn-primary') and text()='Middle']")
    WebElement middleButton;
    @FindBy(xpath = "//button[contains(@class,'btn btn-lg btn-primary') and text()='Right']")
    WebElement rightButton;
    @FindBy(xpath = "//button[contains(@class,'btn btn-lg btn-primary') and text()='1']")
    WebElement oneButton;
    @FindBy(xpath = "//button[contains(@class,'btn btn-lg btn-primary') and text()='2']")
    WebElement twoButton;
    @FindBy(xpath = "//button[@id='btnGroupDrop1']")
    WebElement dropdownButton;
    @FindBy(xpath = "//div//a[contains(text(),'Dropdown link 1')]")
    WebElement dropdownLinkOneButton;
    @FindBy(xpath = "//div//a[contains(text(),'Dropdown link 2')]")
    WebElement dropdownLinkTwoButton;

    public ButtonsPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        PageFactory.initElements(chromeDriver, this);
    }

    public void clickPrimaryButton() {
        primaryButton.click();
    }

    public void clickSuccessButton() {
        successButton.click();
    }

    public void clickInfoButton() {
        infoButton.click();
    }

    public void clickWarningButton() {
        warningButton.click();
    }

    public void clickDangerButton() {
        dangerButton.click();
    }

    public void clickLinkButton() {
        linkButton.click();
    }

    public void clickLeftButton() {
        leftButton.click();
    }

    public void clickMiddleButton() {
        middleButton.click();
    }

    public void clickRightButton() {
        rightButton.click();
    }

    public void clickOneButton() {
        oneButton.click();
    }

    public void clickTwoButton() {
        twoButton.click();
    }

    public void clickDropdownButton() {
        dropdownButton.click();
    }

    public void clickDropdownLinkOneButton() {
        clickDropdownButton();
        dropdownLinkOneButton.click();
    }

    public void clickDropdownLinkTwoButton() {
        clickDropdownButton();
        dropdownLinkTwoButton.click();
    }
}