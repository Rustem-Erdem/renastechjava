package day24;

public class ConstructorChainningPractice {


    //
//    constructor calls:(chainning) by using this() keyword
//            1. only constructor can call other constructor
//            2. constructor cannot be called by its name,  this() is used for calling
//            3. constructor call needs to be at the first step
//            4. One constructor can only call one constructor
//            5. Contructor cannot call itself or conatin itself

    //creating constructors
    //acces modifier and class name
    public ConstructorChainningPractice(){
//        ConstructorChainningPractice("hello");; 2. constructor cannot be called by its name,  this() is used for calling
        //this(10);// i am calling int constructor
        System.out.println("Default Const.");
    }

    public ConstructorChainningPractice(String str){
        this();
        System.out.println("Const. with String");
        //            3. constructor call needs to be at the first step
        //this(); error constructor call needs to be at the first step
    }

    public ConstructorChainningPractice(int a){
        ////            4. One constructor can only call one constructor
        this(15.5,true);
        //this("");One constructor can only call one constructor
        System.out.println("Const. with int");
    }

    public ConstructorChainningPractice(double d,boolean b){
        //5. Contructor cannot call itself or conatin itself
        //this(5.5,true); error
        this(""); //System.out.println("Default Const.");
        //this();
        System.out.println("Const. with double and boolen");
    }

    //

    public static void main(String[] args) {
        // ConstructorChainningPractice obj1=new ConstructorChainningPractice(25);
        //we created an object from Constructor with int parameters method

        ConstructorChainningPractice onj1=new ConstructorChainningPractice(5.5,false);
    }


    //make sure your constructor methods are not in the loop

}