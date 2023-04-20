package LinkedList;

import java.util.*;

public class UnionOfTwoLinkedLists {
    public static Node findUnionEfficient(Node head1, Node head2) {
        //Add your code here.
        HashSet<Integer> set = new HashSet<>();

        while (head1 != null) {
            set.add(head1.val);
            head1 = head1.next;
        }

        while (head2 != null) {
            set.add(head2.val);
            head2 = head2.next;
        }

        Node head = null, tail = null;
        for (Integer x : set) {
            Node node = new Node(x);
            if (head == null) {
                head = node;
                tail = head;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        return head;
    }
}
