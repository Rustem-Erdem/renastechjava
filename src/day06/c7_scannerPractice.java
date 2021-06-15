package day06;
import java.util.Scanner;
public class c7_scannerPractice {
    public static void main(String[] args) {
        //even number odd numbers
        Scanner inputNumber=new Scanner(System.in);
        //scnanner is ready with object calls inputnumber
        //you can call any method from scanner by using object566
        //first number
        System.out.println("Insert First Number : ");
        int number=inputNumber.nextInt();
        System.out.println("You have inserted number : " + number);
        if (number % 2 ==0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }
        // in the console if you pass something not expected you will have errros ( Exceptions )
        //Exception in thread "main" java.util.InputMismatchException
        //
        // at day06.c7_scannerPractice.main(c7_scannerPractice.java:17)
        //
        //Process finished with exit code 1
        //max min numbers
        Scanner scan= new Scanner(System.in);
        //new variable called scan from scanner class
        System.out.println("Enter First Number");
        short num1=scan.nextShort();
        System.out.println("Enter Second Number");
        short num2=scan.nextShort();
        System.out.println("Enter Third Number");
        short num3=scan.nextShort();
        int max = (num1 >= num2 && num1>=num3 ) ? num1 : (num2 >= num1 && num2>=num3) ? num2 : num3;
        System.out.println("max number is "+ max);
        System.out.println( (num1+num2+num3)/3 );
        //byte b1=scan.nextInt(); // errror beacuse int is bigger then byte
        int  i1=scan.nextByte(); // this will works beacuse byte is smaller then int
        // String str=scan.nextByte(); you cant assign number to string
    }
}