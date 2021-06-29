package aexamples;

import java.util.ArrayList;
import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i =0; i<5; i++){
            System.out.println("enter a num: ");
            numbers.add(scan.nextInt());
        }
        ArrayList<Integer> reverse = new ArrayList<>();
        for (int k = numbers.size()-1; k>=0; k--){
            reverse.add(numbers.get(k));
        }
        System.out.println("reverse of the Array List: ");
        System.out.println(reverse);
    }
}