package day21;

import MyLibrary.Library;

public class shoeObjects2 {

    public static void main(String[] args) {
        Shoe shoe1=new Shoe();
        shoe1.getShoeInfo();

        //lets set information of shoe without calling instance variables
        shoe1.setShoeInfo("puma",9,"yellow");
        shoe1.getShoeInfo();

        //
        //shoe1.color=...
        // shoe1.brand=...
        //shoe1.size=...
        //

        Shoe shoe2=new Shoe();
        shoe2.setShoeInfo("converse" , 12,"black");

        Shoe [] allShoes={shoe1,shoe2};

        Library.stars();
        for (int i=0; i < allShoes.length ; i++){
            allShoes[i].wear();
            allShoes[i].getShoeInfo();
        }

        Library.stars();
        System.out.println(shoe1);//day21.Shoe@5cad8086 this will be printed if you dont have toString method.
      Library.stars();

    }
}