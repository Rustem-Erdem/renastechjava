package aPractise;


import java.util.Arrays;

public class a5 {

    public static String same() {
        String str1 ="file";
        String str2 ="life";

        boolean result= true;

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)) {
            result=true;
            System.out.println(str1 + " and " + str2 + " have same letters: " + result);
        } else {
            result=false;
            System.out.println(str1 + " and " + str2 + " have not same letters:"  +result);
        }
/*    int num = 10;
      int num1 =20;
      num1 =num;
      num = 30
          System.out.println(num1)
       */






        return("");


    }

    public static void main(String[] args) {
        same();

    }


}









