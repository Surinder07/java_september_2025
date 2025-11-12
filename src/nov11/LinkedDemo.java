package nov11;

import java.util.LinkedHashSet;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        lh.add(10);
        lh.add(430);
        lh.add(1340);
        lh.add(1230);
        lh.add(1340);
        lh.add(110);
        System.out.println(lh);
    }
}
