package Mohamed;

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


    //Before executing the script
    @Before
    public void setUp() throws Exception {
        driver = AsquaredWebDriverFactory.getDriver("chrome");
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLogIn() throws Exception {
     // Open webpage
        driver.get("http://www.newtours.demoaut.com/");
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        assertTrue(isElementPresent(By.linkText("SIGN-ON")));
        assertTrue(isElementPresent(By.linkText("REGISTER")));
        driver.findElement(By.name("userName")).click();
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("asquared");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("asquared");
        driver.findElement(By.name("login")).click();
        assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
        driver.findElement(By.linkText("SIGN-OFF")).click();
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
