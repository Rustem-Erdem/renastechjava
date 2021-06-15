package day15;

//import java.util.Scanner;

//import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class c6_firstLastLetter {

    public static void main(String[] args) {
        //create a java program that will ask for 5 string  name to store in the array
        //and print first and last letter from each string

        //scanner to store 3 names
        //aydin , mahir ,heshu
        //an , mr ,hu

        Scanner input=new Scanner(System.in);

        //to import class for mac option + enter
        //for windows alt + enter

        //to store 5 name in the array
        String [] nameList=new String[5];

        for (int i =0 ; i <=4 ; i++){ // 0 1 2 3 4
            System.out.println("Enter Name "+ (i+1));
            nameList[i]=input.next(); // 5 scanner will be asked in console
        }

        System.out.println(Arrays.toString(nameList));

        //and print first and last letter from each string

        for (String eachName : nameList){
            String firstLastLetters=""+eachName.charAt(0) + eachName.charAt(eachName.length()-1);
            System.out.println(firstLastLetters);
        }
    }
}