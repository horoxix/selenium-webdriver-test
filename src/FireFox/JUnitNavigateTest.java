package FireFox;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjohnson on 6/7/2017.
 */
public class JUnitNavigateTest {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);
        String newUrl = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
        driver.navigate().to(newUrl);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

}

