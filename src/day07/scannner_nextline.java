package day07;

import java.util.Scanner;

public class scannner_nextline {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //System.out.println("Employee First Name");
        //String firstName=scan.next();// it only accept one word
        //System.out.println("first name is "+firstName);

        System.out.println("Employee Full Name");
        String fullName=scan.nextLine(); // accepts enter
        System.out.println(fullName);

        System.out.println("Employee company name :");
        String companyName=scan.nextLine();
        System.out.println(companyName);

        System.out.println("employee age");
        int age=scan.nextInt();
        System.out.println(age);

        System.out.println("employee city");
        String cityName=scan.nextLine();
        System.out.println(cityName);

        System.out.println("employee salary");
        double salary=scan.nextDouble();
        System.out.println(salary);
    }


}
