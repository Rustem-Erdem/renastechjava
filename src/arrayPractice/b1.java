package arrayPractice;

public class b1 {


    public static void Ascending( ) {
        int [] arr = {100, -1, 21, 72};
        int max = 0;
        for (int i = 0; i <= arr.length-1; i++ ) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if (arr[i] < arr[i1]) {
                    max = arr[i];
                    arr[i] = arr[i1];
                    arr[i1] = max;
                }
            }
        }
        for (int demo=0; demo<=arr.length-1; demo++){
            System.out.println(arr[demo]);
        }
    }

    public static void main(String[] args) {
        Ascending( );
    }
}