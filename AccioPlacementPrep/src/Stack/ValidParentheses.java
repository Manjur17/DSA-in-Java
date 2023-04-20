package Stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) return false;

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch); //push it into stack
            } else {
                if (st.empty()) return false; //case where if we start with closing parentheses
                if (isMatching(st.peek(), ch)) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.empty();
    }

    private boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}');
    }
}
