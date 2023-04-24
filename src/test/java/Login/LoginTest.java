package Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class LoginTest {
    private WebDriver driver;

    @Given("I am on Swag Labs login page")
    public void goToSwagLabsLogin(){
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter {string} as username")
    public void enterUsername(String username){
        driver.findElement(By.cssSelector("[data-test=username]")).clear();
        driver.findElement(By.cssSelector("[data-test=username]")).sendKeys(username);
    }

    @And("I enter {string} as password")
    public void enterPassword(String password){
        driver.findElement(By.cssSelector("[data-test=password]")).clear();
        driver.findElement(By.cssSelector("[data-test=password]")).sendKeys(password);
    }

    @When("I click on Login button")
    public void clickLoginButton(){
        driver.findElement(By.cssSelector("[data-test=login-button]")).click();
    }

    @Then("The error message {string} show")
    public void errorMessageShow(String message){
        String getErrorMessage = driver.findElement(By.cssSelector("[data-test=error]")).getText();
        assertTrue(getErrorMessage.contains(message));
        driver.quit();
    }

    @Then("I will redirect to sauce demo inventory")
    public void loginSuccessfully(){
        String getCurrentURL = driver.getCurrentUrl();
        assertTrue(getCurrentURL.contains("/inventory.html"));
        driver.quit();
    }
}
