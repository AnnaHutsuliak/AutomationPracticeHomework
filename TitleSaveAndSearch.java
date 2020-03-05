package variantSecondGrowTaskFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TitleSaveAndSearch {
    private ChromeDriver chromeDriver;

    @BeforeClass
    public void appSetup() {
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
    public void testSearchCategoryLinkAndCheckSearchResults() {
        String newPage = chromeDriver.getWindowHandle();
        WebElement toSearchText = chromeDriver.switchTo().window(newPage).findElement(By.xpath
                ("//a[@class= 'gs-c-section-link gs-c-section-link--truncate nw-c-section-link nw-o-link nw-o-link--no-visited-state']/span"));
        String textToBeSearched = toSearchText.getText();
        WebElement searchBar = chromeDriver.findElement(By.id("orb-search-q"));
        searchBar.sendKeys(textToBeSearched);
        WebElement searchButton = chromeDriver.findElement(By.id("orb-search-button"));
        searchButton.click();
        String newPageWithTextWasResearched = chromeDriver.getWindowHandle();
        WebElement firstTittleInOpenedSearchPage = chromeDriver.switchTo().window(newPageWithTextWasResearched).findElement(By.xpath
                ("//*[@id=\"search-content\"]/ol/li[1]/article/div/h1/a"));  //залишила цей примхливий XPath, довбалась довго, інші не знаходили елемент, тест падав =(
        Assert.assertTrue(firstTittleInOpenedSearchPage.getText().contains(textToBeSearched), "Title matches with searched text");
    }
}
