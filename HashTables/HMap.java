package HashTables;

import java.util.HashMap;

public class HMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        // Add a key and value
        m.put(1, 1);
        m.put(2, 45);
        m.put(23, 12);

        // Print HashMap
        System.out.println(m);

        // Check if map contains key
        System.out.println(m.containsKey(1));

        // Get value
        System.out.println(m.get(2));

        // Remove a key
        m.remove(2);
        System.out.println(m);

        // Reset Value
        m.put(1, 87);
        System.out.println(m);

        // Size of Hashmap
        System.out.println(m.size());

        // Loop through keys of hashmap
        for (int i : m.keySet())
            System.out.print(i + ", ");

        // Loop trhough values of hashmap
        for (int i : m.values()) {
            System.out.print(i + ", ");
        }
    }
}
