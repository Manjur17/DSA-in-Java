package LinkedList;

public class NthNodeFromEnd {
    public Node NthFromEnd(Node head, int n) {
        if (head == null) return null;

        Node second = head, first = head;
        int i = 0;
        while (i < n && first != null) {
            first = first.next;
            i++;
        }

        if (i != n) return null; //case of n > size of list

        if (first == null) {
            return head; //case of size == n
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second;
    }
}
