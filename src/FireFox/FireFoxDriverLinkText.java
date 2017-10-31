package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Timer;


/**
 * Created by hjohnson on 6/5/2017.
 */
public class FireFoxDriverLinkText {

    public static void main (String[] args){
        //System property for geckodriver needs to be set before the firefoxdriver
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseURL = "http://www.reddit.com/";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("all")).click();
        driver.findElement(By.partialLinkText("sign up")).click();
        driver.quit();
    }
}
