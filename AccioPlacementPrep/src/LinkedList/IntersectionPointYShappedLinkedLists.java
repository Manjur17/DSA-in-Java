package LinkedList;

public class IntersectionPointYShappedLinkedLists {
    public Node getIntersectionNode(Node head1, Node head2) {
        Node ptr1 = head1, ptr2 = head2;

        while (ptr1 != ptr2) { // loop until we found the first common node
            ptr1 = (ptr1 == null) ? head2 : ptr1.next; // once we're done with A, move to B
            ptr2 = (ptr2 == null) ? head1 : ptr2.next; // once we're done with B, move to A
        }

        return ptr1;
    }

    int intersectPoint(Node head1, Node head2) {
        // code here
        Node temp1 = head1, temp2 = head2;
        int size1 = getSize(head1);
        int size2 = getSize(head2);
        int diff = Math.abs(size1 - size2);
        if (size1 > size2) {
            //temp1 will move
            for (int i = 0; i < diff; i++) {
                temp1 = temp1.next;
            }
        } else {//temp2 will move
            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1.val; //temp2.val
    }

    private int getSize(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
