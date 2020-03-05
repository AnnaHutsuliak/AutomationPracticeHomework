package variantSecondGrowTaskFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TitlesCheck {
    private ChromeDriver chromeDriver;

    @BeforeClass
    public void appSetupAndOpen() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.bbc.com/");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.xpath("//li[@class='orb-nav-newsdotcom']")).click();
    }

    @AfterClass
    public void closeBrowser() {
        chromeDriver.quit();
    }

    @Test
    public void checkFirstTittle() {
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticle = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//a[@class='gs-c-promo-heading gs-o-faux-block-link__overlay-link gel-paragon-bold nw-o-link-split__anchor']/h3"));
        Assert.assertEquals(nameArticle.getText(), "Fight against virus at 'decisive point' - WHO1", "Title doesn't match the title website");
    }

    @Test
    public void checkThirdTittle() {
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticleThird = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//a[@class='gs-c-promo-heading gs-o-faux-block-link__overlay-link gel-pica-bold nw-o-link-split__anchor']/h3"));
        Assert.assertEquals(nameArticleThird.getText(), "Japan to close all schools to halt virus spread", "Title doesn't match the title website");
    }

    @Test
    public void checkFourthTittle() {
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticleFourth = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//a[@class='gs-c-promo-heading gs-o-faux-block-link__overlay-link gel-pica-bold nw-o-link-split__anchor']/h3"));
        Assert.assertEquals(nameArticleFourth.getText(), "Coronavirus: The ‘propaganda push’ in China", "Title doesn't match the title website");
    }

    @Test
    public void checkFifthTittle() {
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticleFifth = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//a[@class='gs-c-promo-heading gs-o-faux-block-link__overlay-link gel-pica-bold nw-o-link-split__anchor']/h3"));
        Assert.assertEquals(nameArticleFifth.getText(), "Taylor Swift literally plays The Man in new video", "Title doesn't match the title website");
    }

    @Test
    public void checkSixthTittle() {
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticleSixth = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//a[@class='gs-c-promo-heading gs-o-faux-block-link__overlay-link gel-pica-bold nw-o-link-split__anchor']/h3"));
        Assert.assertEquals(nameArticleSixth.getText(), "London airport expansion halted over climate change", "Title doesn't match the title website");
    }

    @Test
    public void checkSeventhTittle() {
        String newsPage = chromeDriver.getWindowHandle();
        WebElement nameArticleSeventh = chromeDriver.switchTo().window(newsPage).findElement(By.xpath
                ("//a[@class='gs-c-promo-heading gs-o-faux-block-link__overlay-link gel-pica-bold nw-o-link-split__anchor']/h3"));
        Assert.assertEquals(nameArticleSeventh.getText(), "UK nears acid test in trade talks with EU", "Title doesn't match the title website");
    }
}

