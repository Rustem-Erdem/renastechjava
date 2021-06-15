package day10;

public class c1_forLoop {
    public static void main(String[] args) {
        //we have for loop in java to be able to do contiouns actions
        //you need specify your starting point
        //second where to end whihc is ending point
        //att the end itteration
        //loop will work until you reached ending point
        for (int i = 0 ; i<=10 ; i++){ //i = 0 ,1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10
            //11 times hello
            System.out.println("Hello World");
        }//i=1
        for (int i=0 ; i <6 ; i+=2){//0 2 4 6 8
            //3 times java 0 ,2 ,4
            System.out.println("Java");
        }
        //starting point
        for (int k=-1 ; k < 5 ; k+=3 ){// -1 2 5
            //2 times
            System.out.println("renastech");
        }
        for (int i = 4 ; i > 0 ; i-- ){ // 4 3 2 1
            System.out.println("vahap");
        }
//        for (int i =0 ; i < 5 ;  i--){ // -1 -2 -3 -4 -5 -6 -7 -8 -9
//            System.out.println("VAHAP");
//
//        } // infinitive loop
        //create an condition that will print square numbers from 0 10
        for (int number=0 ; number <= 10 ; number++){
            System.out.println("Stage : " + number +" number * number = " + (number*number));
            //Stage 0 number* number 0
            //stage 1                1
        }

    }
}
