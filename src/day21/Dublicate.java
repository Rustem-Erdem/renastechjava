package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Dublicate {

    public static void main(String[] args) {


        //write a java program that will return dublicate datas from an arraylist
        //input list1 {1,2,3,4,5,1,2,10}
        //output 1,2
        //input list2 {a,b,c,d,c,x,e ,c ,d ,x,x}
        //c ,d ,x

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("a", "b", "c", "d", "c", "x", "x", "e", "x"));

        //at the end i want to return only dublicate values
        //my output should be c , x
        ArrayList<String> dublicateLetters = new ArrayList<>(); // i will store dublicate values inside here

        //if count of letter more then 1 that means this is dublicate value

        for (int i = 0; i < letters.size(); i++) { //"a","b","c","d","c","x","x","e","x"

            int count = 0;

            for (String each : letters) { //"a","b","c","d","c","x","x","e","x"
                if (each.equals(letters.get(i))) {
                    count++;
                }
            }


            if (count > 1 && !dublicateLetters.contains(letters.get(i))) {
                System.out.println(letters.get(i) + " count is " + count);

                dublicateLetters.add(letters.get(i));
                System.out.println(dublicateLetters);
            }


        }

        System.out.println(dublicateLetters);//[c, x]


        System.out.println("*********************");

        //Collections frequency () whihc will give us count of data

        ArrayList<String> letters2 = new ArrayList<>();
        letters2.addAll(Arrays.asList("a", "b", "c", "d", "c", "x", "x", "e", "x"));


        ArrayList<String> dublicateLetters2 = new ArrayList<>(); // i will store dublicate values inside here

        for (String each2 : letters2) {

            int count2 = Collections.frequency(letters2, each2);
            System.out.println(each2 + " count is " + count2);

            if (count2 > 1 && !dublicateLetters2.contains(each2)) {
                dublicateLetters2.add(each2);
                System.out.println(dublicateLetters2);
            }

        }


        System.out.println("final result");
        System.out.println(dublicateLetters2);


    }
}
