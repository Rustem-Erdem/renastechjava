package day16;

import java.util.Arrays;

public class c1_countLetter {

    public static void main(String[] args) {


        // create a java logic that will count letter a or A from given string
        //example
        //JavA
        //output should be 2

        String sentence="JavA is fun,javAscript is also Fun,python is fun";
        //sentence = sentence.toLowerCase(); //java is fun,javascript is also fun,python is fun

        System.out.println(sentence);

        String [] letters=sentence.split("");
        //[j, a, v, a,  , i, s,  , f, u, n, ,, j, a, v, a, s, c, r, i, p, t,  , i, s,  , a, l, s, o,  , f, u, n, ,, p, y, t, h, o, n,  , i, s,  , f, u, n]

        System.out.println(Arrays.toString(letters));

        int countLetterA=0;
        int countLetterF=0;

        for (String eachLetter : letters){
            if (eachLetter.equalsIgnoreCase("a")){
                countLetterA++;
            }

            if (eachLetter.equalsIgnoreCase("f")){
                countLetterF++;
            }
        }

        System.out.println("Count of A "+ countLetterA);
        System.out.println("Count of f "+ countLetterF);




    }
}