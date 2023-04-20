package LinkedList;

public class RemoveDuplicatesFromSortedListII {
    public Node deleteDuplicates(Node head) {
        if (head == null || head.next == null) return head;

        Node curr = head;
        Node prev = null;

        while (curr != null && curr.next != null) {
            if (curr.val != curr.next.val) {
                prev = curr;
                curr = curr.next;
            } else {
                Node next = curr.next;
                while (next != null && curr.val == next.val) {
                    next = next.next;
                }

                curr = next;

                if (prev != null) {
                    prev.next = curr;
                } else {
                    head = curr;
                }

            }
        }

        return head;

    }

    public Node deleteDuplicatesII(Node head) {
        if (head == null) return null;

        Node dummyHead = new Node(-1);
        Node tail = dummyHead;
        Node curr = head;

        while (curr != null && curr.next != null) {
            Node next = curr.next;
            if (curr.val != next.val) {
                tail.next = curr;
                tail = tail.next;
            } else {
                while (next != null && curr.val == next.val) {
                    next = next.next;
                }
            }

            curr = next;
        }

        tail.next = curr; //curr can be null or last unique element

        return dummyHead.next;
    }
}
