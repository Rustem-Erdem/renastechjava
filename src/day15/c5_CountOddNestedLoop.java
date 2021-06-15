package day15;

public class c5_CountOddNestedLoop {

    public static void main(String[] args) {
        int [][] numberList2D={
                {10,11,12,13,3},
                {15,16,17},
                {1,2,3,4,5,6,7},
                {2,4,6,10,4}
        };

        //create a java logic that will print odd and even numbers
        //also it will print sum of oddnumbers and sum of even numbers

        int countOdd=0; //11 13 15 17 1 3 5 7    8 numbers
        int countEven=0;//{10,12,16,2,4,6 ,2,4,6,10}  10 numbers
        int sumOfOdd=0;
        int sumOfEven=0;

        for (int [] each1D : numberList2D){

            for (int eachNumber: each1D){

                if (eachNumber %2 == 0){  //eachnumber = 10 , , 12,,,16,
                    countEven++;
                    sumOfEven += eachNumber;
                    System.out.println( eachNumber + " is even number");
                }else { //if number is not even that means else is odd 11 13 3,15 17
                    countOdd++;
                    sumOfOdd += eachNumber;
                    System.out.println(eachNumber + " is odd number");
                }

            }
        }


        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        System.out.println("count of odd numbers is : "+countOdd +" sum of odd numbers is :" +sumOfOdd);
        System.out.println("count of even numbers is : "+countEven +" sum of even numbers is :" +sumOfEven);



    }
}