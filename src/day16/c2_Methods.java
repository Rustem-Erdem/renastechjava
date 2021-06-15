package day16;

public class c2_Methods {

    public static void main(String[] args) { // main method

        hello();
        printJava10();
        hello();
        evenNumbers100();
    }

    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater)
    //statments ,code
    //}

    //Access-Modifer =public, protected ,default ,priavate
    //specifier   : static ,final ,abstract ,synchronized
    //return type : void , any datatype(int,string,char , int [] .......)
    //some method has paramertes some dont have parameter

    public static void hello() {
        System.out.println("Hello");


    }


    //cretate a method that will print java 10 times
    public static void printJava10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Java");
        }
    }

    //crete a method that will print even numbers between 1 to 100
    //make the method name evenNumbers100
    public static void evenNumbers100() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " , ");
            }
        }

        System.out.println(); // to break the line

    }
}


// void method (without parameters)
// void method (with parameters)\
// return method (without parameters)
// return method (with parameters)

//you can use above methods with different access modifier and specifier


