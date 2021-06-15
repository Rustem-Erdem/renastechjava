package day11;

public class c4_whileLoopPractise {
    public static void main(String[] args) {
        // print below figure
        // *****
        System.out.println("*****");
        int i=0;
        //i++;
        while (i < 5) { // 0 1 2 3 4 5
            //System.out.print("*");
            i++; //0 1 2 3 4
            System.out.print("*"); //0 1 2 3 4
        }//1 2 3 4 5
        //print below figure
        /*
         ****
         *  *
         *  *
         *  *
         *  *
         *  *
         *  *
         ****
         */
        System.out.println("--------------------------------");
        System.out.println("****");
        int count=1;
        while (count < 7  ){ //2 7
            System.out.println("*  *"); //1 //2 .. 6
            count++; //1
        }
        System.out.println("****");


    }
}
