package nov22;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        // Collections
        // immutable list
       // List<Integer> list = List.of(10, 23, 232, 3, 2, 452, 32, 23, 2342, 432);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(450);
        list.add(200);
        list.add(200);
        list.add(402);
        list.add(200);
        list.add(250);
        list.add(50);
        Collections.sort(list);
        System.out.println(list);


        Collections.reverse(list);
        System.out.println(list);

        System.out.println("Minimum element in the list : "+Collections.min(list));
        System.out.println("Maximum element in the list : "+Collections.max(list));

        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println(unmodifiableList);
       // unmodifiableList.add(10);

        List<Object> objects = Collections.emptyList();
       // objects.add(10);
        System.out.println(objects);


        System.out.println("Frequency : "+Collections.frequency(list, 200));


        List<Integer> sortedList = List.of(10, 23, 45, 64, 76, 79);
        int result = Collections.binarySearch(sortedList, 45);
        System.out.println("Binary search :  "+result);

    }
}
