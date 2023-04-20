package QueuesAndDeques;

import java.util.Stack;

public class ImplementQueueUsing2Stacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    /*The method pop which return the element poped out of the stack*/
    int dequeue() {
        if (s1.isEmpty())
            return -1;
        return s1.pop();
    }

    public int peek() {
        if (s1.isEmpty())
            return -1;
        return s1.peek();
    }

    /* The method push to push element into the stack */
    void enqueue(int x) {
        //step 1 -> s1 -> s2
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        // x -> s1
        s1.push(x); //-> this is at its correct position
        // s2 -> s1
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }
}
