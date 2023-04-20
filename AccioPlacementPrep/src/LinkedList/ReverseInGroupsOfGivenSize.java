package LinkedList;

public class ReverseInGroupsOfGivenSize {
    public static Node reverse(Node head, int k) {
        //Your code here
        if (k <= 1 || head == null) {
            return head;
        }

        Node curr = head;
        Node prev = null;

        int length = getLength(head);
        int size = length / k;
        int extra = length % k;
        int count = size + (extra > 0 ? 1 : 0);
        while (count > 0) {
            Node newHead = prev;
            Node newEnd = curr;

            for (int i = 0; curr != null && i < k; i++) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            if (newHead != null) {
                newHead.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = curr;

            prev = newEnd;
            count--;
        }
        return head;
    }

    public static int getLength(Node head) {
        Node node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
