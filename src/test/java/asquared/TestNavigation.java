package asquared;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

/**
 * @project batch8
 * Creation date: 29-04-2019
 */
public class TestNavigation extends global {

    @Test
    public void testNav(){


        //Step 1	Go to http://newtours.demoaut.com
        logger.info("Step 1 - Go to http://newtours.demoaut.com");
        driver.get(baseUrl);

        //Assert page title : Welcome: Mercury Tours
        logger.info("Assert page title : Welcome: Mercury Tours");
        assertEquals(driver.getTitle(), "Welcome: Mercury Tours");

        //Step 2	Click on SIGN-ON link in Header
        logger.info("Step 2 - Click on SIGN-ON link in Header");
        driver.findElement(By.linkText("SIGN-ON")).click();

        //Assert page title : Sign-on: Mercury Tours
        logger.info("Assert page title : Sign-on: Mercury Tours");
        assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");

        //Step 3	Click on SUPPORT link in Header
        logger.info("Step 3 - Click on SUPPORT link in Header");
        driver.findElement(By.linkText("SUPPORT")).click();

        //Assert page title : Under Construction: Mercury Tours

        //Step 4	Click on CONTACT link in Header

        //Assert page title : Under Construction: Mercury Tours

        //Step 5	Click on Home link in left side menu

        //Assert page title : Welcome: Mercury Tours

        //Step 6	Click on Flight link in left side menu

        //Assert page title : Welcome: Mercury Tours

        //Step 7	Click on Hotels link in left side menu

        //Assert page title : Under Construction: Mercury Tours

        //Step 8	Click on Car Rentals link in left side menu

        //Assert page title : Under Construction: Mercury Tours

        //Step 9	Click on Cruises link in left side menu

        //Assert page title : Cruises: Mercury Tours

        //Step 10	Click on Destinations link in left side menu

        //Assert page title : Under Construction: Mercury Tours

        //Step 11	Click on Vacations link in left side menu

        //Assert page title : Under Construction: Mercury Tours


    }

}
