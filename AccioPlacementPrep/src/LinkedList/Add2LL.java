package LinkedList;

import java.util.Scanner;

public class Add2LL {
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
        Node ans = addTwoLists(headA, headB);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node addTwoLists(Node first, Node second) {
        first = reverse(first);
        second = reverse(second);

        Node ans = add(first, second);
        ans = reverse(ans);
        return ans;
    }

    private static Node add(Node first, Node second) {
        int carry = 0;
        Node head = null, tail = null;

        while (first != null || second != null || carry != 0) {
            int val1 = (first != null) ? first.val : 0;
            int val2 = (second != null) ? second.val : 0;

            int sum = val1 + val2 + carry;
            int digit = sum % 10;
            Node node = new Node(digit);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            carry = sum / 10;
            if (first != null)
                first = first.next;
            if (second != null)
                second = second.next;
        }
        return head;
    }
}
