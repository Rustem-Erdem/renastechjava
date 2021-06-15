package day8;

public class StringMethods2 {
    public static void main(String[] args) {
        //equals()           Compares two strings. Returns true if the strings are equal,
        //                      and false if not                                                   boolean
        //equalsIgnoreCase()     Compares two strings, ignoring case considerations               boolean
        String str1="Hello";
        String str2="Hello"; // this comes from string pool
        String str3=new String("Hello"); //this comes from java heap
        String str4=new String("World");
        //eqquals method will only care exact match value
        //not the memory (object type)
        System.out.println(str1.equals(str2));  //true
        System.out.println(str2.equals(str3));   //true
        System.out.println(str1.equals(str3));  //true
        System.out.println(str2==str3); //false   different object
        System.out.println(str1==str2); //true

        //equalsIgnoreCase()     Compares two strings, ignoring case considerations               boolean
        String s1="Java";
        String s2="java";
        String s3= "jAVa";
        System.out.println("**********************");
        System.out.println(s1.equals(s2));           // false  case are not same so false
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s3)); // true
        boolean b1=s3.equalsIgnoreCase(s1);  //true
        boolean b2=s2.equalsIgnoreCase(s1);  //true
        boolean b3=s3.equals(s1);              // false
        if (b1){ //b1 true
            System.out.println("b1 is true");
            if (b2){//b2 true
                System.out.println("b2 is true");
                if (b3){
                    System.out.println("b3  true");
                }else{
                    System.out.println("b3 is false");
                }
            }else {
                System.out.println("b2 is not true");
            }
        }else{ // b1 false
            System.out.println("b1 is not true");

    }

   }
}
