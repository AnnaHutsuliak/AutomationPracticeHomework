package variantSecondGrowTaskSecond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InfoSubmit {
    ChromeDriver chromeDriver = new ChromeDriver();
    @Test (testName = "correct data input without sending ")
    public void submitOneHundredWords() {
        chromeDriver.get("https://www.bbc.com/");
        chromeDriver.manage().window().maximize();
        WebElement newsButtonClick = chromeDriver.findElement(By.xpath("//li[@class='orb-nav-newsdotcom']"));
        newsButtonClick.click();
        String newPage = chromeDriver.getWindowHandle();
        WebElement moreButtonClick = chromeDriver.switchTo().window(newPage).findElement(By.xpath("//button/span[@class= 'gel-long-primer gs-u-ph']"));
        moreButtonClick.click();
        WebElement haveYouSayButton = chromeDriver.findElement(By.xpath("//li/a[@class='nw-o-link']/span[contains(text(),'Have Your Say')]"));
        haveYouSayButton.click();
        String newPage2 = chromeDriver.getWindowHandle();
        WebElement howToShareWithBBCButton = chromeDriver.switchTo().window(newPage2).findElement(By.xpath
                ("//*[@id=\"index-page\"]/div/div[2]/div[2]/div[3]/div/div[2]/div/a"));
        new WebDriverWait(chromeDriver, 30).until(ExpectedConditions.visibilityOf(howToShareWithBBCButton));
        howToShareWithBBCButton.click();
        /* Пробувала по XPath локатору. На вебці він знаходив один результат. Але тест не проходив..Копі-пастнула із вебки.
        WebElement howToShareWithBBCButton = chromeDriver.switchTo().window(newPage).findElement(By.xpath
                ("//h3[@class='gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text'][text()='How to share with BBC News']"));
        howToShareWithBBCButton.click();
        Помилка писала:
        org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <h3 class="gs-c-promo-heading__title gel-pica-bold nw-o-link-split__text">...</h3> is not clickable at point (665, 602). Other element would receive the click: <a class="gs-c-promo-heading gs-o-faux-block-link__overlay-link gel-pica-bold nw-o-link-split__anchor" href="/news/10725415">...</a>
  (Session info: chrome=80.0.3987.122)
         */
        WebElement fillWithName = chromeDriver.switchTo().window(newPage2).findElement(By.xpath("//input[@class='contact-form__input'][@id='fullName']"));
        fillWithName.sendKeys("Ann Hutsulak");
        WebElement fillWithEmail = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='email']"));
        fillWithEmail.sendKeys("anhutsulak1234512@gmail.com");
        WebElement fillWithTownCountry = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='town']"));
        fillWithTownCountry.sendKeys("Lviv");
        WebElement fillWithPhoneNumber = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='phone']"));
        fillWithPhoneNumber.sendKeys("3809722222222");
        WebElement fillWithComments  = chromeDriver.findElement(By.xpath("//textarea[@class='contact-form__textarea'][@id='message']"));
        fillWithComments.sendKeys("If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.\n" +
                "If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.\n" +
                "If input is correct, do not press Send (let’s not spam BBC with random crap). Afterwards, check that you are on a different page (this check should always fail, since we didn’t press Submit).\n" +
                "Imagine that you need to develop BBC tests as close to reality as possible, while only having access to production environment where you are \n");
        WebElement sendButton = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input--submit'][@id='submit']"));
        Assert.assertEquals("https://www.bbc.com/news/10725415", chromeDriver.getCurrentUrl(), "Current URL is correct webpage");
    }


    @Test (testName = "correct data input without sending ")
    public void submitTwoHundredWords() {
        chromeDriver.get("https://www.bbc.com/");
        chromeDriver.manage().window().maximize();
        WebElement newsButtonClick = chromeDriver.findElement(By.xpath("//li[@class='orb-nav-newsdotcom']"));
        newsButtonClick.click();
        String newPage = chromeDriver.getWindowHandle();
        WebElement moreButtonClick = chromeDriver.switchTo().window(newPage).findElement(By.xpath("//button/span[@class= 'gel-long-primer gs-u-ph']"));
        moreButtonClick.click();
        WebElement haveYouSayButton = chromeDriver.findElement(By.xpath("//li/a[@class='nw-o-link']/span[contains(text(),'Have Your Say')]"));
        haveYouSayButton.click();
        String newPage2 = chromeDriver.getWindowHandle();
        WebElement howToShareWithBBCButton = chromeDriver.switchTo().window(newPage2).findElement(By.xpath
                ("//*[@id=\"index-page\"]/div/div[2]/div[2]/div[3]/div/div[2]/div/a"));
        new WebDriverWait(chromeDriver, 30).until(ExpectedConditions.visibilityOf(howToShareWithBBCButton));
        howToShareWithBBCButton.click();
        WebElement fillWithName = chromeDriver.switchTo().window(newPage2).findElement(By.xpath("//input[@class='contact-form__input'][@id='fullName']"));
        fillWithName.sendKeys("Ann Hutsulak");
        WebElement fillWithEmail = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='email']"));
        fillWithEmail.sendKeys("anhutsulak1234512@gmail.com");
        WebElement fillWithTownCountry = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='town']"));
        fillWithTownCountry.sendKeys("Lviv");
        WebElement fillWithPhoneNumber = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='phone']"));
        fillWithPhoneNumber.sendKeys("3809722222222");
        WebElement fillWithComments  = chromeDriver.findElement(By.xpath("//textarea[@class='contact-form__textarea'][@id='message']"));
        fillWithComments.sendKeys("If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.\n" +
                "If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.\n" +
                "If input is correct, do not press Send (let’s not spam BBC with random crap). Afterwards, check that you are on a different page (this check should always fail, since we didn’t press Submit).\n" +
                "Imagine that you need to develop BBC tests as close to reality as possible, while only having access to production environment where you are \n" +
                "If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.\n" +
                "If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.\n" +
                "If input is correct, do not press Send (let’s not spam BBC with random crap). Afterwards, check that you are on a different page (this check should always fail, since we didn’t press Submit).\n" +
                "Imagine that you need to develop BBC tests as close to reality as possible, while only having access to production environment where you are \n");
        WebElement sendButton = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input--submit'][@id='submit']"));
        Assert.assertEquals("https://www.bbc.com/news/10725415", chromeDriver.getCurrentUrl(), "Current URL is correct webpage");
    }


    @Test (testName = "correct data input without Email ")
    public void submitWithEmptyEmail() {
        chromeDriver.get("https://www.bbc.com/");
        chromeDriver.manage().window().maximize();
        WebElement newsButtonClick = chromeDriver.findElement(By.xpath("//li[@class='orb-nav-newsdotcom']"));
        newsButtonClick.click();
        String newPage = chromeDriver.getWindowHandle();
        WebElement moreButtonClick = chromeDriver.switchTo().window(newPage).findElement(By.xpath("//button/span[@class= 'gel-long-primer gs-u-ph']"));
        moreButtonClick.click();
        WebElement haveYouSayButton = chromeDriver.findElement(By.xpath("//li/a[@class='nw-o-link']/span[contains(text(),'Have Your Say')]"));
        haveYouSayButton.click();
        String newPage2 = chromeDriver.getWindowHandle();
        WebElement howToShareWithBBCButton = chromeDriver.switchTo().window(newPage2).findElement(By.xpath
                ("//*[@id=\"index-page\"]/div/div[2]/div[2]/div[3]/div/div[2]/div/a"));
        new WebDriverWait(chromeDriver, 30).until(ExpectedConditions.visibilityOf(howToShareWithBBCButton));
        howToShareWithBBCButton.click();
        WebElement fillWithName = chromeDriver.switchTo().window(newPage2).findElement(By.xpath("//input[@class='contact-form__input'][@id='fullName']"));
        fillWithName.sendKeys("Ann Hutsulak");
        WebElement fillWithTownCountry = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='town']"));
        fillWithTownCountry.sendKeys("Lviv");
        WebElement fillWithPhoneNumber = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='phone']"));
        fillWithPhoneNumber.sendKeys("3809722222222");
        WebElement fillWithComments  = chromeDriver.findElement(By.xpath("//textarea[@class='contact-form__textarea'][@id='message']"));
        fillWithComments.sendKeys("If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.\n" +
                "If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.\n" +
                "If input is correct, do not press Send (let’s not spam BBC with random crap). Afterwards, check that you are on a different page (this check should always fail, since we didn’t press Submit).\n" +
                "Imagine that you need to develop BBC tests as close to reality as possible, while only having access to production environment where you are \n" +
                "If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.\n" +
                "If input is not correct (required field empty), click Send. You should verify that you stayed on the same page afterwards.\n" +
                "If input is correct, do not press Send (let’s not spam BBC with random crap). Afterwards, check that you are on a different page (this check should always fail, since we didn’t press Submit).\n" +
                "Imagine that you need to develop BBC tests as close to reality as possible, while only having access to production environment where you are \n");
        WebElement sendButton = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input--submit'][@id='submit']"));
        sendButton.click();
        Assert.assertEquals("https://www.bbc.com/news/10725415", chromeDriver.getCurrentUrl(), "Current URL is correct webpage");
    }

    @Test (testName = "correct data input without Comments ")
    public void submitWithEmptyComment() {
        chromeDriver.get("https://www.bbc.com/");
        chromeDriver.manage().window().maximize();
        WebElement newsButtonClick = chromeDriver.findElement(By.xpath("//li[@class='orb-nav-newsdotcom']"));
        newsButtonClick.click();
        String newPage = chromeDriver.getWindowHandle();
        WebElement moreButtonClick = chromeDriver.switchTo().window(newPage).findElement(By.xpath("//button/span[@class= 'gel-long-primer gs-u-ph']"));
        moreButtonClick.click();
        WebElement haveYouSayButton = chromeDriver.findElement(By.xpath("//li/a[@class='nw-o-link']/span[contains(text(),'Have Your Say')]"));
        haveYouSayButton.click();
        String newPage2 = chromeDriver.getWindowHandle();
        WebElement howToShareWithBBCButton = chromeDriver.switchTo().window(newPage2).findElement(By.xpath
                ("//*[@id=\"index-page\"]/div/div[2]/div[2]/div[3]/div/div[2]/div/a"));
        new WebDriverWait(chromeDriver, 30).until(ExpectedConditions.visibilityOf(howToShareWithBBCButton));
        howToShareWithBBCButton.click();
        WebElement fillWithName = chromeDriver.switchTo().window(newPage2).findElement(By.xpath("//input[@class='contact-form__input'][@id='fullName']"));
        fillWithName.sendKeys("Ann Hutsulak");
        WebElement fillWithTownCountry = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='town']"));
        fillWithTownCountry.sendKeys("Lviv");
        WebElement fillWithPhoneNumber = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input'][@id='phone']"));
        fillWithPhoneNumber.sendKeys("3809722222222");
        WebElement sendButton = chromeDriver.findElement(By.xpath("//input[@class='contact-form__input--submit'][@id='submit']"));
        sendButton.click();
        Assert.assertEquals("https://www.bbc.com/news/10725415", chromeDriver.getCurrentUrl(), "Current URL is correct webpage");
    }
}
