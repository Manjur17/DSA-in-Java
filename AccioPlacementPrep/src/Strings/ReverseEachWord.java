package Strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseWords(str));
        System.out.println(reverseWordsOptimized(str));
    }

    public static String reverseWords(String str) {
        int startIndex = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                String reverse = reverseString(str, startIndex, i - 1);
                ans.append(reverse).append(" ");
                startIndex = i + 1;
            } else if (i == str.length() - 1) {
                String reverse = reverseString(str, startIndex, i);
                ans.append(reverse);
            }
        }
        return ans.toString();
    }

    private static String reverseString(String str, int startIndex, int endIndex) {
        StringBuilder temp = new StringBuilder();
        for (int i = startIndex; i <= endIndex; i++) {
            temp.insert(0, str.charAt(i));
        }
        return temp.toString();
    }

    public String reverseWordsII(String s) {
        String[] arr = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();

        for (int i = arr.length - 1; i >= 1; i--) {
            ans.append(arr[i]).append(" ");
        }
        ans.append(arr[0]);

        return ans.toString();
    }

    public static String reverseWordsOptimized(String s) {
        String[] arr = s.trim().split("\\s+");
        Stack<String> stack = new Stack<>();

        for (String t : arr) {
            //"a good   example" -> this is a test case thats why
            if (!t.equals(""))
                stack.push(t);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            String ss = stack.pop();
            if (stack.isEmpty()) {
                sb.append(ss);
            } else {
                sb.append(ss).append(" ");
            }

        }

        //return  sb.toString();
        return reverseString(String.valueOf(sb), 0, sb.length() - 1);
    }
}
