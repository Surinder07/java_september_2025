package oct14;

public class Test {
    public static void main(String[] args) {
        String s1 = "Test";  // 10112 SCP
        String s2 = "Test";  // 10112 SCP

        String s3 = new String("Test");  // 3er234
        String s4 = s3;
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equals(s3));
//
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
        //System.out.println(s3 == s4);
        System.out.println(s3.toString());

        Student student = new Student(101);
        System.out.println(student.toString());

    }
}
