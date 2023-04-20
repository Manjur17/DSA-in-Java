package LinkedList;

import java.util.Scanner;

public class RecursiveInsertion{
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

    public static Node insertRecursive(int val, int index, Node node) {
        if (index == 0) {
            return new Node(val, node);
        }
        node.next = insertRecursive(val, index - 1, node.next);
        return node;
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
        head = insertRecursive(7, 3, head);
        System.out.println("After Insertion");
        printLinkedList(head);
    }
}
