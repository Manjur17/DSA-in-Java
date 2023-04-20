package LinkedList;

public class ReverseSublist {
    public Node reverseBetween(Node head, int left, int right) {
        if (left == right) {
            return head;
        }

        Node curr = head;
        Node prev = null;
        for (int i = 1; i < left; i++) {
            //move curr to the left node
            prev = curr;
            curr = curr.next;
        }
        //useful in later connection otherwise cycle will be formed
        Node newHead = prev;
        Node newEnd = curr;
        // reverse between left and right
        for (int i = 1; i <= (right - left + 1); i++) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //newHead can be null -> if left = 1
        if (newHead != null) {
            newHead.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = curr;
        return head;
    }
}
