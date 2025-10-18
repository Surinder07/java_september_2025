package oct18.absraction;

public class PhoneDemo {
    public static void main(String[] args) {

        //Mobile mobile = new Mobile();

        Mobile mobile = new SamsungS24();
        mobile.call();
        mobile.messages();
        mobile.surfing();


        Mobile mobile1 = new Iphone17ProMax();
        mobile1.surfing();
        mobile1.call();
        mobile1.messages();
    }
}
