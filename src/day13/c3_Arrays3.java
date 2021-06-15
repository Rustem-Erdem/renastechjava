package day13;

import java.util.Arrays;

public class c3_Arrays3 {

    public static void main(String[] args) {


        //Array SIZE PART
        ////declaration of array
        //        //DataType [] name= {data1 , data2 , data 3 .....};

        //Arrays size is fixed
        int [] number={2,4,5};
        number[0]=10; //{10,4,5};

        //since array size is fixed and it was declerad as 3 when we created number which has index 0 1 2
        //so you cant change size

//        number[3]=25;//{10,4,5 ,25};ArrayIndexOutOfBoundsException

        int [] arr=new int[5];
        //size is fixed and its 5
        //index number 0 1 2 3 4

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //arr[10]=100;//error
        //arr index 10 is assigned to 100
        //but our arr was created as size 5 which is last index number is 4
        //so you cant go more then 4
        //System.out.println(arr[10]);error

        //System.out.println(arr[6]);error


        //ArraysUTIL

        int [] list={1,2,3,4,5,6,10};
        System.out.println(list[1]); // 1

        System.out.println(list); //[I@5cad8086 hashcode

        //we have a method to covert hashcode to string and return whole array

        //Arrays is library inside java and it has multiple methods
        //tostring method will ask and array and convert that array to string

        String listNumbers= Arrays.toString(list); // [1, 2, 3, 4, 5, 6, 10]
        System.out.println(listNumbers);


        String [] names= { "desi","mahir","mehmet","ilkay"};

        System.out.println(names);//[Ljava.lang.String;@6e0be858

        System.out.println( Arrays.toString(names) ); // [desi, mahir, mehmet, ilkay]



        //combine 2 different array

        int [] list1={1,2,3,4}; // size 4
        //0 1 2 3
        int [] list2={5,10,15,0,2}; //size of this 5
        //0 1  2  3 4
        //if you want to combine list1 + list2 you need have size of list 1 + list2
        int [] list3=new int[list1.length + list2.length]; //size 9

        //since list3 is empty whihc we didnt assigned anything .
        //all list as a defoult will be 0
        System.out.println(list3[0]); //0
        System.out.println(list3[1]); //0
        System.out.println(list3[2]); //0

        //first i assign list1 numbers to my list 3
        for (int i=0 ; i< list1.length ; i++){ // 0 1 2 3
            list3[i]=list1[i];

            //list3 [0]=list1[0]
            //list3 [1]=list1[1]
            //list3 [2]=list1[2]
            //list3 [3]=list1[3]
        }


        //we assigned list2 numbers to my list 3 from where list1 left
        //list3 [4]=list2[0]
        //list3 [5]=list2[1]
        //list3 [6]=list2[2]
        //list3 [7]=list2[3]
        //list3 [8]=list2[4]
        for (int i=0 ; i< list2.length ; i++){ // 0 1 2 3 4

            list3[list1.length+i] = list2[i];
            //list3 [4+0]=list2[0]
            //list3 [4+1]=list2[1]
            //list3 [4+2]=list2[2]
            //list3 [4+3]=list2[3]
            //list3 [4+4]=list2[4]
        }

        System.out.println(Arrays.toString(list3));








    }

}