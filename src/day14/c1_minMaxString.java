
package day14;

public class c1_minMaxString {

    public static void main(String[] args) {

        //task3
//write a program that can return the largest string of text from an array
//ex         String[] names = {"akar", "byana", "can", "fexri", "jeniffer", "sevgin", "renastechschool"};
//output :renastechschool
//write a program that can return the shortest string of text from an array
////ex         String[] names = {"akar", "byana", "can", "fexri", "jeniffer", "sevgin", "renastechschool"};
//output : can

        String[] names = {"akar", "byana", "can", "fexri", "jeniffer", "sevgin", "renastechschool" , "a" , "asdnbas,mndbam,snbdmanbsd"};

        //lest assume max min string legnths first
        int maxLength= names[1].length(); //5
        int minLength= names[1].length(); //5

        //lets assume largest and shortest strings
        String longestName=names[1]; //byana
        String shortestName=names[1]; //byana

        for (int i=0; i < names.length ; i++){ // 0 1 2 3 4 5 6

            if (names[i].length() > maxLength ) { //akar   4>5
                maxLength = names[i].length();
                longestName = names[i];
            }

            if (names[i].length() < minLength ){ //4< 5
                minLength=names[i].length();//4
                shortestName=names[i]; //akar
            }

        }

        System.out.println(longestName);
        System.out.println(shortestName);



    }
}