# BubbleSort

# Worst Case Time: O(n^2)
# Average Case Time: O(n^2)
# Best Case Time: O(n) - Array already sorted
# Greedy, compare adjacent elements
# Bubbles the highest element to the top first


def sort(arr: list):
    for i in range(len(arr)):
        for j in range(len(arr) - 1):
            if arr[j + 1] < arr[j]:
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp


arr = [9, 8, 7, 6, 5]
sort(arr)
print(arr)
