package aexamples;

import java.util.ArrayList;

public class b {
    public static void main(String[] args) {
        ArrayList<Integer>  rustem=new ArrayList<>();
        rustem.add(4);
        rustem.add(5);
        rustem.add(43);
        rustem.add(7);
        rustem.add(1);
        ArrayList<Integer> reverse=new ArrayList<>();

        for(int i=rustem.size()-1; i>=0; i--){
            reverse.add(rustem.get(i));

        }
        System.out.println(reverse);
    }
}
