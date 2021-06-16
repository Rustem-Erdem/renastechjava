package day17;

public class c1_practise {
    public static void main(String[] args) {
      calculate(10,5,'*');
      int i=100;
      int i2= 20;
      char a='/';
    }

    public static void calculate(double number1, double number2,char operator){

        switch(operator){
            case'+':
                System.out.println(number1 + number2);
                break;
            case'-':
                System.out.println(number1 - number2);
                break;
            case'/':
                System.out.println(number1 / number2);
                break;
            case'%':
                System.out.println(number1 % number2);
                break;
            case'*':
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("invalid number: " + operator);

        }

    }

}
