package Strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseWords(str));
    }

    private static String reverseWords(String s) {
        String[] tokens = s.trim().split(" ");
        Stack<String> stack = new Stack<>();
        for (String t : tokens) {
            if (!t.equals("")) {
                stack.push(t);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (stack.size() > 0) {
            String ss = stack.pop();
            if (stack.size() == 0) {
                sb.append(ss);
            } else {
                sb.append(ss).append(" ");
            }

        }
        return sb.toString();
    }
}
