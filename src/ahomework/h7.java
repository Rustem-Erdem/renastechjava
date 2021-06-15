package ahomework;

import java.util.Scanner;

public class h7 {
    public static void main(String[] args) {
     /*   int number= 6;
        int total= 0;

        for(int i=1;i<number;i++){
            if(number% i ==0){
                total= total+i;
            }
        }
        if(total==number){
            System.out.println("perfect Number");
        }else{
            System.out.println("not perfect");
        }*/


        Scanner input= new Scanner(System.in);
        System.out.println("enter a number:   ");
        int number= input.nextInt();
        int result= 0;

        for(int i=1;i<number;i++){
            if(number% i ==0){

               result= result+i;
            }
        }
        if(result == number){
            System.out.println(" Perfect Number");
        }else {
            System.out.println("Not Perfect Number");


        }
    }
}
