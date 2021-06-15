package day15;

public class c3_CountEvenOddnumbers {

    public static void main(String[] args) {
        //creata a java program that will print count off odd numbers and even numbers from int array
        int []numberList={0,2,4,6,7,5,3,100,25,30};

        //output will say 6 even numbers
        //4 odd numbers

        int oddCount=0;//1
        int evenCount=0;//1 2 3 4

        //first regular loop
        for (int i=0; i < numberList.length ; i++){

            if (numberList[i] % 2 ==0 ){ //this means even number
                evenCount++;
            }else { //if it is not even it will odd number
                oddCount++;
            }

        }

        System.out.println("odd count is : "+oddCount);
        System.out.println("even count is : "+evenCount);

        System.out.println("++++++++++++++++++++++++++++++");
        //for each loop
        int []numberList2={0,2,4,6,7,5,3,100,25,30};


        int oddCount2=0;
        int evenCount2=0;

        for (int number : numberList2){

            if (number % 2 ==0){
                evenCount2++;
            }else {
                oddCount2++;
            }

        }

        System.out.println("odd count2 is :"+oddCount2);
        System.out.println("even count 2 is : "+evenCount2);





    }
}