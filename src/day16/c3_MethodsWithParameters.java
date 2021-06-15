package day16;

import java.util.Scanner;

public class c3_MethodsWithParameters {

    //decleration of the method
    // public               static           void               main        (String [] args){
    // Access-modifer       specifier        return-type        methodName  (paramater){
    //statments ,code
    //}


    public static void main(String[] args) {
        //hello method is without parameters
        hello(); //no need to pass anything inside ()

        //ageCategory method creted with paramater which is int age
        ageCategory(3);//method will ask you a int number to be able to run
        //method will take that int number and sent it inside of method

        ageCategory(10);

        ageCategory(100);

        ageCategory(-67);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age : ");

        int number=scanner.nextInt();
        ageCategory(number); // this number will be assgined to int age that we have inside agecoategory
    }

    public static void hello(){
        System.out.println("Hello");

    }

    //crete a method that will check given age and print the category of each age
    //if age is 0-5 baby
    //if age is 5-18 young
    //if age is 18-80 mature
    //if age is bigger then 80 print  old

    //now my method should accept an age so i can check age category


    //void methods                  with parameters
    public static void ageCategory(int age){ //age == 10

        if (age>=0 && age <5){
            System.out.println(age + " is baby");
        }else if (age>=5 && age<18){
            System.out.println(age + " is young");
        }else if (age>=18 && age<80){
            System.out.println(age + " is mature");
        }else if (age >= 80){
            System.out.println(age + " is old");
        }else { //anything left will be invalid number whihc is negatif numbers
            System.out.println(age + " is not excist");
        }


    }

}