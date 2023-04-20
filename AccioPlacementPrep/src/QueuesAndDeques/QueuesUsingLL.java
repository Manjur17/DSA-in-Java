package QueuesAndDeques;

class Node {
    int val;
    Node next;

    public Node(int value) {
        this.val = value;
    }
}

public class QueuesUsingLL {

    Node front;
    Node rear;
    int size;

    public QueuesUsingLL() {
        this.size = 0;
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int item) {
        Node node = new Node(item);
        if (front == null) {
            front = node;
            rear = node;
            size++;
            return;
        }
        rear.next = node;
        rear = node;
        size++;
    }

    public int dequeue() throws Exception {
        if (front == null) {
            throw new Exception("Queue is Empty!!!");
        }
        int removed = front.val;
        front = front.next;
        if (front == null) { //corner case -> if 1 item is there to be deleted
            rear = null;
        }
        size--;
        return removed;
    }

    public int peek() throws Exception {
        if (front == null) {
            throw new Exception("Queue is Empty!!!");
        }
        return front.val;
    }

    public boolean isEmpty() {
        return front == null; //or size == 0
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) throws Exception {
        QueuesUsingLL ll = new QueuesUsingLL();
        ll.enqueue(21);
        ll.enqueue(22);
        ll.enqueue(34);
        ll.enqueue(45);
        ll.enqueue(78);
        System.out.println(ll.peek());
        System.out.println(ll.size());
        System.out.println(ll.dequeue());
        System.out.println(ll.peek());
        System.out.println(ll.dequeue());
        System.out.println(ll.size());
    }
}