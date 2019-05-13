package asquared;

import core.engine.global;
import org.junit.Test;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * @project batch8
 * Creation date: 12-05-2019
 */
public class TestRegistrationXpath extends global {

    @Test
    public void registration() {


        // Go to newtours website
        logger.info("Go to newtours website" + baseUrl);
        driver.get(baseUrl);

        //verify page title is "Welcome: Mercury Tours"
        logger.info("verify page title is \"Welcome: Mercury Tours\"");
        assertEquals(driver.getTitle(), "Welcome: Mercury Tours");

        //Verify REGISTER link is present using WebDriver linktext method
        logger.info("Verify REGISTER link is present using WebDriver linktext method");
        assertTrue(driver.findElement(
                By.xpath("//a[contains(text(),'REGISTER')]"))
                .isDisplayed());

        //Click on REGISTER link using xpath
        logger.info("Click on REGISTER link using xpath");
        driver.findElement(
                By.xpath("//a[contains(text(),'REGISTER')]")).click();


        //Enter asquared in First Name - using xpath @name
        logger.info("Enter asquared in First Name - using xpath @name");
        driver.findElement(By.xpath("//input[@name='firstName']")).clear();
        driver.findElement(By.xpath("//input[@name='firstName']"))
                .sendKeys("asquared");

        //Enter asquared in Last Name - using following-sibling by label

        logger.info("Enter asquared in Last Name - " +
                "using following-sibling by label");
        driver.findElement(By.xpath("//b[contains(text(),'Last ')]/../../following-sibling::td/input"))
                .clear();
        driver.findElement(By.xpath("//b[contains(text(),'Last ')]/../../following-sibling::td/input"))
                .sendKeys("asquared");



        //Enter 9049049044 in Phone - using descendant by label
        driver.findElement(By.xpath("//font[contains(text(),'Contact ')]/../../../../../../../descendant::td[7]/input"))
                .clear();
        driver.findElement(By.xpath("//font[contains(text(),'Contact ')]/../../../../../../../descendant::td[7]/input"))
                .sendKeys("9049049044");

        //Select UNITED KINGDOM from Country

        //Click Submit

        //Verify "Dear asquare asquared," text is displayed

        //verify Sign-off link exists

        // Verify REGISTER image is displayed

        //click SIGN-OFF
    }
}
