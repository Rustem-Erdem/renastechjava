package day16;

public class c5_MaxNumber {

    ///create a method that will accept 2 different number
    //and  it will print me the maximum one

    public static void maxNumber(int number1, int number2) { //10 20

        if (number1 > number2) {
            System.out.println(number1 + " is bigger then " + number2);
        } else if (number2 > number1) {
            System.out.println(number2 + " is bigger then " + number1);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }

    }

    public static void main(String[] args) {
        maxNumber(10, 20);
        //number 1= 10
        //number 2= 20

        maxNumber(20, 15);

        maxNumber(10, 10);

        int i1 = 75;
        int i2 = 100;

        maxNumber(i1, i2);
        //number 1= i1 =75
        //number 2= i2 =100
    }
}