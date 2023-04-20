package LinkedList;

import java.util.Scanner;

public class ReOrderList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        LinkedListNew list = new LinkedListNew();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = list.insert(val);
        }
        head = reorderlist(head);
        list.print(head);
    }

    public static Node middleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static Node reorderlist(Node head) {
        // Your code here
        if (head.next == null || head.next.next == null) {
            return head;
        }
        Node mid = middleNode(head);
        Node right = mid.next;
        mid.next = null;
        Node first = head;
        Node second = reverseList(right);
        System.out.println(second.val);
        // rearrange
        while (second != null) {
            Node next1 = first.next;
            Node next2 = second.next;
            first.next = second;
            second.next = next1;
            first = next1;
            second = next2;
        }

        return head;
    }
}
