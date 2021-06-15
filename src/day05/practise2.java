package day05;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class practise2 {
    public static void main(String[] args){

     /*   Scanner input= new Scanner(System.in);
        System.out.print("Input Your Name:   ");
        String name = input.next();
        System.out.print("Input Your Surname:   ");
        String surname = input.next();
        System.out.println("Hello!  " + name +" "+surname);

        // for

        for(int i=-10; i<=10; i+=2){
            System.out.println(i);
        }

        //while
        int i=-10;
        while(i<=10){
        System.out.println(i); i+=2; }

      */

        //do while
        int i=-10;
        do {
            System.out.println(i);
            i += 2;
        }
        while(i<=10);



    }
}
