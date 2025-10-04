package oct4;

public class Demo {

      static int z = 0; // instance variable
    public static void main(String[] args) {

        System.out.println(z);
//        System.out.println(y);
//        System.out.println(x);
    }


    public void show(int y ){ // y is local variable
        int x = 10; // local variable
        System.out.println(z);

    }
}
