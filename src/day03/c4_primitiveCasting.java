package day03;

public class c4_primitiveCasting {
    public static void main(String[]  args){
        //we have 2 type of primitive casting
        //1.implicit casting (done automatically from java)
        //2. explicit casting (needs to be handle manually)
        //double> float> long> int> short> byte
        byte b1 = 20;
        long l1 = b1;

        int i2= 10;
        byte b2= (byte) i2;
    }
}
