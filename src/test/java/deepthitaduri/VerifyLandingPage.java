package deepthitaduri;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class VerifyLandingPage extends global {

    @Test
    public void verifyLandingPage(){

        logger.info("Go to the website "+baseUrl);
        driver.get(baseUrl);

        logger.info("Verify Mercury Tours logo is displayed on the top left");
        assertTrue(driver.findElement
                (By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/p[1]/img[1]")).isDisplayed());

        logger.info("Verify one cool summer banner image exists");
        assertTrue(driver.findElement
                (By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/img[1]")).isDisplayed());

        logger.info(("Verify that SIGN-ON link is displayed in the horizontal menu:"));
        assertTrue(driver.findElement
                (By.linkText("SIGN-ON")).isDisplayed());

        logger.info(("Verify that REGISTER link is displayed in the horizontal menu:"));
        assertTrue(driver.findElement
                (By.linkText("REGISTER")).isDisplayed());

        logger.info(("Verify that SUPPORT link is displayed in the horizontal menu:"));
        assertTrue(driver.findElement
                (By.linkText("SUPPORT")).isDisplayed());

        logger.info(("Verify that CONTACT link is displayed in the horizontal menu:"));
        assertTrue(driver.findElement
                (By.linkText("CONTACT")).isDisplayed());

        logger.info("Verify that the Username label exists");
        assertTrue(driver.findElement
                (By.xpath("//font[contains(text(),'User ')]")).isDisplayed());

        logger.info("Verify that the username field exists");
        assertTrue(driver.findElement
                (By.name("userName")).isDisplayed());

        logger.info("Verify that the Password label exists");
        assertTrue(driver.findElement
                (By.xpath("//font[contains(text(),'Password:')]")).isDisplayed());

        logger.info("Verify that the Password field exists");
        assertTrue(driver.findElement(
                By.name("password")).isDisplayed());

        logger.info("Verify that Sign in button is displayed");
        assertTrue(driver.findElement
                (By.name("login")).isDisplayed());

        logger.info(("Verify that sub section Destinations is displayed "));
        assertTrue(driver.findElement
                (By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form[@name='home']/table/tbody/tr[5]/td[1]/img[1]")).isDisplayed());

        logger.info(("Verify that sub section Vacations is displayed "));
        assertTrue(driver.findElement
                (By.xpath("//tr[7]//td[1]//img[1]")).isDisplayed());

        logger.info("Verify that sub section Register is displayed");
        assertTrue(driver.findElement
                (By.xpath("//tr[9]//td[1]//img[1]")).isDisplayed());

        logger.info(("Verify that sub section Links is displayed "));
        assertTrue(driver.findElement
                (By.xpath("//tr[11]//td[1]//img[1]")).isDisplayed());

        logger.info("Verify that Specials sub section exists");
        assertTrue(driver.findElement(By.xpath("//tr[11]//td[1]//img[1]")).isDisplayed());

        logger.info("Verify that Specials sub section with Atlanta to LAs Vegas to exists");
        assertTrue(driver.findElement(By.xpath("//font[contains(text(),'Atlanta ')]")).isDisplayed());




    }

}
