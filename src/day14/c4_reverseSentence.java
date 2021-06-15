package day14;

import java.util.Arrays;

public class c4_reverseSentence {

    public static void main(String[] args) {
        //create a condtion that will reverse given sentence
        //ex: Java is fun
        //output should be fun is java


        String sentence="Java is fun";
        //i will split to split them by words
        //split method returning an array
        String [] splitSentence=sentence.split(" ");
        System.out.println(Arrays.toString(splitSentence));//[Java, is, fun]

        String reverseSentence="";
        //starting point last index beacuse i wanna print reverse way
        for (int i= splitSentence.length-1;i>=0 ; i--){ // 2 1 0
            reverseSentence += splitSentence[i]; //fun is Java
            System.out.println("in loop -->"+reverseSentence);
        }
        System.out.println(reverseSentence); //fun is java


        System.out.println("====================================================");
        //create a condtion that will reverse given string
        //ex: Java is fun
        //output should be nuf si avaJ

        //reverse string  nuf si avaJ

        String sentence2="Java is fun";
        //i will split to split them by words
        //split method returning an array
        String [] splitSentence2=sentence2.split("");//this will split from each letter
        System.out.println(Arrays.toString(splitSentence2));//[J, a, v, a,  , i, s,  , f, u, n]
        //length is 11
        //last index is 10

        String reverseSentence2="";
        //starting point last index beacuse i wanna print reverse way
        for (int i= splitSentence2.length-1 ;i>=0 ; i--){ // 10 9 8 7 6 ... 0
            reverseSentence2 += splitSentence2[i];
            System.out.println("in loop -->"+reverseSentence2);//nuf si avaJ
        }
        System.out.println(reverseSentence2); //nuf si avaJ

    }
}