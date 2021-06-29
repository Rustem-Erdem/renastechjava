package day24;

public class PersonObjects {

    public static void main(String[] args) {
        FemalePerson person1=new FemalePerson();
        person1.name="Heshu";//public
        person1.age=20;//default in day 24 package

        System.out.println("FemalePerson.isHuman = " + FemalePerson.isHuman);
        System.out.println("FemalePerson.gender = " + FemalePerson.gender);

        // FemalePerson.ID

        if (FemalePerson.gender=='F' && FemalePerson.isHuman){

            System.out.println("person1.name = " + person1.name);
        }

        FemalePerson person2=new FemalePerson();
        person2.name="Gulfidan";
        person2.age=21;

        //since you are in same package with female person class
        // you will able to call default and public variables
    }
}
