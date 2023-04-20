package Stack;

import java.util.Stack;

class MinStackExtraSpace {
    Stack<Long> mSt = new Stack<>();    //Main stack
    Stack<Long> aSt = new Stack<>();    //Auxiliary stack
    Long mini;

    public MinStackExtraSpace() {
        mini = Long.MAX_VALUE;
    }

    public void push(int value) {
        Long val = (long) value;
        if (mSt.isEmpty()) {
            mini = val;
            aSt.push(val);
        } else {
            if (val <= mini) {
                mini = val;
                aSt.push(val);
            }
        }
        mSt.push(val);
    }

    public void pop() {
        if (mSt.isEmpty()) return;

        Long val = mSt.peek();
        if (val.equals(mini)) {
            aSt.pop();
            if (!aSt.isEmpty())
                mini = aSt.peek();
        }
        mSt.pop();
    }

    public int top() {
        Long val = mSt.peek();
        return val.intValue();
    }

    public int getMin() {
        return mini.intValue();
    }
}

class MinStack {
    Stack<Long> st = new Stack<>();
    Long mini;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        mini = Long.MAX_VALUE;
    }

    public void push(int value) {
        Long val = (long) value;
        if (st.isEmpty()) {
            mini = val;
            st.push(val);
        } else {
            if (val < mini) {
                st.push(2 * val - mini);
                mini = val;
            } else {
                st.push(val);
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        Long val = st.pop();
        if (val < mini) {
            mini = 2 * mini - val;
        }
    }

    public int top() {
        Long val = st.peek();
        if (val < mini) {
            return mini.intValue();
        }
        return val.intValue();
    }

    public int getMin() {
        return mini.intValue();
    }
}