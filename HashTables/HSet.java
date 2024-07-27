package HashTables;

import java.util.HashSet;

public class HSet {

    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<Integer>();

        // Add values
        s.add(1);
        s.add(45);
        s.add(23);
        s.add(67);

        // Print HashMap
        System.out.println(s);

        // Check if map contains key
        System.out.println(s.contains(45));

        // Remove a key
        s.remove(1);
        System.out.println(s);

        // Size
        System.out.println(s.size());

        // Loop through Hashset
        for (int i : s)
            System.out.print(i + ", ");
    }
}
