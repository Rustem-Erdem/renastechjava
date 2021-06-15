package day06;

public class c3_nestedIf {
    public static void main(String[]  args){

        // nested if is having if conditions inside of if conditions
        // so if firs condition is true then java move inside and check other condiyions
        // if it is not then move to the end
//        if (){
//            if (){
//
//            }else if (){
//
//            }else if (){
//
//            }else{
//
//            }
//        }else if (){
//
//            if (){
//
//            }else if(){
//
//            }
//
//        }else if () {
//
//        }else{
//
//        }
        ////this task :
        //    //create a java program that takes score of student and prints the grade of student
        //    //between 100 to 51 is grade A
        //    //between 0 to 50 is grade B
        //    //if number is not between 0-100 grade 0 ,,"invalid number"
        //    if students absent
        //    if number is valid numnber
        int score= 120;
        String attend= "Yes";
        String  result="";
        if (attend == "Yes"){ // java is case sensitive language make sure to pass exact match
            if (score >= 51 && score <=100){
                //    //between 100 to 51 is grade A
                result = "Student score is : " + score + " Grade is A ";
            }else if (score>=0 && score <=50) {
                //    //between 0 to 50 is grade B
                result = "Student score is : " + score + " Grade is B ";
            }else {
                result = "Invalid Number passed Check the Score !!!!" + "Score is : "+ score;
            }
        }else if (attend == "No"){
            //System.out.println("Student was absent");
            result="Student was absent" ;
        }else {
            //System.out.println("invalid character for attendence");
            result="Invalid Characters for Attandence Please check attend variable : " + attend;
        }
        System.out.println(result);

    }
}
