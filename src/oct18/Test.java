package oct18;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(101, "Lovepreet");
        String name = student.getName();
        System.out.println("Student Name :"+ name);
        student.setId(102);
        System.out.println(student.getId());
    }
}
