package LinkedList;

import java.util.Scanner;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNew list = new LinkedListNew();
        Node head = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = list.insert(val);
        }
        head = pairwiseSwap(head);
        list.print(head);
    }

    public static Node pairwiseSwap(Node head) {
        Node dummy = new Node(-1);
        Node prev = dummy;
        prev.next = head;

        while (prev.next != null && prev.next.next != null) {
            Node a = prev.next;
            Node b = prev.next.next;

            prev.next = b;
            a.next = b.next;
            b.next = a;

            prev = a;
        }

        return dummy.next;
    }

    public static Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node tempNode = head;
        while (tempNode != null && tempNode.next != null) {
            int temp = tempNode.val;
            tempNode.val = tempNode.next.val;
            tempNode.next.val = temp;
            tempNode = tempNode.next.next;
        }

        return head;
    }
}
