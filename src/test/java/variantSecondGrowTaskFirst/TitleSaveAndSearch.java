package variantSecondGrowTaskFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TitleSaveAndSearch {
    ChromeDriver chromeDriver = new ChromeDriver();

    @BeforeTest
    public void openWebSite() {
        chromeDriver.get("https://www.bbc.com/");
        chromeDriver.manage().window().maximize();
        WebElement newsClick = chromeDriver.findElement(By.xpath("//li[@class='orb-nav-newsdotcom']"));
        newsClick.click();
    }
     @Test
    public void testSearchCategoryLinkAndCheckSearchResults() {
         String newPage = chromeDriver.getWindowHandle();
         WebElement toSearchText = chromeDriver.switchTo().window(newPage).findElement(By.xpath
                 ("//a[@class= 'gs-c-section-link gs-c-section-link--truncate nw-c-section-link nw-o-link nw-o-link--no-visited-state']/span"));
         String textToBeSearched= toSearchText.getText();
         WebElement searchBar = chromeDriver.findElement(By.id("orb-search-q"));
         searchBar.sendKeys(textToBeSearched);
         WebElement searchButton = chromeDriver.findElement(By.id("orb-search-button"));
         searchButton.click();
         String newPageWithTextWasResearched = chromeDriver.getWindowHandle();
         WebElement firstTittleInOpenedSearchPage = chromeDriver.switchTo().window(newPageWithTextWasResearched).findElement(By.xpath
                 ("//*[@id=\"search-content\"]/ol/li[1]/article/div/h1/a"));
         Assert.assertTrue(firstTittleInOpenedSearchPage.getText().contains(textToBeSearched), "Title matches with searched text");
          }
}
