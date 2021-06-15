package day09;
import java.util.Scanner;
public class c1_FacebookLoginVerification {
    //create a logic that will check login function of facebook
    //correct username= renastech
    //correct password= renastech123


    //user scanner here to pass usernames and passwords
    // do validation of those usernames and password matching with correct credentials
    public static void main(String[] args) {
        String expectedUserName= "renastech";
        String expectedPassword= "renastech123";
        Scanner scan=new Scanner(System.in);//this will create an object from scanner class
        //
        System.out.println("Enter User Name :");
        String inputUserName=scan.next(); // in here what ever you pass on the console it will be stored in the string
        System.out.println("Enter the password");
        String inputPassword=scan.next();
        if (inputUserName.equals(expectedUserName) && inputPassword.equals(expectedPassword)){
            System.out.println("You have logged in Succesfuly");
        }else {
            System.out.println("Login Funcition has failed");
            System.out.println("invalid credantials please check your credentials");
            System.out.println("Credentials are " + inputUserName + " and "+ inputPassword);
        }


    }

}

