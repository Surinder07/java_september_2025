package sep23;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("Welcome to my Lottery System");
        System.out.println("Pick a number from 1 - 100 ");

        Scanner scanner = new Scanner(System.in);

        int luckyNumber = 55;
        int maxAttempt = 3;
        // range - 100
        System.out.println("Guess a number ");
        for (int i = 1; i <= 3; i++) {
           int guess = scanner.nextInt();

            if(guess == luckyNumber){
                System.out.println(" you won the lottery....");
                break;
            }else {

            }
        }

    }
}
/*

 Lottery System
        range is 1- 100
        Lucky number : 59
        print the winner ,
        user can have 3 attempts
 */