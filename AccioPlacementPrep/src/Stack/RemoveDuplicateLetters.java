package Stack;

import java.util.Stack;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        Stack<Character> st = new Stack<>();
        boolean[] isVisited = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']--; //decrement the frequency
            if (!isVisited[ch - 'a']) {
                isVisited[ch - 'a'] = true;

                while (!st.empty() && st.peek() > ch && freq[st.peek() - 'a'] > 0) {
                    isVisited[st.peek() - 'a'] = false; //for future addition
                    st.pop();
                }
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0,st.pop()); // stack contains in reverse order
        }
        return sb.toString();
    }

}
