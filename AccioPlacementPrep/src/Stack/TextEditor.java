package Stack;

import java.util.*;

public class TextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        Stack<String> st = new Stack<String>();
        st.push(s);
        for (int i = 0; i < n; i++) {
            int type = sc.nextInt();
            if (type == 1) {
                s = s + sc.next();
                st.push(s);
            } else if (type == 2) {
                s = s.substring(0, s.length() - sc.nextInt());
                st.push(s);
            } else if (type == 3) {
                System.out.println(s.charAt(sc.nextInt() - 1));
            } else {
                st.pop();
                s = st.peek();
            }
        }
    }
}


