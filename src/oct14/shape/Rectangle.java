package oct14.shape;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Area of rectangle "+ length * width);
    }
}
