package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n, 0));
    }

    private static int reverse(int N, int rev) {
        if (N == 0) {
            return rev;
        }
        rev = rev * 10 + (N % 10);
        return reverse(N / 10, rev);
    }
}
