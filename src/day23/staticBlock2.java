package day23;

public class staticBlock2 {

    static int a=10;
    static int a2=1;
    int b;

    public static void main(String[] args) {
        staticBlock2 sb2=new staticBlock2();
        System.out.println(sb2.b);
        System.out.println(a);
        System.out.println(a2);

    }


    static {
        a=25;
        System.out.println("hello");
        //System.out.println(b);
        a2=200;


        if (10>5){ //true
            a=35;
        }else {
            a2=50;
        }

    }
}