# Binary Search

# Divide and conquer
# Dictionary Search
# Check if mid is equal to key if less search on left if greater search right
# Worst Case Time: O(logn)
# Average Case Time: O(logn)
# Best Case Time: O(1)


def search(arr: list, low, high, key):
    mid = int((low + high) / 2)

    if low <= high:
        if arr[mid] == key:
            return mid
        if key < arr[mid]:
            return search(arr, low, mid - 1, key)
        else:
            return search(arr, mid + 1, high, key)

    return -1


arr = [10, 23, 32, 45, 67, 89]
key = 23

print(search(arr, 0, len(arr) - 1, key))
