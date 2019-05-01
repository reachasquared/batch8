package asquared;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

/**
 * @project batch8
 * Creation date: 30-04-2019
 */
public class VerifyLandingPage extends global {

    @Test
    public void landingPage(){

        logger.info("go to the website " + baseUrl);
        driver.get(baseUrl);

        logger.info("Verify that Logo is displayed");
        assertTrue(driver.findElement
                (By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/p[1]/img[1]")).isDisplayed());

        logger.info("Verify One cool summer banner image exists");
        //
        // assertTrue(driver.findElement(By.name()));

        logger.info("Verify that the User Name label is displayed");
        assertTrue(driver.findElement(
                By.xpath("//font[contains(text(),'User ')]")).isDisplayed());

        logger.info("Verify that the User Name field is displayed");
        assertTrue(driver.findElement(By.name("userName")).isDisplayed());

        logger.info("Verify that the password label is displayed");
        //assertTrue(driver.findElement(By.name()));

        logger.info("Verify that the password field is displayed");
        assertTrue(driver.findElement(By.name("password")).isDisplayed());

        logger.info("Verify that the sign in button is displayed");
        assertTrue(driver.findElement(By.name("login")).isDisplayed());


    }

}
