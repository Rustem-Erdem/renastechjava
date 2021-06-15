package ahomework;

import java.util.Scanner;

public class h10 {
    //task 1

    public static void main(String[] args) {


      String[]months= {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
      Scanner scan= new Scanner(System.in);
        System.out.println("enter a number  :");
        int number= scan.nextInt();
        int attempt=1;

        while(number>12 || number<1){
            System.out.println("invalid number");
            System.out.println("try again please");


            number= scan.nextInt();
            attempt++;


            if(attempt==3 &&(number>12 || number<1)){
                System.out.println("you tried 3 times  ");
                System.out.println("system has been locked");
                System.exit(0);
            }
        }
          String result=months[number-1];
        System.out.println(result);

    }
}

