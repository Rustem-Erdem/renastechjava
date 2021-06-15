package day07;

import java.util.Scanner;

public class scanner_next {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter first name  ");
        String firstName= input.next();
        System.out.println("enter last name  ");
        String lastName= input.next();

        String fullName= firstName+"   "+lastName;
        System.out.println(fullName);
        System.out.println("Grade For Student ");
        int grade=input.nextInt();
        System.out.println(fullName + " grade is :" +grade);
        System.out.println("letter grade for student");
        String gradeLetter=input.next();
        System.out.println(gradeLetter);






    }
}
