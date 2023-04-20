package Stack;

import java.util.Stack;

public class MinimumSwapsToMakeParenthesesValid {
    public int minSwapsEfficient(String s) {
        int ans = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                count++;
            } else {
                if (count == 0) {
                    ans++;
                } else {
                    count--;
                }
            }
        }
        // 1 swap cancels 2 close brackets
        return (int) Math.ceil((double) ans / 2);
    }

    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[') {
                st.push(ch);
            } else {
                if (!st.empty()) {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }

        return st.size() / 2;
    }
}
