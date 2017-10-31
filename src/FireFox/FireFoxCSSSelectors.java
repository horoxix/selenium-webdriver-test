package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by hjohnson on 6/6/2017.
 */
public class FireFoxCSSSelectors {

    public static void main (String[] args){
        //System property for geckodriver needs to be set before the firefoxdriver
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseURL = "https://letskodeit.teachable.com/pages/practice";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[id='displayed-text'")).click();
        driver.findElement(By.cssSelector("input#displayed-text")).click();
        driver.findElement(By.cssSelector("#displayed-text")).click();
        driver.quit();
    }
}
