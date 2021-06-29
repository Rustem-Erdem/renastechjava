package day19;

public class c4_ParseMethod {

    //
//	methods:
//            parse methods: converts string of text to the primitives, returns primitive values
//            "123"
//
//            valueOf methods: converting string to wrapper class value, returns wrapper class values


    public static void main(String[] args) {

        String str="535";

        //int i1=str; errror
        System.out.println(str+25); //53525  //string text

        int i2=Integer.parseInt(str);
        //parse int method will take str string and return primitive int number //535
        System.out.println(i2+25); // 560  //int number


        String str2="10.55";

        float f1=Float.parseFloat(str2);

        System.out.println(f1 + 2);

        double d1=Double.parseDouble(str2);
        System.out.println(d1+5);


        String str3="true";
        String str4="false";
        String str5="TruE";
        String str6="FalSE";
        String str7="hello world";

        boolean bool1=Boolean.parseBoolean(str3);  //true
        boolean bool2=Boolean.parseBoolean(str4);  //false
        boolean bool3=Boolean.parseBoolean(str5);  //true
        boolean bool4=Boolean.parseBoolean(str6);  // false
        boolean bool5=Boolean.parseBoolean(str7);  //anything is not equal to false or true will be false

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
        System.out.println(bool4);
        System.out.println(bool5);

    }
}