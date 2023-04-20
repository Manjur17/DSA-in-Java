package LinkedList;

public class DoubleLL {
    private Node head;

    //Insert at first Index
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            //For an empty LL
            head.prev = node;
        }
        head = node;
    }

    //Insert at last Index
    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if (head == null) {
            insertFirst(value);
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    //Insert at a particular node
    public void insert(int after,int value){
        Node currentNode = find(after);
        Node node = new Node(value);
        node.next = currentNode.next;
        currentNode.next = node;
        node.prev = currentNode;
        if (node.next != null) {
            //inserting at last index
            node.next.prev = node;
        }
    }
    //Find a particular node whose data is given
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    //Display the LL
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
