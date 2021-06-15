package day11;

public class c3_whileLoop {
    public static void main(String[] args) {
        for (int i = 0 ; i < 100 ; i++){
            //Starting point , ending point , iteration
            // initilization , condition , iteration
        }
//        //while loop
//        while (100 > 95 ){ // condtion always true so this will be infinitive loop
//
//            // while will check condtion that you have and it will runn until condition gets false
//            System.out.print("Java is fun");
//
//        }
        int i = 0;
        while (i <= 10 ){//condtion  //0 1 2 ... 10  11
            System.out.print("JAva is fun "); //0 1 .. 10
            i++;//1..10 11
        }
        System.out.println();
        int i1=5 ;
        while (i1 > 0) { //5  //4  3 //2 //1 //0
            //while  will runn until condition is not true anymore
            i1--; //post condition decrememmnet //5 //4 //3 //2 //1
            System.out.println(i1);//4 3 2 1 0
        }
    }

}
