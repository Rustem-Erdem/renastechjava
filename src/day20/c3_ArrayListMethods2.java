package day20;

import java.util.ArrayList;
import java.util.Collections;

public class c3_ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  //empty integar arraylist

        list.add(26); //index 0
        list.add(35); //1
        list.add(-55); //2
        list.add(-1);//3

        //indexOf() will print us index of the object you are passing
        //if the object is presnet in the list you will see index of that object
        //if the object is not presnet in your list you will see index number always as -1
        System.out.println(list.indexOf(26)); //0
        System.out.println(list.indexOf(35)); //1
        System.out.println(list.indexOf(100));//-1   since i dont have 100 in my list it will return index number -1
        System.out.println(list.indexOf(555555));

        int indexnum3=list.indexOf(-55);  //2
        System.out.println(indexnum3);

        System.out.println(list.indexOf(200));//-1

        System.out.println(list.indexOf(-1)); //3

        System.out.println("******************");
        ArrayList<String > list2= new ArrayList<>();
        list2.add("A");
        list2.add("B");

        System.out.println(list2.indexOf("B")); //1
        System.out.println(list2.indexOf("C")); //-1

        //contains return boolen condition
        System.out.println(list2.contains("A"));//true

        ///all the methods that you use for arraylist will return you wrapper class
        //you can store them in wrapper class
        //but also you can store them with primitive data type
        boolean bool1= list2.contains("R");
        //list2.contains("R");  wrapper class  unboxing
        System.out.println("bool1 = " + bool1);//false


        //sort that comes from import java.util.Collections;  library
        System.out.println("list = " + list); //[26, 35, -55, -1]

        //below method will ask for list and will sorted.
        Collections.sort(list); //ascending order

        System.out.println("Sorted list "+list); //[-55, -1, 26, 35]

        Collections.sort(list2);
        System.out.println("sorted list2 = " + list2);  //sorted list2 = [A, B]

        Integer num1=10;
        Integer num2=20;

        System.out.println(num1+num2);


        //equls method will compare 2 list if all of datas are equal it will retunr true
        //if it is not then it will false
        ArrayList<Integer> numList1=new ArrayList<>();
        numList1.add(10);
        numList1.add(20);

        ArrayList<Integer> numList2=new ArrayList<>();
        numList2.add(10); // 0 index
        numList2.add(20);
        numList2.add(25);
        numList2.add(4);


        Boolean bool2=numList1.equals(numList2);
        System.out.println(bool2);


        //get method
        Collections.sort(numList2); // 4 10 20 25
        for (int i =0 ; i < numList2.size() ; i++){
            System.out.println("numList2.get(" + i + ") = " + numList2.get(i));
        }


        //is empty
        System.out.println("Before Clear numList2 = " + numList2);
        System.out.println("before clear numList2.size() = " + numList2.size()); //4
        boolean bool5= numList2.isEmpty();
        System.out.println("bool5 = " + bool5);//false


        numList2.clear(); //that will remove all data fromlist


        System.out.println("After Clear numList2 = " + numList2);
        System.out.println("After Clear numList2.size() = " + numList2.size()); //0

        //soutv this will create print line with variable information
        System.out.println(numList2.isEmpty());
        System.out.println("After clear numList2.isEmpty() = " + numList2.isEmpty()); //  true


    }
}