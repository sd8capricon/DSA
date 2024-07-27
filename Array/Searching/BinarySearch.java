package Array.Searching;

public class BinarySearch {

    // Divide and conquer
    // Dictionary Search
    // Check if mid is equal to key if less search on left if greater search right
    // Worst Case Time: O(logn)
    // Average Case Time: O(logn)
    // Best Case Time: O(1)

    public static int search(int[] arr, int low, int high, int key) {
        int mid = (int) (low + high) / 2;

        if (high >= low)
            if (arr[mid] == key)
                return mid;
            else if (key < arr[mid])
                return search(arr, low, mid - 1, key);
            else
                return search(arr, mid + 1, high, key);

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 23, 32, 45, 67, 89 };
        int key = 23;
        int index = search(arr, 0, arr.length, key);
        System.out.println("Key found at index: " + index);
    }
}
