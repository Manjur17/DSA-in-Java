package Recursion;

import java.util.Scanner;

public class ProductDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(product(n));
    }

    private static int product(int N) {
        if (N < 10) {
            return N;
        }
        return (N % 10) * product(N / 10);
    }
}
