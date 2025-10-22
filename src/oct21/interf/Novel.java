package oct21.interf;

public class Novel implements Book{
    @Override
    public void read() {
        System.out.println("reading from a paper novel book");
    }

    @Override
    public void display() {
        System.out.println("can be used a dispaly in the library");
    }
}
