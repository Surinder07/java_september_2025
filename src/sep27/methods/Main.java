package sep27.methods;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int subtraction = calculator.subtraction(10, 20);
        System.out.println("Subtraction of 10 and 20  is "+ subtraction);

        int sum = calculator.sum(10, 20);
        int average = sum/2;
        int moreSomething = average + 200;
        System.out.println("Average of two nos : "+moreSomething);
    }
}
