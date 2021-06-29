package day24;

public class printOrder {
    int number=10;

    public printOrder(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main");

        printOrder obj1=new printOrder();//this will run your constructor and instance block
        printOrder obj2=new printOrder();//this will run your constructor and instance block

        System.out.println("hello main");
        methodStatic();
    }

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    public static void methodStatic(){
        System.out.println("static method");
    }

    public void methodInstance(){
        System.out.println("instance method ");
    }


    //no matter what if you run your class static block will run before eveything even before main method
    //then main method will run
    //depends on what you have in main method they will be getting printed in line order

    //new object will run instance block and constructor together
    //        printOrder obj1=new printOrder();//this will run your constructor and instance block
    //first instance block will get excuted
}