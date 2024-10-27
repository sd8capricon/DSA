class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self, value):
        self.head = Node(value)

    def traverse(self):
        current = self.head

        while current != None:
            print(current.value)
            current = current.next

    def append(self, value):
        current = self.head

        while current.next != None:
            current = current.next

        current.next = Node(value)


list = LinkedList(1)
list.append(2)
list.append(3)

list.traverse()
