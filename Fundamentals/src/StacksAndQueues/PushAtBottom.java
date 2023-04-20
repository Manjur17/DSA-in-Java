package StacksAndQueues;

import java.util.Stack;

public class PushAtBottom {
    public static void pushAtBottom(Stack <Integer> myStack, int x) {
        if (myStack.isEmpty()){
            myStack.push(x);
            return;
        }
        int num = myStack.peek();
        myStack.pop();
        pushAtBottom(myStack,x);
        myStack.push(num);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(1);
        st.push(4);
        st.push(5);
//        st.push(4);
//        st.push(3);
//        st.push(2);
        pushAtBottom(st,9);
        int n = st.size();
        for (int i = 0; i < n; i++) {
            System.out.print(st.peek() + " -> ");
            st.pop();
        }
        System.out.println("END");
    }
}
