package Stack;

import java.util.Stack;

class MinStackGFG {
    int mini;
    Stack<Integer> st = new Stack<>();

    int getMin() {
        if (st.isEmpty()) return -1;
        return mini;
    }


    int pop() {
        if (st.isEmpty()) return -1;

        int val = st.peek();
        if (val < mini) {
            int ans = mini;
            mini = 2 * mini - val;
            st.pop();
            return ans;
        }
        return st.pop(); // if st.peek() >= mini
    }


    void push(int x) {
        if (st.isEmpty()) {
            mini = x;
            st.push(x);
        } else {
            if (x < mini) {
                st.push(2 * x - mini);
                mini = x;
            } else {
                st.push(x);
            }
        }
    }
}