package aPractise;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner fac = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int num = fac.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("the factorial of " + num + " = " + result);

    }
}