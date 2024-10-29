class Node<T> {
    public T value;
    public Node<T> next;

    public Node(T value) {
        this.value = value;
    }
}

public class LinkedList<T> {
    public Node<T> head;

    public LinkedList(T value) {
        this.head = new Node<T>(value);
    }

    public void traverse() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void append(T value) {
        Node<T> current = head;
        while (current.next != null)
            current = current.next;
        current.next = new Node<T>(value);
    }

    public Node<T> pop() {
        Node<T> current = head;
        while (current.next.next != null)
            current = current.next;
        Node<T> popped = current.next;
        current.next = null;
        return popped;
    }

    public void reverse() {
        Node<T> prev = null;

        while (this.head != null) {
            Node<T> next_node = this.head.next;
            this.head.next = prev;
            prev = this.head;
            this.head = next_node;
        }

        this.head = prev;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(10);
        list.append(23);
        list.append(56);
        list.append(87);
        list.pop();

        System.out.println("LinkedList");
        list.traverse();
        list.reverse();

        System.out.println("Reversed LinkedList");
        list.traverse();
    }
}