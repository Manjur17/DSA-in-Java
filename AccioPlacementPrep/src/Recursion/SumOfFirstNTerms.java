package Recursion;

public class SumOfFirstNTerms {
    long sumOfSeries2(long N) {
        long x = ((N * (N + 1)) / 2);
        return powerOptimised(x, 2);
    }

    long sumOfSeries(long n) {
        long res = 0;

        //try to find the series to avoid TLE
        for (int i = 1; i <= n; i++) {
            res += powerOptimised(i, 3);
        }

        return res;
    }

    //using fast Exponentiation
    private static long powerOptimised(long x, int y) {
        if (y == 0) {
            return 1;
        }

        long ans = powerOptimised(x, y / 2);
        ans *= ans;
        if (y % 2 != 0) ans *= x;
        return ans;
    }
}
