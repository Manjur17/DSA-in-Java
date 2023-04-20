package LinkedList;

import java.util.Scanner;

public class ReverseASubList {
    public static Node takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements:");
        int data = s.nextInt();
        Node head = null, tail = null;
        while (data != -1) {
            Node currentNode = new Node(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static Node reverseBetween(Node head, int left, int right) {
        if (left == right) {
            return head;
        }
        // skip the first left-1 nodes
        Node current = head;
        Node prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;

        // reverse between left and right

        Node next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = takeInput();
        Node ansHead = reverseBetween(head, 0, 1);
        System.out.println("After Sorting");
        printLinkedList(head);
    }
}
