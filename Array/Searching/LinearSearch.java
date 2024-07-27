package Array.Searching;

public class LinearSearch {

    // Sequential Search
    // Worst Case Time: O(n)
    // Average Case Time: O(n)
    // Best Case Time: O(1)

    public static int search(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                index = i;
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 23, 32, 45, 67, 89 };
        int key = 67;
        int index = search(arr, key);
        System.out.println("Key found at index: " + index);
    }
}