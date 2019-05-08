package deepthitaduri;

import core.engine.AsquaredWebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class TestVerifyLinks {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    //Before executing the script
    @Before
    public void setUp() throws Exception {
        driver = AsquaredWebDriverFactory.getDriver("chrome");
        baseUrl = "http://newtours.demoaut.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testVerifyLinks(){


        // Go to http://newtours.demoaut.com/

        driver.get(baseUrl);

        // Verify page title is "Welcome: Mercury Tours"
        driver.getTitle().equalsIgnoreCase("Welcome: Mercury Tours");

        // Verify Home link exist
        assertTrue(driver.findElement(By.linkText("Home")).isDisplayed());

        // Verify Flights link exist
        assertTrue(driver.findElement(By.linkText("Flights")).isDisplayed());

        // Verify Hotels link exist
        assertTrue(driver.findElement(By.linkText("Hotels")).isDisplayed());

        //Verify Cars link exist
        assertTrue(driver.findElement(By.linkText("Car Rentals")).isDisplayed());

        // Verify Cruises link exist
        assertTrue(driver.findElement(By.linkText("Cruises")).isDisplayed());

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}
