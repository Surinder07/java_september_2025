package nov4.collectiondemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(4253);
        System.out.println(list);
        list.add(0, 2323);
        System.out.println(list);

        // int - 0
        // Integer - null

        System.out.println(list.get(0));
    }
}
