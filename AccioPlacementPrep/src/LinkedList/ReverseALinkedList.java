package LinkedList;

public class ReverseALinkedList {
    public Node reverseListRecursiveII(Node head) {
        if (head == null) {
            return null;
        }
        return helper(head, null);
    }

    Node helper(Node current, Node prev) {
        if (current == null) return prev; //original head after reversing

        Node next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        return helper(current, prev);
    }

    public Node reverseListRecursiveI(Node head) {
        if (head == null || head.next == null)
            return head;

        Node newHead = reverseListRecursiveII(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public Node reverseListIterative(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
