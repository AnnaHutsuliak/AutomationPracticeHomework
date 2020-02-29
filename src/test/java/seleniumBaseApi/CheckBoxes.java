package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckBoxes {
    ChromeDriver chromeDriver = new ChromeDriver();
    @DataProvider()
    public Object[][] dataProviderCheckWithXPath() {
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox");
        return new Object[][]{
                {"//input[@id='checkbox-1']"},
                {"//input[@id='checkbox-2']"},
                {"//input[@id='checkbox-3']"},
        };
    }

    @Test (dataProvider = "dataProviderCheckWithXPath")
    public void checkBoxesWithXpath (Object data){
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox");
        chromeDriver.findElement(By.xpath((String) data)).click();
           }

    @DataProvider()
    public Object[][] dataProviderCheckWithCss() {
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox");
        return new Object[][]{
                {"input#checkbox-1"},
                {"input#checkbox-2"},
                {"input#checkbox-3"},
        };
    }

    @Test (dataProvider = "dataProviderCheckWithCss")
    public void checkBoxesWithCss (Object data){
        chromeDriver.get("https://formy-project.herokuapp.com/checkbox");
        chromeDriver.findElement(By.cssSelector((String) data)).click();
    }
}
