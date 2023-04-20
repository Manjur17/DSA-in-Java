package Stack;

import java.util.Stack;

public class InsertAnElementAtItsBottom {
    public static Stack<Integer> pushAtBottom(Stack<Integer> st, int x) {
        insertAtBottom(st, x);
        return st;
    }

    private static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.empty()) {
            st.push(x);
            return;
        }
        int value = st.pop();
        insertAtBottom(st, x);
        st.push(value);
    }
}