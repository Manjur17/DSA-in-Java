package LinkedList;

import java.util.Scanner;

public class BubbleSortLL {
    private static Node head;
    private static Node tail;

    public static Node takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements:");
        int data = s.nextInt();
//        Node head = null, tail = null;
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

    public static void bubbleSort(Node head) {
        if(head == null){
            return;
        }
        int size = sizeLL(head);
        bubbleSort(size - 1, 0);
    }

    private static void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.val > second.val) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }
    //Get a node
    public static Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        head = takeInput();
        bubbleSort(head);
        System.out.println("After Sorting");
        printLinkedList(head);
    }

}
