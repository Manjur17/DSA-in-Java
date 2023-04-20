package LinkedList;

public class InsertRecursive {
    LinkedListNew list = new LinkedListNew();

    public void insert(int value, int index) {
        if (index == 0) {
            Node node = new Node(value);
            node.next = list.head;
            list.head = node;
            return;
        }
        list.head = insert(value, --index, list.head);
    }

    public Node insert(int value, int index, Node head) {
        if (index == 0) {
            Node node = new Node(value);
            node.next = head;
            return node;
        }
        head.next = insert(value, --index, head.next);
        return head;
    }

    public void print() {
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        InsertRecursive list = new InsertRecursive();
        list.insert(7, 0);
        list.insert(6, 0);
        list.insert(9, 1);
        list.insert(12,2);
        list.print();
    }
}
