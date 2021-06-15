package studyHall_day1;
import java.util.Scanner;
public class SumOfNumbers {
    // Write a program that can ask the user enter a number for five times and returns the sum of those five numbers
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0; // we will add sum of number into this int variable
        for(int i = 1; i <= 5; i++){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}