package Maths;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
//        for (int i = 2; i < n; i++) {
//            int c = a + b;
//            a = b;
//            b = c;
//            System.out.print(b + " ");
//        }

        while (b != n) {
            int c = a + b;
            a = b;
            b = c;
            if (b > n) break;
            System.out.print(b + " ");
        }
    }
}
