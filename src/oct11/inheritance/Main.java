package oct11.inheritance;

public class Main {
    public static void main(String[] args) {
        // with the help of  child class object , access the parent class properties
        Car car = new Car();
        car.brand = "Honda";
        car.model = "civic";

        car.accelerates();
        car.brakes();
        car.start();
        System.out.println(car);
    }
}
// Person - name, email  , walk() talk()
// Student - name , email, course   walk()
// talk(), study()
// create Student class Object to access
// all the methods in both classes.