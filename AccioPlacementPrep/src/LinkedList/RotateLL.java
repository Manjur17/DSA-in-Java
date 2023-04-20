package LinkedList;

public class RotateLL {
    public Node rotateLeft(Node head, int k) {
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        while (k-- > 0) {
            last.next = head;
            last = head;
            head = head.next;
            last.next = null;
        }

        return head;
    }

    public Node rotateRight(Node head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        int length = 1;
        Node last = head;
        while (last.next != null) {
            length++;
            last = last.next;
        }
        last.next = head;

        int rotations = k % length;
        int skip = length - rotations;

        Node newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
