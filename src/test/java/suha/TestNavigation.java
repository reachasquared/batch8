package suha;

import core.engine.global;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestNavigation extends global {
    //declare variables

    //Create Before/set up method

    @Test
    public void testNavigation(){

  //Step 1	Go to http://newtours.demoaut.com
        logger.info("Step 1 Go to http://newtours.demoaut.com");
                driver.get(baseUrl);

//Assert page title : Welcome: Mercury Tours
        assertEquals (driver.getTitle(),"Welcome: Mercury Tours");

 //Step 2	Click on SIGN-ON link in Header
        logger.info("Step 2 Click on SIGN-ON link in Header");
        driver.findElement(By.linkText("SIGN-ON")).click();

//Assert page title : Sign-on: Mercury Tours
        assertEquals(driver.getTitle(),"Sign-on: Mercury Tours");

//Step 3	Click on SUPPORT link in Header
        logger.info("Step 3	Click on SUPPORT link in Header");
        driver.findElement(By.linkText("SUPPORT")).click();

//Assert page title : Under Construction: Mercury Tours
        assertEquals(driver.getTitle(),"Under Construction: Mercury Tours");

//Step 4	Click on CONTACT link in Header
        logger.info("Step 4	Click on CONTACT link in Header");
        driver.findElement(By.linkText("CONTACT")).click();

//Assert page title : Under Construction: Mercury Tours
        assertEquals(driver.getTitle(),"Under Construction: Mercury Tours");

//Step 5	Click on Home link in left side menu
        logger.info("Step 5	Click on Home link in left side menu");
        driver.findElement(By.linkText("Home")).click();

//Assert page title : Welcome: Mercury Tours
assertEquals(driver.getTitle(),"Welcome: Mercury Tours");

//Step 6	Click on Flights link in left side menu
        logger.info("Step 6	Click on Flights link in left side menu");
        driver.findElement(By.linkText("Flights")).click();

//Assert page title : Welcome: Mercury Tours
        assertEquals(driver.getTitle(),"Welcome: Mercury Tours");

//Step 7	Click on Hotels link in left side menu
        logger.info("Step 7 Click on Hotels link in left side menu");
        driver.findElement(By.linkText("Hotels")).click();

//Assert page title : Under Construction: Mercury Tours
        assertEquals(driver.getTitle(),"Under Construction: Mercury Tours");

//Step 8	Click on Car Rentals link in left side menu
        logger.info("Step 8 Click on Car Rentals link in left side menu");
        driver.findElement(By.linkText("Car Rentals")).click();

//Assert page title : Under Construction: Mercury Tours
        assertEquals(driver.getTitle(),"Under Construction: Mercury Tours");

//Step 9	Click on Cruises link in left side menu
        logger.info("Step 9 Click on Cruises link in left side menu");
        driver.findElement(By.linkText("Cruises")).click();

//Assert page title : Cruises: Mercury Tours
        assertEquals(driver.getTitle(),"Cruises: Mercury Tours");

//Step 10	Click on Destinations link in left side menu
        logger.info("Step 10 Click on Destinations link in left side menu");
        driver.findElement(By.linkText("Destinations")).click();

//Assert page title : Under Construction: Mercury Tours
        assertEquals(driver.getTitle(),"Under Construction: Mercury Tours");

//Step 11	Click on Vacations link in left side menu
        logger.info("Step 11 Click on Vacations link in left side menu");
        driver.findElement(By.linkText("Vacations")).click();

//Assert page title : Under Construction: Mercury Tours
        assertEquals(driver.getTitle(),"Under Construction: Mercury Tours");

    }

}
