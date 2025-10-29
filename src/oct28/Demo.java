package oct28;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x ");
        int x = scanner.nextInt();

        System.out.println("Enter the value for y ");
        int y = scanner.nextInt();
        int result = 0;
        try {
             result = x / y;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println(result);

        System.out.println("End of the line");

    }
}
