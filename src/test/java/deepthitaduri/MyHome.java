package deepthitaduri;

import org.junit.Test;

public class MyHome {

    @Test
    public void myHomeDetails(){//method begins

        reception();//calling reception method
        mailHall();//calling mainHall method
        storeRoom();//calling storeRoom method


    }
    //reception method begins
    public void reception(){
        //printing the items which belong to storeRoom
        System.out.println("RECEPTION");
        System.out.println("---------"); //printing underline for the heading RECEPTION
        System.out.println("1.Welcome Desk");
        System.out.println("2.Welcome Board");
        System.out.println("3.Telephone");
        System.out.println("");//extra line break to create space between outputs from methods on console
    }//reception method ends
    //mailHall method begins
    public void mailHall(){
        //printing the items which belong to mailHall
        System.out.println("MAIN HALL");
        System.out.println("---------");//printing underline for the heading MAIN HALL
        System.out.println("1.White board");
        System.out.println("2.Writing table");
        System.out.println("3.Pencils");
        System.out.println("");//extra line break to create space between outputs from methods on console
    }//mailHall method ends
    //storeRoom method begins
    public void storeRoom(){
        //printing the items which belong to mailHall
        System.out.println("STORE ROOM");
        System.out.println("---------");//printing underline for the heading STORE ROOM
        System.out.println("1.Safe Deposit box ");
        System.out.println("2.Book Shelf");
        System.out.println("3.Stationary");
        System.out.println("");//extra line break to create space between outputs from methods on console
    }//storeRoom method ends
}
