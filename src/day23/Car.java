package day23;

public class Car {

    //if you dont create any constructor java will have default constructor


    String brand;
    int year;
    double price;
    String color;


    public Car(String brand,int year,double price,String color){

        this.brand=brand;
        this.year=year;
        this.price=price;
        this.color=color;
    }

    public Car(String brand ,int year){
        this.brand=brand;
        this.year=year;
    }

    public String toString(){
        return year+" , " + brand + " , " + price + " , "+color;
    }

    public void getCarBrandYear(){
        System.out.println("Brand is " +brand );
        System.out.println("Year is " +year);
    }

}
