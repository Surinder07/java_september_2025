package oct25;

public abstract class Vehicle {

    double speed;

    public Vehicle(double speed) {
        this.speed = speed;
    }

    public abstract void run();

    public void runOnRoad(double speed){
        System.out.println("All vehicles must run on road with speed limit " + speed);
    }
}
