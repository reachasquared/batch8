package Veena;

import org.junit.Test;

public class MultipleMethods { //class begins @Test //junit annotation
    @Test
    public void myHome(){
        rception();
        mainHall();
        storeroom();
    }
    public  void  rception(){ //first method begins
   System.out.println(" Reception");
   System.out.println("-------------");
   System.out.println("1.Welcome Desk");
   System.out.println("2.Telephone");
   System.out.println("3.Register");

       }//first method ends

    public void mainHall(){ //second method begins
        System.out.println(" MainHall");
        System.out.println("-----------");
        System.out.println("1.WhiteBoard");
        System.out.println("2.Tables");
        System.out.println("3.Chairs");
          }//second method ends
    public void storeroom(){ //third method begins
        System.out.println(" Storeroom");
        System.out.println("------------");
        System.out.println("1.Safebox");
        System.out.println("2.Paints");
        System.out.println("3.Brushes");

    }//third method ends

}//class ends
