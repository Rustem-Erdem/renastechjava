package day13;

public class c1_Arrays {

    public static void main(String[] args) {
        //declaration of array
        //DataType [] name= {data1 , data2 , data 3 .....};

        int [] number = {1,2,3,4};
        //index number   0 1 2 3

        String [] names={"Rustem","Ceylan","Alia","burhan"};
        //index number      0       1          2        3

        System.out.println(number [3]); //4
        System.out.println(names  [2]); //Alia

        //print all the names from string names array
        //starting point : inizitilation :0
        //ending point : condition  :3
        //iteration ++

        for (int i=0 ; i <=3 ; i++){
            String name = names[i] ;
            System.out.println("Name "+i+" : "+name);
        }

        int [] number2 = {1 , 5 , 3 , 10 ,7 , -5 , 0};
        //0   1   2    3  4   5    6
        if (number2[5] > number2 [2]) {
            System.out.println("3th index of number2 is bigger then 2nd index number of number2 array");
        }else{
            System.out.println("!!!!!!");
        }


        //String engineers= new String (); //this  will store single string
        String [] engineers= new String[4]; // 0 1 2 3
        //size has to be passed in new []\
        //this will be size 4 strin array
        //and all index are empty
        //as a defult those index will be null for string

        System.out.println(engineers[1]); // null

        engineers[1] ="Serhat"; // this will be serhat not null anymore
        //reasssigned from null to serhat
        System.out.println(engineers[1]);

        engineers[0]="Heshu";
        //engineers[3]="Recep";
        engineers [2]="Saira";
        System.out.println("**********************************");
        //that will give us size of array 4
        //last index 3
        int length=engineers.length; //4
        System.out.println("length of array is : "+ length);

        for (int i=0;i <= length-1 ;i++){
            System.out.println(engineers[i]);
        }


        boolean [] bool1=new boolean[3]; //length is 3
        //index numbers 0 1 2
        //System.out.println(bool1[3]);//ArrayIndexOutOfBoundsException
        System.out.println(bool1[0]);
        System.out.println(bool1[2]);
        //if you dont assign anything to array
        //as a default you will have false

        System.out.println("------------------------");
        boolean [] bool2={ true,true,false,false ,true }; //length is 5

        System.out.println(bool2 [1] ); // true



        //create condition that will check bool2 array and if array value is true print passed
        //if false print failed

        for (int i=0 ; i < bool2.length ; i++){  // i < 5  // 0 1 2 3 4

            if (bool2[i]){ //bool2[0] bool2[1] bool2[2] bool2[3] bool2[4]
                System.out.println("passed");
            }else {
                System.out.println("failed");
            }

        }



    }
}