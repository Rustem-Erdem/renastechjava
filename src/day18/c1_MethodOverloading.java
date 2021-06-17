package day18;

public class c1_MethodOverloading {
    public static void main(String[] args) {
        int n1=25;
        double n2=1.56;
        byte n3=2;

        method(n2);
        method(n3);
        method("rustem");
    }
    public static void method(int a){
        System.out.println(a+ ": integer");
    }
    public static void method(double a){
        System.out.println(a+ " : double");
    }
    public static void method(byte a){
        System.out.println(a+ ": byte");
    }
    public static void method(String a){
        System.out.println(a+ ": string");
    }
}
