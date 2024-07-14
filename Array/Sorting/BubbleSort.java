package Array.Sorting;

public class BubbleSort {

    // Worst Case Time: O(n^2)
    // Average Case Time: O(n^2)
    // Best Case Time: O(n) - Array already sorted
    // Greedy, compare adjacent elements
    // Bubbles the highest element to the top first

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5 };
        sort(arr);
        for (int i : arr)
            System.err.print(i + " ");
    }
}
