package day11;

import java.util.Scanner;

public class sumOfNumbers {
    //create a java logic that will sum the given numbers
    //ex if input is 5;
    //output will be 1+2+3+4+5 == 15
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        int start=0;
        int sum=0;
        while(start<= number){
            sum += start;
            start++;
        }
        System.out.println(sum);

    }

}
