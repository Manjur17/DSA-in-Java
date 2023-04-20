package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(minAddToMakeValid(s));
    }

    public int minAddToMakeValidEfficient(String s) {
        int ans = 0, count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                if (count == 0) {
                    ans++;
                } else {
                    count--;
                }
            }
        }

        return ans + count;
    }

    public static int minAddToMakeValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (!st.empty()) {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}
