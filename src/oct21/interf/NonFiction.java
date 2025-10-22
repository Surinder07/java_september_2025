package oct21.interf;

public class NonFiction implements Book{
    @Override
    public void read() {
        System.out.println("reading a non fiction book");
    }

    @Override
    public void display() {
        System.out.println("can be used to dispaly in library");
    }
}
