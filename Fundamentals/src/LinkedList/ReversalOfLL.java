package LinkedList;

import java.util.Scanner;

public class ReversalOfLL {
    private static Node head;
    private static Node tail;
    public static Node takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements:");
        int data = s.nextInt();
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
    // recursion reverse
    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in place reversal of linked list
    // google, microsoft, apple, amazon: https://leetcode.com/problems/reverse-linked-list/
    public static void reverse() {
        int size = sizeLL(head);
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    public static int sizeLL(Node head){
        Node temp = head;
        int count =0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
