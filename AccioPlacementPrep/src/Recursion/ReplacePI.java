package Recursion;

import java.util.Scanner;

public class ReplacePI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        solve(str, "");
    }

    public static void solve(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        if (str.startsWith("pi")) {
            ans += "3.14";
            solve(str.substring(2), ans);
        } else {
            ans += str.charAt(0);
            solve(str.substring(1), ans);
        }
    }
}
