# Insertion Sort

# Worst Case Time Complexity: O(n^2)
# Average Case Time Complexity: O(n^2)
# Best Case Time Complexity: O(n)


def sort(arr: list):
    for i in range(1, len(arr)):
        for j in range(i, 0, -1):
            if arr[j - 1] > arr[j]:
                temp = arr[j]
                arr[j] = arr[j - 1]
                arr[j - 1] = temp
    return arr


arr = [7, 6, 5, 4, 3, 2, 1]
sorted = sort(arr)
print(sorted)
