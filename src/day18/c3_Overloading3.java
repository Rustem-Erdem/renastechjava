package day18;

import java.util.Arrays;

public class c3_Overloading3 {

    public static void main(String[] args) {
        int [] numbers = {2,5,3,0,-10};
        String [] names= {"serhat" , "ceylan" ,"heshu" , "burhan"};
        char [] letters={'a' , 'f' , 'b' , 'x' ,'c'};

        //lets import some librarry import java.util.Arrays;
        Arrays.sort(numbers);
        Arrays.sort(names);
        Arrays.sort(letters);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(letters));


        System.out.println(concatStrings("hello" ," world"));
        System.out.println(concatStrings("hello "," world" , " Java is here"));
    }


    public static String concatStrings(String str1,String str2){

        return str1.concat(str2);
    }

    public static String concatStrings(String str1,String str2,String str3){

        return str1.concat(str2).concat(str3);
    }




}