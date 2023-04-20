package LinkedList;

class DeleteMiddleOfLinkedList {
    public Node deleteMiddle(Node head) {
        if (head.next == null) {
            return null;
        }
        if (head.next.next == null) {
            head.next = null;
            return head;
        }
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.val = slow.next.val;
        slow.next = slow.next.next;
        return head;
    }
}