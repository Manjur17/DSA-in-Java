package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
        System.out.println(sumDigitsTailRecursion(n, 0));
    }

    private static int sumDigits(int N) {
        if (N == 0) {
            return 0;
        }
        return (N % 10) + sumDigits(N / 10);
    }

    static int sumDigitsTailRecursion(int n, int val) {
        if (n == 0) {
            return val;
        }
        return sumDigitsTailRecursion(n / 10, (n % 10) + val);
    }
}
