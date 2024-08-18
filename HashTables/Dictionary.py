dict = {1: 1, 2: 45}

# Add a key and value to dictionary
dict[23] = 12

# Print dictionary
print(dict)

# Check if dictionary contains key
if 1 in dict:
    print(True)

# Get Value
print(dict.get(23))

# Remove a key
dict.pop(2)
print(dict)

# Set new key value
dict[1] = 87
print(dict)

# Size of dictionary
print(len(dict))
