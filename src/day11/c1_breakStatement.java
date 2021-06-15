package day11;

public class c1_breakStatement {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 10 ; i++){
            // 1 2 3  4 ... 10
            System.out.println("Java"); //10 times
            //4
            if (i==4){
                System.out.println("JAVA 2"); // 1 times
            }
        }
        // anytime java will reach to break break will stop current condition that you have.
        // if java catch break inside of loop
        //loop will be stopped running
        //anything after break statement wont be run
        for (int i = 1 ; i <= 10 ; i++){  //  i = 1 , 2 ,3 ,4
            System.out.println("Hello"); // 1 2 3 4
            if (i==4){ //4
                System.out.println("Stop Hello"); //4
                break;// break will  stop for loop to running from after here //4
                //System.out.println(" hello again"); you cant print after break
            }
            System.out.println("Hello again"); // 1 2 3
        }
        //4
    }
}
