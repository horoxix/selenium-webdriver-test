package InternetExplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by hjohnson on 6/6/2017.
 */
public class IEDriverTest {

    public static void main (String[] args){
        String baseURL = "http://www.google.com";
        System.setProperty("webdriver.ie.driver", "C:\\Selenium\\drivers\\IEDriverServer.exe");
        WebDriver driver;
        driver = new InternetExplorerDriver();
        driver.get(baseURL);
        driver.quit();

    }
}
