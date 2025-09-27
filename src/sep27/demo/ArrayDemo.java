package sep27.demo;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 101;
        arr[2] = 102;
        arr[3] = 103;
        arr[4] = 104;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // for each loop
// for every integer element in the given array , print that element
        for (int element: arr) {
            System.out.println(element);
        }

        /*
        arr[i]  , 0     arr[0] ---> 100
                1     arr[1] ---> 101
                2    arr[2] ---> 102
                3     arr[3] ---> 103
                4     arr[4] ---> 104

         */




    }
}
