package StacksAndQueues;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    //Leetcode-921
    public int minAddToMakeValid(String s) {
        int ob = 0;
        int cb = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (!st.empty() && st.peek() == '(') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }
        //no of braces needed to make it valid = size of the stack
        return st.size();
    }
}
