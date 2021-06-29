package day18;

import java.time.LocalDate;

public class c6_datePractice {

    //create a method that will check today date and comapare the date you are passing
    //if it matchs it will print Happy Birthday
    //if it is not "Not Today I am Sorry"


    public static void happyBirthday(int year , int month ,int day){
        LocalDate birthday=LocalDate.of(year,month,day);
        LocalDate todayDate=LocalDate.now();

        int month2=todayDate.getMonthValue();
        int day2=todayDate.getDayOfMonth();
//        int year2=todayDate.getYear();

        if (month==month2 && day==day2){
            System.out.println("\n\t Today is your birthday !!!!!!!!!");
            System.out.println("\t\t\t Happy Birthday To You !!!!!!!!!!!!!");
        }else {
            System.out.println("Not Today I am Sorry");
        }

    }

    public static void main(String[] args) {
        happyBirthday(1990,06,20);
    }
}