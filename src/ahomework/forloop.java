package ahomework;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int sum=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int input= scan.nextInt();
            sum+=input;

        } System.out.println(sum);
    }
}
