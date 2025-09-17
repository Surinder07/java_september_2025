package sep16;

public class Logical2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int a = 15;
        int b = 25;

        // give true of false
        System.out.println(x == y && a < b);  // false
        System.out.println(a <= y || b == 10); // true
        System.out.println(b >= a && a <= x);  // false
        System.out.println(b != y || y >=a);  // true
        System.out.println(a <= x  && b != y) ; // false
        System.out.println(!(x == y)); //  true
    }
}
