package aForLoop;

import java.util.Scanner;

public class basamaksay {
    public static void main(String[] args) {
        long i;
        long n=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter maximum 10 digit number");
        i=scan.nextLong();
        do {
            ++n;
            i = i / 10;


        }while(i>0);
        System.out.printf("%d have %d digits", i, n);
    }
}
