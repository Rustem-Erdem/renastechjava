package day22;

public class Animals {
    String type;
    double age;
    String color;
    String name;

    public void setAnimalInfo(String type,double age,String color, String name){
      /*  type=animalType;
        age=animalAge;
        color=animalColor;
        name=animalName; */

        this.type=type;
        this.age=age;
        this.color=color;
        this.name=name;


    }

    public void eating(String food){
        System.out.println(name + "is a" + food);
    }
    public void getType(){
        System.out.println(name+"is a"+type);
    }
}
