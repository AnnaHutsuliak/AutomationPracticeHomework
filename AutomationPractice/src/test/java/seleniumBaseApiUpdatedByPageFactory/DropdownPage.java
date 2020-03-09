package seleniumBaseApiUpdatedByPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {
    private WebDriver chromeDriver;
    protected static final String WEBSITE = "https://formy-project.herokuapp.com/dropdown";
    protected static final String XPathOfDropDownButton = "//*[@class='btn btn-primary dropdown-toggle']";

    public DropdownPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        PageFactory.initElements(chromeDriver, this);
    }

    @FindBy
    WebElement dropdownButton;

    public void clickAllDropdownButtons(String i, String URLName) {
        dropdownButton = chromeDriver.findElement(By.xpath("/html/body/div/div/div/a[" + i + "]"));
        dropdownButton.click();
    }

    public void openWebsiteAndClickDropdownButton() {
        chromeDriver.get(WEBSITE);
        chromeDriver.findElement(By.xpath(XPathOfDropDownButton)).click();
    }

}
