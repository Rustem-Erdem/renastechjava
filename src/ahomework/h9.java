package ahomework;

import java.util.Scanner;

public class h9 {
    public static void main(String[] args) {
       /* //answer1

        for(int i=0; i<=10; i++){
        System.out.println(i);
    }
        System.out.println("********************************");
//answer2
        int sum=0;
        for(int i=0; i<=10; ++i){
            sum= sum+i;
        }
            System.out.println("the sum of natural numbers by 10 :   " +sum);
        System.out.println("********************************");
//answer3
        Scanner in= new Scanner(System.in);
        System.out.println("please enter a positive number:  ");
        int input= in.nextInt();

        if(input>0){
            System.out.println(input*input);
        }else{
            System.out.println("please a positive number!!!");
        }
        //answer 4
        Scanner enter= new Scanner(System.in);
        System.out.println("enter a number please ");
        int num =enter.nextInt();
       int factorial=1;


        for(int a=1; a<=num; a++){
            factorial= factorial*a;
        }


        System.out.println(factorial);*/

        //answer5
       Scanner x= new Scanner(System.in);
        System.out.println("please enter a number:  ");

       int n1= x.nextInt();
        System.out.println("please enter another number:  ");
       int n2= x.nextInt();
        int exponent= 1;
         for(int i=1; i<=n2; i++){
             exponent= exponent*n1;
         }
        System.out.println(exponent);



       }
}
