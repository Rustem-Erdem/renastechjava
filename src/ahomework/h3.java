package ahomework;
import java.util.Scanner;

public class h3 {
    public static void main(String[] args) {
        System.out.println("\n\n" +(25.5*3.5-3.5*3.5)/(40.5-4.5));
//another example
        System.out.println("\n\n " + 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
//Write a Java program to print the area and perimeter of a circle. Go to the editor
//Test Data:
//Radius = 7.5
        Scanner in= new Scanner(System.in);
        System.out.println("Please, input the value of radius : ");
        double radius= in.nextDouble();
        double perimeter= 2*Math.PI*radius;
        double area=Math.PI*radius*radius;
        System.out.println("The perimeter is : "+ perimeter );
        System.out.println("The area is "+ area);




    }

}
