package Stack;

import java.util.Stack;

public class EvaluationOfPostFix {
    public static int evaluatePostFix(String exp) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {

            if (exp.charAt(i) == '*') {
                int a = st.pop();
                int b = st.pop();
                st.add(b * a);
            } else if (exp.charAt(i) == '+') {
                int a = st.pop();
                int b = st.pop();
                st.add(b + a);
            } else if (exp.charAt(i) == '-') {
                int a = st.pop();
                int b = st.pop();
                st.add(b - a);
            } else if (exp.charAt(i) == '/') {
                int a = st.pop();
                int b = st.pop();
                st.add(b / a);
            } else {
                st.add(exp.charAt(i) - '0');
            }
        }

        return st.pop();
    }
}
