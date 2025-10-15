package oct11;

public class Solution {
    public static void main(String[] args) {

        String s1 = "Hello I am learning Java";
        String[] words = s1.split(" "); // hint

        StringBuilder result = new StringBuilder();
        for (String word: words) {
           // StringBuilder stringBuilder = new StringBuilder(word);
            result.append(new StringBuilder(word).reverse() + " ");
        }

        System.out.println(result);

        /*
        Problem statement
given this string
1. Hello I am learning Java

olleH I ma gninrael avaJ
         */
    }
}
