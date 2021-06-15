package day12;
public class c1_doWhileLoop {
    public static void main(String[] args) {
        //While loop
        //in the while loop loop will run as long as condition is true
        //if it is false it wont run
        //do while loops
        //no matter condition is true or false do will be running at the begining one time
        //after that if your condition is still true it will be running
        int number=10;
        do { // will be printed once without checking while condtion
            System.out.println("JAva");
            System.out.println(number);
        }while (number < 10); // false
        int number2=10;
        /* infinitive loop
        do {
            System.out.println("hello");
        }while (number2 == 10);
         */
        while (number <10){ // false nothing will be printed
            System.out.println("hello");
        }
        int i= 3;
        do {
            System.out.println( "i : "+ i);
            i++;
        }while (i < 10);
        int i2= 20;
        do {
            System.out.println(i2); // 20
            i2--; //19
        }while (i2 < 15);//false confition
        System.out.println("*********************");
        //print even numbers from 0 - 100
        int num1=0; // starting point
        do {
            if (num1 % 2 ==0){
                System.out.print(num1 + " , ");
            }
            num1++; // iteration
        }while (num1 <=100); // ending point (condition)
    }
}