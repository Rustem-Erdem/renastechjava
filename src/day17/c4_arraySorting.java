package day17;

import java.util.Arrays;

public class c4_arraySorting {
    public static void main(String[] args) {
        int[]numbers={5,10,43,27};
        descandingArray(numbers);

    }
    public static void descandingArray(int[] arr){
        Arrays.sort(arr);
        for(int i= arr.length-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
