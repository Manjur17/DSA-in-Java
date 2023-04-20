package LinkedList;

import java.util.Scanner;

public class EliminateDuplicatesFromLL {
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

    public static Node eliminateDuplicates(Node head) {
        if (head == null) {
            return null;
        }
        Node node = head;
        while (node.next != null) {
            if (node.val == (node.next.val)) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
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
        head = eliminateDuplicates(head);
        printLinkedList(head);
    }
}
