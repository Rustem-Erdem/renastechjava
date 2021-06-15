package day16;

public class c4_reverseMethod {

    public static void main(String[] args) {
        String name1="Rustem";
        reverseString(name1);
        reverseString("heshu");
        reverseString("i like java");
    }

    //we will create our reverse method
    //this method will accept a string
    //and as a result it will return reverse version of string
    public static void reverseString(String str){
        //to reverse string we start from last index to first index
        for (int i =str.length() -1 ; i>=0 ; i--){
            System.out.print(str.charAt(i));
        }

        System.out.println();
    }


}