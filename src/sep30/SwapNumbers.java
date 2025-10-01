package sep30;

public class SwapNumbers {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        System.out.println("Before swapping ");
        System.out.println("X : " + x);
        System.out.println("Y : " + y);

        // logic

        int temp = x;    // temp = 10, x = 10
        x = y ;       // x = 20, y = 20
        y = temp;

        System.out.println("After swapping ");
        System.out.println("X : " + x);   // x= 20
        System.out.println("Y : " + y);  // y = 10
    }
}

