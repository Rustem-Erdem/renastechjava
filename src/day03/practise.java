package day03;

public class practise {

    public static void main(String[] args){
      //create different number
        //x=25
      int x=25;
      //y=32
        int y= x+7; //25+7=32
        //z=40
        int z= y+8; // (x+7) + 8 = 25+7+8=40

         System.out.println("the sum of x,y,z is :" +x+y+z); //the sum of x,y,z is :253240
         //text +number = text
        System.out.println("the sum of x,y,z is :" +(x+y+z)); //the sum of x,y,z is :97
        // sum of numbers =number
        boolean divisibleBy2= x % 2 == 0;
        boolean divisibleBy3= x % 3 == 0;
        boolean divisibleBy5= x % 5 == 0;

        System.out.println(x+" is divisible by 2 " +divisibleBy2);
        System.out.println(x+" is divisible by 3 " +divisibleBy3);
        System.out.println(x+" is divisible by 5 " +divisibleBy5);





    }
}
