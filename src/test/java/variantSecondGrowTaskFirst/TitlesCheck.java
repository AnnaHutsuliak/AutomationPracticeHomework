package variantSecondGrowTaskFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TitlesCheck {
    ChromeDriver chromeDriver = new ChromeDriver();

    @BeforeTest
    public void openNewsTag() {
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.bbc.com/");
        WebElement element = chromeDriver.findElement(By.xpath("//li[@class='orb-nav-newsdotcom']"));
        element.click();
    }

    @Test
    public void checkFirstTittle() {
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticle = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//a[@class='gs-c-promo-heading gs-o-faux-block-link__overlay-link gel-paragon-bold nw-o-link-split__anchor']/h3"));
        Assert.assertEquals(nameArticle.getText(), "Fight against virus at 'decisive point' - WHO1", "Title doesn't match the title website");
    }

    @Test
    public void checkThirdTittle(){
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticleThird = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//*[contains(text(), 'Japan to close all schools to halt virus spread')]"));
        Assert.assertEquals(nameArticleThird.getText(), "Japan to close all schools to halt virus spread", "Title matches the third title website");
    }

    @Test
    public void checkFourthTittle(){
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticleFourth = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//*[contains(text(), 'Coronavirus: The ‘propaganda push’ in China')]"));
        Assert.assertEquals(nameArticleFourth.getText(), "Coronavirus: The ‘propaganda push’ in China", "Title matches the fourth title website");
    }

    @Test
    public void checkFifthTittle(){
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticleFifth = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//*[contains(text(), 'Taylor Swift literally plays The Man in new video')]"));
        Assert.assertEquals(nameArticleFifth.getText(), "Taylor Swift literally plays The Man in new video", "Title matches the fifth title website");
    }

    @Test
    public void checkSixthTittle(){
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticleSixth = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//*[contains(text(), 'London airport expansion halted over climate change')]"));
        Assert.assertEquals(nameArticleSixth.getText(), "London airport expansion halted over climate change", "Title matches the sixth title website");
    }

    @Test
    public void checkSeventhTittle(){
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticleSeventh = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//*[contains(text(), 'UK nears acid test in trade talks with EU')]"));
        Assert.assertEquals(nameArticleSeventh.getText(), "UK nears acid test in trade talks with EU", "Title matches the seventh title website");
    }
}

