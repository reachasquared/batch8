package suha;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class VerifyLandingPage extends global {

    @Test
   public void verifyLandingPage(){
        logger.info("go to the website + baseUrl");
        driver.get(baseUrl);

        logger.info("Verify that Logo is displayed");
        assertTrue(driver.findElement(By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/p[1]/img[1]")).isDisplayed());

        logger.info("Verify one cool summer banner image");
        assertTrue(driver.findElement(By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/img[1]")).isDisplayed());

        logger.info("Verify that the sign-on button is displayed");
        assertTrue(driver.findElement(By.name("login")).isDisplayed());

        logger.info("Verify that the Register button is displayed");
        assertTrue(driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).isDisplayed());

        logger.info("Verify that the Support button is displayed ");
        assertTrue(driver.findElement(By.xpath("//a[contains(text(),'SUPPORT')]")).isDisplayed());

        logger.info("Verify that the Contact button is displayed");
        assertTrue(driver.findElement(By.xpath("//a[contains(text(),'CONTACT')]")).isDisplayed());

         logger.info("Verify that the User Name label is displayed");
         assertTrue(driver.findElement(By.xpath("//font[contains(text(),'User ')]")).isDisplayed());

         logger.info("Verify that the User Name is displayed");
         assertTrue(driver.findElement(By.name("userName")).isDisplayed());

         logger.info("Verify that Password label is displayed");
         assertTrue(driver.findElement(By.xpath("//font[contains(text(),'Password:')]")).isDisplayed());

         logger.info("Verify that the password is displayed");
         assertTrue(driver.findElement(By.name("password")).isDisplayed());

        logger.info("Verify that the Destinations button is displayed");
        assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Destinations')]")).isDisplayed());

        logger.info("Verify that the Vacations button is displayed");
        assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Vacations')]")).isDisplayed());

        logger.info("Verify that the Register link is displayed");
        assertTrue(driver.findElement(By.xpath("//tr[9]//td[1]//img[1]")).isDisplayed());

        logger.info("Verify that the subsection links is displayed");
        assertTrue(driver.findElement(By.xpath("//tr[11]//td[1]//img[1]")).isDisplayed());

        logger.info("Verify that the Atlanta to Las Vegas $398 information is displayed in subsection specials");
        assertTrue(driver.findElement(By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]")).isDisplayed());
   }



}
