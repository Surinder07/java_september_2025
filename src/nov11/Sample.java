package nov11;

import java.util.HashSet;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(200);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(40);
        set.add(40);
        set.add(40);
        System.out.println(set);
        System.out.println(set.remove(new Integer("30")));
        System.out.println(set);
        System.out.println(set.contains(1120));
        System.out.println(set.size());
    }
}
