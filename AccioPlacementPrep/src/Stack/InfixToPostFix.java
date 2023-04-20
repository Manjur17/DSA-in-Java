package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(infixToPostfix(s));
    }

    // A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
    static int Precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '^')
            return 3;

        return -1;
    }

    static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); ++i) {
            char ch = exp.charAt(i);

            // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            // If the scanned character is an '(' push it to the stack.
            else if (ch == '(') {
                stack.push(ch);
            }
            //  If the scanned character is an ')',
            // pop and output from the stack until an '(' is encountered.
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); //pop out the encountered '('.
            } else // an operator is encountered
            {
                while (!stack.isEmpty() && Precedence(ch) <= Precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch); //if precedence is higher
            }

        }

        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result.append(stack.pop());
        }
        return result.toString();
    }
}
