package LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0; //LL is created inside memory of size 0
    }

    public void insertFirst(int val) {
        Node node = new Node(val); // create the node
        if (head == null) { // if we are inserting inside empty LL
            head = node;
            tail = head;
            return;
        }
        node.next = head; //make new node point to first node
        head = node; //make head point to first node
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);  // if we have an empty LL
            return;
        }
        Node node = new Node(val); // create the node
        tail.next = node; //make new node point to first node
        tail = node; //make head point to first node
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
        //make before break
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public int deleteFirst() throws LinkedListOutOfBound {
        if (size == 0) { //we have nothing to delete
            throw new LinkedListOutOfBound("You are trying to access an Empty list");
        }
        int value = head.val;
        head = head.next;
        if (head == null) {
            tail = null; //if we have only 1 element
        }
        size--;
        return value;
    }

    public int deleteLast() throws LinkedListOutOfBound {
        if (size <= 1) {
            return deleteFirst();
        }
        int value = tail.val; //this will be deleted
        Node temp = getNode(size - 2); //index = n - 2 getting the 2nd last node
        tail = temp;
        tail.next = null;
        return value;
    }

    public int delete(int index) throws LinkedListOutOfBound {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size) {
            return deleteLast();
        }
        //int value = getNode(index).val;
        Node prev = getNode(index - 1);
        int value = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return value;
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
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void printRecursive(Node head){
        if (head == null){
            System.out.println("Null");
            return;
        }
        System.out.print(head.val + " -> ");
        printRecursive(head.next);
    }

    public int size() {
        return size;
    }
}
