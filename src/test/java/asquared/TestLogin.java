package asquared;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @project batch8
 * Creation date: 06-05-2019
 */
public class TestLogin extends global {
    @Test
    public void login(){

//Step 1	Go to http://newtours.demoaut.com
        logger.info("Go to http://newtours.demoaut.com");
        driver.get(baseUrl);

//Assert page title : Welcome: Mercury Tours
        logger.info("Assert page title : Welcome: Mercury Tours");
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

//Assert below data is displayed under Specials section
// Atlanta to Las Vegas	$398
        logger.info("Atlanta to Las Vegas $398");
        assertTrue(driver.findElement(
                By.xpath("//font[contains(text(),'Atlanta ')]/../following-sibling::td//b[text()='$398']")).isDisplayed());
// Boston to San Fransisco	$513
// Los Angeles to Chicago $168
// New York to Chicago	$198
// Phoenix to San Fransisco	 $213

// Click on Sign-On link

//Assert text is displayed: Welcome back to Mercury Tours! Enter your user information to access the member-only areas of this site. If you don't have a log-in, please fill out the registration form.

//Verify User Name and Password fields and Submit button exist

//Step 2	Enter asquared in user name field

//Step 3	Enter asquared in password field

//Step 4	Click on Submit

//Assert page title is Find a Flight: Mercury Tours:

//Step 5 Click on SIGN-OFF




    }
}
