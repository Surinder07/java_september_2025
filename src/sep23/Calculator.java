package sep23;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("1. Addition");
        System.out.println("2. Sub");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.println("5. Modulus");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice ");
        int input = scanner.nextInt();
        System.out.println("Enter the first Number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the first Number ");
        int num2 = scanner.nextInt();

        switch (input ){
            case 1:
                int sum  = num1  + num2;
                System.out.println(sum);
                break;

        }
        System.out.println("Do you still want to add more numerbs ...");
    }
}
