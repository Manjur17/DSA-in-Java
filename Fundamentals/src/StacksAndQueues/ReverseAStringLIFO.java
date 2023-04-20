package StacksAndQueues;

import java.util.Stack;

public class ReverseAStringLIFO {
    public static void main(String[] args) {
        String str = "Manjur";
        Stack<Character> st = new Stack<>();
        //pushing into stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            st.push(ch);
        }
        //popping and adding answer into var
        StringBuilder ans = new StringBuilder();
        while (!st.empty()){
            char ch = st.peek();
            ans.append(ch);
            st.pop();
        }
        System.out.println("The reverse of string is: " + ans);
    }
}
