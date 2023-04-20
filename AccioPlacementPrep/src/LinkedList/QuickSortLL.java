package LinkedList;

import java.util.Scanner;

public class QuickSortLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNew list = new LinkedListNew();
        Node head = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = list.insert(val);
        }
        head = quickSort(head);
        list.print(head);
    }

    public static Node quickSort(Node head) {
        if(head == null) return null;

        Node tail = head;
        while (tail.next != null)
            tail = tail.next;

        sort(head, tail);
        return head;
    }

    private static void sort(Node head, Node tail) {
        if (head == null || tail == null || head == tail)
            return;
        Node pivot = partition(head, tail);
        sort(head, pivot);
        sort(pivot.next, tail);
    }

    private static Node partition(Node head, Node tail) {
        Node pivot = head;
        Node prev = head;
        Node curr = head.next;

        while (curr != tail.next) {
            if (curr.val < pivot.val) {
                int temp = prev.next.val;
                prev.next.val = curr.val;
                curr.val = temp;
                prev = prev.next;
            }
            curr = curr.next;
        }
        int temp = prev.val;
        prev.val = pivot.val;
        pivot.val = temp;

        //-----Just For Demonstration-----------
        Node node = head;
        while (node != tail.next){
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
        //-----Not Needed in quick sort--------------

        return prev;
    }
}
