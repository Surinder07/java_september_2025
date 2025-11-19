package nov18.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("Audi", "White",28000.45));
        vehicleList.add(new Vehicle("Mercedes", "Green",32000.34));
        vehicleList.add(new Vehicle("Hyundai", "Orange",234324.324));
        vehicleList.add(new Vehicle("Honda", "Yellow",35000.334));
        vehicleList.add(new Vehicle("Tesla", "Blue",25000.5));

       // Collections.sort(vehicleList, new BrandCompartor());
        Collections.sort(vehicleList, new ColorComparator());

        // compare based on color


        // compare based on price


        System.out.println(vehicleList);
    }
}
