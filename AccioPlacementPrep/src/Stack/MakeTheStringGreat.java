package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        System.out.println(makeGood(s1));
    }

    public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean flag = false;

            if (!st.isEmpty()) {
                char c = st.peek();
                if (Math.abs(ch - c) == 32) {
                    st.pop();
                    flag = true;
                }
            }

            if (!flag) {
                st.push(ch);
            }
        }

        while (!st.isEmpty())
            res.append(st.pop());

        return res.reverse().toString();
    }

    public static String makeGoodBrute(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean flag = false;

            while (!st.isEmpty()) {
                char c = st.peek();
                if (c >= 'a' && c <= 'z') {
                    char cap = (char) ('A' - 'a' + c);
                    if (cap == ch) {
                        st.pop();
                        flag = true;
                    }
                    break; //2 at a time
                } else {
                    char small = (char) ('a' - 'A' + c);
                    if (small == ch) {
                        st.pop();
                        flag = true;
                    }
                    break; //2 at a time
                }
            }

            if (!flag) {
                st.push(ch);
            }
        }

        while (!st.isEmpty())
            res.append(st.pop());

        return res.reverse().toString();
    }
}
