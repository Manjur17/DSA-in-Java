package LinkedList;

public class MergeSortLL {
    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = middleNode(head); // mid will iterate 1 loop less -> fast.next != null && fast.next.next != null
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeLL(left, right);
    }

    //Mid of LL
    public static Node middleNode(Node head) {
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

    //merge function
    public static Node mergeLL(Node head1, Node head2) {
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                tail.next = head1;
                head1 = head1.next;
                tail = tail.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
                tail = tail.next;
            }
        }
        tail.next = (head1 != null) ? head1 : head2;
        return dummyHead.next;
    }
}
