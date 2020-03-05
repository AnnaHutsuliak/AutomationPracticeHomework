package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class VerifyButtons<chromeDriver> {
    private ChromeDriver chromeDriver;

    @BeforeClass
    public void appSetup() {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser() {
        chromeDriver.quit();
    }

    @Test(priority = 1)
    public void checkPrimaryButton() {
        chromeDriver.findElement(By.xpath("//*[@class='btn btn-lg btn-primary']")).click();
    }

    @Test(priority = 2)
    public void checkSuccessButton() {
        chromeDriver.findElement(By.xpath("//*[@class='btn btn-lg btn-success']")).click();
    }

    @Test(priority = 3)
    public void checkInfoButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class, 'btn-info')]")).click();
    }

    @Test(priority = 4)
    public void checkWarningButton() {

        chromeDriver.findElement(By.xpath("//*[text() = 'Warning']")).click();
    }

    @Test(priority = 5)
    public void checkDangerButton() {

        chromeDriver.findElement(By.xpath("//*[text() = 'Danger']")).click();
    }

    @Test(priority = 6)
    public void checkLinkButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Link']")).click();
    }

    @Test(priority = 7)
    public void checkLeftButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary') and text()='Left']")).click();
    }

    @Test(priority = 8)
    public void checkMiddleButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary') and text()='Middle']")).click();
    }

    @Test(priority = 9)
    public void checkRightButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary') and text()='Right']")).click();
    }

    @Test(priority = 10)
    public void checkFirstButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary') and text()='1']")).click();
    }

    @Test(priority = 11)
    public void checkSecondButton() {
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary') and text()='2']")).click();
    }

    @Test(priority = 12)
    public void checkDropdownButton() {
        chromeDriver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
    }

    @Test(priority = 13)
    public void checkDropdownFirstLinkButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");  //залишила,бо падав цей тест при тестуванні всього класу
        chromeDriver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
        chromeDriver.findElement(By.xpath("//div//a[contains(text(),'Dropdown link 1')]")).click();
    }

    @Test(priority = 14)
    public void checkDropdownSecondLinkButton() {
        chromeDriver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
        chromeDriver.findElement(By.xpath("//div//a[contains(text(),'Dropdown link 2')]")).click();
    }

}
