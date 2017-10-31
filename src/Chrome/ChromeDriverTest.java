package Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by hjohnson on 6/5/2017.
 */
public class ChromeDriverTest {

    public static void main (String[] args){
        String baseURL = "http://www.google.com";
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.quit();

    }
}
