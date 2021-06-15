package day12;

public class c6_ArrayIntro {

    public static void main(String[] args) {

        //int,string,char ....

        //each variables are storing one value

        //if i want to store multiple value in one list

        //Array  == variable containers
        //as a container that will store multiple values inside
        //and it has ready methods that you can modify print any variable that you have inside of container


        //declaration of array
        //DataType [] name= {data1 , data2, data 3 .....};

        //integar container (array)
        int [] numbers= {100 , 50 , 300 , 49  }; // this is int array
        //you cannot store any other varibale type in this array only int numbers

        //   0     1    2     3      index of array elements

        System.out.println( numbers [0] ); // this will print index 0 from given array

        int number2=numbers[1]; // this will sttore 50 inside number 2

        System.out.println(number2);

        System.out.println( numbers[4] ); // ArrayIndexOutOfBoundsException: error


    }

}