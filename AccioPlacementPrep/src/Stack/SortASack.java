package Stack;

import java.util.Stack;

public class SortASack {
    public static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()){
            return;
        }
        int num = st.pop();
        //Now sort the stack
        sortStack(st);
        //now add the first number back to the stack
        insertSorted(st,num);
    }

    private static void insertSorted(Stack<Integer> st, int num) {
        if (st.empty() || (st.peek() < num)){
            st.push(num);
            return;
        }
        int n = st.pop();
        insertSorted(st,num);
        st.push(n);
    }
}
