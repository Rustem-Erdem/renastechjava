package day23;

public class StaticBlock {
    int insVariable=10;
    static int startVrb=20;

    public static void main(String[] args) {
        int localvrb=30;
        System.out.println("this is main method");

    }
    static{
        System.out.println("this is static block");
    }
    public static void methodStatic(){
        System.out.println("this is method static");
    }

}
