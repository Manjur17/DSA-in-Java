package Stack;

import java.util.Stack;

public class CountTheReversal {
    public static int findMinimumCost(String str) {
        Stack<Character> st = new Stack<>();
        if (str.length() % 2 == 1) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{') {
                st.push(ch);
            } else {
                //ch == '}". Now remove all the valid expressions
                if (!st.empty() && st.peek() == '{') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }
        }
        //Now we have all invalid expressions
        int a = 0, b = 0;
        //b is no of opening brackets and a is no of closing brackets
        while (!st.empty()) {
            if (st.peek() == '{') {
                b++;
            } else {
                a++;
            }
            st.pop();
        }
        return (a + 1) / 2 + (b + 1) / 2;
    }

    static int countRev(String s) {
        int n = s.length();
        if (n % 2 != 0)
            return -1;

        int count = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '{') {
                st.push(ch);
            } else {
                //ch == }
                if (st.empty()) {
                    st.push('{'); //reverse the braces
                    count++; //cnt the reverse as } will contribute 1 to ans
                } else {
                    //we have { for ch == }
                    st.pop();
                }
            }
        }
        //finally, stack will hold only the open braces that
        //are not closed...so that can be closed by
        //reversing st.size()/2 characters
        int sz = st.size();
        return count + (sz / 2);
    }
}
