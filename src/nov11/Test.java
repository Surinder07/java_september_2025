package nov11;

import java.util.List;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(100);
        System.out.println(stack);

    }
}
