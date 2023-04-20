package Stack;

class Node {
    int val;
    Node next;

    public Node(int value) {
        this.val = value;
    }
}

public class ImplementStackUsingLL {

    private Node head;
    int size;

    public ImplementStackUsingLL() {
        this.size = 0;
        this.head = null;
    }

    public boolean push(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack Underflow");
        }
        int removed = head.val;
        head = head.next;
        size--;
        return removed;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return head.val;
    }

    public boolean isEmpty() {
        return head == null; //or size == 0
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) throws StackException {
        ImplementStackUsingLL ll = new ImplementStackUsingLL();
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
