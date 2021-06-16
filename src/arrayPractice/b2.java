package arrayPractice;

public class b2 {
    public static void main(String[] args) {
        Divisible();
    }
    public static void Divisible() {
        String Divisibleby15 = "";
        String DivisibelBy3= "";
        String DivisibelBy5= "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                Divisibleby15 += i+" ";
            } else if(i%3==0 && i%15!=0){
                DivisibelBy3+=i+" ";
            } else if(i%5==0 && i%15!=0){
                DivisibelBy5+=i+" ";
            }
        }
        System.out.println("Divisible by 15 : "+ Divisibleby15);
        System.out.println("Divisible by 3: " + DivisibelBy3);
        System.out.println("Divisible by 5: " +DivisibelBy5);
    }
}
