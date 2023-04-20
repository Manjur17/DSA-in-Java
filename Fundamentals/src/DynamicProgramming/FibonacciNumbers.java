package DynamicProgramming;

import java.util.Arrays;

public class FibonacciNumbers {

    static int fMemoization(int n, int[] dp) {
        if (n <= 1) return n;

        if (dp[n] != -1) return dp[n];
        return dp[n] = fMemoization(n - 1, dp) + fMemoization(n - 2, dp);
    }

    static void fTabulation() {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
    }

    static void fSpaceOptimisation() {
        int n = 5;
        int prev2 = 0;
        int prev = 1;

        for (int i = 2; i <= n; i++) {
            int cur_i = prev2 + prev;
            prev2 = prev;
            prev = cur_i;
        }
        System.out.println(prev);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fMemoization(n, dp));
        fTabulation();
        fSpaceOptimisation();
    }
}
