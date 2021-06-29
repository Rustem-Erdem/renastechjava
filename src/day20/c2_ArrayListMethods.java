package day20;

import java.util.ArrayList;

public class c2_ArrayListMethods {

    public static void main(String[] args) {

        //ArrayList<DataType> myNumbers = new ArrayList<Integer>(); // Valid

        ArrayList<Integer> numbers= new ArrayList<>();///0  empty list
//

        //add(5) this will add the number to last index
        numbers.add(10);//index 0 == 10
        numbers.add(20); //index 1 == 20
        numbers.add(100); //index 2 == 100

        System.out.println(numbers);//[10, 20, 100]

        numbers.add(0,200); //[200, 10, 20, 100]
        //index      0     1   2   3
        System.out.println(numbers);

        numbers.add(2,25);//[200, 10, 25 ,20 ,100]  index 4 size 5
        System.out.println(numbers);

        //add(index,number)
        //this will add the number to given index number

        numbers.add(5,35); //index 5 size 6
        System.out.println(numbers); //[200, 10, 25, 20, 100, 35]

        //numbers.add(7,35);//IndexOutOfBoundsException   // index 7 size 8


        //set()  this method will set the value for given index
        numbers.set(2,150);
        System.out.println(numbers);




        ArrayList<String> letters=new ArrayList<>();
        letters.add("B");
        letters.add("C");
        letters.add("E");
        letters.add("D");
        System.out.println(letters);

        letters.add(0,"A");
        System.out.println(letters);

        letters.set(4,"X");
        System.out.println(letters);


        //Remove
        letters.remove("B");

        System.out.println(letters);//[A, C, E, X]
        letters.remove("Y");
        //remove method will look at given object and if it is presnet in the list it will remove it
        //if it is not presant nothing will change.
        System.out.println(letters);

        boolean bool1 = letters.remove("R"); // false
        boolean bool2 = letters.remove("C"); //true

        System.out.println(bool1);
        System.out.println(bool2);

        System.out.println(letters);//[A, E, X]

        letters.clear();//[]
        //clear method will clear everything in your list

        System.out.println(letters); //[]

        //size
        System.out.println("letters.size() = " + letters.size());


    }
}