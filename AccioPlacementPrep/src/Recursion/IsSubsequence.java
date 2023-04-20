package Recursion;

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String t = sc.next();
        System.out.println(isSubsequence(t, str));
    }

    public static boolean isSubsequence(String s, String t) {
        return helper(t, "", s);
    }

    private static boolean helper(String str, String ans, String t) {
        if (str.length() == 0) {
            return ans.equals(t);
        }
        char ch = str.charAt(0);
        boolean ans1 = helper(str.substring(1), ans + ch, t); //take it
        boolean ans2 = helper(str.substring(1), ans, t); //leave it
        return ans1 || ans2;
    }
}
