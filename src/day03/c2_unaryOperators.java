package day03;

public class c2_unaryOperators {
    public static void main(String[] args){
        //create variables
        byte b1=5;
        byte b2=b1;//5
        int b3= -b1;//-5
        int b4 = + b3;//+ -5 = -5
        int b5 = -b3; //- -5 = +5


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);


        int x =10;
        int y =-x; //-10

        boolean bool1= y>0;
        boolean bool2= x <= 0;
        System.out.println(y>0);
        System.out.println(bool1);

    }
}
