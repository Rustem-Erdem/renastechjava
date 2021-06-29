package day18;

public class c7_minNumberArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 2, 1000, 95};
        System.out.println(minNumberArray(arr));

        double[] arr1 = {10, 20, 2.7, 1000, 95};
        System.out.println(minNumberArray(arr1));
    }

    public static int minNumberArray(int[] numbers) {
        int minimum = numbers[0];

        for (int eachNumber : numbers) {
            if (eachNumber < minimum) {
                minimum = eachNumber;
            }
        }

        return minimum;


    }

    public static double minNumberArray(double[] numbers) {
        double minimum = numbers[0];

        for (double eachNumber : numbers) {
            if (eachNumber < minimum) {
                minimum = eachNumber;
            }
        }

        return minimum;
    }
}