package aPractise;

public class a4 {
    public static void main(String[] args) {
        reverseString("ABCD");
    }



    public static void reverseString(String str) {

        for (int i =str.length() -1 ; i>=0 ; i--){
            System.out.print(str.charAt(i));
        }
    }
}
