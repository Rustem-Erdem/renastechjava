package aForLoop;

public class forEach {
    public static void main(String[] args) {
        String [] a = {"ankara","Diyarbakir","Izmir","Kocaeli"};
        for (String str : a){
            System.out.print(str+" ");
        }
    }
}
class foreach{
    public static void main(String[] args) {
        int n=1, w=1;
        char [] ch = {'a','n','k','a','r','a'};
        for (char c:ch){
            w = w*n;
            n++;
        }
        System.out.println(w);
    }
}
