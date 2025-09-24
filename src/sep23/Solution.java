package sep23;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // enter the limit = 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit you want to print the sum ");
        int limit = scanner.nextInt();
        int x = 1;
        int sum = 0;

        do{
            sum = sum + x;   // 1 2 3 4 ....   sum 0 1 3 6 10 15
            x++;
        }while (x <= limit);  // 1 < 20

        System.out.println("Sum of first "+  limit + " numbers is : " + sum);

    }
}
