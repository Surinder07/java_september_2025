package oct14.shape;

public class BlueRectangle extends Rectangle{

    public BlueRectangle(double length, double width) {
        super(length, width);
    }

    @Override
    void area() {
        System.out.println("Blue rectangle area " + length * width);
    }
}
