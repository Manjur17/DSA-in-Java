package LinkedList;

public class LengthOfCycle {
    static int countNodesinLoop(Node head) {
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
}
