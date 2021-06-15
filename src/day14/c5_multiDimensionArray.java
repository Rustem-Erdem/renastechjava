package day14;

import java.util.Arrays;

public class c5_multiDimensionArray {

    public static void main(String[] args) {


        ////declaration of array
        //        //DataType [][] name= { {data1 , data2 , data 3 .....}, {data1 , data2 ,}  };

        //1 dimension Array
        int [] arr1D={1,2,3,4,5};
        //0         //0 1 2 3 4
        System.out.println("arr1d :"+arr1D.length);  // 5

        //2 dimension array
        int [][] arr2D={  { 1,2,3 } ,   { 0,2,5,10 }  };
        //        0     ,       1
        //      0 1 2         0,1,2,3

        System.out.println("arr2d :"+arr2D.length); //2

        //arr2D[0][2]
        //first [] is container number
        //second one is your index number that you have in specific container
        System.out.println(arr2D[0][2]); // 3
        System.out.println(arr2D[1][3]); // 10

        //this will give you length of each container
        System.out.println(arr2D[0].length); //3
        System.out.println(arr2D[1].length);//4

        //getting specific number from specific container
        System.out.println(arr2D[0][0]);  // container index 0 index 0      1
        System.out.println(arr2D[1][3]);// container index 1 index 3      10


        System.out.println("==============");
        int number=arr2D[0][0]; //1
        System.out.println(number);
        int [] numbersContainer0=arr2D[0]; // 1,2,3
        System.out.println(Arrays.toString(numbersContainer0));
        int [] numbersContainer1=arr2D[1]; // 0,2,5,10
        System.out.println(Arrays.toString(numbersContainer1));

        System.out.println("************************************");
        //0     ,  1       , 2     , 3     , 4      ,5             //0   ,1     ,2
        String [][] strList={  {"aydin" , "sevgin" ,"ozkan","aydin","demhat","rustem"} , {"zine","ceylan","saira"}    };
        //                  0                                       ,           1

        String nameOzkan= strList[0][2];
        System.out.println(nameOzkan);
        String nameZine= strList[1][0];
        System.out.println(nameZine);

        String [] boysName=strList[0];
        String [] girlsNAme=strList[1];

        System.out.println(boysName); // this will print hashlink
        System.out.println(Arrays.toString(boysName));
        System.out.println(Arrays.toString(girlsNAme));



    }
}