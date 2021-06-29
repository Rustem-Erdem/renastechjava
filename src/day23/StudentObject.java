package day23;

import MyLibrary.Library;

public class StudentObject {
    public static void main(String[] args) {
        RenastechStudent.setSchoolName("Renastech");

        RenastechStudent s1=new RenastechStudent();
        s1.setStudentInfo("heshu");
        RenastechStudent s2=new RenastechStudent();
        s1.setStudentInfo("serhat");
        RenastechStudent s3=new RenastechStudent();
        s1.setStudentInfo("vahap");

        s1.getStudentInfo();
        s2.getStudentInfo();
        s3.getStudentInfo();
        Library.stars();
        System.out.println(s1);

        StudentObject so1=new StudentObject();


    }
}