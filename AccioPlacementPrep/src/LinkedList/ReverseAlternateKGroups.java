package LinkedList;

public class ReverseAlternateKGroups {
    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public Node reverseAlternateKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node newHead = prev;
            Node newEnd = curr;

            // reverse between left and right
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

            // skip the k nodes
            for (int i = 0; curr != null && i < k; i++) {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

}
