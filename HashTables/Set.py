# Unordered datatype
# No duplicates

s = {1, 45, 23, 45}
# or
s_2 = set([1, 36, 45, 36])

# Print Set
print(s)
print(s_2)

# Check if value exists in set
if 23 in s:
    print(True)

# Remove an element from set
s.remove(1)
print(s)

# Size of set
print(len(s))
