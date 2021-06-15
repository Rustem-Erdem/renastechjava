package day14;

import java.util.Arrays;

public class c3_StringMethods {

    public static void main(String[] args) {

        //Another String method
        //toCharArray()

        //Method	              Description                                                     	Return Type
        //toCharArray()             this will take a string and return you a char array	             char[]


        String str="Rustem 2313 $% ";

        char [] arr=str.toCharArray(); //[R , u , s ,t ,e , m]

        System.out.println(arr[0]); //R

        System.out.println(Arrays.toString(arr));


        String str2="Hello World";

        char [] arr2=str2.toCharArray();

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));//[ , H, W, d, e, l, l, l, o, o, r]



        //string method
        //split()
        //this will split given string from specific condition in the string     Return Type
        //      	                                                                string[]

        String mySentence="Java is Fun";

        String [] splitedSentence=mySentence.split("");//[J, a, v, a,  , i, s,  , F, u, n]
        System.out.println(Arrays.toString(splitedSentence));


        //split from words given sentence
        String [] splittedSentence2=mySentence.split(" ") ;//[Java, is,  Fun]
        System.out.println(Arrays.toString(splittedSentence2));

    }
}