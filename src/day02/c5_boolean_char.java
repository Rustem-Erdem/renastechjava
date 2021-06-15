package day02;

public class c5_boolean_char {
    public static void main(String [] args){

        boolean b1= true;
        boolean b2= false;
        System.out.println(b1);
        System.out.println(b2);

        boolean b3 = 125<245; // true
        System.out.println(b3);

        System.out.println(10==17); // "==" means equal, "!=" means not equal

        System.out.println(true == false);//false
        System.out.println(!true == false);// true
        System.out.println(!(true == false)); // true
        System.out.println((true == false) == (false==false));

        char ch1= 'a';
        //char ch2= 'abc'; doesn't work
        System.out.println(ch1);

        int i1 = 97;
        char ch3 = 97;
        System.out.println(i1);
        System.out.println(ch3);

        char ch4 = (char)(i1+ch3);// this is casting means force java to tell this char
        System.out.println(ch4);//194
        System.out.println(i1+ch3); //97+97

        int i2 = 'c';// java will take character c which is 99 from ascii
        System.out.println(i2);





    }
}
