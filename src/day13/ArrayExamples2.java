package day13;

import java.util.Scanner;

public class ArrayExamples2 {

    public static void main(String[] args) {

        //create a java program that will check days string and depends on number you passed
        //you should be able to see day name
        //example : 2 tue
        //3 :wed
        //numbers should be between 1 to 7 (included)
        //if numbers are not between 1 to 7 print invalid number
        //and give user 3 attempt if it is still not between 1 to 7 then stop whole system

        String []days= {"Mon","Tue","Wed","Thur","Fri","Sat","Sun"};

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number :");
        int number=scan.nextInt();

        int attempt=1;

        while (number>7 || number<1){
            System.out.println("invalid number");
            System.out.println("try again");

            number=scan.nextInt();
            attempt++;

            if (attempt==3 && (number>7 || number<1) ){
                System.out.println("user tried 3 times ");
                System.out.println("System is locked");
                System.exit(0);// this will stop whole java
            }


        }

        String result=days[number-1];

        System.out.println(result);







    }
}