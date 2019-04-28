package suha;

import org.junit.Test;

public class TestVariableDeclaration {//class begins
    int  age;
    char  gender;
    String  fullName;
    boolean  status;
    @Test
        public void Variables(){//method begins
       //declaring variables

       age =  16;
       gender  = 'M';
       fullName  = " Suha Sasubilli ";
       status  =  true;

      /* System.out.println(age);
       System.out.println(gender);
       System.out.println(fullName);
       System.out.println(status);*/
      repeatPrint();

       /*System.out.println("Age:"+ age);
       System.out.println("Gender:"+ gender);
       System.out.println("FullName:"+ fullName);
       System.out.println("Status:"+ status);*/
       repeatPrint();
       //business logic
        age  =  age + 1;
        gender  =  'f';
        fullName = " fullName " + fullName;

       /* System.out.println("Age"+ age);
        System.out.println("Gender"+ gender);
        System.out.println("FullName"+ fullName);
        System.out.println("Status"+ status);
        System.out.println();*/
repeatPrint();
        age  =  age - 1;
        /*System.out.println("Age"+ age);
        System.out.println("Gender"+ gender);
        System.out.println("FullName"+ fullName);
        System.out.println("Status"+ status);*/
        repeatPrint();
    }//method ends
    public void repeatPrint(){
        System.out.println(" Age " + age);
        System.out.println(" Gender " + gender);
        System.out.println(" FullName " + fullName);
        System.out.println(" Status " + status);
    }

}
