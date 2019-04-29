package deepthitaduri;

import org.junit.Test;

public class MultipleMethods {//class begins
    @Test

    public void reception(){//method begins

           System.out.println("Welcome desk");
           mainHall();//calling mainHall method
           storeRoom();//calling storeRoom method
         }//method ends

    public void mainHall(){//method begins

        System.out.println("White board");

         }//method ends
    public void storeRoom(){//method begins
        System.out.println("Safe box");
         }
}//class ends
