package Strings;

import java.util.Stack;

class Pair {
    char ch;
    int count;

    Pair(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
}

public class RemoveAllAdjacentDuplicatesStringII {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (st.isEmpty()) {
                st.push(new Pair(ch, 1));
            } else {

                int count;

                if (ch == st.peek().ch) {
                    count = st.pop().count + 1;
                } else {
                    count = 1;
                }

                st.push(new Pair(ch, count));

                if (st.peek().count == k) {
                    st.pop();
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            // st.peek() can be (a,2)
            int num = st.peek().count;
            char ch = st.pop().ch;
            for (int i = 0; i < num; i++) {
                ans.insert(0, ch);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicatesBrute("pbbcggttciiippooaais", 2));
    }

    public static String removeDuplicatesBrute(String s, int k) {
        String ans = "";
        while (ans.length() != s.length()) {
            //check if further modification is possible
            ans = s;
            s = modify(s, k);
        }

        return s;
    }

    private static String modify(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {

            int j = i + 1, start = i;

            if (j < n && s.charAt(j) == s.charAt(i)) {
                //if the adjacent chars are equals check up to where they are same
                while (j < n && s.charAt(j) == s.charAt(i)) {
                    j++;
                    if (j - i == k) {
                        start = j;
                    }
                }

                if (j - start != k) {
                    ans.append(s, start, j);
                }

            } else {
                //add it to the ans
                ans.append(s.charAt(i));
            }

            i = j; //skip the equal char or move ahead
        }

        return ans.toString();
    }
}
