package LinkedList;

public class DetectCycle {
    public static boolean detectLoop(Node head) {
        // Add code here
        Node fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
    }
}
