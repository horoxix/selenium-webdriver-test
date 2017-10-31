package seleniumpackage;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;
/**
 * Created by hjohnson on 6/7/2017.
 */
//use Assert for critical functionality, and verify for non-critical
public class seleniumIDEtest {
        private WebDriver driver;
        private String baseUrl;

        @Before
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "http://www.letskodeit.com/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        @Test
        public void loadPage() throws Exception {
            driver.get(baseUrl + "/");
            driver.findElement(By.id("i90scv3glabel")).click();
            //driver.findElement(By.cssSelector("button.navbar-toggle")).click();
            driver.findElement(By.linkText("Practice")).click();
        }

        @Test
        public void clickButton() {
            driver.get("https://letskodeit.teachable.com/p/practice");
            driver.findElement(By.id("bmwradio")).click();
        }

        @After
        public void tearDown() throws Exception {
            Thread.sleep(3000);
            driver.quit();
        }
    }

