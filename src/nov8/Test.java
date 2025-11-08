package nov8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

       //List<String> cities = new ArrayList<>();

        //ArrayList<String> cities = new ArrayList<>();
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Toronto");
        cities.add("Mississauga");
        cities.add("Niagara");
        cities.add("Brampton");

        List<String> countries = new ArrayList<>();

        countries.add("India");
        countries.add("US");
        countries.add("Canada");
        countries.add("Mexico");
        cities.addAll(1, countries);
        System.out.println(cities);
             //   ["Toronto", "India", "US","Canada","Mexico","Missisauga"]


        cities.getLast();

        Object[] objects = cities.toArray();
        System.out.println(objects.toString());

//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(objects[i]);
//        }

        System.out.println(Arrays.toString(objects));


    }
}
