package oct11;

public class Test {
    public static void main(String[] args) {
        char[] ch = {'p','r','a','g','r','a'};
        String s = new String(ch);
        System.out.println(s);

        String s1 = String.valueOf(ch);

        int x = 10;
        String s2 = String.valueOf(x);
        String sum = 20 + s2;
        System.out.println(sum);

        boolean isRaining = true;
        String s3 = String.valueOf(isRaining);
        System.out.println(10 + s3);

        // git pull --rebase

    }
}
