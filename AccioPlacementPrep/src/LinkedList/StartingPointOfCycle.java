package LinkedList;

public class StartingPointOfCycle {
    public Node detectCycleII(Node head) {
        if (head == null || head.next == null) return null;

        Node slow = head, fast = head;

        // Move slow and fast 1 and 2 steps ahead respectively.
        slow = slow.next;
        fast = fast.next.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) break;
        }

        if (fast != slow) {
            return null; //No cycle
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    static int lengthCycle(Node head) {
        if (head == null || head.next == null) return 0; //for length 1
        Node fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) break;
        }

        if (fast != slow) {
            return 0; //no cycle
        }
        //count cycle length
        Node temp = slow;
        int length = 0;
        do {
            temp = temp.next;  //temp will never be null as we have handled 0 length cycle explicitly
            length++;

        } while (temp != slow);

        return length;
    }

    public Node detectCycle(Node head) {
        if (head == null || head.next == null) return null; //for length 1

        int length = lengthCycle(head);

        if (length == 0) {
            return null; //no cycle is present
        }

        Node f = head;
        Node s = head;
        while (length > 0) { //move s node  length times
            s = s.next;
            length--;
        }
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return f; //or s
    }
}
