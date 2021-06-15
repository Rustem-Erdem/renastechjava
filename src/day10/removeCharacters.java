package day10;

import java.util.Scanner;

public class removeCharacters {
    public static void main(String[] args) {
        //java
        //length
        //length will change if you remove something inside
        //first letter and last letter
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your word:  ");
        String word =scan.next();

        int length=word.length();
        System.out.println("before modification length of word:  "+word.length());
        //first check first letter
        //if letter small or capital a remove it
        if(word.substring(0,1).equalsIgnoreCase("a"));
        {
            //this will check first letter if it is a or A it will check it
            word = word.substring(1);
            System.out.println("word first case: " + word);
        }
        length = word.length();
        System.out.println("after first length is:  "+length);

        int lastIndex =length-1;
        if(word.substring(lastIndex).equalsIgnoreCase("A"));
        word= word.substring(0,lastIndex);
        System.out.println("modified word:" +word);



    }

}
