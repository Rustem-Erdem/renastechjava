package day19;

public class c1_wrapperClasses {


    //Java Wrapper Classes
    //Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
    //
    //The table below shows the primitive type and the equivalent wrapper class:
    //
    //Primitive Data Type	Wrapper Class
    //byte	                Byte
    //short	                Short
    //int	                Integer
    //long	                Long
    //float	                Float
    //double	            Double
    //boolean	            Boolean
    //char	                Character
    //Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
    // where primitive types cannot be used (the list can only store objects):

    //Example
    //ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
    //ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

    //Data Structure:
    //	1. Array
    //	2. Collection ==> only accepts objects
    //	3. Map ==>  only accepts objects
    //
    //
    //	primitives: byte, short, int, long, float, double, char, boolean
    //
    //  wrapper classes:
    //		Byte, Short, Integer, Long, Float, Double, Character, Boolean
    public static void main(String[] args) {
        Integer myInt= 10; // wrapper class
        int i1=10;  //primitive data

        Double myDouble=10.25; //wrapper class
        Character ch= 'a'; //wrapper class

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(ch);

        short sh1=100;   //primitive data
        int i2= sh1;   //primitive data

        Integer int1= i2; //wrapper class
        //Integer int2 = sh1; // Integar is another form of int primitive datat type
        // you cant assign other primitive data types



        Byte b1=10;//wrapper class
        byte b2=15; // primitive
        Byte b3=b2; //wrapper class


        //Integer int2=b2;

        int i4=b3;  //primitive data

        System.out.println("*******************");
        System.out.println(b1); //10
        System.out.println(b2); //15
        System.out.println(b3); //15
        System.out.println(i4); //15

        //useful method is the toString() method, which is used to convert wrapper objects to strings.
        //
        //In the following example, we convert an Integer to a String, and use the length() method of the
        // String class to output the length of the "string":

        System.out.println("**********");
        Integer myInt10= 200;
        String str=myInt10.toString(); //which is used to convert wrapper objects to strings. "100"
        System.out.println(str.length());//3




    }
}