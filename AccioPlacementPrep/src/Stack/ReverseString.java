package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }

        StringBuilder res = new StringBuilder();
        while (!st.empty()) {
            res.append(st.pop());
        }

        return res.toString();
    }
}
