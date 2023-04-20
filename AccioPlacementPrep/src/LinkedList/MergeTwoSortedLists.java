package LinkedList;

import java.util.Scanner;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        LinkedListNew listA = new LinkedListNew();
        Node headA = null;
        for (int i = 0; i < m; i++) {
            int val = sc.nextInt();
            headA = listA.insert(val);
        }

        int n = sc.nextInt();
        LinkedListNew listB = new LinkedListNew();
        Node headB = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            headB = listB.insert(val);
        }
        Node head = mergeTwoLists(headA,headB);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        Node ans = mergeRecursive(headA, headB);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public static Node mergeRecursive(Node head1, Node head2) {
        Node dummyHead = new Node(0);
        helper(head1, head2, dummyHead);
        return dummyHead.next;
    }

    private static void helper(Node head1, Node head2, Node tail) {
        if (head1 == null || head2 == null) {
            tail.next = (head1 != null) ? head1 : head2;
            return;
        }

        if (head1.val <= head2.val) {
            tail.next = head1;
            helper(head1.next, head2, tail.next);
        } else {
            tail.next = head2;
            helper(head1, head2.next, tail.next);
        }
    }

    public static Node mergeTwoLists(Node head1, Node head2) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        tail.next = (head1 != null) ? head1 : head2;
        return dummyHead.next;
    }

    Node sortedMerge(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            return null;
        }
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node temp = null, head = null;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                if (temp == null) {
                    temp = head1;
                    head = temp;
                } else {
                    temp.next = head1;
                    temp = temp.next;
                }
                head1 = head1.next;
            } else {
                if (temp == null) {
                    temp = head2;
                    head = temp;
                } else {
                    temp.next = head2;
                    temp = temp.next;
                }
                head2 = head2.next;
            }
        }

        temp.next = (head1 != null) ? head1 : head2;

        return head;
    }
}
