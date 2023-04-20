package LinkedList;

import java.util.Scanner;

public class ReverseFromMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNew list = new LinkedListNew();
        Node head = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = list.insert(val);
        }
        head = reverseMiddle(head);
        list.print(head);
    }

    private static Node reverseMiddle(Node head) {
        Node mid = middleNode(head);
        Node prev = head;
        while (prev.next != mid) {
            prev = prev.next;
        }
        Node curr = mid;
        Node newHead = prev, newTail = curr;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        newHead.next = prev;
        newTail.next = curr;
        return head;
    }

    public static Node middleNode(Node head) {
        if (head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
