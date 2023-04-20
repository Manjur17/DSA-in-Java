package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RedundantBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(checkRedundancy(s));
    }

    public static int checkRedundancy(String s) {
        int n = s.length();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;
            }
            if (ch == '(' || isValid(ch)) {
                st.push(ch); //until we have not encountered ')' keep pushing inside stack
            } else {
                //now we have encountered ')' so start comparison for redundancy
                if (!st.empty() && !isValid(st.peek()))
                    //there is no expressions between ( and )
                    return 1;

                while (!st.empty() && st.peek() != '(') {
                    st.pop();
                }
                st.pop(); //(a + ( -> this ( has to be popped out
            }
        }
        return 0; //stack is empty
    }

    private static boolean isValid(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}
