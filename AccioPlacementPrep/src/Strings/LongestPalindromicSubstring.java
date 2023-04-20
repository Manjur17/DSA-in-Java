package Strings;

import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(solve(s));
        }
    }

    private static String solve(String s) {
        int max = 1;
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(s, i, j) && (j - i + 1 > max)) {
                    max = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
