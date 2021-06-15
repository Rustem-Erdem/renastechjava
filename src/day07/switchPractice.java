package day07;
public class switchPractice {
    public static void main(String[] args) {
        //Duplicate case values are not allowed.
        //The value for a case must be of the same data type as the variable in the switch. (or smaller then switch range)
        //The value for a case must be a constant or a literal. Variables are not allowed.
        //The break statement is used inside the switch to terminate a statement sequence.
        //The break statement is optional. If omitted, execution will continue on into the next case.
        //The default statement is optional and can appear anywhere inside the switch block.
        //          In case, if it is not at the end, then a break statement must be kept after the
        //          default statement to avoid the execution of the next case statement.
        //Accepted Data Types
        //The variable passed as a switch argument can be one of the following:
        //char
        //byte
        //short
        //int
        //String
        //Integer,Short,Byte,Character,enum
        byte b1=2;
        short s1=3;
        int day= 7;
        //long l1=5; not acceptable
        //double d1=3;  not acceptable
        //float f1=2;  not acceptable
        //boolean bool1=true;  not acceptable
        int number=5;
        String dayType;
        String dayName; //empty you didnt assign anything yet.
        switch (day){
            case 1: // 1 as a default is int
                dayName ="Monday";
                break;
            case 2:
                dayName ="Tuesday";
                break;
            case 3:
                dayName ="Wednesday";
                break;
            case 4:
                dayName ="Thursday";
                break;
            default:
                dayName ="Invalid Day";
                break;
            //case number: case connot be assign to variable
            case 5: //case value is 5 in here you cant assign any varible
                dayName ="Friday";
                break;
            case 6:
                dayName ="Saturday";
                break;
            case 7:
                dayName ="Sunday";
        }
        switch (day){
            //multiple cases without break statement
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType="Weekday";
                break;
            case 6:
            case 7:
                dayType="Weekend";
                break;
            default:
                dayType="Invalid Daytype";
        }
        System.out.println(day + "is a "  +dayName);
        System.out.println(day + " is a " +dayType);
        System.out.println(dayName + " is a " +dayType);
    }
}






