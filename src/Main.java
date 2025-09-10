public class Main {
    public static void main(String[] args) {
        String s = "Hello";   // olleH
        char[] arr = s.toCharArray();


        // swap

        int start = 0;
        int end = arr.length-1;
        char temp;
        while (start < end ){
            temp = arr[start];  // empty glass = orange juice
            arr[start] = arr[end];  // orange = mango
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }



    }
}