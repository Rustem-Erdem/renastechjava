package ahomework;

import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter first exam result  ");
        double exam1= input.nextDouble();
        System.out.println("enter second exam result  ");
        double exam2= input.nextDouble();
        System.out.println("enter quiz result");
        double quiz= input.nextDouble();
        System.out.println("enter project result");
        double project= input.nextDouble();

        double result= ((exam1* 30/100) + (exam2*40/100)+ (quiz*10/100)+ (project*29/100));

        if(result>=55){
            System.out.println( "Your average is:  "+ result+ "  PASSED");
        }else{
            System.out.println("Your average is:  "+ result+ " FAILED");
        }


    }
}
