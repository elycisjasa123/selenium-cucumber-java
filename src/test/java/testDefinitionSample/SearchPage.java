package testDefinitionSample;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchPage {
    private WebDriver driver;
    @Given("User navigates to Google site")
    public void user_is_in_google_site(){
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
    }

    @When("User searched for a {string}")
    public void user_input(String string){
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Test Automation");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.RETURN);
    }

    @Then("User should be redirected to Result Page")
    public void user_clicks_search(){
        String title = driver.getTitle();
        Assert.assertEquals("Test Automation - Google Search", title);
        System.out.println("Searched successfully");
        driver.quit();
    }
}
