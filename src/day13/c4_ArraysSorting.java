package day13;

import java.util.Arrays;

public class c4_ArraysSorting {

    public static void main(String[] args) {


        int [] arr1 ={0,-100,-90,7,8,90,35,100,255,66};
        System.out.println(Arrays.toString(arr1)); //[0, -100, -90, 7, 8, 90, 35, 100, 255, 66]

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));//[-100, -90, 0, 7, 8, 35, 66, 90, 100, 255]
        //after sorthing
        //min number will be first index
        System.out.println("Min number is :"+arr1[0]);
        //max number will be last index of array
        System.out.println("Max number is :"+arr1[ arr1.length-1 ]);

        //medium number
        System.out.println("Medium number is "+arr1 [ arr1.length/2 -1 ]);

        String [] names = {"aparvina","aevindar","cozgur","Asibel","evahap"};

        //a 97  // p
        //a 97  // e
        //c 99
        //A  65
        //e  101

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));



        //create a condiiton that will print numbers from largest to samllest in the given array


        int [] numbers={ 10,5,3,20,-7,90,2};
        Arrays.sort(numbers); // this is from smallest to largest
        System.out.println(Arrays.toString(numbers)); //[-7, 2, 3, 5, 10, 20, 90]

        int [] numbersLargeToSmall=new int[numbers.length];//[0, 0, 0, 0, 0, 0, 0]

        //numbers[i]=-numbers[i]
        //sort
        //numbers[i]=-numbers[i]
        int j=0;

        for (int i= numbers.length -1 ; i >=0 ; i--){ //i= numbers.length -1 == 6 , 5 , 4 ,3 2 1 0

            //i= numbers.length -1
            numbersLargeToSmall[ j ]=numbers[i];

            //numbersLargeToSmall[0]=numbers[6];
            //numbersLargeToSmall[1]=numbers[5];
            //numbersLargeToSmall[2]=numbers[4];
            j++;//1 2 3 4


        }

        System.out.println(Arrays.toString(numbersLargeToSmall)); //[90, 20, 10, 5, 3, 2, -7]


        // ]90, 20, 10, 5, 3, 2, -7[
    }
}