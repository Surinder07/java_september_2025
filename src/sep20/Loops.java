package sep20;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit ");
        int limit = scanner.nextInt();

        int x = 1;
        int sum = 0;
        while (x <= limit){
            //System.out.println(x);
            if(x % 2 == 0) {
                sum = sum + x;
            }
            x++;
        }
        System.out.println("Sum : " + sum);
    }
}
