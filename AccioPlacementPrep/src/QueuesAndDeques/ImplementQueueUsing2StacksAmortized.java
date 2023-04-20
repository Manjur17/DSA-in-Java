package QueuesAndDeques;

import java.util.Stack;

public class ImplementQueueUsing2StacksAmortized {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public ImplementQueueUsing2StacksAmortized() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s1.empty())
            return -1;

        while (!s1.empty()) {
            s2.push(s1.pop());
        }

        int x = s2.pop();

        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return x;
    }

    public int peek() {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }

        int x = s2.peek();

        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return x;
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
