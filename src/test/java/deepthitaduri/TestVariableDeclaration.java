package deepthitaduri;

import org.junit.Test;

public class TestVariableDeclaration {

    //declare the variables here;
    int age = 16;
    char gender = 'F';
    String fullName = "Deepthi Taduri";
    boolean status = true ;

    @Test //declare the method as junit test
    public void variablesDec(){

        printVariables();

        //Business logic

        age = age+1;
        gender = 'M';
        fullName = fullName + " Srihan";

        printVariables();

        /*System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("FullName: "+ fullName);*/

        age = age-1;

        printVariables();

        /*System.out.println("Age: "+ age);
        System.out.println("Gender: "+gender);
        System.out.println("FullName: "+ fullName);
        System.out.println();*/

    }//variablesDec ends

    public void printVariables(){

        System.out.println("Age: "+ age);
        System.out.println("Gender: "+gender);
        System.out.println("FullName: "+ fullName);
        System.out.println();

    }

}//class ends
