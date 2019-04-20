package DeepthiTaduri;

import org.junit.Test;

//name of this class is ArtStudio

public class ArtStudio {

    //Executable method
    @Test
    public void artMethod(){

       iSee(); //calling another method iSee within the method artMethod
        System.out.println("white board"); //Printing white board
        iSee();
       System.out.println("tables");//Printing tables
        iSee();
       System.out.println("Taj Mahal");//Printing Taj Mahal
        iSee();
        System.out.println("boxes");//Printing boxes
        iSee();
       System.out.println("TV");//Printing TV
        iSee();
       System.out.println("Paints");//Printing Paints
        iSee();
       System.out.println("Book Shelf");//Printing Book Shelf
        iSee();
       System.out.println("Chairs");//Printing Chairs
        iSee();
       System.out.println("Collection");//Printing Collection

    }
    //another method
    public void iSee(){
        System.out.print("At Prachee Arts, I see "); //printing At Prachee Arts, I see
    }
}
