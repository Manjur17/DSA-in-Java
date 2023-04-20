package LinkedList;

import java.util.Scanner;

public class TakingInputAndPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNew list = new LinkedListNew();
        Node head = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = list.insert(val);
        }
        list.print(head);
    }

    public static Node takeInput() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        Node head = null, tail = null;
        while (val != -1) {
            Node node = new Node(val);
            if (head == null) {
                head = node;
                tail = head;
            } else {
                tail.next = node;
                tail = node;
            }
            val = sc.nextInt();

        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("Null");
    }

}
