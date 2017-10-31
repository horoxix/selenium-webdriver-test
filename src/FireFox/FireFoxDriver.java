package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by hjohnson on 6/5/2017.
 */
public class FireFoxDriver {

    public static void main (String[] args){
        //System property for geckodriver needs to be set before the firefoxdriver
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseURL = "http://www.google.com/";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
        //driver.findElement(By.xpath(".//*[@id='_fZl']")).click();
        driver.findElement(By.name("btnG")).click();
        driver.quit();
    }
}
