package QueuesAndDeques;

class CustomQueue {
    private final int[] arr;
    private static final int DEFAULT_SIZE = 10;
    private final int front;
    private int rear;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.arr = new int[size];
        front = 0;
        rear = 0;
    }

    public boolean add(int item) {
        if (isFull()) {
            return false;
        }
        arr[rear++] = item;
        return true;
    }

    public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue Underflow");
        }

        int removed = arr[front]; //first item to be deleted

        // shift the elements to left
        for (int i = 1; i < rear; i++) {
            arr[i - 1] = arr[i];
        }

        if (rear < arr.length) arr[rear] = 0; //optional as we are only considering elements between [front,rear]

        rear--;
        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("END");
            return;
        }

        for (int i = front; i < rear; i++) { //we are only considering elements between [front,rear]
            System.out.print(arr[i] + " <- ");
        }
        System.out.println("END");
    }

    public int peek() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }
        return arr[front];
    }

    public int size() {
        return rear - front;
    }

    public boolean isFull() {
        return rear == arr.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return front == rear;
    }
}