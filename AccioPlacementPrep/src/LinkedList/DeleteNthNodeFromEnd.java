package LinkedList;

public class DeleteNthNodeFromEnd {
    public Node removeNthFromEnd(Node head, int n) {
        //First move fast by n distance
        //Now the distance between fast and slow is = n
        //now move fast and slow at same pace
        //till fast reaches last index
        //slow is at the prev node of the nth node to be deleted
        //so make slow.next = slow.next.next;

        if (head == null) return null;

        Node second = head, first = head;
        int i = 0;
        while (first != null && i < n) {
            first = first.next;
            i++;
        }
        if (first == null) {
            return head.next; //case of size == n
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }

    public Node removeNthFromEndBrute(Node head, int n) {
        if (head == null) return null;

        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size == n) {
            return head.next;
        }
        int move = size - n;
        temp = head;
        for (int i = 0; i < move - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
