package day06;

public class c1_ternaryPractise {
    public static void main(String[] args){


        int number ;
        number=20;
        String result="";

        if(number%2== 0){
            result="Number is even";

        }else{
            result="Number is odd";
        }
        System.out.println(result);


        //ternary
        //if = ?
        //else= :

        String result2= (number% 2==0) ? "Number is even" :"Number is odd";
        System.out.println(result2);

        int i1=1250;

        boolean divisibleBy2and5 =(i1%2==0 && i1%5==0) ? true : false;
        System.out.println(i1+ "  is divisible by 2 and 5:  " + divisibleBy2and5);





    }
}
