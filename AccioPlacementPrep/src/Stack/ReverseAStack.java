package Stack;

import java.util.*;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(3);
        st.add(2);
        st.add(1);
        st.add(7);
        st.add(6);
        reverseStack(st);
        while (!st.empty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int num = stack.pop();
        //Recursion to reverse the remaining stack
        reverseStack(stack);
        //Push it at bottom
        pushAtBottom(stack, num);
    }

    public static void pushAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int num = stack.pop();
        pushAtBottom(stack, x);
        stack.push(num);
    }


    static ArrayList<Integer> reverse(Stack<Integer> s) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(s, list);
        return list;
    }

    private static void helper(Stack<Integer> st, ArrayList<Integer> list) {
        if (st.empty()) {
            return;
        }
        int value = st.pop();
        list.add(value);
        helper(st, list);
        st.push(value);
    }
}
