package day23;

import MyLibrary.Library;

public class CarObject {

    public static void main(String[] args) {
        //Car car1=new Car();
        //car1 object using default constroctor from Car class
        //if you dont create any constructor java will create a default constroctor for your class

        Car car2=new Car("bmw" ,2020,250876,"yellow");

        System.out.println(car2.brand);
        System.out.println(car2.year);
        System.out.println(car2.price);
        System.out.println(car2.color);

        Car car3=new Car("toyoto",2010,35876,"black");
        System.out.println(car3);//tostring

        Library.stars();
        car3.getCarBrandYear();
        Library.stars();
        car2.getCarBrandYear();

        Car car4=new Car("audi",2010);
        System.out.println(car4);

    }
}