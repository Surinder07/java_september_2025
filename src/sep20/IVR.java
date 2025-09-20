package sep20;

import java.util.Scanner;

public class IVR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Press 1 for English");
        System.out.println("2. Press 2 for French");
        System.out.println("Enter the choice ");
        int choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("1. Press 1 for Sales");
            System.out.println("2. Press 2 for Tech Support");
            System.out.println("3. Press 3 for Tech Billing");
            System.out.println("4. Press 4 for Tech Feedback");
            System.out.println("enter your choice ");
            int innerChoice = scanner.nextInt();
            if(innerChoice == 1){
                System.out.println("Offers ...");
            }


        }else {

        }
    }
}
