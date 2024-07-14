package Array.Sorting;

public class InsertionSort {
    public static int[] sort(int[] arr) {

        // Worst Case Time Complexity: O(n^2)
        // Average Case Time Complexity: O(n^2)
        // Best Case Time Complexity: O(n)

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
        int[] sorted = sort(arr);

        for (int i : sorted)
            System.out.print(i + ", ");
    }
}
