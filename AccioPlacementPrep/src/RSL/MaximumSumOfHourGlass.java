package RSL;

public class MaximumSumOfHourGlass {
    int findMaxSum(int N, int M, int[][] Mat) {
        if (N < 3 || M < 3) {
            return -1;
        }
        int currSum = 0, maxSum = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < M - 2; j++) {
                currSum = (Mat[i][j] + Mat[i][j + 1] + Mat[i][j + 2])
                        + (Mat[i + 1][j + 1]) +
                        (Mat[i + 2][j] + Mat[i + 2][j + 1] + Mat[i + 2][j + 2]);

                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }
}
