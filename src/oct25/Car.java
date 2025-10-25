package oct25;

public class Car extends Vehicle{

    int seatingCapacity;

    public Car(double speed) {
        super(speed);
    }

    public Car(double speed, int seatingCapacity) {
        super(speed);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void run() {
        System.out.println("Car is running at speed 100");
    }
}
