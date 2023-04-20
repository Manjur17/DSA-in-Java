package Stack;

import java.util.Stack;

public class CheckIfWordIsValidAfterSubstitutions {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'c') {
                if (st.size() >= 2 && st.pop() == 'b' && st.pop() == 'a') {
                    continue; //pairing is possible of "abc"
                } else {
                    return false; //pairing not possible
                }
            } else {
                st.push(ch);
            }
        }
        //If we have only abc pattern the stack will become empty.
        return st.isEmpty(); // if some part is still unprocessed inside stack
    }
}
