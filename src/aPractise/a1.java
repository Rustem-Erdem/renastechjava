package aPractise;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner multiplication= new Scanner(System.in);

        System.out.println("enter a positive number:   ");
        int input= multiplication.nextInt();
        System.out.println("the multiplication of " + input);

        for( int i = 1; i<=10; i++){
            System.out.println(input+ "x"+i+"=" + (input*i));

        }
    }
}
