package day19;

import java.util.ArrayList;

public class c6_List {

    //Data Structure:
    //	1. Array
    //	2. Collection ==> only accepts objects
    //	3. Map ==>  only accepts objects


    // ArrayList<DataType>  listName = new ArrayList<DataType>();
    //DataType can not be primitive
    //they need to be wrapper class ,object

    //ArrayList: part of Collections
    //			does not support primitives, only support none primitives
    //			size is dynamic, automatically adjusted
    //			has index numbers


    //what is the differences between array and array list
    //1. //ArrayList: part of Collections : array is data structure
    //2.     //			does not support primitives, only support none primitives   but array support primitives
    //3. size is dynamic,    // but array siz is fixed


    public static void main(String[] args) {
        // ArrayList<DataType>  listName = new ArrayList<DataType>();
        //DataType can not be primitive
        //they need to be wrapper class objects ,object

        // ArrayList <int> list=new ArrayList<>();  int is primitive arraylist doesnt accept primitives
        ArrayList<Integer> list = new ArrayList<>(); //size is equal 0 ; size is flexible

        //add() that will add data inside the list
        list.add(10); //size 1  index 0
        list.add(100);//size 2  index 1
        list.add(259);//size 3  index 2
        list.add(250);//size 4  index 3

        System.out.println(list);

        int[] numbers = new int[5]; //size is fixed 5

        //get() that will give you specifix index number value

        Integer num1 = list.get(0);// index number 0 =10
        System.out.println(num1); //10
        System.out.println(list.get(3)); //index number 3 = 250
        //System.out.println(list.get(4)); // IndexOutOfBoundsException

        //list.get(1) will return wrapper object
        //unboxing will help you to store wrapper objects as a primitive data
        int num2 = list.get(1);
        System.out.println(num2); //100


        ArrayList<String> nameList = new ArrayList<>(); //size 0

        nameList.add("Serhat");
        nameList.add("ceylan");
        nameList.add("vahap");
        nameList.add("Heshu");
        nameList.add("evindar");  //size 5 here
        nameList.add("rustem"); //size 6

        System.out.println(nameList);

        //size() method that will give us size of arraylist
        //last index is always 1 number smaller then size or length

        System.out.println("Names are : ");
        for (int i = 0; i <= nameList.size() - 1; i++) { //0 1 2 3 4 5
            System.out.println(nameList.get(i)); // 0 1 2 3 4 5
            //System.out.println(nameList[i]); if list was an array

        }

        System.out.println("**********************");

        for (String name : nameList) {
            System.out.println(name);
        }

        int size1 = nameList.size();

        System.out.println(" size 1 ==" + size1);

        nameList.add("Java");

        int size2 = nameList.size();
        System.out.println("size 2 ==" + size2);

    }
}