package oct4;

public class ArrayDemo {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
// replace this with user input, use scanner.
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
matrix addition


10 20 30             10 10 10           20 30 40
10 20 30     +       10 10 10   =       20 30 40
10 20 30             10 10 10           20 30 40





*
* *
* * *
* * * *
* * * * *



 */