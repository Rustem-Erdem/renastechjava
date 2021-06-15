package day11;



    public class FINRA {
        //write a java program that will check numbers from 1-50
        //if number is divisible by 2 print FIN
        //If number is divisible by 3 print RA
        //If number is divisible both by 2 and 3 FINRA
        //excpected result : // 1  2    3    4    5   6
        // 1 FIN   RA  FIN  5  FINRA
        //
        public static void main(String[] args) {
            //store result and print at the end
            String str="";
            //    //write a java program that will check numbers from 1-50
            //starting point 1
            //ending point 50
            //iteration increase 1 number each time == i++
            for (int i=1; i<=50 ; i++){
                //if number is divisible by 2 print FIN
                //when you divided number by 2 reminder should be equal to 0
                if ( i %2 == 0 && i%3==0){//If number is divisible both by 2 and 3 FINRA
                    str += "FINRA "; //FOR EX if number is 6 str will have FINRA at 6 step
                }else if (i % 3 == 0){
                    //If number is divisible by 3 print RA
                    str +="RA ";
                }else if ( i % 2 == 0){
                    //if number is divisble by 2
                    str += "FIN ";
                }else {
                    //anything left will be in here
                    str += i + " " ;
                }
            }
            System.out.println(str);
        }

}
