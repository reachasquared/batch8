package deepthitaduri;

import java.util.concurrent.TimeUnit;

import core.engine.AsquaredWebDriverFactory;
import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;

public class TestExportedVerifyLinks {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    //Before executing the script
    @Before
    public void setUp() throws Exception {
        driver = AsquaredWebDriverFactory.getDriver("chrome");
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLinksValidation() throws Exception {
        //open webpage
        driver.get("http://newtours.demoaut.com/");
        //get page title
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //Verify Sign-on and click  Sign-on link
        driver.findElement(By.linkText("SIGN-ON")).click();
        //assert title for Sign-on
        assertEquals("Sign-on: Mercury Tours", driver.getTitle());
        //Verify Support and click  Support
        driver.findElement(By.linkText("SUPPORT")).click();
        //assert title for Support
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //Verify Contact and click  Contact
        driver.findElement(By.linkText("CONTACT")).click();
        //assert title for Contact
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //Verify Home and click Home
        driver.findElement(By.linkText("Home")).click();
        //assert title for Home
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //Verify Flights and click  Flights
        driver.findElement(By.linkText("Flights")).click();
        //assert title for Flights
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //Verify Hotels and click  Hotels
        driver.findElement(By.linkText("Hotels")).click();
        //assert title for Hotels
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //Verify Car Rentals and click  Car Rentals
        driver.findElement(By.linkText("Car Rentals")).click();
        //assert title for Car Rentals
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //Verify Cruises and click  Cruises
        driver.findElement(By.linkText("Cruises")).click();
        //assert title for Cruises
        assertEquals("Cruises: Mercury Tours", driver.getTitle());
        //Verify Destinations and click Destinations
        driver.findElement(By.linkText("Destinations")).click();
        //assert title for Destinations
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //Verify Vacations and click Vacations
        driver.findElement(By.linkText("Vacations")).click();
        //assert title for Vacations
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
