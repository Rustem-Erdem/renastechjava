package day14;

import java.util.Arrays;

public class c2_ArraysEqual {

    public static void main(String[] args) {
        //Arrays this will import arrays class from java

        int [] arr1={3,5,7};
        int [] arr2={5,3,7};
        int [] arr3={3,5,7};
        int [] arr4={4,5,7};

        boolean b1=Arrays.equals(arr1,arr2); //false
        boolean b2=Arrays.equals(arr2,arr3); //false
        boolean b3=Arrays.equals(arr1,arr3); //true

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("---------------------");

        //after we sort them each array will start from smallest number to largest
        //new arrays will be as below :
        Arrays.sort(arr1); //3,5,7
        Arrays.sort(arr2); //3,5,7
        Arrays.sort(arr3); //3,5,7
        Arrays.sort(arr4); //4,5,7

        System.out.println(Arrays.equals(arr1,arr2) ); //true
        System.out.println(Arrays.equals(arr1,arr4) ); //false



        int [] number1={10,20,30};
        int [] number2={10,20,30,40};

        System.out.println(Arrays.equals(number1,number2)); //false
    }
}