package LinkedList;

public class PartitionList {
    public Node partition(Node head, int x) {
        Node left = new Node(), right = new Node();
        Node leftTail = left, rightTail = right;
        Node curr = head;
        while (curr != null) {
            if (curr.val < x) {
                leftTail.next = curr;
                leftTail = leftTail.next;
            } else {
                rightTail.next = curr;
                rightTail = rightTail.next;
            }
            curr = curr.next;
        }
        leftTail.next = right.next;
        rightTail.next = null; //imp else cycle will form

        return left.next;
    }
}
