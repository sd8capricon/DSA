# QuickSort

# Divide and conquer
# Place the pivot in its right position
# Elements greater than pivot on right and elements less than pivot on left
# Worst Case: O(n^2)
# Average Case: O(nlogn)
# Best Case: o(nlogn)


def partition(arr: list, low: int, high: int):
    pivot = arr[high]
    i = low - 1

    for j in range(low, high):
        if arr[j] < pivot:
            i += 1
            temp = arr[j]
            arr[j] = arr[i]
            arr[i] = temp

    i += 1
    temp = arr[high]
    arr[high] = arr[i]
    arr[i] = temp

    return i


def sort(arr, low, high):
    if low < high:
        pivot = partition(arr, low, high)
        sort(arr, low, pivot - 1)
        sort(arr, pivot + 1, high)


arr = [4, 20, 1, 45, 9]
sort(arr, 0, len(arr) - 1)
print(arr)
