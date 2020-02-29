package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Buttons {
    ChromeDriver chromeDriver = new ChromeDriver();
   @Test (priority=1)
   public void checkPrimaryButton() {
       chromeDriver.get("https://formy-project.herokuapp.com/buttons");
       chromeDriver.findElement(By.xpath("//*[@class='btn btn-lg btn-primary']")).click();
}

    @Test (priority=2)
    public void checkSuccessButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//*[@class='btn btn-lg btn-success']")).click();
    }

    @Test (priority=3)
    public void checkInfoButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//button[contains(@class, 'btn-info')]")).click();
    }
    @Test (priority=4)
    public void checkWarningButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//*[text() = 'Warning']")).click();
    }
    @Test(priority=5)
    public void checkDangerButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//*[text() = 'Danger']")).click();
    }

    @Test (priority=6)
    public void checkLinkButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn') and text()='Link']")).click();
    }

    @Test (priority=7)
    public void checkLeftButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary') and text()='Left']")).click();
    }

    @Test(priority=8)
    public void checkMiddleButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary') and text()='Middle']")).click();
    }

    @Test (priority=9)
    public void checkRightButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary') and text()='Right']")).click();
    }

    @Test (priority=10)
    public void checkFirstButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary') and text()='1']")).click();
    }

    @Test (priority=11)
    public void checkSecondButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary') and text()='2']")).click();
    }

    @Test (priority=12)
    public void checkDropdownButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
    }

    @Test (priority=13)
    public void checkDropdownFirstLinkButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
        chromeDriver.findElement(By.xpath("//div//a[contains(text(),'Dropdown link 1')]")).click();
    }

    @Test (priority=14)
    public void checkDropdownSecondLinkButton() {
        chromeDriver.get("https://formy-project.herokuapp.com/buttons");
        chromeDriver.findElement(By.xpath("//button[@id='btnGroupDrop1']")).click();
        chromeDriver.findElement(By.xpath("//div//a[contains(text(),'Dropdown link ')]")).click();
    }
}
