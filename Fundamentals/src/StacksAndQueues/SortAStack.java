package StacksAndQueues;

import java.util.Stack;

public class SortAStack {
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()){
            return;
        }
        int num = stack.peek();
        stack.pop();
        //Now sort the stack
        sortStack(stack);
        //now add the first number back to the stack
        insertSorted(stack,num);
    }

    private static void insertSorted(Stack<Integer> stack, int num) {
        if (stack.empty() || (!stack.empty() && stack.peek() < num)){
            stack.push(num);
            return;
        }
        int n = stack.peek();
        stack.pop();
        insertSorted(stack,num);
        stack.push(n);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(-2);
        st.push(9);
        st.push(-7);
        st.push(3);
        sortStack(st);
        int n = st.size();
        for (int i = 0; i < n; i++) {
            System.out.print(st.peek() + " -> ");
            st.pop();
        }
        System.out.println("END");
    }
}
