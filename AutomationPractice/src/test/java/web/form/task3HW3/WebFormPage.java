package web.form.task3HW3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WebFormPage {
    private WebDriver chromeDriver;
    protected static final String WEBSITE = "https://formy-project.herokuapp.com/form";

    public WebFormPage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        PageFactory.initElements(chromeDriver, this);
    }

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "job-title")
    WebElement jobTitle;

    @FindBy(id = "radio-button-1")
    WebElement highSchool;

    @FindBy(id = "radio-button-2")
    WebElement college;

    @FindBy(id = "radio-button-3")
    WebElement gradSchool;

    @FindBy(id = "checkbox-1")
    WebElement male;

    @FindBy(id = "checkbox-2")
    WebElement female;

    @FindBy(id = "checkbox-3")
    WebElement preferNotToSay;

    @FindBy(id = "select-menu")
    WebElement selectAnOption;

    @FindBy(xpath = "//*[@value='1']")
    WebElement selectFirstOption;

    @FindBy(xpath = "//*[@value='2']")
    WebElement selectSecondOption;

    @FindBy(xpath = "//*[@value='3']")
    WebElement selectThirdOption;

    @FindBy(xpath = "//*[@value='4']")
    WebElement selectFourthOption;

    @FindBy(id = "datepicker")
    WebElement date;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-primary']")
    WebElement submit;

    public void enterAllDates() {
        firstName.sendKeys("Anna");
        lastName.sendKeys("Ivanova");
        jobTitle.sendKeys("Quality assurance");
        highSchool.click();
        college.click();
        gradSchool.click();
        male.click();
        female.click();
        preferNotToSay.click();
        selectAnOption.click();
        selectFirstOption.click();
        selectSecondOption.click();
        selectThirdOption.click();
        selectFourthOption.click();
        date.click();
        date.sendKeys("10/05/2020");
        date.sendKeys(Keys.ENTER);
        submit.click();
    }

    public void openWebsite() {
        chromeDriver.get(WEBSITE);
    }


}
