package nov15;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(10); // first added
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50); // last added

        System.out.println(queue.poll());
        System.out.println(queue.peek());


    }
}
