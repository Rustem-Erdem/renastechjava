package day05;

public class practise3 {
    public static void main(String[]  args){
        String[] students= new String[4];
        students[0]= "rustem";
        students[1]= "sahan";
        students[2]= "asli";
        students[3]= "erdem";

        for(int i=0; i<students.length; i++){
        System.out.println(students[i]);}
        System.out.println("--------------");
        for(String student:students){
            System.out.println(student);
        }


    }
}
