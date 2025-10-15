package oct11.inheritance;

public class Car extends Vehicle{   // child class, derived, sub class

    public void start(){
        System.out.println("Car starts.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
