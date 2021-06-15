package day06;

public class c5_switchStatement {
    //create a java program that will take numbers between 1-12
    //and print months name depends on number
    //ex
    //1 -- jan
    //5 -- may
    public static void main(String[] args) {

        //main + enter is shortcut to create main method
        //sout + enter is shortcut to create println
        //System.out.println();
        int month=7;
        String monthName ;
        switch (month) { // switch will ask you for a variable
            case 1 : monthName="Jan"; //switch will check cases and if it is match
                //then month name will be Jan
                break; // if this case is true then break the switch
            case 2 : monthName="Feb";
                break;
            case 3 : monthName="Mar";
                break;
            case 4 : monthName="Apr";
                break;
            case 5 : monthName="May";
                break;
            case 6 : monthName="Jun";
                break;
            case 8 : monthName="Aug";
                break;
            case 7 : monthName="July";
                break;
            case 9 : monthName="Sep";
                break;
            case 10 : monthName="Oct";
                break;
            case 12 : monthName="Dec";
                break;
            case 11 : monthName="Now";
                break;
            default: monthName="Invalid Number";
                break;
        }
        System.out.println(monthName);
        //without break statement
        char ch1='D';
        String result="Hello ";
        // 3 case which is A B C
        switch (ch1){ //C
            case 'A':
                result += "A"; // hello A
            case 'B' :
                result += "B"; //hello AB
                //break;// break stop switch
            case 'C' :
                result += "C";
            default: //when you dont have any match default will be run like else
                result += "invalid";
        }
        System.out.println(result);


    }

}
