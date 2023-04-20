package LinkedList;

public class ReverseADoublyLinkedList {
    public static Node reverseDLL(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }

        return prev;
    }

    private static class Node {
        int val;
        Node next; //always null
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }
}
