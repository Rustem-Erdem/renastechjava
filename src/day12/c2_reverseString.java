package day12;

public class c2_reverseString {

    public static void main(String[] args) {

        //reverse the giving string


        String actual="Java is the best class ever";
        System.out.println(actual);

        String reverse="";

        //to be able to get last index
        //lenght will be always one number more the lastchar index
        int lastIndex=actual.length() -1 ; //starting point of loop

        do {

            //my goal is store each letter from last to one
            reverse += actual.charAt(lastIndex);

            //iteartion
            //from last index to first index
            lastIndex--;

        }while (lastIndex >=0 );//conditon which is ending point i want to finish at first letter whihc index number 0

        System.out.println(reverse);


    }
}