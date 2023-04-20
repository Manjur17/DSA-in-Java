package LinkedList;

public class SubtractionInLinkedListInPlace {

    static int getLength(Node node) {
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    static Node trimLeftZeros(Node root) {
        while (root != null && root.val == 0)
            root = root.next;

        return root;
    }

    static Node subLinkedList(Node head1, Node head2)
    {
        head1 = trimLeftZeros(head1);
        head2 = trimLeftZeros(head2);
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }


        int size1 = getLength(head1);
        int size2 = getLength(head2);
        if (size2 > size1) {
            Node temp = head1;
            head1 = head2;
            head2 = temp;
        } else if (size1 == size2) {
            boolean isFirstNodeBigger = findGreater(head1, head2);
            if (!isFirstNodeBigger) {
                Node temp = head1;
                head1 = head2;
                head2 = temp;
            }
        }

        Node head = subtract(head1, head2, false);

        while(head != null && head.val == 0){
            if(head.next == null) break; //means both number are same so their subtraction is 0

            head = head.next;
        }

        return head;
    }

    private static boolean findGreater(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.val > head2.val) {
                return true;
            } else if (head2.val > head1.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }

    public static Node subtract(Node head1, Node head2, boolean borrow) {
        Node first = reverse(head1);
        Node second = reverse(head2);
        Node head = first;

        while (first != null || second != null) {
            int val1 = (first != null) ? first.val : 0;
            int val2 = (second != null) ? second.val : 0;

            if (borrow) {
                val1--;
                borrow = false;
            }
            if (val1 < val2) {
                val1 += 10;
                borrow = true;
            }

            int sub = val1 - val2;

            first.val = sub;

            if (first != null)
                first = first.next;
            if (second != null)
                second = second.next;
        }

        head = reverse(head);
        return head;
    }

    public static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
