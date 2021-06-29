package day24;

public class EncapTest {

    public static void main(String[] args) {
        EncapsulationIntro obj1=new EncapsulationIntro();

        //obj1.name;
        // obj1.age;
        //obj1.idNum;

        // by using encapsulation oop consept i am able modify priavate variables and view them
        obj1.setName("Gokhan");
        System.out.println("obj1.getName() = " + obj1.getName());

        obj1.setIdNum("asdas765721");
        System.out.println("obj1.getIdNum() = " + obj1.getIdNum());

        System.out.println("obj1.getAge() = " + obj1.getAge());//we need to first set his age

        obj1.setAge(21);
        System.out.println("obj1.getAge() = " + obj1.getAge());

    }
}