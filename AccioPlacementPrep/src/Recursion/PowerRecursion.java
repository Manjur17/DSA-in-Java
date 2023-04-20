package Recursion;

import java.util.Scanner;

public class PowerRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(power(x, y));
        System.out.println(powerOptimised(x, y));
    }

    private static int power(int x, int y) {
        if (y == 1) {
            return x;
        }
        return x * power(x, y - 1);
    }

    //using fast Exponentiation -> TC - O(log n)
    private static int powerOptimised(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int ans = powerOptimised(x, y / 2);
        ans *= ans;
        if (y % 2 != 0) ans *= x;
        return ans;
    }

    private static double myPow(double x, int y) {
        if (y == 0) {
            return 1;
        }

        double ans = myPow(x, y / 2);
        ans *= ans;
        if (y < 0) {
            x = 1 / x;
        }
        if (y % 2 != 0) ans *= x;

        return ans;
    }
}
