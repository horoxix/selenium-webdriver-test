package FireFox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjohnson on 6/7/2017.
 */
public class JUnitElementStateTest {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void testLogin() throws InterruptedException {
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys("letskodeit");
        System.out.println(element.isEnabled());
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

}

