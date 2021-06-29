package day19;

public class c2_TypeCasting {
//Type Casting
    //Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing.
    // For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:
    //Passed as a parameter to a method that expects an object of the corresponding wrapper class.
    //Assigned to a variable of the corresponding wrapper class.
    //Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
    // For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:
    //Passed as a parameter to a method that expects a value of the corresponding primitive type.
    //Assigned to a variable of the corresponding primitive type.
    //The following table lists the primitive types and their corresponding wrapper classes,
    // which are used by the Java compiler for autoboxing and unboxing:
    //Primitive Data Type	Wrapper Class
    //byte	                Byte
    //short	                Short
    //int	                Integer
    //long	                Long
    //float	                Float
    //double	            Double
    //boolean	            Boolean
    //char	                Character


    public static void main(String[] args) {
        //create an Integer Object
        Integer i1=new Integer(10);

        int i2= i1; //unboxing :
        // Converting an object of a wrapper Integer corresponding primitive value int
        // called unboxing.

        Character ch='w'; //autoboxing
        //we take char='w' and assigned wrapper classes

        char ch2=ch;//unboxing
        //we took ch Wrapper Charracter and assign to ch2 primitive

        System.out.println(ch);
        System.out.println(ch2);


        int number=120; //primitive

        Integer int1=number; //autoboxing
        //if you take primitive value and assign to wrapper class that will be autoboxing

        Byte b1=25; //wrapper object
        //if you take wrapper object and assign to primitives that will be unboxing

        byte b2=b1; //unboxing
        int i10=b1; //unboxing

        //Integer int15= b2; error

    }
}