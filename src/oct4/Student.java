package oct4;

public class Student {

    int id; // 101
    String name;

    Student(int id, String name){
         this.id = id;
        this.name = name;
    }


    public void show(int id){
        System.out.println(this.id);
    }

}
