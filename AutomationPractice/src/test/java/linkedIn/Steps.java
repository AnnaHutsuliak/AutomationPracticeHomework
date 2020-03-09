package linkedIn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {
    private WebDriver driver;

    @Given("^Open Login Page$")
    public void openPage() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        driver.manage().window().maximize();

    }

    @When("^Enter the Username and Password$")
    public void inputInvalidData() {
        driver.findElement(By.id("username")).sendKeys("Annnnnn");
        driver.findElement(By.id("password")).sendKeys("Annnnnn123");
    }

    @Then("^Click Sign Button and check error message appeared$")
    public void clickSignButton() {
        driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
        WebElement text = driver.findElement(By.id("error-for-username"));
        Assert.assertEquals(text.getText(), "Please enter a valid username");
    }

    @Then("^Close chrome driver$")
    public void closeBrowser() {
        driver.quit();
    }

}