class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Method 1: Iterative
    int countOccurrences(int key) {
        int count = 0;
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    // Method 2: Recursive
    int countOccurrences(Node node, int key) {
        if (node == null) {
            return 0;
        }
        if (node.data == key) {
            return 1 + countOccurrences(node.next, key);
        }
        return countOccurrences(node.next, key);
    }
}