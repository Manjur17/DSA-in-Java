package LinkedList;

public class InsertInASortedList {
    Node sortedInsert(Node head, int key) {
        Node node = new Node(key);
        if (key <= head.val) {
            node.next = head;
            head = node;
            return head;
        }
        Node temp = head;
        while (temp.next != null && temp.next.val < key) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        return head;
    }
}
