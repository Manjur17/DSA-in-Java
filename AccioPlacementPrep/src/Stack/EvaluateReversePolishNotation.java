package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for (String token : tokens) {
            if (st.isEmpty() || !isValid(token)) {
                st.push(token);
            } else {
                char ch = token.charAt(0);
                if (!st.isEmpty()) {
                    int a = Integer.parseInt(st.pop());
                    int b = Integer.parseInt(st.pop());
                    int c = evaluate(b, a, ch);
                    st.push(c + "");
                }
            }
        }

        return Integer.parseInt(st.peek());
    }

    public int evaluate(int first, int second, char op) {
        switch (op) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '/':
                return first / second;
            default:
                return 0;
        }
    }

    public boolean isValid(String token) {
        return (token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*"));
    }
}
