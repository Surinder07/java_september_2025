package sep20;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number ");
        int x = scanner.nextInt();

        System.out.println("Enter the second Number ");
        int y = scanner.nextInt();

        System.out.println("Enter the third Number ");
        int z = scanner.nextInt();

        if(x > y  && x >z ){
            System.out.println(x + " is greater");
        }
        else if (y >z){
            System.out.println(y +" is greater");
        }else if(x == y & y == z){
            System.out.println("All are equal");
        }else{
            System.out.println("Z is greater");
        }

    }
}
