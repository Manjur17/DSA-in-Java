package LinkedList;

public class MiddleOfLinkedList {
    int getMiddle(Node head) {
        if (head == null) return 0;
        Node fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.val;
    }
}
