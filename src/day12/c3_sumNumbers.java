package day12;

import java.util.Scanner;

public class c3_sumNumbers {

    /// task
    //Write a do-while loop that asks the user to enter two numbers.
    // The numbers should be added and the sum displayed.
    // The loop should ask the user whether he or she wishes to perform the operation again.
    // If so, the loop should repeat; otherwise it should terminate.
    // if user says y or Y continue
    // if user says n or N stop the loop

    public static void main(String[] args) {


        //2 number
        int number1, number2;
        char choice;


        Scanner scan=new Scanner(System.in);


        do {
            //Write a do-while loop that asks the user to enter two numbers.
            System.out.println("Enter First Number : ");
            number1 = scan.nextInt();
            System.out.println("Enter Second Number : ");
            number2 = scan.nextInt();

            // The numbers should be added and the sum displayed.
            int sum=number1 + number2;
            System.out.println("Sum of "+number1 + " + " + number2 + " is : " + sum);


            // The loop should ask the user whether he or she wishes to perform the operation again.
            // If so, the loop should repeat; otherwise it should terminate.
            // if user says y or Y continue
            // if user says n or N stop the loop

            System.out.println("Do you want to continue to use this operation y/n");
            choice = scan.next().charAt(0);

        }while (choice == 'y' || choice == 'Y');

    }

}