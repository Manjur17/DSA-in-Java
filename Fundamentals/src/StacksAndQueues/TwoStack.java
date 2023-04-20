package StacksAndQueues;

public class TwoStack {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int top1;
    int top2;
    int size;

    // Initialize TwoStack.
    public TwoStack() {
        this(DEFAULT_SIZE);
    }

    public TwoStack(int s) {
        this.data = new int[s];
        this.top1 = -1;
        this.top2 = s;
        this.size = s;
    }

    // Push in stack 1.
    public void push1(int num) {
        if (top2 - top1 > 1) {
            data[++top1] = num;
        }
    }

    // Push in stack 2.
    public void push2(int num) {
        if (top2 - top1 > 1) {
            data[--top2] = num;
        }
    }

    // Pop from stack 1 and return popped element.
    public int pop1() {
        if (top1 >= 0) {
            int removed = data[top1];
            top1--;
            return removed;
        } else {
            return -1;
        }
    }

    // Pop from stack 2 and return popped element.
    public int pop2() {
        if (top2 < size) {
            int removed = data[top2];
            top2++;
            return removed;
        } else {
            return -1;
        }

    }
}
