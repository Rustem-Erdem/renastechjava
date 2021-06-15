package day09;

public class StringMethods {
    //isEmpty()              Checks whether a string is empty or not                          boolean
    //length()           Returns the length of a specified string                         int
    //replace()              Searches a string for a specified value, and returns
    //                      a new string where the specified values are replaced               String
    //replaceFirst()         Replaces the first occurrence of a substring that matches the
    //                      given regular expression with the given replacement                String
    //
    //startsWith()       Checks whether a string starts with specified characters         boolean
    //substring()            Extracts the characters from a string,
    //                      beginning at a specified start position,
    //                      and through the specified number of character                      String
    //toLowerCase()          Converts a string to lower case letters                          String
    //toUpperCase()          Converts a string to upper case letters                          String
    //trim()                 Removes whitespace from both ends of a string                        String
    public static void main(String[] args) {
        //isEmpty()              Checks whether a string is empty or not                          boolean
        String str="Heshu";
        System.out.println(str.isEmpty());
        String str2="";
        boolean b1=str2.isEmpty();
        if (b1){
            System.out.println("str2 is empty");
        }else {
            System.out.println("str2 is not empty");
        }
        String str3=" ";
        System.out.println(str3.isEmpty());
        ////length()             Returns the length of a specified string                         int
        String word1="Parvina";
        //0123456
        //lentgh will be 1 number plus of last index number
        System.out.println("length of word1 is : "+word1.length()); //7
        int lastIndex=word1.lastIndexOf("a"); // 6
        System.out.println("last index number of word is : " + lastIndex);
        char lastLetter=word1.charAt(6);// a
        System.out.println("letter of index number 6 is : "+ lastLetter);
        String text="abababababababababababababam,nsadnababa";
        System.out.println("Length of text is :"+ text.length());
        System.out.println("Last index number of text is :" + (text.length()-1) );
        System.out.println("Last index number of text is :" + text.lastIndexOf("a") );
    }
}
