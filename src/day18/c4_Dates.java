package day18;

import java.time.LocalDate;


public class c4_Dates {
    public static void main(String[] args) {
        LocalDate LocalDate1=LocalDate.of(2021,06,16);
        System.out.println(LocalDate1);

        LocalDate LocalDate2=LocalDate.of(2020,07,18);
        System.out.println(LocalDate2);
        //isAfter, isBefore
        boolean bool1=LocalDate1.isAfter(LocalDate2);// true
        boolean bool2=LocalDate1.isAfter(LocalDate2);//false
        boolean bool3=LocalDate1.isAfter(LocalDate2);//false

        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);

        LocalDate todayDate=LocalDate.now();
        System.out.println("today is : "+todayDate);

        String str1=LocalDate1.toString();//2021-06-16
        str1= str1.replace("-",".");
        System.out.println(str1);
    }
}
