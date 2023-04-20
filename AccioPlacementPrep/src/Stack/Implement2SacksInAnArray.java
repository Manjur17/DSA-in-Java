package Stack;

class TwoStack {

    int size;
    int top1, top2;
    int[] arr = new int[100];

    TwoStack() {
        size = 100;
        top1 = -1;
        top2 = size;
    }
}

public class Implement2SacksInAnArray {
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack st) {
        if (st.top2 - st.top1 > 1) {
            st.top1++;
            st.arr[st.top1] = x;
        }
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack st) {
        if (st.top2 - st.top1 > 1) {
            st.top2--;
            st.arr[st.top2] = x;
        }
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack st) {
        if (st.top1 >= 0){
            int val = st.arr[st.top1];
            st.top1--;
            return val;
        }
        return -1;
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack st) {
        if (st.top2 < st.size){
            int val = st.arr[st.top2];
            st.top2++;
            return val;
        }
        return -1;
    }
}
