package oct4.test;

import java.util.Scanner;

public class Mobile {

    // constructor
    Mobile(){
        System.out.println("Inside default constructor...");
    }



    // static method
    public static void text(){
        System.out.println("static method");
    }

    // static block
    static {
        System.out.println("Inside the static block");
    }


    //non static method
    public void call(){
        System.out.println("non static block");
    }

    // instance block is called when object of the class is created
    {
        System.out.println("Instance block");
    }

}
