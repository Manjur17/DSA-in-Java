package LinkedList;

import java.util.Scanner;

public class SwapKthNodesFromEnds {
    public Node swapNodes(Node head, int k) {
        if (head == null) return null;

        Node second = head, first = head;

        int i = 0;
        while (first != null && i < k - 1) {
            first = first.next;
            i++;
        }

        Node temp = first.next;
        while (temp != null) {
            second = second.next;
            temp = temp.next;
        }

        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;
    }

    public static Node NthFromEnd(Node head, int n) {
        if (head == null) return null;

        Node second = head, first = head;
        int i = 0;
        while (first != null && i < n) {
            first = first.next;
            i++;
        }
        if (first == null) {
            return head; //case of size == n
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second;
    }

    public static void main(String[] args) throws java.lang.Exception {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Node head = null;
        LinkedListNew list = new LinkedListNew();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = list.insert(val);
        }
        Node tempLast = NthFromEnd(head, k);
        Node tempFirst = head;
        for (int i = 0; i < k - 1; i++) {
            tempFirst = tempFirst.next;
        }
        int temp = tempFirst.val;
        tempFirst.val = tempLast.val;
        tempLast.val = temp;
        list.print(head);
    }
}
