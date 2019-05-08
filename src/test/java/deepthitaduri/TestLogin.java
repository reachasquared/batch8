package deepthitaduri;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestLogin extends global {
    @Test
    public void login(){

        //Step 1	Go to http://newtours.demoaut.com
        logger.info("Step 1 Go to the website");
        driver.get(baseUrl);
        //Assert page title : Welcome: Mercury Tours
        logger.info("Assert page title : Welcome: Mercury Tours");
        assertEquals(driver.getTitle(),"Welcome: Mercury Tours");
        //Assert below data is displayed under Specials section
        logger.info("Assert below data is displayed under Specials section");
        // Atlanta to Las Vegas	$398
        logger.info("Atlanta to Las Vegas $398");
        assertTrue(driver.findElement
                (By.xpath("//font[contains(text(),'Atlanta ')]/../following-sibling::td//b[text()='$398']")).isDisplayed());
        // Boston to San Fransisco	$513
        logger.info("Boston to San Fransisco $513");
        assertTrue(driver.findElement
                (By.xpath("//font[contains(text(),'Boston ')]/../following-sibling::td//b[contains(text(),'$513')]")).isDisplayed());
        // Los Angeles to Chicago $168
        logger.info("Los Angeles to Chicago $168");
        assertTrue(driver.findElement
                (By.xpath("//font[contains(text(),'Los')]/../following-sibling::td//b[contains(text(),'$168')]")).isDisplayed());
        // New York to Chicago	$198
        logger.info("New York to Chicago $198");
        assertTrue(driver.findElement
                (By.xpath("//font[contains(text(),'New')]/../following-sibling::td//b[contains(text(),'$198')]")).isDisplayed());
        // Phoenix to San Fransisco	 $213
        logger.info("Phoenix to San Fransisco $213");
        assertTrue(driver.findElement(By.xpath
                ("//font[contains(text(),'Phoenix')]/../following-sibling::td//b[contains(text(),'$213')]")).isDisplayed());
        // Click on Sign-On link
        logger.info("Click on Sign-On link");
        driver.findElement
                (By.linkText("SIGN-ON")).click();
        /*Assert text is displayed: Welcome back to Mercury Tours!
        Enter your user information to access the member-only areas of this site.
        If you don't have a log-in, please fill out the registration form.*/
        logger.info("Welcome back to Mercury Tours!");
        assertTrue(driver.findElement
                (By.xpath("//b[contains(text(),'Welcome')]")).isDisplayed());
        logger.info("Enter your user information to access the member-only areas of this site.\n" +
                "        If you don't have a log-in, please fill out the registration form!");
        assertTrue(driver.findElement
                (By.xpath("//font[contains(text(),' Enter your user information to access the member-only ')]")).isDisplayed());
        //Verify User Name and Password fields and Submit button exist
        logger.info("Verify User Name and Password fields and Submit button exist");
        assertTrue(driver.findElement
                (By.name("userName")).isDisplayed());
        assertTrue(driver.findElement
                (By.name("password")).isDisplayed());
        assertTrue(driver.findElement
                (By.name("login")).isDisplayed());
        //Step 2	Enter asquared in user name field
        logger.info("Step 2 Enter asquared in user name field");
        driver.findElement
                (By.name("userName")).sendKeys("asquared");
        //Step 3	Enter asquared in password field
        logger.info("Step 3 Enter asquared in password field");
        driver.findElement
                (By.name("password")).sendKeys("asquared");
        //Step 4	Click on Submit
        logger.info("Step 4 Click on Submit");
        driver.findElement
                (By.name("login")).click();
        //Assert page title is Find a Flight: Mercury Tours:
        logger.info("Assert page title is Find a Flight: Mercury Tours:");
        //assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
        assertEquals(driver.getTitle(),"Find a Flight: Mercury Tours:");
        //Step 5 Click on SIGN-OFF
        logger.info("Step 5 Click on SIGN-OFF");
        driver.findElement
                (By.linkText("SIGN-OFF")).click();
    }//method ends
}//class ends
