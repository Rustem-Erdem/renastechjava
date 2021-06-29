package day24;

public class ConsturactorChainning {

    /*
    Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in two ways:
Within same class: It can be done using this() keyword for constructors in same class
From base class: by using super() keyword to call constructor from the base class.-- we will see this later
Why do we need constructor chaining ?
This process is used when we want to perform multiple tasks in a single constructor
rather than creating a code for each task in a single constructor we create a separate constructor for each task
and make their chain which makes the program more readable.
     */

    //to be able to create constructor
    //you need to pass a acces modifier and clas name
    public ConsturactorChainning(){
        method1();
        method2();

    }

    public ConsturactorChainning(String str){
        this();
        method1();
        method2();
        method1();
        //
        //this: refers to object instances
        //this.: instances of the object
        //this(): used for calling constructors within current class
    }

    public ConsturactorChainning(int number){
        this("");
    }

    public static void method1(){

    }

    public void method2(){
        method1();
    }
}
