package QueuesAndDeques;

public class CircularQueue {
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;

    protected int rear = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.arr = new int[size];
    }

    public boolean insert(int item) throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        // rear = (front + size - 1)
        arr[rear] = item;
        rear = (rear + 1) % arr.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        for (int j = front; j < rear; ) {
            System.out.print(arr[j] + " <- ");
            j = (j + 1) % arr.length;
        }

        int i = front;
        do {
            System.out.print(arr[i] + " <- ");
            i = (i + 1) % arr.length;
        } while (i != rear);
        System.out.println("END");
    }

    public boolean isFull() {
        return size == arr.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0;
    }
}