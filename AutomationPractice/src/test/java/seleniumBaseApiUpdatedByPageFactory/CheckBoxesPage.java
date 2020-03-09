package seleniumBaseApiUpdatedByPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckBoxesPage {
    private final WebDriver chromeDriver;

    public CheckBoxesPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        PageFactory.initElements(chromeDriver, this);
    }

    @FindBy
    WebElement checkBoxButton;

    public void clickAllCheckBoxesButtons(String selector) {
        checkBoxButton = chromeDriver.findElement(By.xpath(selector));
        checkBoxButton.click();
    }

}
