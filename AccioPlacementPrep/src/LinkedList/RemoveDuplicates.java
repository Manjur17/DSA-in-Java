package LinkedList;

public class RemoveDuplicates {
    Node removeDuplicates(Node head) {
        if(head == null)
            return null;

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.val == temp.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
