package oct14.shape;

public class Square extends Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void area(){
        System.out.println("Area of square : "+ side * side);
    }

}
