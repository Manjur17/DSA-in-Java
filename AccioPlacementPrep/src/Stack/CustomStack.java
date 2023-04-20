package Stack;

class CustomStack {
    protected int[] arr;
    private int top;
    private static final int DEFAULT_SIZE = 5;

    // Constructor to initialize the stack
    CustomStack() {
        this(DEFAULT_SIZE);
    }

    CustomStack(int size) {
        this.arr = new int[size];
        top = -1;
    }

    public boolean push(int x) throws StackException {
        if (isFull()) {
            throw new StackException("Stack Overflow");
        }
        top++; //new element is added
        arr[top] = x;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack Underflow");
        }

        return arr[top--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }

        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;               // or return size() == 0;
    }

    public boolean isFull() {
        return top == arr.length - 1;     // or return size() == capacity;
    }
}