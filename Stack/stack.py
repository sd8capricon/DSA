# Stack DS
# LIFO - Last In First Out
# Append Method to add new element at the top of the stack
# Pop Method to get element at the top of the stack
# Using list as stack

s = []

s.append(1)
s.append(20)
s.append(12)
s.append(80)
s.append(45)

while len(s) > 0:
    print(s.pop())
