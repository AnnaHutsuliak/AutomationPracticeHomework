package variantSecondGrowTaskSecond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class InfoSubmit {
    private ChromeDriver chromeDriver;

    @BeforeClass
    public void appSetup() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.bbc.com/");
        chromeDriver.manage().window().maximize();
        WebElement newsButtonClick = chromeDriver.findElement(By.xpath("//li[@class='orb-nav-newsdotcom']"));
        newsButtonClick.click();
        String newPage = chromeDriver.getWindowHandle();
        WebElement moreButtonClick = chromeDriver.switchTo().window(newPage).findElement(By.xpath("//button/span[@class= 'gel-long-primer gs-u-ph']"));
        moreButtonClick.click();
        WebElement haveYouSayButton = chromeDriver.findElement(By.xpath("//li/a[@class='nw-o-link']/span[contains(text(),'Have Your Say')]"));
        haveYouSayButton.click();
    }

    @BeforeMethod
    public void openPage() {
        String newPage2 = chromeDriver.getWindowHandle();
        WebElement howToShareWithBBCButton = chromeDriver.switchTo().window(newPage2).findElement(By.xpath
                ("//*[@id=\"index-page\"]/div/div[2]/div[2]/div[3]/div/div[2]/div/a"));
        new WebDriverWait(chromeDriver, 30).until(ExpectedConditions.visibilityOf(howToShareWithBBCButton));
        howToShareWithBBCButton.click();
        chromeDriver.switchTo().window(newPage2).findElement(By.xpath("//input[@class='contact-form__input'][@id='fullName']"));
    }

    @AfterClass
    public void closeBrowser() {
        chromeDriver.quit();
    }

    @Test(dataProvider = "dataProviderOneHundredWords", dataProviderClass = DataProviderBBC.class)
    public void submitOneHundredWords(String name, String email, String city, String number, String comment) {
        String newPage2 = chromeDriver.getWindowHandle();
        chromeDriver.switchTo().window(newPage2).findElement(By.xpath("//input[@class='contact-form__input'][@id='fullName']")).sendKeys(name);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='email']")).sendKeys(email);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='town']")).sendKeys(city);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='phone']")).sendKeys(number);
        chromeDriver.findElement(By.xpath("//textarea[@class='contact-form__textarea'][@id='message']")).sendKeys(comment);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input--submit'][@id='submit']"));
        Assert.assertEquals(chromeDriver.getCurrentUrl(), "https://www.bbc.com/news/10725415", "Current URL is not correct webpage");
    }

    @Test(dataProvider = "dataProviderTwoHundredWords", dataProviderClass = DataProviderBBC.class)
    public void submitTwoHundredWords(String name, String email, String city, String number, String comment) {
        String newPage2 = chromeDriver.getWindowHandle();
        chromeDriver.switchTo().window(newPage2).findElement(By.xpath("//input[@class='contact-form__input'][@id='fullName']")).sendKeys(name);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='email']")).sendKeys(email);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='town']")).sendKeys(city);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='phone']")).sendKeys(number);
        chromeDriver.findElement(By.xpath("//textarea[@class='contact-form__textarea'][@id='message']")).sendKeys(comment);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input--submit'][@id='submit']"));
        Assert.assertEquals(chromeDriver.getCurrentUrl(), "https://www.bbc.com/news/10725415", "Current URL is not correct webpage");
    }

    @Test(dataProvider = "dataProviderOneHundredWords", dataProviderClass = DataProviderBBC.class)
    public void submitWithEmptyEmail(String name, String email, String city, String number, String comment) {
        String newPage2 = chromeDriver.getWindowHandle();
        chromeDriver.switchTo().window(newPage2).findElement(By.xpath("//input[@class='contact-form__input'][@id='fullName']")).sendKeys(name);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='email']")).sendKeys("");
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='town']")).sendKeys(city);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='phone']")).sendKeys(number);
        chromeDriver.findElement(By.xpath("//textarea[@class='contact-form__textarea'][@id='message']")).sendKeys(comment);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input--submit'][@id='submit']")).click();
        Assert.assertEquals(chromeDriver.getCurrentUrl(), "https://www.bbc.com/news/10725415", "Current URL is not correct webpage");
    }

    @Test(dataProvider = "dataProviderOneHundredWords", dataProviderClass = DataProviderBBC.class)
    public void submitWithEmptyComment(String name, String email, String city, String number, String comment) {
        String newPage2 = chromeDriver.getWindowHandle();
        chromeDriver.switchTo().window(newPage2).findElement(By.xpath("//input[@class='contact-form__input'][@id='fullName']")).sendKeys(name);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='email']")).sendKeys(email);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='town']")).sendKeys(city);
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='phone']")).sendKeys(number);
        chromeDriver.findElement(By.xpath("//textarea[@class='contact-form__textarea'][@id='message']")).sendKeys("");
        chromeDriver.findElement(By.xpath("//input[@class='contact-form__input--submit'][@id='submit']")).click();
        Assert.assertEquals(chromeDriver.getCurrentUrl(), "https://www.bbc.com/news/10725415", "Current URL is not correct webpage");
    }
}

