package LinkedList;

public class SegregateEvenAndOddNodes {
    Node divide(int N, Node head) {
        Node evenS = null, evenE = null, oddS = null, oddE = null;
        Node temp = head;

        while (temp != null) {
            int val = temp.val;
            if (val % 2 == 0) {
                if (evenS == null) {
                    evenS = temp;
                    evenE = evenS;
                } else {
                    evenE.next = temp;
                    evenE = temp;
                }
            } else {
                if (oddS == null) {
                    oddS = temp;
                    oddE = oddS;
                } else {
                    oddE.next = temp;
                    oddE = temp;
                }
            }
            temp = temp.next;
        }

        if (oddS == null || evenS == null) {
            return head; //no change in the original list
        }

        evenE.next = oddS;
        oddE.next = null;

        return evenS;
    }
}
