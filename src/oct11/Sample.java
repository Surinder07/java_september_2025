package oct11;

public class Sample {
    public static void main(String[] args) {
       /* String s1 = "Pragra";
        String result = s1.concat(" Incorporation");
        s1 ------------> Pragra
        result ------>      Pragra Incorporation
        System.out.println(s1);
        System.out.println(result);
*/

        StringBuffer sb = new StringBuffer("Pragra");
        StringBuffer result = sb.append(" Incorporation");

        // sb   -----------> Pragra Incorporation
        // sb.append
        //
        System.out.println(sb);   // Pragra
       // System.out.println(result);




    }
}
