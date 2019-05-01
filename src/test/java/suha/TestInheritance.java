package suha;

import core.GlobalVariables;
import org.junit.Test;

public class TestInheritance extends GlobalVariables {
    @Test
    public void testInheritance() {
        age = 10;
        gender = 'f';
        fullName = "suha sasubilli";
        status = true;
        /*System.out.println(" Age " + age);
        System.out.println(" Gender " + gender);
        System.out.println(" FullName " + fullName);
        System.out.println(" Status " + status);
        System.out.println();*/
        repeatPrint();
//business logic
        age = age + 5;
        fullName = "Suha sasubilli";

       /* System.out.println(" Age " + age);
        System.out.println(" Gender " + gender);
        System.out.println(" FullName " + fullName);
        System.out.println(" Status " + status);
        System.out.println();*/
        repeatPrint();

    }

    public void repeatPrint() {
        System.out.println(" Age " + age);
        System.out.println(" Gender " + gender);
        System.out.println(" FullName " + fullName);
        System.out.println(" Status " + status);
    }
}