package nov4.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("PineApple");
        fruits.add("Grapes");

        // loop over array

       /* for (int i = 0; i <fruits.size() ; i++) {
            System.out.println(fruits.get(i));
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
*/

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
/*
1. given a list of integers, find the maximum/minimum number
2. reverse the arraylist
3. find the sum/avg of all the numbers in the list
4. Count even and odd numbers

 */
