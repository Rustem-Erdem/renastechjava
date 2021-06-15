package day14;

import java.util.Arrays;

public class c6_arrayDeepToString {

    public static void main(String[] args) {
        int [] arr1={1,2,3};
        System.out.println(Arrays.toString(arr1));//[1, 2, 3]

        int [][] arr2={{1,2},{2,3},{4}};
        System.out.println(Arrays.toString(arr2[0]));//[1, 2]

        System.out.println(Arrays.toString(arr2 ));//[[I@5cad8086, [I@6e0be858, [I@61bbe9ba]

        System.out.println(Arrays.deepToString(arr2)); //[[1, 2], [2, 3], [4]]

    }
}