public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    // Insert at the first position
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at the last position
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert at a specific index
    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // Get node at a specific index
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Delete the first element
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1; // Or throw an exception
        }
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    // Delete the last element
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    // Delete at a specific index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1; // Or throw an exception
        }

        Node previous = get(index - 1);
        int value = previous.next.value;
        previous.next = previous.next.next;
        size--;
        return value;
    }

    // Find a node by value
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null; // Not found
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.display(); // Expected: 17 -> 8 -> 2 -> 3 -> END

        list.insertLast(99);
        list.display(); // Expected: 17 -> 8 -> 2 -> 3 -> 99 -> END

        list.insert(100, 2);
        list.display(); // Expected: 17 -> 8 -> 100 -> 2 -> 3 -> 99 -> END

        System.out.println("Deleted first: " + list.deleteFirst()); // Expected: 17
        list.display(); // Expected: 8 -> 100 -> 2 -> 3 -> 99 -> END

        System.out.println("Deleted last: " + list.deleteLast()); // Expected: 99
        list.display(); // Expected: 8 -> 100 -> 2 -> 3 -> END

        System.out.println("Deleted at index 1: " + list.delete(1)); // Expected: 100
        list.display(); // Expected: 8 -> 2 -> 3 -> END

        Node foundNode = list.find(2);
        if (foundNode != null) {
            System.out.println("Found node with value: " + foundNode.value);
        } else {
            System.out.println("Node not found.");
        }
    }
}