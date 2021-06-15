package day13;

public class c2_Arrays2 {

    public static void main(String[] args) {

        int [] arr= {5,-5,25};
        System.out.println(arr.length);

        //you need to pass length of arrray
        int [] arr2 = new int[20]; // 0  1 2 ... 19

        System.out.println(arr2[0]); //as a default this is empty because we didnt assigned yet
        //this will print 0

        System.out.println("=============================");
        for (int i=0; i < arr2.length ; i++){
            arr2[i] = i +5;
            System.out.println(arr2[i]);
            //arr2 [0]=0+5  5
            //arr2 [1]=1+5  6
            //arr2 [2]=2+5  7
            //.../
            //arr2 [19]=19+5  24

        }

        System.out.println("==============================");

        int [] numbers= {5,10,15};
        //0 1  2
        System.out.println(numbers[1]); // 10

        numbers[1] = 25;//{5,25,15}
        //numbers 1 will be reassigned to 25

        System.out.println(numbers[1]); // 25

        numbers[1] = numbers[2]; //{5,15,15}
        //numbers 1 will be reassigned to numbers2 value which is 15

        System.out.println(numbers[1]); // 15


    }
}