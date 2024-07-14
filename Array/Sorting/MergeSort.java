package Array.Sorting;

import java.util.Arrays;

public class MergeSort {

    // Divide and Conquer Algo
    // Worst Case Time: O (nlogn)
    // Average Case Time: O(nlogn)
    // Best Case Time: O(nlogn)

    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int mergedIndex = 0;
        int i = 0;
        int j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[mergedIndex] = left[i];
                i++;
            } else {
                merged[mergedIndex] = right[j];
                j++;
            }
            mergedIndex++;
        }

        // Handle remaining elements
        while (i < left.length) {
            merged[mergedIndex] = left[i];
            mergedIndex++;
            i++;
        }
        while (j < right.length) {
            merged[mergedIndex] = right[i];
            mergedIndex++;
            j++;
        }

        return merged;
    }

    public static int[] sort(int arr[]) {

        if (arr.length == 1)
            return arr;

        int mid = Math.floorDiv(arr.length, 2);
        int left[] = Arrays.copyOfRange(arr, 0, mid);
        int right[] = Arrays.copyOfRange(arr, mid, arr.length);

        int[] sortedLeft = sort(left);
        int[] sortedRight = sort(right);

        int[] sorted = merge(sortedLeft, sortedRight);

        return sorted;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 6, 5, 4, 3, 2, 1 };
        int[] sorted = sort(arr);

        for (int i : sorted)
            System.out.print(i + ", ");
    }
}
