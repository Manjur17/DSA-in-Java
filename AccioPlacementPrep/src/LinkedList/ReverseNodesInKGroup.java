package LinkedList;

public class ReverseNodesInKGroup {
    public Node reverseKGroup(Node head, int k) {
        if (k == 1 || head == null) {
            return head;
        }

        Node curr = head;
        Node prev = null;

        int length = getLength(head);
        int count = length / k;
        while (count > 0) {
            Node newHead = prev;
            Node newEnd = curr;

            for (int i = 0; i < k; i++) {
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

            prev = newEnd; //take care and update prev for next iteration
            count--;
        }
        return head;
    }

    public int getLength(Node head) {
        Node node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    public Node reverse(Node head, int k, int n) {
        if (n <= 0) return head;

        Node prev = null;
        Node curr = head;
        int count = 0;

        while (curr != null && count < k) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverse(curr, k, --n);

        return prev;
    }

    public Node reverseKGroupII(Node head, int k) {
        if (k == 1 || head == null) {
            return head;
        }

        int length = getLength(head);
        int count = length / k;

        head = reverse(head, k, count);
        return head;
    }

}
