package LinkedList;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    //Insert element
    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            //Empty LL
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    //Display list
    public void display() {
        Node node = head;
        if (node == null) {
            System.out.println("Empty List");
            return;
        }
        //Not empty List
        do {
            System.out.print(node.val + " -> ");
            if (node.next != null) {
                //check for displaying 1 element in the list
                node = node.next;
            }
        } while (node != head);
        System.out.println("HEAD");
    }

    //Delete an item
    public void delete(int value) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (head == tail) {
            //Deleting 1 item in list
            head = null;
            tail = null;
            return;
        }
        if (node.val == value) {
            //deleting first element -> head.val
            head = head.next;
            tail.next = head;
            return;
        }
        //Case for deleting any element in the list
        do {
            Node temp = node.next;
            if (temp.val == value) {
                node.next = temp.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
