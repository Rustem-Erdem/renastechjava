package day04;

public class c1_logicalOperators {
    public static void main(String[]  args){
      //&& --
      // || -- or
      // ! -- not opposite


        //&& -- and
        System.out.println( (5>3) && (3>5));    // t && f =f
        System.out.println( (10>3) && (7>5));   // t && t = t
        System.out.println( (5==3) && (3!=5)); // f && t = f
        System.out.println( (2!=2) && (3>5));  // f && f =f
        System.out.println();

        // || -- or
        System.out.println( (5>3) || (3>5));  // t || f   =t
        System.out.println( (10>3) ||  (7>5));  // t || t   = t
        System.out.println( (5==3) ||  (3!=5));  // f || t   = t
        System.out.println( (2!=2) ||  (3>5));  // f || f    =f
        System.out.println();

        boolean bool1 = true;
        boolean bool2 = ! (10 !=15);
      System.out.println(bool1 && bool2);
      System.out.println();









    }
}
