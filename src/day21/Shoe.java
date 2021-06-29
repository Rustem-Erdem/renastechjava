package day21;

//custom classes which will be your library for shoes

//ArrayList class as example                //shoe
//data : can be any type of object          //data:shoe object
//functions : add ,remove ,size             //functions :brand,size,color
//wear() ,, getShoeInfo

//idea of creating object from class
//ArrayList<>  list     =  new ArrayList<>();
//        Class     refName               OBJECT

// Shoe   nike=new Shoe();

//class : it is where you actually implement your code . you store variables methods inside of your class
//this is where you create an object from . Class will explain behaviour of objects

//local variables : local variables that we declared with in block(main method,other methods ,static block)
//instance variables : object variables that we create inside of class
//instance variables can not have static specifier
//needs to be decleared outside of methods or blocks

//Access-Modifer =public, protected ,default ,priavate
//specifier   : static ,final ,abstract ,synchronized
//return type : void , any datatype(int,string,char , int [] .......)
//some method has paramertes some dont have parameter


public class Shoe {


//    public static void main(String[] args) {
//
//    }
//
//    public static void hello(){
//
//    }

    //instance variables : object variables that we create inside of class
    //instance variables can not have static specifier
    //needs to be decleared outside of methods or blocks

    String brand; //instance variable
    int size;
    String color;

    //static String Brand2; static variable

    public void wear(){ // function of shoe class
        System.out.println("He/She is wearing " + brand);
    }

    public void getShoeInfo(){
        System.out.println(brand +" , " + size + " , " + color);
    }

    //this method will set shoe objects information
    public void setShoeInfo(String shoeBrand,int shoeSize , String shoeColor){
        brand=shoeBrand;
        size=shoeSize;
        color=shoeColor;
    }


    // toString(): the method gets executed automatically whenever we pass the object name into the print statement

    public String toString(){
        //when you call class object directlly you will see whatever you pass here

        return brand + " / " + color + " / " + size;
    }




}