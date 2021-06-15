package ahomework;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("please enter a number:  ");
        int enter= input.nextInt();
        boolean prime= true;
        if(enter==1){
            System.out.println("the number is not prime ");
            return;
        }
        if(enter<1){
            System.out.println("unvalid number");
        }
        for(int i=2; i<enter; i++){
            if(enter % 2 == 0){
               prime= false;
            }
        }
        if(prime==true){
            System.out.println("the number is prime ");
        }else{
            System.out.println("the number is not prime");

        }

    }
}
