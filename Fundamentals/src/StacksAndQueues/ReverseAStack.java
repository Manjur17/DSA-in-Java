package StacksAndQueues;

import java.util.Stack;

public class ReverseAStack {
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

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()){
            return;
        }
        int num = stack.peek();
        stack.pop();
        //Recursion to reverse the remaining stack
        reverseStack(stack);
        //Push it at bottom
        pushAtBottom(stack,num);
    }
    public static void displayStack(Stack<Integer> st){
        int n = st.size();
        for (int i = 0; i < n; i++) {
            System.out.print(st.peek() + " -> ");
            st.pop();
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(1);
        st.push(4);
        st.push(5);
//        displayStack(st);
        reverseStack(st);
        displayStack(st);
    }
}
