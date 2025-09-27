package sep27.demo;


import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        // scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5]; // size is fixed

        System.out.println("Enter the elements for array");

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Printing the array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

            /*

            arr[0] = 110
            i = 1 arr[1] = 123

             */



      /*  arr[0] = 100;
        arr[1] = 101;
        arr[2] = 102;
        arr[3] = 103;
        arr[4] = 104;*/



    }
}
