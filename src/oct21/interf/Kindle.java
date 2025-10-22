package oct21.interf;

public class Kindle implements Book{
    @Override
    public void read() {
        System.out.println("can be read online, or in e-reader mode");
    }

    @Override
    public void display() {
        System.out.println("cannot be placed in libarary");
    }
}
