package suha;

import org.junit.Test;

public class MultipleMethods {//class begins
  //junit annotations @test
    @Test
  public void myHome(){
        reception();
        mainHall();
        storeroom();
    }

    public void reception() {//reception method begins
        System.out.println("Reception");
        System.out.println("---------");
        System.out.println("1.Welcome Desk");
        System.out.println("2.Telephone");
        System.out.println("3.Register");
    }//reception method ends

    public void mainHall() {//mainHall method begins
        System.out.println("MainHall");
        System.out.println("---------");
        System.out.println("1.WhiteBoard");
        System.out.println("2.Tables");
        System.out.println("3.Chairs");
    }//mainHall method ends

    public void storeroom() {//storeRoom method begins
        System.out.println("StoreRoom");
        System.out.println("----------");
        System.out.println("1.SafeBox");
        System.out.println("2.Paints");
        System.out.println("3.PaintBrushes");
    }//storeRoom method ends
}//class ends
