public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(1);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(1);
        list.head.next.next.next.next.next = new Node(6);

        int key = 1;
        int count = list.countOccurrences(key);
        System.out.println("Method 1 - Iterative: The number of occurrences of " + key + " is " + count);

        int countRecursive = list.countOccurrences(list.head, key);
        System.out.println("Method 2 - Recursive: The number of occurrences of " + key + " is " + countRecursive);
    }
}