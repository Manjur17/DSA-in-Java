package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(reverse(n));
    }

    private static int reverse(int n) {
        int digits = (int) (Math.log10(n) + 1);
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return (int) (rem * Math.pow(10,digits-1) + helper(n/10,digits-1));
    }
}
