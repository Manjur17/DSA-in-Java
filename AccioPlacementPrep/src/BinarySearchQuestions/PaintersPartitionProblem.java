package BinarySearchQuestions;

public class PaintersPartitionProblem {
    public int paint(int k, int B, int[] arr) {
        long max = arr[0], maxSum = 0; // non-negative integers in nums
        for (int x : arr) {
            max = Math.max(max, x);
            maxSum += x;
        }
        long low = max, high = maxSum;
        long ans = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (isValid(arr, k, mid)) {
                ans = mid % 10000003;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        ans = (ans * B) % 10000003; //B is unit of time
        return (int) (ans);
    }

    private static boolean isValid(int[] arr, int k, long mid) {
        long painters = 1; //min 1 piece is possible
        long sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum > mid) {
                painters++;
                sum = num;
            }
        }
        return painters <= k;
    }
}
