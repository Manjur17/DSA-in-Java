package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.nextLine();
        System.out.println(removeOuterParentheses(str));
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        //we will be processing only for inner parenthesis
        //to check whether the parenthesis is inner or out we will use stack and stack.size
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (!st.isEmpty()) {
                    //we already have a '(' inside stack so this is inner parenthesis '('
                    //add it to ans
                    sb.append(ch);
                }
                st.push(ch);
            } else {
                //ch == ')'
                if (st.size() > 1) {
                    //we have at-least 2 '(' inside stack so this is inner parenthesis ')'
                    sb.append(ch);
                }
                st.pop();
            }
        }
        return sb.toString();
    }
}
