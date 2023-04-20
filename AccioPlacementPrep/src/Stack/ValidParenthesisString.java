package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesisString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(checkValidString(str));
    }

    public static boolean checkValidString(String s) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                st2.push(i);
            } else if (ch == '(') {
                st1.push(i);
            } else {
                //ch == ')' -> we have to balance it
                if (!st1.isEmpty()) {
                    st1.pop(); //st1.peek == '('
                } else if (!st2.isEmpty()) {
                    st2.pop(); //st2.peek == '*'
                } else {
                    return false; //if both are empty then we cannot balance )
                }
            }
        }
        //now we have to balance '('
        while (!st1.isEmpty() && !st2.isEmpty()) {
            if (st1.peek() > st2.peek())
                return false; // * came before ( as index are in increasing order
            else {
                st1.pop();
                st2.pop();
            }
        }

        return st1.isEmpty(); // ex- '(' we have something inside st1 which could not be balanced
    }
}
