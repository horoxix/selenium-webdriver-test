package Safari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by hjohnson on 6/6/2017.
 */
public class SafariDriverTest {

    public static void main (String[] args){
        String baseURL = "http://www.google.com";
        System.setProperty("webdriver.safari.driver", "C:\\Selenium\\drivers\\IEDriverServer.exe");
        WebDriver driver;
        driver = new SafariDriver();
        driver.get(baseURL);
        driver.quit();

    }
}
