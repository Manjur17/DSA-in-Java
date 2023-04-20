package LinkedList;

public class DoubleLinkedList {
    private Node head;
    private int size;

    public DoubleLinkedList() {
        this.size = 0; //LL is created inside memory of size 0
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {//first element
            head = node;
            size++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    }

    public void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node(value);
        temp.next = node;
        node.prev = temp;
        size++;
    }

    public void insert(int index, int val) throws IndexOutOfBoundsException {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of range for size " + size);
        }
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = getNode(index - 1); //get the previous node
        Node node = new Node(val); // create the new node
        node.next = temp.next;
        temp.next.prev = node;
        node.prev = temp;
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        if (head == null) {
            throw new NullPointerException();
        }
        int value = head.val;
        //if size == 1
        if (head.next == null) {
            head = null;
            size--;
            return value;
        }
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    public int deleteLast() {
        if (head == null) {
            throw new NullPointerException();
        }
        //if size == 1
        if (head.next == null) {
            return deleteFirst();
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        int value = temp.val;
        temp.prev.next = null;
        size--;
        return value;
    }

    public int delete(int index) throws LinkedListOutOfBound {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        //int value = getNode(index).val;
        Node temp = getNode(index);
        int value = temp.val;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
        return value;
    }

    public Node getNode(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of range for size " + size);
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void print() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("Null");

        /*
        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
        */
    }

    public int size() {
        return size;
    }

    private static class Node {
        int val;
        Node next; //always null
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }


}
