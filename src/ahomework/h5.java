package ahomework;

public class h5 {
    public static void main(String[] args)
    {
        String[] big={"akar", "byana", "can", "fexri", "jeniffer", "sevgin", "renastechschool"};
        String bigstring=null;
        int maxlength=0;
        for(String max:big)
        {
            if(maxlength<max.length()) {
                maxlength=max.length();
                bigstring=max;
            }
        }
        System.out.println(bigstring);
    }
}
