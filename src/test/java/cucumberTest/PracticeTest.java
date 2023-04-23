package cucumberTest;
import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PracticeTest {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ubuntu/Documents/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Test Automation");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys(Keys.RETURN);
        String title = driver.getTitle();
        Assert.assertEquals("Test Automation - Google Search", title);
        System.out.println("Searched successfully");
        driver.quit();
    }

}
