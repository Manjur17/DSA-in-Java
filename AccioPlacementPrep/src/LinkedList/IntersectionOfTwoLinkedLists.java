package LinkedList;

import java.util.HashMap;
import java.util.Scanner;

public class IntersectionOfTwoLinkedLists {
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

        Node ans = findIntersection(headA, headB);
        while (ans != null) {
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }

    public static Node findIntersection(Node head1, Node head2) {
        // return the head of intersection list
        HashMap<Integer, Integer> map = new HashMap<>();
        Node temp1 = head1, temp2 = head2;
        while (temp2 != null) {
            map.put(temp2.val, map.getOrDefault(temp2.val, 0) + 1);
            temp2 = temp1.next;
        }

        Node head = null, tail = null;
        while (temp1 != null) {
            if (map.containsKey(temp1.val)) {
                int freq = map.get(temp1.val);
                if (freq > 0) {
                    Node node = new Node(temp1.val);
                    if (head == null) {
                        head = node;
                        tail = head;
                    } else {
                        tail.next = node;
                        tail = node;
                    }
                    map.put(temp1.val, --freq);
                }
            }
            temp1 = temp1.next;
        }

        return head;
    }
}
