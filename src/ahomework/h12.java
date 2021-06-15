package ahomework;
public class h12 {
    //task3

    public static void main(String[] args) {
        String[] names = {"akar", "byana", "can", "fexri", "jeniffer", "sevgin", "renastechschool"};

        int a=  (names[0].length());
        int a1= (names[1].length());
        int a2= (names[2].length());
        int a3= (names[3].length());
        int a4= (names[4].length());

        int a5= (names[5].length());
        int a6= (names[6].length());



        int[] number= {a,a1,a2,a3,a4,a5,a6};
        int max= number[0];
        int min= number[0];

        for (int i=0; i<number.length; i++) {
            if (number[i] >= max) {
                max = number[i];


            }
            if (number[i] <= min) {
                min = number[i];
            }


        }

        System.out.println("Max is " + max);
        System.out.println("Min is " + min);



    }
}