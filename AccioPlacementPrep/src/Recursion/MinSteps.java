package Recursion;

import java.util.Scanner;

public class MinSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minSteps(n));
    }

    private static int minSteps(int n) {
        if (n == 1) return 0;

        int div1 = Integer.MAX_VALUE; //min steps to reduce n -> n-1
        int div2 = Integer.MAX_VALUE; //min steps to reduce n -> n/2
        int div3 = Integer.MAX_VALUE; //min steps to reduce n -> n/3

        div1 = minSteps(n - 1);
        if (n % 2 == 0) {
            div2 = minSteps(n / 2);
        }
        if (n % 3 == 0) {
            div3 = minSteps(n / 3);
        }

        return 1 + Math.min(div1, Math.min(div2, div3));
    }
}
