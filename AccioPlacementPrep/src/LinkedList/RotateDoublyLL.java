package LinkedList;

public class RotateDoublyLL {
    private static class Node {
        int val;
        Node next; //always null
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node rotateDLL(Node head, int k) {
        //Write your code here
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        while (k > 0) {
            Node temp = head;
            head = head.next;
            last.next = temp;
            temp.prev = last;
            last = temp;
            last.next.prev = null; //last == temp
            last.next = null; //temp.next == null
            k--;
        }
        return head;
    }
}
