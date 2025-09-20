package sep20;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1 :
                System.out.println("Case 1");
                break;
            case 2 :
                System.out.println("Case 2 ");
                break;
            case 3 :
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Default");

        }


    }
}
