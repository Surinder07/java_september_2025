package oct7;

public class StringDemo {
    public static void main(String[] args) {
        String name = "pragra";

        System.out.println(name.length());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.isEmpty());

        // convert to character array
        char[] chars = name.toCharArray();
        for (char ch: chars) {
            System.out.println(ch);
        }


        System.out.println(name.equals("Pragra"));
        System.out.println(name.trim());

        System.out.println(name.indexOf('z'));

        System.out.println(name.lastIndexOf('p'));

        System.out.println(name.charAt(2));

        System.out.println(name.substring(5));

        System.out.println(name.equalsIgnoreCase("PRAGRA"));

    }
}
