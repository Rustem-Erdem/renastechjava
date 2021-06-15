package day09;

public class StringMethods2 {
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
        String str = "Hello World 123 Hello world 123";
        // //replace()           Searches a string for a specified value, and returns
        //    //                      a new string where the specified values are replaced             String
        System.out.println(str.replace("e", "x")); //Hxllo World 123 Hxllo world 123
        System.out.println(str.replace("World", "Planet"));//Hello Planet 123 Hello world 123
        //second world is small w but our target was World
        System.out.println(str);//since str didnt reassigned it will be first one we have
        str = str.replace("World", "Planet"); //now we reassigned str
        //str will change here
        System.out.println("*****************");
        System.out.println(str);
        str = "parvina";
        System.out.println(str);
        ////replaceFirst()       Replaces the first occurrence of a substring that matches the
        //    //                      given regular expression with the given replacement              String
        //    //
        System.out.println("******************************");
        String str2 = "Planet is beatiuful Planet aeeae 123 321 123";
        System.out.println(str2);
        System.out.println(str2.replaceFirst("a", "x")); // this will only replace first matching a with x
        System.out.println(str2.replace("a", "x")); //this will replace all a with x
        System.out.println(str2);
        System.out.println("****************");
        String str3 = str2.replaceFirst("Planet", "World");
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str2.replace("123", "555"));
        int number = 25;
//        System.out.println(number.replace());  yo cant repalce integar number replace methods coming from string classes
        //startsWith()       Checks whether a string starts with specified characters         boolean
        // endsWith()      Checks whether a string ends with the specified character(s)       boolean
        // if your string ends with given condition it will be true
        // if it is not then you will have false
        System.out.println("****************");
        String ss2 = "Java 21 Hello 47 Java";
        //print true if string starts with Java and if ends with Java
        //print false if string doesnt start with Java 21 and if doesnt and with 47 Java
        //if first print is not true no need to check second one
        boolean b1 = ss2.startsWith("Java") && ss2.endsWith("Java");
        boolean b2 = ss2.startsWith("Java 21") && ss2.endsWith("47 Java");


        if (b1) {

            System.out.println(b1 + " b1 is true");
            if (b2) {

                System.out.println(b2 + " b2 is true");


            } else {
                System.out.println(b2 + " b2 is false");

            }


        } else {
            System.out.println(b2 + " b1 is false");

        }

       //substring() Extracts the characters from a string,
        //                      beginning at a specified start position,
        //                      and through the specified number of character                      String
        //we have 2 method
        //first substring(beginiing index , ending index) :
        //this will print starting given index until the ending index (excluded ending index)
        //second substring(beginiing index) : this will start printing from given index to end of the sentence
        String sentence = "Hello World Java";
        //012345678910
        //i want to print World Java
        System.out.println(sentence.substring(6)); // World Java
        //print World
        System.out.println(sentence.substring(6, 10));//Worl
        System.out.println(sentence.substring(6, 11));//World
        //print Hello
        System.out.println(sentence.substring(0, 4)); // 4 index number wont be printed whihc is o
        System.out.println(sentence.substring(0, 5));//Hello  5 index number wont be printed which is space



    }
}
