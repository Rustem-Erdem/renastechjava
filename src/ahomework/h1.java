package ahomework;

import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
        int heshu;
        boolean isPrime=true;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=scan.nextInt();
        for (int i=2; i<=num/2;i++)
        {
            heshu=num%i;
            if (heshu==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + "is a prime number");
        else
            System.out.println(num + "is not a prime number");
    }
}