package nov8;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Peter","Parker","peter@gmail.com", 100));
        list.add(new Employee(102, "Mark","Parker","peter@gmail.com", 150));
        list.add(new Employee(103, "John","Parker","peter@gmail.com", 125));

        double salary = Integer.MIN_VALUE;

        // iterator  :

        for (Employee e: list) {
            if(e.getSalary() >  salary){
                salary = e.getSalary();
                list.add(e);
            }
        }
        System.out.println(list);



        /*
        add a new field with salary
        find the employee with highest salary


         */


    }
}
