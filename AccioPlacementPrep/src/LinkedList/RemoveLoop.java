package LinkedList;

public class RemoveLoop {
    public static void removeLoop(Node head) {
        // code here
        // remove the loop without losing any nodes
        if (head == null || head.next == null) return;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) break;
        }

        if (fast != slow) {
            return; //No cycle
        }

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        while(fast.next != slow)
            fast = fast.next;

        fast.next = null;

    }
}
