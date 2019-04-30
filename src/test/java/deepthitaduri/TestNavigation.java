package deepthitaduri;

import core.engine.AsquaredWebDriverFactory;
import core.engine.global;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class TestNavigation extends global {

    @Test
    public void testNavigation(){

        //Step 1	Go to http://newtours.demoaut.com
        logger.info("Step 1: Go to http://newtours.demoaut.com");
        driver.get(baseUrl);
        //Assert page title : Welcome: Mercury Tours
        logger.info("Assert page title : Welcome: Mercury Tours");
        assertEquals(driver.getTitle(),"Welcome: Mercury Tours");
        //Step 2	Click on SIGN-ON link in Header
        logger.info("Step 2: Click on SIGN-ON link in Header");
        driver.findElement(By.linkText("SIGN-ON")).click();
        //Assert page title : Sign-on: Mercury Tours
        logger.info("Assert page title : Sign-on: Mercury Tours");
        assertEquals("Sign-on: Mercury Tours", driver.getTitle());
        //Step 3	Click on SUPPORT link in Header
        logger.info(": Step 3Click on SUPPORT link in Header");
        driver.findElement(By.linkText("SUPPORT")).click();
        //Assert page title : Under Construction: Mercury Tours
        logger.info("Assert page title : Under Construction: Mercury Tours");
        assertEquals("Under Construction: Mercury Tours",driver.getTitle());
        //Step 4	Click on CONTACT link in Header
        logger.info("Step 4: Click on CONTACT link in Header");
        driver.findElement(By.linkText("CONTACT")).click();
        //Assert page title : Under Construction: Mercury Tours
        logger.info("Assert page title : Under Construction: Mercury Tours");
        assertEquals("Under Construction: Mercury Tours",driver.getTitle());
        //Step 5	Click on Home link in left side menu
        logger.info("Step 5: tClick on Home link in left side menu");
        driver.findElement(By.linkText("Home")).click();
        //Assert page title : Welcome: Mercury Tours
        logger.info("Assert page title : Welcome: Mercury Tours");
        assertEquals("Welcome: Mercury Tours",driver.getTitle());
        //Step 6	Click on Flight link in left side menu
        logger.info("Step 6: Click on Flight link in left side menu");
        driver.findElement(By.linkText("Flights")).click();
        //Assert page title : Welcome: Mercury Tours
        logger.info("Assert page title : Welcome: Mercury Tours");
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //Step 7	Click on Hotels link in left side menu
        logger.info("Step 7: Click on Hotels link in left side menu");
        driver.findElement(By.linkText("Hotels")).click();
        //Assert page title : Under Construction: Mercury Tours
        logger.info("Assert page title : Under Construction: Mercury Tours");
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //Step 8	Click on Car Rentals link in left side menu
        logger.info("Step 8: Click on Car Rentals link in left side menu");
        driver.findElement(By.linkText("Car Rentals")).click();
        //Assert page title : Under Construction: Mercury Tours
        logger.info("Assert page title : Under Construction: Mercury Tours");
        assertEquals("Under Construction: Mercury Tours",driver.getTitle());
        //Step 9	Click on Cruises link in left side menu
        logger.info("Step 9: Click on Cruises link in left side menu");
        driver.findElement(By.linkText("Cruises")).click();
        //Assert page title : Cruises: Mercury Tours
        logger.info("Assert page title : Cruises: Mercury Tours");
        assertEquals("Cruises: Mercury Tours",driver.getTitle());
        //Step 10	Click on Destinations link in left side menu
        logger.info("Step 10: Click on Destinations link in left side menu");
        driver.findElement(By.linkText("Destinations")).click();
        //Assert page title : Under Construction: Mercury Tours
        logger.info("Assert page title : Under Construction: Mercury Tours");
        assertEquals("Under Construction: Mercury Tours", driver.getTitle());
        //Step 11	Click on Vacations link in left side menu
        logger.info("Step 11: Click on Vacations link in left side menu");
        driver.findElement(By.linkText("Vacations")).click();
        //Assert page title : Under Construction: Mercury Tours
        logger.info("Assert page title : Under Construction: Mercury Tours");
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

}
