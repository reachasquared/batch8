package suha;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import core.engine.AsquaredWebDriverFactory;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
// import all the necessary class files
public class TestExportedVerifyLinks {
    //class begins
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
//annotation before executing the script
    @Before
    public void setUp() throws Exception {
        //method begins
        driver = AsquaredWebDriverFactory.getDriver("chrome");

        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
//Executing the script
    @Test
    public void testNavigation1() throws Exception {
        //open web page
        driver.get("http://newtours.demoaut.com/");
        //verify welcome:Mercury Tours displayed
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //click on sign-on link
        driver.findElement(By.linkText("SIGN-ON")).click();
        //verify sign-on link open
        assertEquals("Sign-on: Mercury Tours", driver.getTitle());
        //click on support link
        driver.findElement(By.linkText("SUPPORT")).click();
        //verify support link is showing under construction
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on contact link
        driver.findElement(By.linkText("CONTACT")).click();
        //verify the link contact is showing under construction
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on home link
        driver.findElement(By.linkText("Home")).click();
        //verify welcome:Mercury Tours page is displaying
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //click on flights link
        driver.findElement(By.linkText("Flights")).click();
        //verify flight finder page is open
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //click on hotels link
        driver.findElement(By.linkText("Hotels")).click();
        //verify the link is showing under construction
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on car rentals link
        driver.findElement(By.linkText("Car Rentals")).click();
        //verify the link is showing under construction
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on link cruises
        driver.findElement(By.linkText("Cruises")).click();
        //verify the link is taking to the cruises page
        assertEquals("Cruises: Mercury Tours", driver.getTitle());
        //click on destinations
        driver.findElement(By.linkText("Destinations")).click();
        //verify the page is showing under construction
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //click on vacations link
        driver.findElement(By.linkText("Vacations")).click();
        //verify the link is showing under construction
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
            }
//annotation after
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
//class ends