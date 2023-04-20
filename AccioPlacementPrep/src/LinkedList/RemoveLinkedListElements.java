package LinkedList;

import java.util.Scanner;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        LinkedListNew list = new LinkedListNew();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = list.insert(val);
        }
        int nVal = sc.nextInt();
        head = removeElements(head, nVal);
        list.print(head);
    }

    public static Node removeElements(Node head, int val) {
        if (head == null) return null;

        Node dummyHead = new Node();
        Node temp = dummyHead;
        while (head != null) {
            if (head.val != val) {
                temp.next = head;
                temp = temp.next;
            }
            head = head.next;
        }

        if(temp.next != null) temp.next = null;

        return dummyHead.next;
    }
}
