package sep20;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Scanner - helps to take user input
        // created scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the num1 : ");
        int x = scanner.nextInt();

        if(x % 2 ==0){
            System.out.println(x + " Even number ");
        }else{
            System.out.println(x + " Odd number");
        }
        /*
          given number x y z , x = 10, y = 20, z 15
        print the largest number of the all
         */



    }
}
