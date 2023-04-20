package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(scoreOfParentheses(str));
    }

    public int scoreOfParenthesesII(String s) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                st.push(-1);
            else {
                if (!st.isEmpty() && st.peek() == -1) {
                    st.pop(); // remove '('
                    st.push(1);
                } else {
                    // top of the stack is number
                    int score = 0;
                    while (!st.isEmpty() && st.peek() != -1) {
                        score += st.pop();
                    }
                    st.pop();
                    st.push(2 * score);
                }
            }
        }

        int score = 0;
        while (!st.isEmpty()) {
            score += st.pop(); // ()() -> for those who don't have outer parenthesis to process
        }

        return score;
    }

    public static int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(score);
                score = 0;
            } else {
                score = st.pop() + Math.max(2 * score, 1);
            }
        }

        return score;
    }

    public int scoreOfParenthesesConstantSpace(String s) {
        int d = 0, score = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // if `(` increase the depth
            if (ch == '(')
                d++;
            else {
                d--;  // if `)` decrease the depth

                // check if a balanced pair is getting formed, if yes update the result
                if (s.charAt(i - 1) == '(')
                    score += Math.pow(2, d);
            }
        }

        return score;
    }
}
