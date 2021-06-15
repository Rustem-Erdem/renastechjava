package day02;

public class c3_variables {
    public static void main(String[] args){
        // range numbers double > long > short > byte
        // smallest whole number
        byte b1=34;
        // -128, 127
        System.out.println(b1);


        // short example
        short s1=28;
        // stores whole numbers -32,768 to 32,767
        short s2=1000;
        short s3=35;

        //range of int 4 bytes stores -2,147,483,648 to 2,147,483,647
        int number=23456677;
        System.out.println(44); //as default it consider as "int"
        long l1= 200;
        long l2=9999999999L;/* when you move out of int range computer needs to know what is the number
          that is why you need to tell it is long by adding L at the end */
        System.out.println(999999999999L);

        //stores decimal numbers
        double d1= 5.5;
        System.out.println(d1);
        // as a default java picks double for decimal number
        System.out.println(3.5);
        float f1= 4.5f;
        System.out.println(f1);
        System.out.println(f1+d1);






    }
}
