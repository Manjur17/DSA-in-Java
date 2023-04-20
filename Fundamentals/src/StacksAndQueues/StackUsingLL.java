package StacksAndQueues;

public class StackUsingLL {
    static class Node{
        int val;
        Node next;
        public Node(int value){
            this.val = value;
        }
    }
    int size;
    Node head;
    public StackUsingLL(){
        this.size = 0;
        this.head = null;
    }
    public boolean push(int item){
       Node newNode = new Node(item);
       if (head == null) {
           head = newNode;
       }else {
           newNode.next = head;
           head  = newNode;
       }
       size++;
       return true;
    }
    public  int pop() throws Exception{
        if (head == null){
            throw new Exception("Stack is Empty!!");
        }
        int removed = head.val;
        head = head.next;
        size--;
        return removed;
    }
    public  int peek() throws Exception {
        if (head == null){
            throw new Exception("Stack is Empty!!");
        }
        return head.val;
    }
    public  boolean isEmpty(){
        return head == null;
    }
    public int size(){
        if (head == null){
            return Integer.MIN_VALUE;
        }
        return size;
    }

    public static void main(String[] args) throws Exception {
        StackUsingLL ll = new StackUsingLL();
        ll.push(21);
        ll.push(22);
        ll.push(34);
        ll.push(45);
        ll.push(78);
        System.out.println(ll.peek());
        System.out.println(ll.pop());
        System.out.println(ll.peek());
        System.out.println(ll.size());
    }
}
