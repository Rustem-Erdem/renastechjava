package day10;

import java.util.Scanner;

public class c3_reverseString {
    public static void main(String[] args) {
        //how you can reverse a string
        //input :hello
        //output :olleh
        String str="hello";
        //01234
        String reverse1=""+str.charAt(4)+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        System.out.println(reverse1);
        //create a java logic that will reverse the giving string
        //input ; hello
        //output ; olleh
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();
        //reverse ideas is basiccly printing string from backword
        System.out.println("Length of word :"+word.length());
        String result="";
        //starting point : last index of string
        //word.length() -1 this is last index of word
        //ending point : first index of string
        //first index of word which is always 0 for any word
        //iteration  :  i--
        for (int i=word.length() -1 ; i >= 0 ; i--){
            //System.out.println("i is : " + i);
            result += word.charAt(i);
            //System.out.println("result in the loop : "+result);
        }
        ///final result
        System.out.println("Reverse of "+ word + " is " + result);
    }
}
