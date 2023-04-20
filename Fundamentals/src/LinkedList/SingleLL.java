package LinkedList;

public class SingleLL {
    private static int size = 0;
    private Node head;
    private Node tail;

    //Insert at first Index
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        //no element case
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    //Insert at last Index
    public void insertLast(int value) {
        if (tail == null) {
            //For empty null
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    // insert using recursion
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    //Insert at a particular Index
    public void insert(int value, int index) {
        if (index == 0) {
            //Insert at first index
            insertFirst(value);
            return;
        }
        if (index == size) {
            //Insert at last index
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    //Delete first element
    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if (head == null) {
            //deleting 1 element in list
            tail = null;
        }
        size--;
        return val;
    }

    //Delete last element
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = getNode(size - 2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    //Delete at particular Index
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = getNode(index - 1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }

    //Get a node
    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //Find a particular node whose data is given
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //Display the LL
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
