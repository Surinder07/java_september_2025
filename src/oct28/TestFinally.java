package oct28;

import java.util.Scanner;

public class TestFinally {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements ");
        int[] arr = new int[3];

        try {
            for (int i = 0; i < 4; i++) {
                arr[i] = scanner.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("ALways going to be executed.");
        }
        System.out.println("Last line");
    }
}
