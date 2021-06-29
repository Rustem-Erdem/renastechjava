package day23;

public class RenastechStudent {
    String name;
    int number;
    static String schoolName;
    static int countNumbers = 0;

    public void setStudentInfo(String name) {
        this.name = name;
        number = setStudentNumber();
    }

    public static int setStudentNumber() {

        countNumbers++;
        return countNumbers;
    }

    public static void setSchoolName(String schlName) {
        schoolName = schlName;
    }

    public void getStudentInfo() {
        System.out.println("name of Student : " + name);
        System.out.println("student number: " + number);

        System.out.println("school name: " + schoolName);
    }

    public String toString() {
        return "name: " + name + "number: " + number + "school name:  " + schoolName;
    }
}