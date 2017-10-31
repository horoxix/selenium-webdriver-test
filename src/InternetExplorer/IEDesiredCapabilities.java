package InternetExplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

/**
 * Created by hjohnson on 6/6/2017.
 */
public class IEDesiredCapabilities {

    public static void main (String[] args){
        WebDriver driver;
        String baseURL = "https://letskodeit.teachable.com/pages/practice";

        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
        caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
        caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
        caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        System.setProperty("webdriver.ie.driver", "C:\\Selenium\\drivers\\IEDriverServer.exe");
        driver = new InternetExplorerDriver(caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.quit();

    }
}
