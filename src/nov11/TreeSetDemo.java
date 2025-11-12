package nov11;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(120);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(40);
        treeSet.add(430);
        treeSet.add(43);
        System.out.println(treeSet);
    }
}
