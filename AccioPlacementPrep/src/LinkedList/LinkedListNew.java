package LinkedList;

class LinkedListNew {
    Node head;
    int size = 0;

    public Node insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return head;
        }
        node.next = head;
        head = node;
        return head;
    }

    public Node insert(Node head, int val, int index) {
        if (index == 0) {
            return insertFirst(val);
        }
        Node temp = head;
        for (int i = 0; i < index - 2; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        return head;
    }

    public Node insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            size++;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
        return head;
    }

    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void delete(int index) {
        if (head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}