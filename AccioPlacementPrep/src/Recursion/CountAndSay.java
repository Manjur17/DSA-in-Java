package Recursion;

import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        return helper(1, "1", n);
    }

    private static String helper(int ind, String s, int n) {
        if (ind == n) {
            return s;
        }
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 1;
            int j = i + 1;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                count++;
                j++;
            }
            i = j - 1;
            sBuilder.append(count).append(ch);
        }
        s = sBuilder.toString();
        return helper(ind + 1, s, n);
    }
}
