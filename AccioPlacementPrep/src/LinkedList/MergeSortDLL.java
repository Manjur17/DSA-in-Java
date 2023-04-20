package LinkedList;

public class MergeSortDLL {
    private static class Node {
        int val;
        Node next; //always null
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    static Node getMid(Node head) {
        if (head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2) {
        Node dummyHead = new Node(-1);
        Node curr = dummyHead;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                curr.next = head1;
                head1.prev = curr;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2.prev = curr;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if (head1 != null) {
            curr.next = head1;
            head1.prev = curr;
        } else {
            curr.next = head2;
            head2.prev = curr;
        }
        /*  In Increasing order
            dummyHead =  dummyHead.next;
            dummyHead.prev = null;
            return dummyHead;
         */
        return dummyHead.next;
    }

    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;
        right.prev = null;

        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    static Node sortDoubly(Node head) {
        return mergeSort(head);
    }
}
