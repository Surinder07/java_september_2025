package nov1;

public class Test {
    public static void main(String[] args) {

        String s1 = "Pragra";
        s1 = null;
        try {
            String lowerCase = s1.toLowerCase();
            //System.out.println("Hello");
            System.out.println(lowerCase);


        }

        finally {
            System.out.println("hello");
        }


    }
}
