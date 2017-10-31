package FireFox;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by hjohnson on 6/5/2017.
 */
public class FireFoxDriverListText {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://letskodeit.teachable.com/pages/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void test() throws InterruptedException {
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type, 'radio') and contains(@name, 'cars')]"));

        for(int i=0;i<radioButtons.size();i++){
            if(!radioButtons.get(i).isSelected()){
                radioButtons.get(i).click();
                Thread.sleep(2000);
            }
        }
    }

    @Test
    public void test2() throws InterruptedException {
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[contains(@type, 'checkbox') and contains(@name, 'cars')]"));

        for(int i=0;i<checkBoxes.size();i++){
            if(!checkBoxes.get(i).isSelected()){
                checkBoxes.get(i).click();
                Thread.sleep(2000);
            }
        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }

}
