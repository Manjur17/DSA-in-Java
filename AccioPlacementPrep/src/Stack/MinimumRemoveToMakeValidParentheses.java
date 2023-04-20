package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(minRemoveToMakeValid(s));
    }

    public String minRemoveToMakeValidConstantSpace(String s) {
        int count = 0;

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(')
                count++;
            else if (arr[i] == ')') {
                if (count == 0)
                    arr[i] = '*';
                else
                    count--;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '(' && count > 0) {
                arr[i] = '*';
                count--;
            }

        }

        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c != '*')
                sb.append(c);
        }

        return sb.toString();
    }

    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                st.push(i);
            } else if (arr[i] == ')') {
                if (st.empty()) {
                    //no ( for )
                    arr[i] = '*';
                } else {
                    st.pop();
                }
            }
        }

        while (!st.empty()) {
            //stack only has '(' for whose there is no ')' for '('
            arr[st.peek()] = '*';
            st.pop();
        }

        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c != '*')
                sb.append(c);
        }

        return sb.toString();
    }
}
