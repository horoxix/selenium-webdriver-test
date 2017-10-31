package FireFox;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by hjohnson on 6/7/2017.
 */
public class JUnitLogInFireFox {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        baseUrl = "https://blackops.dev.sirsidynix.net/admin";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin(){
        driver.get(baseUrl);
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("testing");
        driver.findElement(By.id("submitBtn")).click();
    }

    @After
    public void tearDown() throws Exception{
    }

}

