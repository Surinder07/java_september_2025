package nov15;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Toronto", 5);   // entry   list.add("")
        map.put("Brampton", 4);
        map.put("Mississauga", 6);
        map.put("Milton", 3);
        map.put("Niagra Falls", -5);
        map.put("Niagra Falls", -7);

        System.out.println(map);
        Set<String> cities = map.keySet();
        Collection<Integer> values = map.values();

        System.out.println(map.containsKey("Milton"));
        map.putIfAbsent("Milton",23);
        System.out.println(map);

        System.out.println(map.get("Milton"));
        System.out.println(map.getOrDefault("Toronto", 1000));

        map.replace("Test", 1212);
        System.out.println(map);


        // loop over

       // Set<Map.Entry<String, Integer>> map1 = map.entrySet();
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }

    }
}
