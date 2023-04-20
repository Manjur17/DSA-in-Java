package BinarySearchQuestions;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(mySqrt(n));
    }

    public boolean isPerfectSquare(int num) {
        long i = 1;
        while (i * i <= num) {
            if (i * i == num) return true;
            i += 1;
        }
        return false;

    }

    public static int mySqrt(int x) {
        if (x <= 1) return x;

        long start = 1, end = x, ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;

            // If x is a perfect square
            if (mid * mid == x)
                return (int) mid;

            // Since we need floor, we update answer when mid*mid is smaller than x, and move closer to sqrt(x)
            if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            } else   // If mid*mid is greater than x
                end = mid - 1;
        }
        return (int) ans;
    }
}
