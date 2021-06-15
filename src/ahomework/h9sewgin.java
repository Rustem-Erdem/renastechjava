package ahomework;

import java.util.Scanner;

public class h9sewgin {
    public static void main(String[] args) {




        Scanner input= new Scanner(System.in);
        String word= input.next();
        String mid=""+word.charAt((word.length())/2);
        String mid2=""+word.charAt((word.length())/2+1);

        System.out.println(word.length());


        if(word.length() %2==0){

            System.out.println("This word length is even=   " + word.length());
        }else{
            System.out.println("This word length is odd=   " + word.length() );
        }
        if((word.length() %2==0)==(true) ){

            System.out.println( "The middle character is=   "   + (mid.toUpperCase())+" "+(mid2.toUpperCase()));

        }else{
            System.out.println( "The middle character is=   "  +(mid.toUpperCase()) );
        }


    }
}

