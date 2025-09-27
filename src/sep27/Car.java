package sep27;
// create a class COmputer , methods, variables, and create an Object to call these methods.
// int memory, String color,   surfInternet(),
public class Car {
    // attributes / properties // data memebers
    String color;
    String brand;
    String make;
    int topSpeed;

    // methods - behaviours
    // access modifier - public
    // void - return type but not returning any value
    public void run(){
        System.out.println("This car is running..");
    }

    public void stop(){
        System.out.println("Car stops");
    }

    public void accelerate(){
        System.out.println("Car accelerate...");
    }

}
