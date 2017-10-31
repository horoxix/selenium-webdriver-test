package FireFox;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by hjohnson on 6/5/2017.
 */
public class DesiredCapabilitiesTest {

    public static void main (String[] args){
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\geckodriver.exe");
        caps.setBrowserName("firefox");
        caps.setPlatform(Platform.WINDOWS);
        String baseURL = "https://letskodeit.teachable.com/pages/practice";

        WebDriver driver = new FirefoxDriver(caps);
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.quit();

    }
}
