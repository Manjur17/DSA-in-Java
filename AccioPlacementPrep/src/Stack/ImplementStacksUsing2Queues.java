package Stack;

import java.util.*;

public class ImplementStacksUsing2Queues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    //Function to push an element into stack using two queues.
    void push(int x) {
        //step -1 -> push inside q2
        q2.add(x);

        //now q1 -> q2
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        //q2 -> q1
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
    }

    public int top() {
        if (q1.isEmpty())
            return -1;

        return q1.peek();
    }

    //Function to pop an element from stack using two queues.
    int pop() {
        if (q1.isEmpty())
            return -1;

        return q1.poll();
    }
}
