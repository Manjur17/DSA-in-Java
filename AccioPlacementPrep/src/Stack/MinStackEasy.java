package Stack;

import java.util.Stack;

public class MinStackEasy {

    Stack<Pair> st; //<top, minSoFar>

    public MinStackEasy() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(new Pair(val, val));
        } else {
            int min = Math.min(val, st.peek().second);
            st.push(new Pair(val, min));
        }
    }

    public void pop() {
        if (st.isEmpty()) return;
        st.pop();
    }

    public int top() {
        if (st.isEmpty()) return -1;

        return st.peek().first;
    }

    public int getMin() {
        if (st.isEmpty()) return -1;
        return st.peek().second;
    }

}
