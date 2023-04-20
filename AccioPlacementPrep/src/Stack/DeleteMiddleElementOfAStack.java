package Stack;

import java.util.Stack;

public class DeleteMiddleElementOfAStack {
    public void deleteMid(Stack<Integer> s, int n) {
        helper(s, n, n - 1);
    }

    void helper(Stack<Integer> st, int n, int index) {
        if ((n % 2 != 0 && index == n / 2) || (n % 2 == 0 && index == n / 2 - 1)) {
            st.pop();
            return;
        }


        int value = st.pop();
        helper(st, n, index - 1);
        st.push(value);
    }
}
