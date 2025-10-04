package oct4;

public class StaticDemo {

     int x = 10;
    StaticDemo(){
        System.out.println(x);
        x++;
    }

    public static void main(String[] args) {
        // stack                heap
       StaticDemo s1   =  new StaticDemo(); // 10
        new StaticDemo(); // 11
        new StaticDemo(); // 12
    }
}
