package day8;

public class StringMethods3 {
    public static void main(String[] args) {
        //charAt()           Returns the character at the specified index (position)          char
        //indexOf()              Returns the position of the first found occurrence
        //                      of specified characters in a string                                int
        //isEmpty()              Checks whether a string is empty or not                          boolean
        //lastIndexOf()          Returns the position of the last found occurrence of
        //                      specified characters in a string                                   int
        String sentence="Hello world, you are great world. lo lo";
        System.out.println(sentence.charAt(2)); // l
        System.out.println(sentence.charAt(3)); // l
        System.out.println(sentence.indexOf("l"));// check and returns first matching index first l 2
        System.out.println(sentence.indexOf("lo")); //second l  3
        System.out.println(sentence.indexOf("lo ")); //second l 3
        System.out.println(sentence.indexOf( " lo") ); //index of last space before lo
        //pointing first l from hello
        System.out.println(sentence.indexOf("e")+1);
        //pointing second l from hello
        System.out.println(sentence.indexOf("e")+2);
        //catcing last l from sentece
        System.out.println(sentence.indexOf(". lo") +2);
        System.out.println(sentence.indexOf(" lo") +1);
        ////lastIndexOf()        Returns the position of the last found occurrence of
        //        //                      specified characters in a string                                 int
        //"Hello world, you are great world. lo lo";
        System.out.println("**********");
        System.out.println(sentence.lastIndexOf("l")); //37
        int firstl=sentence.indexOf("l"); //2
        int lastl=sentence.lastIndexOf("l"); //37
        int secondl=sentence.indexOf("lo"); //3
        int beforelastl=sentence.lastIndexOf(". lo") +2 ; //34
        System.out.println(firstl +"," +lastl + "," + secondl +","+beforelastl);
    }

}
