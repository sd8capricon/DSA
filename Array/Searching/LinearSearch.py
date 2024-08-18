# LinearSearch

# Sequential Search
# Worst Case Time: O(n)
# Average Case Time: O(n)
# Best Case Time: O(1)


def search(arr: list, key):
    for i in range(len(arr)):
        if arr[i] == key:
            return i
    return -1


arr = [10, 23, 32, 45, 67, 89]
print(search(arr, 23))
