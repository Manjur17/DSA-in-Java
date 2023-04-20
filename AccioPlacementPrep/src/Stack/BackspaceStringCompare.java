package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(backspaceCompare(s, t));
    }

    public boolean backspaceCompareEfficient(String s, String t) {
        int skips = 0, skipt = 0, n = s.length(), m = t.length();
        int i = n - 1, j = m - 1;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skips++;
                    i--;
                } else if (skips > 0) {
                    skips--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipt++;
                    j--;
                } else if (skipt > 0) {
                    skipt--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }
            if (i >= 0 != j >= 0) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    public boolean backspaceCompareUsingStacks(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && !st1.isEmpty()) {
                st1.pop();
            } else if (s.charAt(i) != '#') {
                st1.push(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#' && !st2.isEmpty()) {
                st2.pop();
            } else if (t.charAt(i) != '#') {
                st2.push(t.charAt(i));
            }
        }

        /*
        while (!st1.isEmpty() && !st2.isEmpty()) {
            if (st1.pop() != st2.pop()) {
                return false;
            }
        }
        return st1.isEmpty() && st2.isEmpty();
        */

        return st1.equals(st2); //comparing 2 stacks
    }

    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                count++;
            } else {
                if (count == 0) {
                    sb.append(s.charAt(i));
                } else {
                    count--;
                }
            }
        }
        count = 0;
        StringBuilder sb2 = new StringBuilder();
        for (int i = t.length() - 1; i >= 0; i--) {
            if (t.charAt(i) == '#') {
                count++;
            } else {
                if (count == 0) {
                    sb2.append(t.charAt(i));
                } else {
                    count--;
                }
            }
        }

        return (sb.toString().equals(sb2.toString()));
    }
}
