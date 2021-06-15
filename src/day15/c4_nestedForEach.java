package day15;

public class c4_nestedForEach {

    public static void main(String[] args) {


        int [] arr={10,20,30};

        for (int each : arr){
            System.out.println(each);
        }

        int [][] arr2={ {1,2,0},{9,8,7} };

        for (int [] each1D : arr2){

            for (int eachNumber : each1D){

                System.out.println(eachNumber);
            }

        }

        char [][] ch2D={ {'a','b','c','d'},{'e'},{'f','g'}};

        for (char [] ch1d : ch2D ){

            for (char eachChar : ch1d){
                System.out.println(eachChar);
            }
        }

    }
}