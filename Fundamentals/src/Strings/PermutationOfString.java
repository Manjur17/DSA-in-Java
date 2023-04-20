package Strings;

import java.util.Scanner;

public class PermutationOfString {
    public static int factorial(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void permutation(String str) {
        int n = str.length();
        int f = factorial(n);
        for (int i = 0; i < f; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(str);
            for (int div = n; div >= 1; div--) {
                int r = temp % div;
                int q = temp / div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        permutation(str);
    }
}
