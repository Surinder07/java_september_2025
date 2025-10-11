package oct11;

public class Demo {
    public static void main(String[] args) {
        String s1 = "Test"; //
        String s2 = "testing";

        int result = s1.compareToIgnoreCase(s2);
        System.out.println(result);
        /*

        s1 == s2 --- 0
        s1 < s2 --- negative number
        s1 > s2 ---- positive number
        ASCII codes
        American Standard

        comparator vs comparable [Interview Question]


         */

    }
}
