package asquared;

import core.GlobalVariables;
import org.junit.Test;

/**
 * @project batch8
 * Creation date: 23-04-2019
 */
public class TestInheritance extends GlobalVariables {
    @Test
    public void testInheritance(){

        age = 10;
        gender = 'F';
        weekDay = "Sunday";
        status = true;

        displayValues();

        age = age + 5;
        weekDay = weekDay + "s";

        displayValues();

    }

}
