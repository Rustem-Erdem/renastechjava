package day17;

public class c3_returnMethods {
    public static void main(String[] args) {
        String firstName= "rustem";
        String lastname= "erdem";
        System.out.println(concat(firstName,lastname));
        String newName= concat(firstName,lastname);
        System.out.println(newName.charAt(3));


        System.out.println(equalNames(firstName,lastname));
        System.out.println(equalNames(firstName,"rustem"));

    }
    public static String concat(String name, String surname){

        return name.concat(surname);
    }
    public static boolean equalNames(String name, String surname){

        return name.equals(surname);
    }
}
