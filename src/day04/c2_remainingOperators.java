package day04;

public class c2_remainingOperators {
    public static void main(String[] args){

        int x= 100;
        System.out.println(x);
        x += 50;  // x = x+50
        System.out.println(x);
        int y=100;
        y = y + 50 ;
        System.out.println(y);
        x = -y;  // it says assign -y to x
        // -y = -150
        //x= -150
        System.out.println(x);
        //-150
        // -150 -50  == -200
        x -= 50;
        System.out.println(x);
        // -= or += means add or remove up to given number
        System.out.println("*************************");
        int z=10;
        System.out.println(z);
        // x = -200
        z = x + 50 - x;  // z = (-200) + 50 - (-200);
        //z = -150 - (-200)
        //z= -150 +200
        //z=50 ;
        System.out.println(z);
        z -= z+z-z+50;    //z = z - (z+z-z+50)
        //z= 50
        //50- (z+z-z+50) == 50 -(50+50-50+50)==
        //50 - (100)
        //-50
        System.out.println(z);
        int i=100;
        System.out.println(i);  //100
        i = 150; //assign 150 to i
        System.out.println(i); //150
        i -= 50;// i= i -50 // 100
        System.out.println(i);//100
        int number= 5;
        number *= 4;   // number = number * 4 --- number = 5 * 4
        System.out.println(number); //20
        number = number / 2; //number /= 2 ; are same
        System.out.println(number); //10
        number /= 2 ;
        System.out.println(number); //5

    }
}
