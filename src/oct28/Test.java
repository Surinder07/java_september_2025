package oct28;

public class Test {
    public static void main(String[] args) {

        String s1 = "PRAGRA";
        s1 = null;
        System.out.println(s1);
        String lowerCase = null;

        try {
            lowerCase = s1.toLowerCase(); // this will generate exception
            System.out.println("Hello line 13");
            int result = 10/0;
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("last result :"+lowerCase);
        System.out.println("Last line");
    }
}
