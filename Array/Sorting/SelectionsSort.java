package Array.Sorting;

public class SelectionsSort {

    // Sort shortest value to correct position
    // Worst Case Time: O(n^2)
    // Average Case Time: O(n^2)
    // Best Case Time: O(n^2)

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int currentMin = i;
            for (int j = i; j < arr.length; j++)
                if (arr[j] < arr[currentMin])
                    currentMin = j;

            int temp = arr[currentMin];
            arr[currentMin] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 45, 67, 32, 89, 23, 10 };
        sort(arr);

        for (int x : arr)
            System.out.print(x + ", ");
    }
}
