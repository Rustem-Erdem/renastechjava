package day19;

public class c3_practice {

    public static void main(String[] args) {

        int number=120; // primitive

        Integer int1=number; // autoboxing ;; Primitivie  to assign wrapper  // wrapper object
        Byte b1=25; //wrapper object

        byte b2=b1; //primitive    ;; wrapper to assign primitive unboxing    //25
        int i10=b1;  //primitive    ;; wrapper to assign primitive unboxing   //25

        boolean b33= i10==b1; //primitive //true
        //equal operator will only check the value

        Boolean bool=b33; // wrapper   ;;// autoboxing ;; Primitivie  to assign wrapper
        Boolean bool1=i10==b1; //wrapper

        System.out.println(b33); //true
        System.out.println(bool); //true
        System.out.println(bool1);  //true

        System.out.println(b1.equals(i10)); //false
        //b1 wrapper class =25
        //int primitive =25
        //equals method will check where the object coming from
    }
}