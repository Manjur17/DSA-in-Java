package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
    public String removeKDigits(String num, int k) {
        if (num.length() == k)
            return "0";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            //if current num < st.peek() then removing the peek num will
            //contribute towards the smallest possible integer after removing k digits from num.
            while (!st.empty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while (!st.empty() && k > 0) {
            //if still something is left to be deleted
            //start deleting from top of stack
            //as stack is monotonic increasing now
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, st.pop());
        }

        while (sb.toString().startsWith("0")) {
            //take care of all leading 0 situations
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static String removeKDigitsConstantSpace(String num, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch && k > 0) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(ch);
        }
        while (sb.length() > 0 && k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        while (sb.toString().startsWith("0")) {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int k = s.nextInt();
        System.out.println(removeKDigitsConstantSpace(str, k));
    }
}
