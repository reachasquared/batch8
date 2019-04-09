package asquared;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class Test_VerifyLinks {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        //driver = new FirefoxDriver();
        driver = AsquaredWebDriverFactory.getDriver("chrome");

        baseUrl = "http://newtours.demoaut.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    @Test

    public void VerifyRegistration() {

        // Go to http://newtours.demoaut.com/
        driver.get(baseUrl);

        //verify page title is "Welcome: Mercury Tours"
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        //Verify REGISTER link is present
        assertTrue(driver.findElement(By.linkText("REGISTER")).isDisplayed());


        //Click on REGISTER link
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).click();
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("asquared");

    }
}
