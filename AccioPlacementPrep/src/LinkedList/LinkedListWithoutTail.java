package LinkedList;

public class LinkedListWithoutTail {
    private Node head; // head of list
    private int size;

    public LinkedListWithoutTail() {
        this.size = 0; //LL is created inside memory of size 0
    }

    public static void main(String[] args) throws LinkedListOutOfBound {
        LinkedListWithoutTail list = new LinkedListWithoutTail();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.printList();
        System.out.println(list.delete(1));
        list.printList();
        System.out.println(list.delete(5));
        list.printList();
        list.deleteByKey(1);
        list.printList();
        list.deleteByKey(8);
        list.printList();
    }

    public void insert(int val) {
        Node node = new Node(val); // Create a new node with given data
        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = node;
        } else {
            // Else traverse till the last node and insert the node there
            Node last = head;
            while (last.next != null) { //last node
                last = last.next;
            }
            last.next = node;// Insert the new_node at last node
        }
    }

    public int deleteFirst() throws LinkedListOutOfBound {
        if (size == 0) { //we have nothing to delete
            throw new LinkedListOutOfBound("You are trying to access an Empty list");
        }
        int value = head.val;
        head = head.next;
        size--;
        return value;
    }

    public int delete(int index) throws LinkedListOutOfBound {
        if (index == 0) {
            return deleteFirst();
        }
        Node prev = getNode(index - 1);
        int value = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    public void deleteByKey(int value) throws LinkedListOutOfBound {
        if (head.val == value) {
            deleteFirst(); //we are asked to delete first node
            size--;
            return;
        }
        Node prev = head;
        while (prev.next != null) {
            if (prev.next.val == value) {
                break;
            }
            prev = prev.next;
        }

        if (prev.next != null) {
            prev.next = prev.next.next;
        }
        size--;
    }

    public Node findNode(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
