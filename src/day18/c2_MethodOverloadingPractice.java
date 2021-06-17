package day18;

public class c2_MethodOverloadingPractice {

    public static void main(String[] args) {
        sumOf2Numbers(5,5);
        sum(10,10);//int sum method
        sumOf3Numbers(10,10,10);
        sum(10,10,10); //int sum method with 3 variables
        sum(10.5,5.5); //double sum

        //sum("asda","sadas");



    }

    //1. print sum of 2 int numbers
    //2. print sum of 3 int numbers
    //3. print sum of 2 double numbers


    public static void sumOf2Numbers(int a , int b){
        System.out.println(a+b);

    }
    public static void sumOf3Numbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a , int b){
        System.out.println(a+b);
    }
    public static void sum(int a , int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(double a , double b){
        System.out.println(a+b);
    }

}