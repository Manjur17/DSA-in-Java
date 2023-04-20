package Stack;

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses2(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else {
                st.pop();

                if (st.isEmpty()) {
                    st.push(i);
                }else{
                    ans = Math.max(ans, i - st.peek());
                }


            }
        }

        return ans;
    }

    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(i);
            } else {
                //ch == ')'
                if (st.size() >= 2 && s.charAt(st.peek()) == '(') {
                    st.pop();
                    ans = Math.max(ans, i - st.peek());
                }else {
                    st.push(i);
                }


            }
        }

        return ans;
    }
}
