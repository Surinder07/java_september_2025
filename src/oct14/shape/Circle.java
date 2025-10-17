package oct14.shape;

public class Circle extends Shape{

    double radius;
    double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of circle is " + PI * radius * radius);
    }
}
