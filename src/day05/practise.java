package day05;

public class practise {
    public static void main(String [] args){
        int number=20;    //21   //21     //22
        int number2= -number++ + number - ++number;
        // -20       +   21   - 22
        //   1 - 22
        //-21
        System.out.println(number);//22
        number = 35;
        System.out.println(number);//35
        System.out.println(number2);
        int a= -10; //-11  //-10 // -10 //-11
        int b= --a + a++ -a + --a*2 + 10/2 - 10%3 ;
        // --a ---> -10 -1 = -11
        // -11 + -11
        // a++ ---- > -11 + 1 = -10
        // -11 + -11 -(-10)
        // -a --- > - -10 = 10
        // -11 + -11 +10 + -11*2 +5 - 1 ;
        // -11 + -11
        // -22      +10
        // -12 +            -11*2 +5 -1
        //-12 + -22 + 5 -1
        //-34 + 5 -1
        //-30
        System.out.println(b);
    }
}
