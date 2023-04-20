package LinkedList;

public class ReverseAlternateNodes {
    //https://www.geeksforgeeks.org/given-linked-list-reverse-alternate-nodes-append-end/
    public static void rearrange(Node head) {
        if (head.next == null || head.next.next == null) return;

        Node evenS = null, evenE = null, oddS = null, oddE = null;
        Node temp = head;
        boolean flag = false;

        while (temp != null) {
            if (flag) {
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
            flag = !flag;
            temp = temp.next;
        }

        evenE.next = null;
        evenS = reverse(evenS);

        oddE.next = evenS;
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
