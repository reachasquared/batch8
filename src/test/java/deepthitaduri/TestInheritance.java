package deepthitaduri;

import core.GlobalVariables;
import org.junit.Test;

public class TestInheritance extends GlobalVariables {
    @Test //declaring as executable test - annotation

    public void testInheritance(){

        age = 10;
        gender = 'F';
        fullName = "deepthitaduri";
        status = true;

        // Business Logic

        age = age+5;
        fullName = fullName+" Taduri";
        gender='M';
        status = false;

        displayValues();

        age = age-3;
        fullName = fullName+" Kiran";
        gender='M';
        status = true;

        displayValues();


    }//method ends

}//class ends
