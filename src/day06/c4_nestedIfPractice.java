package day06;

public class c4_nestedIfPractice {


    //create a java program to check if person is eligible to give blood
//requirement to give blood :
    //person needs to be older then 18
    //person weight needs to be more then 50
//expected output :
// if person age is smaller and equal to 18
    //"Person needs to be older then 18 "
//if person is eligible
    //"Person is eligible to give blood"
//if person is not
    //"Person is not eligible to give blood "
//example test data is ramazan age is 15 weight is 150


    public static void main(String[]  args){
        int age= 55;
        String result="";
       double weight= 150.0;

        if(age> 18){
            if(weight>50.0){
                result= " eligible";

            }else{
                result= "not egilible";

            }

    }
        else{

            result= "not egilible";
        }
        System.out.println(result);
    }

}
