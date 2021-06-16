package day17;

public class c2_returnMethods {
    public static void minNum(int i1,int i2 ){
        if(i1<i2){
            System.out.println("small number is: "+ i1);
        }else{
            System.out.println("big number is: "+ i2);
        }
    }

    public static void main(String[] args) {
        minNum(20,30);
       int result= division(100,25);
        System.out.println(result);


    }
    public static int division(int i1, int i2){

        System.out.println("divison of "+ i1+" "+i2);

        return i1/i2;
    }
    public static int addition(int n1, int n2){
        System.out.println("addition of :" +n1+" "+n2);

        return n1+n2;
    }


}
