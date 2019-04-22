package asquared;

import org.junit.Test;

/**
 * @project batch8
 * Creation date: 16-04-2019
 */
public class MultipleMethods {//class begis
    @Test
    public void reception(){//method begins
        System.out.println("Welcome desk");
        mainHall();
        storeRoom();
    }//method ends

    public void mainHall(){//method begins
        System.out.println("White board");
    }//method ends

    public void storeRoom(){
        System.out.println("Safe box");
    }
}//class ends
