package jayashreesudhakar;

import org.junit.Test;

import java.security.PublicKey;

public class MyHome {
    @Test
    public void Reception() {
        String Test = "\033[4mRECEPTION\033[0m";
        System.out.println(Test);
       //System.out.println((char)27 + "[4m RECEPTION" + (char)27);
        System.out.println("1.Welcome Desk");
        System.out.println("2.Telephone");
        System.out.println("3.Fax Machine");
    mainHall();
    storeRoom();
    }

    public void mainHall() {
        String Test = "\033[4mMAIN HALL\033[0m";
        System.out.println(Test);
   // System.out.println("MAIN HALL");
        System.out.println("1.Pictures");
        System.out.println("2.Television");
        System.out.println("3.White Board");
    }


    public void storeRoom() {
        String Test = "\033[4mSTORE ROOM\033[0m";
        System.out.println(Test);
     //   System.out.println("STORE ROOM");
        System.out.println("1.Paints");
        System.out.println("2.Paint Brush");
        System.out.println("3.Art Sheets");

    }




}
