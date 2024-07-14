package Array;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        // New ArrayList
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 6));

        // Getting element at index 2
        System.out.println("Element at index 2");
        System.out.println(arr.get(2));

        // Setting an element at index
        System.out.println("Set index 1 as 120");
        arr.set(1, 120);
        System.out.println(arr);

        // Adding 69 to list
        System.out.println("Adding to list");
        arr.add(69);
        System.out.println(arr);

        // Removing index 3
        System.out.println("Removing index 3");
        arr.remove(3);
        System.out.println(arr);

        // SubList
        System.out.println("Sublist");
        List<Integer> subarr = arr.subList(0, 3);
        System.out.println(subarr);

        // Add new elements
        System.out.println("Adding multiple elements");
        arr.addAll(Arrays.asList(14, 23, 43, 21));
        System.out.println(arr);
    }
}
