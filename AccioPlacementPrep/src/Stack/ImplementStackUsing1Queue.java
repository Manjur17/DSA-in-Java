package Stack;

import java.util.*;

public class ImplementStackUsing1Queue {
    Queue<Integer> q1;

    public ImplementStackUsing1Queue() {
        q1 = new LinkedList<>();
    }

    public void push(int x) {
        //step -1 -> push inside q2
        q1.add(x);
        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.poll());
        }
    }

    public int pop() {
        if (q1.isEmpty())
            return -1;
        return q1.poll();
    }

    public int top() {
        if (q1.isEmpty())
            return -1;

        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
