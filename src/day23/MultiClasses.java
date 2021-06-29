package day23;

//in java you can only have one public class

import day22.Animals;

class Cat{
    public static void main(String[] args) {
        System.out.println("cat");
        Animals a1=new Animals();

    }

    public static void helloCat(){
        System.out.println("HelloCat");
    }

    public void helloCat2(){
        System.out.println("hello act 2");
    }
}

public class MultiClasses {
    public static void main(String[] args) {
        System.out.println("Main class");
        Animals a1=new Animals();

    }


}

class Bird{
    public static void main(String[] args) {
        System.out.println("bird");
        Animals a1=new Animals();

        Cat.helloCat();

        Cat c1=new Cat();
        c1.helloCat2();

    }


}
