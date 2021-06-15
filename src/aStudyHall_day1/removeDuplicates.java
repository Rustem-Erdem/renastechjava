
package aStudyHall_day1;
import java.util.Scanner;
public class removeDuplicates {
    // Write a program that can ask the user enter a String (word), and can remove the duplicated characters
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String result = "";
        for (int i = 0; i < word.length(); i++){
            String r = "" + word.charAt(i); // a, l, i, a
          /*
            if(result.contains(s)){ // a, l, i
                continue;
            }else{
                result += s;
            }
           */
            if(!result.contains(r)){
                result += r;
            }
        }
        System.out.println(result);
    }
}