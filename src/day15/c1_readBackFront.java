package day15;

public class c1_readBackFront {

    //write a java program that will check array from front and back
    //if it is same print true if it is not same print false

    //int[] numbers={0,1,2,2,1,0};
    //front 0,1,2,2,1,0
    //back  0,1,2,2,1,0
    //output will be true

    public static void main(String[] args) {
        int[] numbers={0,1,2,2,1,0};
        //int[] numbers={0,1,2,2,1,0};
        //0,1,2,3,4,5  index numbers
        //total length is 6
        //last index will be 5
        //in this case to achive for same result from front and back we need compare index numbers
        // frontread=back read
        //numbers[0]==numbers[5]
        //numbers[1]==numbers[4]
        //numbers[2]==numbers[3]
        //numbers[3]==numbers[2]
        //numbers[4]==numbers[1]
        //numbers[5]==numbers[0]

        //first is always 0
        //last index is always length-1


//        if (numbers[0]==numbers[numbers.length-1]){
//            System.out.println("true");
//        }

        boolean b1=true;

        int k =0;
        for (int i= numbers.length-1 ; i>=0; i--){ //5,4,3,2,1,0

            if (numbers[i] != numbers[k]){ // numbers[5]==numbers[0]  0==0
                b1=false;
                break;
            }else {
                System.out.println(k);
                k++;//1 2 3 4 5

            }
        }

        System.out.println(b1);
    }


}