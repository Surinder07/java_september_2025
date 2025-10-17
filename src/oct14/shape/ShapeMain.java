package oct14.shape;

public class ShapeMain {
    public static void main(String[] args) {

        // parent class reference can be assigned to child class object
        // Upcasting
        Shape square = new Square(10);
        square.area();

        Shape circle = new Circle(15);
        circle.area();

        Shape rectangle = new Rectangle(10,30);
        rectangle.area();

        // at the runtime it will evaluate, based on the object which method will be called
        // currently Shape is super class , BlueRectangle is child
        Shape blueRectangle = new BlueRectangle(8,30);
        blueRectangle.area();
    }
}
// ad a triangle shape and calculate its area.