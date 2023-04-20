package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseSubstringsBetweenEachPairOfParentheses {
    public String reverseParenthesesEfficient(String s) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ')')
                st.push(s.charAt(i) + "");
            else {
                StringBuilder sb = new StringBuilder();
                while (!st.isEmpty() && !st.peek().equals("(")) {
                    sb.insert(0, st.pop());
                }
                st.pop();
                st.push(sb.reverse().toString());
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.empty()) {
            sb.append( st.pop());
        }

        return sb.reverse().toString();
    }


    public String reverseParenthesesII(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                Queue<Character> q = new LinkedList<>();
                while (!st.empty() && st.peek() != '(') {
                    q.add(st.pop());
                }
                st.pop();
                while (!q.isEmpty()) {
                    st.push(q.poll());
                }
            } else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.empty()) {
            sb.insert(0, st.pop());
        }

        return sb.toString();
    }

    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                StringBuilder sb = new StringBuilder();
                while (!st.empty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop();
                for (int j = 0; j < sb.length(); j++) {
                    st.push(sb.charAt(j));
                }
            } else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.empty()) {
            sb.insert(0, st.pop());
        }

        return sb.toString();
    }
}
