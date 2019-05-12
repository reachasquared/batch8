package deepthitaduri;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestXpathAccessors extends global {

    @Test
    public void xpathAccessors() {


        //Step 1	Go to http://newtours.demoaut.com
        logger.info("Step 1 Go to http://newtours.demoaut.com");
        driver.get(baseUrl);
        //Assert page title : Welcome: Mercury Tours
        logger.info("Assert page title : Welcome: Mercury Tours");
        assertEquals("Welcome: Mercury Tours",driver.getTitle());
        //assertEquals("Welcome: Mercury Tours",driver.findElement(By.xpath("//title")));
        //Assert below data is displayed under Specials section
        logger.info("Assert below data is displayed under Specials section");
        // Atlanta to Las Vegas	$398
        logger.info("Atlanta to Las Vegas $398");
        assertTrue(driver.findElement(By.xpath("//font[contains(text(),'Atlanta')]")).isDisplayed());
        // Boston to San Fransisco	$513
        logger.info("Boston to San Fransisco $513");
        assertTrue(driver.findElement(By.xpath("//font[contains(text(),'Boston')]")).isDisplayed());
        // Los Angeles to Chicago $168
        logger.info("Los Angeles to Chicago $168");
        assertTrue(driver.findElement(By.xpath("//font[contains(text(),'Los')]")).isDisplayed());
        // New York to Chicago	$198
        logger.info("New York to Chicago $198");
        driver.findElement(By.xpath("//font[contains(text(),'New')]")).isDisplayed();
        // Phoenix to San Fransisco	 $213
        logger.info("Phoenix to San Fransisco\t $213");
        assertTrue(driver.findElement(By.xpath("//font[contains(text(),'Phoenix')]")).isDisplayed());
        // Click on Sign-On link
        logger.info("Click on Sign-On link");
        driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();
        //Assert text is displayed: Welcome back to Mercury Tours! Enter your user information to access the member-only areas of this site. If you don't have a log-in, please fill out the registration form.
        logger.info("Assert text is displayed: Welcome back to Mercury Tours! " +
                "Enter your user information to access the member-only areas of this site. " +
                "If you don't have a log-in, please fill out the registration form.");
        assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Welcome back to')]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//font[contains(text(),'Enter your user information to access the member-o')]")).isDisplayed());
        //Verify User Name and Password fields and Submit button exist
        logger.info("Verify User Name and Password fields and Submit button exist");
        assertTrue(driver.findElement(By.xpath("//input[@name='userName']")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//input[@name='password']")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//input[@name='login']")).isDisplayed());
        //Step 2	Enter asquared in user name field
        logger.info("Step 2 Enter asquared in user name field");
        driver.findElement
                (By.xpath("//input[@name='userName']")).sendKeys("asquared");
        //Step 3	Enter asquared in password field
        logger.info("Step 3 Enter asquared in password field");
        driver.findElement
                (By.xpath("//input[@name='password']")).sendKeys("asquared");
        //Step 4	Click on Submit
        logger.info("Step 4 Click on Submit");
        driver.findElement(By.xpath("//input[@name='login']")).click();
        //Assert page title is Find a Flight: Mercury Tours:
        logger.info("Assert page title is Find a Flight: Mercury Tours:");
        assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
        //assertEquals(driver.findElement(By.xpath("title")),"Find a Flight: Mercury Tours:");
        //Step 5 Click on SIGN-OFF
        logger.info("Step 5 Click on SIGN-OFF");
        driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();


    }
}
