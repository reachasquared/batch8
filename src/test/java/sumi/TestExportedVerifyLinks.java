package sumi;
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
//Before executing the script {
       @Before
    public void setUp() throws Exception {
        driver = AsquaredWebDriverFactory.getDriver("chrome");

        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testAuto4ValidateTestCase() throws Exception {
    //opent web page
        driver.get("http://newtours.demoaut.com/");
        //welcome:mercurytours should appear
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //click on sign-on link
        driver.findElement(By.linkText("SIGN-ON")).click();
        //verify sign-on link
        assertEquals("Sign-on: Mercury Tours", driver.getTitle());
        //click on support link
        driver.findElement(By.linkText("SUPPORT")).click();
        //vrify the support link
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on contact link
        driver.findElement(By.linkText("CONTACT")).click();
        //verify link contact is opening
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on home link
        driver.findElement(By.linkText("Home")).click();
        //verify title welcome :mercury tours
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //click on flights link
        driver.findElement(By.linkText("Flights")).click();
        //verify the flight finder page is open
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //click on hotels link
        driver.findElement(By.linkText("Hotels")).click();
        //verify the hotels link open
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on car rentals link
        driver.findElement(By.linkText("Car Rentals")).click();
        //verify the car rentals link open
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on cruises link
        driver.findElement(By.linkText("Cruises")).click();
        //verify the cruises link open
        assertEquals("Cruises: Mercury Tours", driver.getTitle());
        //click on destinations link
        driver.findElement(By.linkText("Destinations")).click();
        //verify destinations link is open
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on vactions link
        driver.findElement(By.linkText("Vacations")).click();
        //verify the vacations link open
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on register
        driver.findElement(By.linkText("REGISTER")).click();
        //verify the register link open
        assertEquals("Register: Mercury Tours", driver.getTitle());

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
