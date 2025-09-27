package sep27;

public class Demo {
    // methods


    public String greeting(String name){
        String result = "My name is : " + name;
        return result;
    }

    public static void main(String[] args) {

        Demo demo = new Demo();
        String result = demo.greeting("Chetan");

    }
}
