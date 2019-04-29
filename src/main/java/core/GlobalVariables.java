package core;

import org.junit.Test;

public class GlobalVariables {
    //variable declaration at method level
    //Integer variable that can hold an integer value
  public   int  age;
    //character variable that can hold
   public char  gender;
   //string variable that can one string data
   public String  fullName;
   //Boolean variable can hold only either true or false
   public boolean  status;
   @Test
    public void repeatPrint() {
        System.out.println(" Age " + age);
        System.out.println(" Gender " + gender);
        System.out.println(" FullName " + fullName);
        System.out.println(" Status " + status);
    }
}
