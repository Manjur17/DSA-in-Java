package LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedLL {

    public Node removeDuplicates(Node head) {
        // Your code here
        //sort the list
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        Node headA = null, tail = null;

        while (temp != null) {
            if (!set.contains(temp.val)) {
                if (headA == null) {
                    headA = temp;
                    tail = headA;
                } else {
                    tail.next = temp;
                    tail = temp;
                }
            }

            set.add(temp.val);
            temp = temp.next;
        }

        if (tail != null)
            tail.next = null;

        return headA;
    }
}
