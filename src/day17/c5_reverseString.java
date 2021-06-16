package day17;

public class c5_reverseString {

    public static void reverse(String str){ //gokhan
        String reverse="";

        for (int i =str.length()-1 ; i >=0 ; i--){

            reverse += str.charAt(i);
        }

        System.out.println(reverse);
    }



    public static String reverse2(String str){
        String reverse="";

        for (int i=str.length()-1 ; i>=0 ; i--){
            reverse += str.charAt(i);
        }


        return reverse;
    }

    public static void main(String[] args) {
        reverse("gokhan");
        reverse("jennifer");

        System.out.println(reverse2("gokhan"));
        System.out.println(reverse2("jennifer"));

        String reverseGokhan=reverse2("gokhan");
        System.out.println(reverseGokhan + " 120");
    }


    //method overloading
    //how to create a library and store those methods


}
