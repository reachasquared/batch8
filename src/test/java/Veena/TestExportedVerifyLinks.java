package Veena;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import core.engine.AsquaredWebDriverFactory;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExportedVerifyLinks {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    //before executing the script
    @Before
    public void setUp() throws Exception {
        driver = AsquaredWebDriverFactory.getDriver("chrome");
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testAuto4Record() throws Exception {
        //open web page
        driver.get("http://www.newtours.demoaut.com/");
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        driver.findElement(By.linkText("SIGN-ON")).click();
        assertEquals("Sign-on: Mercury Tours", driver.getTitle());
        driver.findElement(By.linkText("SUPPORT")).click();
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        driver.findElement(By.linkText("CONTACT")).click();
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        driver.findElement(By.linkText("Home")).click();
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        driver.findElement(By.linkText("Flights")).click();
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        driver.findElement(By.linkText("Hotels")).click();
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        driver.findElement(By.linkText("Car Rentals")).click();
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        driver.findElement(By.linkText("Cruises")).click();
        assertEquals("Cruises: Mercury Tours", driver.getTitle());
        driver.findElement(By.linkText("Destinations")).click();
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        driver.findElement(By.linkText("Vacations")).click();
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
