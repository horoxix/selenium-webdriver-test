package FireFox;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by hjohnson on 6/5/2017.
 */
public class FireFoxDriverDropDown {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://letskodeit.teachable.com/pages/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void singleSelect() throws InterruptedException {
        driver.get(baseUrl);
        WebElement dropDown = driver.findElement(By.id("carselect"));
        Select selection = new Select(dropDown);

        Thread.sleep(2000);
        selection.selectByValue("benz");
        System.out.println("Select Benz by Value");

        Thread.sleep(2000);
        selection.selectByIndex(2);
        System.out.println("Select Honda by Index");

        Thread.sleep(2000);
        selection.selectByVisibleText("BMW");
        System.out.println("Select BMW by Visible Text");

        Thread.sleep(2000);
        System.out.println("Print the list of all options");
        List<WebElement> options = selection.getOptions();
        int size = options.size();

        for (int i=0; i < size; i++){
            String optionName = options.get(i).getText();
            System.out.println(optionName);
        }

    }

    @Test
    public void multipleSelect() throws InterruptedException {
        driver.get(baseUrl);
        WebElement dropDown = driver.findElement(By.id("multiple-select-example"));
        Select selection = new Select(dropDown);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }

}
