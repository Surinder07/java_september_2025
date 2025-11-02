package nov1.generics;

public class ContainerMain {
    public static void main(String[] args) {
//        Container<String> container = new Container<>("Iphone","Airpods");
//        container.printContainerItems();
//
//        Container<Float> container1 = new Container<>(23.43f, 23.23f);
        Student student = new Student("Edafe","name@gmail.com");
        Course course = new Course("Java");

        Container<Student, Course> studentContainer = new Container<>(student, course);
        studentContainer.printContainerItems();

        ContainerOld containerOld1 = new ContainerOld("macbook","Phone");
      //  ContainerOld containerOld2 = new ContainerOld("macbook",123.23);
    }
}
