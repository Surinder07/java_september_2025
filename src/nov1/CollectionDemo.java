package nov1;

import oct14.Student;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        ArrayList<Student> arrayList  = new ArrayList();
        arrayList.add(new Student(101));

        System.out.println(arrayList);

    }
}
