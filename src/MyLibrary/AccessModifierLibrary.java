package MyLibrary;

import day24.AccessModifiers;

public class AccessModifierLibrary {
    public static void main(String[] args) {


        AccessModifiers obj1 = new AccessModifiers();
        System.out.println(obj1.publicVariable);
        //System.out.println(obj1.defaultVariable);//do not work
       // System.out.println(obj1.privateVariable);// do not work
    }
}