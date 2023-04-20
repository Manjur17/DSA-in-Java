package LinkedList;

public class CircularLinkedList {
    private Node head;
    //private Node tail; -> use only if given in question
    private int size;

    public CircularLinkedList() {
        this.size = 0; //LL is created inside memory of size 0
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            head.next = node;
            size++;
            return;
        }
        //insert at second index
        node.next = head.next;
        head.next = node;
        int temp = head.val;
        head.val = node.val;
        node.val = temp;
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            insertFirst(value);
            return;
        }
        //insert at second index
        node.next = head.next;
        head.next = node;
        int temp = head.val;
        head.val = node.val;
        node.val = temp;
        head = node;
        size++;
    }

    public int deleteFirst() {
        if (head == null) return 0; // if empty list
        //Case - I: Deleting 1 item -> size == 1
        if (head.next == head) {
            int val = head.val;
            head = null;
            size--;
            return val;
        }
        //Case - I.I: if value == head.val but size > 1
        int val = head.val;
        head.val = head.next.val;
        head.next = head.next.next;
        size--;
        return val;
    }

    public int delete(int index) {
        if (head == null) return 0;
        if (index == 0) {
            return deleteFirst();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        return val;
    }

    public void deleteByKey(int value) {
        if (head == null) return;
        if (head.val == value) {
            deleteFirst();
            return;
        }
        Node temp = head;
        do {
            if (temp.next.val == value) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        } while (temp.next != head);
        size--;
    }

    public void print() {
        if (head == null) {
            System.out.println("Head -> Null");
            return;
        }
        //As there is no tail.next -> null so print it at least once
        Node temp = head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;

        } while (temp != head);
        System.out.println("Head");
    }

    public int size() {
        return size;
    }


}
