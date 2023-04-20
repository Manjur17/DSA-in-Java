package Stack;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ']') {
                st.push(ch);
            } else {
                //ch == ']'
                StringBuilder temp = new StringBuilder();

                while (!st.isEmpty() && st.peek() != '[') {
                    temp.insert(0, st.pop());
                }
                st.pop(); //'['

                StringBuilder num = new StringBuilder();

                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num.insert(0, st.pop() + "");
                }

                int n = Integer.parseInt(num + "");

                temp.append(String.valueOf(temp).repeat(n - 1));

                if (st.isEmpty()) {
                    ans.append(temp);
                } else {
                    //internal part
                    for (int j = 0; j < temp.length(); j++) {
                        st.push(temp.charAt(j));
                    }
                }
            }
        }

        int n = ans.length();
        while (!st.isEmpty()) {
            ans.insert(n, st.pop());
        }

        return ans.toString();
    }
}
