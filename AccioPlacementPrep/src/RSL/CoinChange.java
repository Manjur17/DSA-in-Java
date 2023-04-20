package RSL;

public class CoinChange {
    public long count(int[] coins, int N, int sum) {
        long[] arr = new long[sum + 1];

        for (int i = 0; i < arr.length; i++) {
            if (i % coins[0] == 0)
                arr[i] = 1;
        }


        for (int i = 1; i < N; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (coins[i] <= j) {
                    arr[j] = arr[j] + arr[j - coins[i]];
                }

            }

        }

        return arr[sum];
    }
}
