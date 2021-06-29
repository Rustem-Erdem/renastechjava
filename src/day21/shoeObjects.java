package day21;

import java.util.ArrayList;

public class shoeObjects {


    public static void main(String[] args) {
        //since shoe is in same package you will be able to call your shoe librray
        //if it is not in same package you will need to import
        //and then create different objects from this shoe library

        //idea of creating object from class
//ArrayList<>  list     =  new ArrayList<>();
//        Class     refName               OBJECT

        // Shoe   nike=new Shoe();
        Shoe shoe1=new Shoe();

        System.out.println(shoe1.brand);//null
        System.out.println(shoe1.size);//0
        System.out.println(shoe1.color);//null

        shoe1.wear();
        shoe1.getShoeInfo();

        System.out.println("*************");

        shoe1.color="White";
        shoe1.size=7;
        shoe1.brand="Nike";

        System.out.println(shoe1.brand);
        System.out.println(shoe1.size);
        System.out.println(shoe1.color);

        shoe1.wear();
        shoe1.getShoeInfo();

        System.out.println("************");
        Shoe shoe2=new Shoe();
        shoe2.brand="adidas";
        shoe2.size=11;
        shoe2.color="red";

        String [] shoeList={"hello","world"};

        Shoe [] shoes= {shoe1,shoe2};

        //shoe1.getShoeInfo();
        shoes[0].getShoeInfo();
        shoes[1].getShoeInfo();
        System.out.println("shoes[1].size = " + shoes[1].size);
        System.out.println("shoes[1].size = " + shoes[0].size);

        ArrayList<Shoe> shoeList2=new ArrayList<>();
        shoeList2.add(shoe1);
        shoeList2.add(shoe2);



        //System.out.println(shoeList2);

    }

}