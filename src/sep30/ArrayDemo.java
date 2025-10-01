package sep30;

public class ArrayDemo {
    public static void main(String[] args) {


        int[] arr = {10,  20,   30,   40,    50,   60,   70,   80,   90,   100};

        for (int i = 0; i < arr.length/2; i++) {

            int j = arr[i];   // j = arr[0]   , j = 10
            arr[i] = arr[arr.length-1-i];   // arr[0] = arr[9]  , arr[0] = 100
            arr[arr.length-1-i] = j; // arr[9] = 10, arr[9] = 10;
        }

        for (int element : arr){
            System.out.println(element);
        }
        /*
        length = 10
        Iteraration 1 :
        i = 0,
        arr[i]  , arr[0]
        arr[arr.length-1-i];  ==> arr[9]

        i = 1
        arr[1] = 20
        j = 20

        arr[1] = arr[8] , arr[1] = 90
        arr[8] = j , arr[8] = 20








         */



        // reverse this array


        //after reverse
        // 100, 90 ,80 .......20 10
        /*
        int temp = x;    // temp = 10, x = 10
        x = y ;       // x = 20, y = 20
        y = temp;
         */

    }
}
