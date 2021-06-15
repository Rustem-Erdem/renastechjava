package day10;

public class c2_forLoop2 {
    public static void main(String[] args) {

        //print even numbers between 0 - 100
        //output should be 0 2 4 6 ... 96 98 100
        String evenNumbers="";
        String oddNumbers ="";
        for (int i = 0 ; i <= 100 ; i += 2 ){
            //0 2 4 6 8 10
            evenNumbers += i +" , " ; //""+0+2+4+6 +100
        }
        System.out.println("even numbers are : "+evenNumbers);
        //print odd numbers between 0-100
        //output should be 1 3 5 7 ... 97 99
        for (int i=1 ; i <= 100 ; i +=2){  // 1 3 5 7
            //i+=2 this will increase number by 2
            //1 ,3 ,5 ,7, 9 ... 99
            oddNumbers += i +" , ";
            //System.out.println(oddNumbers);
        }
        System.out.println(oddNumbers);
        System.out.println("*********************************");
        for (int i=0 ; i <=100 ; i +=4){//0 5 10 15
            //
            System.out.println("first i ="+i);//0  5 10
            ++i; // pre increase condition
            System.out.println("second i ="+i);//1 6 11
        }
        for (int i = 10 ; i >5 ; --i){ // 10 9 8 7 6
            System.out.println("hello");
        }
        System.out.println("**********");
        for (int i = 10 ; i >5 ; i--){ // 10 9 8 7 6
            System.out.println("hello");
        }
        //Both of them decrease the variable i by one. It's like saying i = i - 1. The difference is subtle.
        // If you're using it in a loop like this, there's no difference:
        //The way for loop is processed is as follows
        //
        //1 First, initialization is performed (i=10)
        //
        //2 the check is performed (i < n)
        //
        //3 the code in the loop is executed.
        //
        //4 the value is incremented or decremement
        //
        //5 Repeat steps 2 - 4
        //
        //This is the reason why, there is no difference between i++ and ++i in the for loop which has been used.
        //how you can reverse a string
        //input :hello
        //output :olleh
        String str="hello";
        //01234
        String reverse1=""+str.charAt(4)+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        System.out.println(reverse1);
        //
    }
}
