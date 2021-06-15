package day15;

import java.util.Arrays;

public class c2_forEachLoop {

    public static void main(String[] args) {
        //loop types
        //for loop
        //while loop
        //do while loop
        //for each loop

        int [] numbers={1,2,3,4,5};

        for (int eachNumber : numbers){
            System.out.println(eachNumber);
        }

        String [] names={"a","b","c"};

        for (String  name : names){
            System.out.println(name);
        }


        System.out.println("============");

        String sentence="Hello world java is here";
        //split method that will store in string array
        String [] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));//[Hello, world, java, is, here]

        for (String word : words){
            System.out.println( word );
        }

        //for each loop you dont need to have starting point or ending point
        //for each loop will check everything you have in the list,array etc.

        for (int i=0 ; i <3 ; i++){
            System.out.println(words[i]);
        }

        System.out.println("------------------------");

        int [] numberList={1,10,5,6,0,32,9};

        for (int number : numberList ){
            //for each loop will check  numberList
            //which has 7 number length is 7
            //index are 0 1 2...6

            //this means this loop will run 7 times
            System.out.println("hello");
            System.out.println(number);

        }




    }
}
