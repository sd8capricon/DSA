# MergeSort

# Divide and Conquer Algo
# Worst Case Time: O (nlogn)
# Average Case Time: O(nlogn)
# Best Case Time: O(nlogn)


def merge(left: list, right: list):
    merged = []
    i = 0
    j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            merged.append(left[i])
            i += 1
        else:
            merged.append(right[j])
            j += 1

    # Apped remaining left arr items
    while i < len(left):
        merged.append(left[i])
        i += 1

    # Apped remaining right arr items
    while j < len(right):
        merged.append(right[j])
        j += 1

    return merged


def sort(arr: list):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left = arr[:mid]
    right = arr[mid:]

    sortedLeft = sort(left)
    sortedRight = sort(right)

    return merge(sortedLeft, sortedRight)


arr = [7, 6, 5, 4, 3, 2, 1]
sorted = sort(arr)
print(sorted)
