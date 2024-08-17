# Selection Sort

# Sort shortest value to correct position
# Worst Case Time: O(n^2)
# Average Case Time: O(n^2)
# Best Case Time: O(n^2)


def sort(arr):
    for i in range(len(arr)):
        currentMin = i
        for j in range(i, len(arr)):
            if arr[j] < arr[currentMin]:
                currentMin = j
        temp = arr[i]
        arr[i] = arr[currentMin]
        arr[currentMin] = temp


arr = [45, 67, 32, 89, 23, 10]
sort(arr)
print(arr)
