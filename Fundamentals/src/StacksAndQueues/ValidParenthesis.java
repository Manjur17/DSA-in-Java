package StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValidParenthesis(String expression) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{'){
                st.push(ch);
            }else{
                if (!st.empty()){
                    char top = st.peek();
                    if ( top == '[' && ch == ']'  ||  top == '(' && ch == ')'||  top =='{' && ch =='}'){
                        st.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        //when the stack is completely popped
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(isValidParenthesis(str));
    }
}
