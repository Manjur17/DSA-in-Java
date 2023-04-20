package StacksAndQueues;

public class QueuesUsingLL {
     static class Node{
        int val;
        Node next;
        public Node(int value){
            this.val = value;
        }
    }
    int size;
    Node head;
    Node rear;
    public QueuesUsingLL(){
        this.size = 0;
        this.head = null;
        this.rear = null;
    }
    public void enqueue(int item){
        Node newNode = new Node(item);
        if (head == null){
            head = newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public int dequeue() throws Exception {
        if (head == null){
            throw new Exception("Queue is Empty!!!");
        }
        int removed = head.val;
        head = head.next;
        if (head == null){
            rear = null;
        }
        return removed;
    }
    public int peek() throws Exception {
        if (head == null){
            throw new Exception("Queue is Empty!!!");
        }
        return head.val;
    }
    public boolean isEmpty(){
        return head== null;
    }

    public static void main(String[] args) throws Exception {
        QueuesUsingLL ll = new QueuesUsingLL();
        ll.enqueue(21);
        ll.enqueue(22);
        ll.enqueue(34);
        ll.enqueue(45);
        ll.enqueue(78);
        System.out.println(ll.peek());
        System.out.println(ll.dequeue());
        System.out.println(ll.peek());
        System.out.println(ll.dequeue());
    }
}
