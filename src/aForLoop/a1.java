package aForLoop;

public class a1 {
    public static void main(String[] args) {
        int sum= 0;
        for (int i=0; i<=5; i++){
            sum=sum+i;
            System.out.printf("%d'e kadar toplam: %d %n",i,sum);
        }
        System.out.println(sum);
    }


    }
    class Break {
        public static void main(String[] args) {
            int fact=1;
            for (int i=1; i<=10;i++){
                fact=fact*i;
              if(i==7){
                  break;
              }
                System.out.println(fact);
            }
        }
}
class Continue {
    public static void main(String[] args) {


        int fact = 1;
        for (int k = 1; k <= 10; k++) {
            fact=fact * k;
            if(k==5){
                continue;


            }
            System.out.println(fact);

        }
    }
}
class breakContinue{
    public static void main(String[] args) {
        for (int a=1; a<=20; a++){
            if(a==10)
                break;
                if(a % 2 == 0 )
                    continue;

            System.out.println(a);
        }

    }
}
class While{
    public static void main(String[] args) {
        int counter=0;
        while (counter<10){
            counter++;
            System.out.println(counter);
        }
    }
}
class While1{
    public static void main(String[] args) {
        int n=1;
        int sum= 0;
        while (n < 10){

            sum=sum+n;

            n++;
            System.out.println(sum);
        }
    }
}