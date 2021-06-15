package day05;

public class c2_multiIfStatements {
    public static void main(String [] args){
        //multi if else blocks
        //lets say you have 2 number
        // you want to check if they are equal ,small , big
        int x= 135;
        int y= 135;
        //create check if x is smaller then y or bigger then y or equal to y
        if (x==y){ // java will first check this block
            System.out.println(x+ " is equal to  " + y);
        }else if(x > y){ // check this one one second part
            System.out.println(x+ " is bigger then "+ y);
        }else { // latsly it will check else block
            //else block will be getting printing only if other blocks does not
            System.out.println(x+ " is smaller then "+ y);
        }
        // starting point is 0                              print  you are at starting point
        // ending  point  is 10                             print  you are at ending point
        // between those numbers (0-10) will be  on my way          print  you are on your way
        int number=100;
        if (number==0){
            System.out.println("you are at starting point");
        }else if ( number == 10) {
            System.out.println("you are at ending point");
        }else if ( number >0 && number <10){
            System.out.println("you are on your way");
        }else {
            System.out.println("you are on wrong way");
            System.out.println("please check your way " + number);
            System.out.println("number has to be between 0 - 10 !!!!! ");
        }
    }

}
