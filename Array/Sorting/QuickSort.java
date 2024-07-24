package Array.Sorting;

public class QuickSort {

    // Divide and conquer
    // Place the pivot in its right position
    // Elements greater than pivot on right and elements less than pivot on left
    // Worst Case: O(n^2)
    // Average Case: O(nlogn)
    // Best Case: o(nlogn)

    public static int parition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = parition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 20, 1, 45, 9 };
        sort(arr, 0, arr.length - 1);
        for (int x : arr)
            System.out.print(x + ", ");
    }
}
