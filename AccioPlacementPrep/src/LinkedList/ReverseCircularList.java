package LinkedList;

public class ReverseCircularList {

    public Node reverse(Node head) {
        if (head == null) return null;

        Node prev = head;
        Node current = head.next;

        while (current != head) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current.next = prev;

        return prev;
    }
}
