package day12;

public class c4_NestedLoop {

    //nested loop mean loop inside loop
    //nested if  = if inside if

    //while for doWhile

    //while inside while
    //while inside for
    //do while inside for
    //for inside for
    ///...... any loop can be inside any loop


    public static void main(String[] args) {


        for (int i = 0 ; i < 4 ; i ++){ // i=0 1 2 3
            System.out.println("Hello"); //i=0 1

            //i=0  , 1
            for (int j=1 ; j < 8 ; j++){ // 1 2 ...8
                System.out.println("Java");
            }


        }

        int totalRow=10;
        int totalColumn=40;


        for (int i = 1 ; i <= totalRow ; i++){ // 0 1 10

            int k=1;
            while (k <= totalColumn){
                System.out.print("* ");
                k++;
            }
            System.out.println(); // move next line


        }

        //i=0
        // k =1 ,2,3 10
        //* * * * * * * * *

        //i=1
        // k =1 ,2,3 10
        //* * * * * * * * *

        //...

        //i=5
        // k =1 ,2,3 10
        //* * * * * * * * *



    }
}