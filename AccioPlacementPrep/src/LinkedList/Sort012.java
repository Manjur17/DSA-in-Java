package LinkedList;

public class Sort012 {
    static Node segregate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // maintain three dummy nodes
        Node first = new Node(-1), second = new Node(-1), third = new Node(-1);
        // maintain three references
        Node zero = first, one = second, two = third;

        // traverse the list
        Node temp = head;
        while (temp != null) {
            if (temp.val == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.val == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }

        // combine lists containing 0's, 1's, and 2's
        zero.next = (second.next != null) ? (second.next) : (third.next);
        one.next = third.next;
        two.next = null;

        // change head
        return first.next;
    }

    static Node segregate2(Node head) {
        Node temp = head;
        Node zeroHead = null, zeroTail = null, oneHead = null, oneTail = null, twoHead = null, twoTail = null;
        while (temp != null) {
            if (temp.val == 0) {
                if (zeroHead == null) {
                    zeroHead = temp;
                    zeroTail = zeroHead;
                } else {
                    zeroTail.next = temp;
                    zeroTail = temp;
                }
            } else if (temp.val == 1) {
                if (oneHead == null) {
                    oneHead = temp;
                    oneTail = oneHead;
                } else {
                    oneTail.next = temp;
                    oneTail = temp;
                }
            } else {
                if (twoHead == null) {
                    twoHead = temp;
                    twoTail = twoHead;
                } else {
                    twoTail.next = temp;
                    twoTail = temp;
                }
            }
            temp = temp.next;
        }

        zeroTail.next = (oneHead != null) ? oneHead : twoHead;
        if (oneTail != null) {
            oneTail.next = twoHead;
        }
        if (twoTail != null) {
            twoTail.next = null;
        }

        return zeroHead;
    }
}
